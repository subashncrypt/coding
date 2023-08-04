package Array;

public class MiscArray {

    int[] arr;

    public MiscArray(int[] arr) {
        this.arr = arr;
    }

    public int MaxOnesByReplaceOneZero(){
        int ans = 0;
        boolean noZero = true;

        for (int i = 0; i < this.arr.length; i++) {
            int lcount = 0;
            int rcount = 0;
            if(this.arr[i] == 0){
                noZero = false;

                for (int j = i-1; j >= 0 ; j--) {
                    if(this.arr[j] == 1){
                        lcount++;
                    }else {
                        break;
                    }
                }

                for (int j = i+1; j < this.arr.length; j++) {
                    if(this.arr[j] == 1){
                        lcount++;
                    }else {
                        break;
                    }
                }

                ans = Math.max(ans,(lcount+rcount+1));
            }
        }

        return noZero ? this.arr.length : ans;
    }


    public int MaxOnesBySwitchingOneZero(){
        int ans = 0;
        int cans = 0;
        int totalOnes = 0;

        for (int n:this.arr) {
            if( n == 1) {
                totalOnes++;
            }
        }

        for (int i = 0; i < this.arr.length; i++) {
            int lcount = 0;
            int rcount = 0;
            if(this.arr[i] == 0){

                for (int j = i-1; j >= 0 ; j--) {
                    if(this.arr[j] == 1){
                        lcount++;
                    }else {
                        break;
                    }
                }

                for (int j = i+1; j < this.arr.length; j++) {
                    if(this.arr[j] == 1){
                        lcount++;
                    }else {
                        break;
                    }
                }

                if((lcount+rcount) < totalOnes ){
                    cans = lcount+rcount+1;
                }else {
                    cans = lcount+rcount;
                }
                ans = Math.max(ans,cans);
            }
        }

        return ans;
    }



    public int triplets(){
        int ans = 0;

        for (int i= 0; i< this.arr.length; i++){
            for(int j=i+1; j <this.arr.length; j++){
                if(this.arr[j] > this.arr[i]){
                    for (int k = j+1; k < this.arr.length; k++) {
                        if(this.arr[k] > this.arr[j] && this.arr[j] > this.arr[i]){
                            ans++;
                        }
                    }
                }

            }
        }
        return ans;
    }

    public int tripletsPro(){
        int ans = 0;

        for (int i= 0; i< this.arr.length; i++){
           int lsmall = 0;
           int rgreater = 0;
            // find leftsmallcount;
            for(int j = i; j>=0;j--){
                if(this.arr[j] < this.arr[i]){
                    lsmall++;
                }
            }

            // Find R greater count;
            for(int j = i+1; j < this.arr.length; j++){
                if(this.arr[j] > this.arr[i]){
                    rgreater++;
                }
            }

            ans += (rgreater*lsmall);
        }
        return ans;
    }


    /**
     * Calculate the number of possible sub arrays possible of length k
     */

    public int NumberOfSubarraysOfLength(int k){
        return this.arr.length - k +1;
    }

    public void StartStopSubarrayLengthK(int k){

        for (int i = 0; i < this.arr.length - k +1; i++) {
            System.out.println("Start : "+ i+ " End : "+ (i+k-1));
        }
    }

    public int maxSubarrayLengthK(int k){
        int ans = 0;

        for (int i = 0; i < this.arr.length - k+1; i++) {
            int start = i;
            int end = i+k-1;
            int sum = 0;
            for(int j = start; j<= end; j++){
                sum += this.arr[j];
            }

            ans = Math.max(ans,sum);
        }

        return ans;
    }

    public int maxSubarrayLengthKPro(int k){
        int ans = 0;
        int cSum = 0;
        for (int i = 0; i < k; i++) {
            cSum = cSum + this.arr[i];
        }
        int flag = 0;
        ans = cSum;

        for(int i=k; i<this.arr.length;i++){
            cSum = cSum + this.arr[i] - this.arr[flag];
            ans = Math.max(ans,cSum);
            flag++;
        }

        return ans;
    }

}
