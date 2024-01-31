import java.util.concurrent.TimeUnit;

class CircuitBreaker {
    private int failureThreshold;
    private int resetTimeoutInMillis;
    private long lastFailureTime;
    private int consecutiveFailures;

    public CircuitBreaker(int failureThreshold, int resetTimeoutInMillis) {
        this.failureThreshold = failureThreshold;
        this.resetTimeoutInMillis = resetTimeoutInMillis;
        this.lastFailureTime = 0;
        this.consecutiveFailures = 0;
    }

    public void execute() {
        if (isCircuitOpen()) {
            System.out.println("Circuit is open. Operation failed without execution.");
            return;
        }

        try {
            // Simulate some operation
            // Replace this with your actual code
            System.out.println("Executing the operation...");
            // Simulate failure condition
            if (Math.random() < 0.3) {
                throw new RuntimeException("Operation failed!");
            }

            // Operation was successful
            System.out.println("Operation successful.");

            // Reset consecutive failures on success
            consecutiveFailures = 0;

        } catch (RuntimeException e) {
            System.out.println("Operation failed with exception: " + e.getMessage());
            handleFailure();
        }
    }

    private void handleFailure() {
        consecutiveFailures++;

        if (consecutiveFailures >= failureThreshold) {
            System.out.println("Circuit is now open. Entering cooldown period.");
            lastFailureTime = System.currentTimeMillis();
        }
    }

    private boolean isCircuitOpen() {
        long currentTime = System.currentTimeMillis();
        return (currentTime - lastFailureTime) < resetTimeoutInMillis;
    }
}

public class CircuitBreakerExample {
    public static void main(String[] args) {
        CircuitBreaker circuitBreaker = new CircuitBreaker(3, 5000);

        // Simulate invoking the operation using the circuit breaker
        for (int i = 0; i < 10; i++) {
            circuitBreaker.execute();
            try {
                // Simulate time passing between operation invocations
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
