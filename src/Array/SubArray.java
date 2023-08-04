package Array;

public class SubArray {

    int arr[];
    public SubArray(int[] arr) {
        this.arr = arr;
    }

    public int TotalSubarrays(){
        return (this.arr.length*(this.arr.length+1))/2;
    }

    /**
     * Return the maximun sum of a sub array
     * Kaden's Algorithm
     * @return
     */
    public int maximunSubArrySum(){
        int ans = 0;
        int cmax = 0;

        for (int i = 0; i < this.arr.length; i++) {

            if(cmax < 0){
                cmax = 0;
            }
            cmax += this.arr[i];
            ans = Math.max(ans,cmax);
        }
        return ans;
    }

    /**
     * In how many sub arrays a pariticular index is present
     * ans = (index +1) * (Length - index)
     */

    public int countSubArrayIndex(int index){
        int ans;
        ans = (index + 1) * (this.arr.length - index);
        return ans;
    }


    /**
     * Sum of all Sub Arrays
     */
    public int totalSumSubArray(){
        int ans = 0;
        int sum = 0;

        for (int i = 0; i < this.arr.length; i++) {
            sum = 0;
            for(int j =i ; j < this.arr.length; j++){
                    sum = sum + this.arr[j];
                    ans += sum;
            }
        }

        return ans;
    }


    public int totalSumSubArrayPro(){
        int ans = 0;

        for (int i = 0; i < this.arr.length; i++) {
           int indexCount = (this.arr.length - i)*(i+1);
           ans += (indexCount*this.arr[i]);
        }

        return ans;
    }


    public int bestTimetoBuySellProfit(){
        int profit = 0;
        int cp = 0;
        int prevLow = Integer.MAX_VALUE;

        for (int n: this.arr) {
            if( n < prevLow) {
                prevLow = n;
            }else {
                cp = n - prevLow;
            }
            profit = Math.max(profit,cp);
        }
        return profit;
    }



}
