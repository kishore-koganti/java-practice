public class FiboTest {

    public static int fibo(int n){
        int[] f = new int[n+2];
        f[0] = 0;
        f[1] = 1;

        for(int i=2; i<=n; i++){
            f[i] = f[i-2] +f[i-1];
        }
    return f[n];
    }


    public static void main(String[] args){
        System.out.println("FIBO TEST");
        System.out.println(fibo(10));
    }
    
}
