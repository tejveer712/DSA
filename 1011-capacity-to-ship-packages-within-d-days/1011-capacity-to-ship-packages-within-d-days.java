class Solution {

    boolean canShip(int[] weights, int mid, int days){
        int day = 1;
        int currentLoad = 0;

        for(int weight : weights){
            if (currentLoad + weight > mid) {
            day++;
            currentLoad = weight;
            }
            else{
                currentLoad = currentLoad + weight;

            }
        }
        return day <= days;

    }

    public int shipWithinDays(int[] weights, int days) {

        int low = 0; // min capacity 
        for(int weight : weights){
            low = Math.max(low, weight);
        }
        int high = 0; // max capacity 
        for(int weight : weights){
            high += weight; 
        }
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2; // the capacity we are guessing 

            if(canShip(weights, mid, days)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;
        
    }
}