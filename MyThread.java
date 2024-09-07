public class MyThread extends Thread{
    private int startIndex, endIndex, maxIdx;

    public MyThread(int s, int n, int m){
        this.startIndex = s;
        this.maxIdx = n;
        this.endIndex = m;
    }
     
    public void run(){
        for(int i= this.startIndex; i < this.maxIdx; i++){
            System.out.println("[ID " + this.getId() + "] " + i);
        }
    }
    
}
