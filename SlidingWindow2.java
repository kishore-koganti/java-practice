public class SlidingWindow2 {
    
    int sw(int nums[], int k){

        int sum = 0;
        for (int i: nums)
            sum+=i;
        int startIndex = 0;
        int endIndex = k;
        int maxSum = 0;

        while (endIndex < nums.length){
            sum -= nums[startIndex];
            startIndex ++;
            sum+= nums[endIndex];
            endIndex ++;
            maxSum = Math.max(sum, maxSum);

        }
        return maxSum;
    }
}
