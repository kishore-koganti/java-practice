public class SlidingWindow {

    int window(int arr[], int k){
       
        int sum = 0;
        
        int startIndex = 0;
        int endIndex = k;
        for (int i = 0; i < k; i++){
            sum +=arr[i];
        }
        int maxSum = sum;
        while (endIndex < arr.length){
            sum -= arr[startIndex];
            startIndex++;
            sum+= arr[endIndex];
            endIndex++;
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("Max Sum" +  maxSum);
        return maxSum;
    }
    public static void main(String[] args){

        int arr[] = {1, 5, 9, 10,-5, 4};
        int k = 3;
SlidingWindow sw = new SlidingWindow();
int max = sw.window(arr, k);
System.out.println(max);
    }
}
