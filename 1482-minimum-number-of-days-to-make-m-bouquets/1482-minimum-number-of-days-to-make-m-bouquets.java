class Solution {

    boolean canMake(int[] bloomDay, int m, int k, int guess){
        int c =0;
        int bouq = 0;

        for(int flower : bloomDay){
            if(guess >= flower){
                c++;
                if(c == k){
                    bouq++;
                    if (bouq >= m){
                        return true;
                    }
                    c=0;
                }
            }
            else{
                c=0;
            }
        }
        return bouq >=m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        int len = bloomDay.length;
        int min = bloomDay[0];
        int max = bloomDay[0];

        for (int day : bloomDay) {
            max = Math.max(max, day);
            min = Math.min(min, day);
        }
        long required = (long)m*k;
        if(required > len){
            return -1;
        }


        while(min <= max){
            int guess = min + (max - min)/2;

            if(canMake(bloomDay, m, k, guess)){
                max = guess -1;
            }
            else{
                min = guess + 1;
            }

            
        }

        return min;
        
    }

    
}