package Array;

import javax.swing.plaf.metal.MetalTheme;

public class CarryForward {

    char arr[];
    int Intarr[];

    //constructor
    public CarryForward(char[] arr) {
        this.arr = arr;
    }

    public CarryForward(int[] arr) {
        this.Intarr = arr;
    }


    /**
     * Calculated the Number of pairs of 'g' & 'a' can be formed where i < j
     */
    public int pairs(){
        int ans = 0;

        for (int i = 0; i < this.arr.length; i++) {
            if( this.arr[i] == 'a'){
                for (int j = i+1; j < this.arr.length; j++) {
                    if(this.arr[j] == 'g'){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }


    public int pairsPro(){
        int ans = 0;
        int aCount = 0;
        for (int i = 0; i < this.arr.length; i++) {
            if(this.arr[i] == 'a'){
                aCount++;
            }
            if(this.arr[i] == 'g'){
                ans += aCount;
            }
        }
        return ans;
    }

    /**
     * Function that calculates the Number of elements that are strictly greater than all the elements on the right
     * @return int [Number of elements that are strictly greater than all the elements on the right]
     */
    public int leader(){
        int ans = 0;
        int maxRight = Integer.MIN_VALUE;

        for (int i = this.Intarr.length-1; i >=0 ; i--) {
            if(this.Intarr[i] > maxRight){
                ans++;
            }

            maxRight = Math.max(this.Intarr[i],maxRight);

        }

        return ans;
    }

    /**
     * Smallest SUb array that contains both min and max
     * @return
     */
    public int smallestSubarryPro(){
        int ans = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int prevMinIndex = 0;
        int prevMaxIndex = 0;
        for (int i = 0; i < this.Intarr.length; i++) {
            if( this.Intarr[i] >= max){
                ans = min == this.Intarr[i] ? ans :Integer.MAX_VALUE;
                max = Intarr[i];
                prevMaxIndex = i;

            }
            if( this.Intarr[i] <= min){
                ans = min == this.Intarr[i] ? ans :Integer.MAX_VALUE;
                min = Intarr[i];
                prevMinIndex = i;

            }
            if(prevMaxIndex != prevMinIndex){
                ans = Math.min(ans,Math.abs(prevMaxIndex - prevMinIndex));
            }
        }
//        System.out.println("min :" + min + " Max :" + max + "prevMinIndex"+prevMinIndex + " Previous Min index "+ prevMaxIndex);

        return min == max ? 1 : ans+1;
    }

    public int smallestSubarry(){
        int ans = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int prevMinIndex = -1;
        int prevMaxIndex = -1;

        for (int i = 0; i < this.Intarr.length; i++) {
            if( this.Intarr[i] > max){
                max = Intarr[i];
            }
            if( this.Intarr[i] < min){
                min = Intarr[i];
            }
        }

        if(max== min){
            return 1;
        }

        for (int i = 0; i < this.Intarr.length; i++) {

            if( this.Intarr[i] == max){
                prevMaxIndex = i;
            } else if (this.Intarr[i] == min) {
                prevMinIndex = i;
            }

            if(prevMinIndex!= -1 && prevMaxIndex != -1){
                    ans = Math.min(ans, Math.abs(prevMaxIndex- prevMinIndex));
                }
        }

        return ans+1;
    }

    /**
     * Minimum number of toggles that is required to tuen on all the lights in a wire
     * @return
     */
    public int faultyToggle(){
        int ans = 0;
        int current = 0;

        for (int i = 0; i < this.Intarr.length; i++) {
                current = ans %2 == 0 ? this.Intarr[i] : 1 - this.Intarr[i];
                if(current == 1){
                    continue;
                }else {
                    ans++;
                }
        }

        return ans;
    }

}
