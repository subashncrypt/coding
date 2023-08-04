package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class BasicArray {

    int arr[];

    //constructor
    public BasicArray(int[] arr) {
        this.arr = arr;
    }

    /**
     * Function to calculate the Number of elements that have at least 1 element greater than itself
     *
     */
    public int greaterThanItself(){

        // Ist Loop
        int max = findMax();
        int ans = 0;

        System.out.println("max : "+max);

        for(int i=0; i<this.arr.length; i++){
            if(arr[i] < max){
                ans++;
            }
        }

        return ans;
    }

    /**
     * Function to calculate the Number of elements that have at least 1 element greater than itself
     *
     */
    public int greaterThanItselfSingleLoop(){
        int max = Integer.MIN_VALUE;
        int maxCount = 0;

        for(int i=0; i<this.arr.length; i++){

            if( arr[i] > max){
                max = arr[i];
                maxCount = 0;
            }
            if(arr[i] == max){
                maxCount++;
            }
        }

        return this.arr.length - maxCount;
    }


    /**
     * Return True if there exists a Pair such that it is equal to k
     * param: Int k
     * @return Boolean
     */

    public boolean twoSum(int k){
        boolean ans = false;

        for(int i=0; i< this.arr.length; i++){
            int target = k - this.arr[i];
            for(int j=i+1;j< this.arr.length; j++){
                if (this.arr[j] == target) {
                    return true;
                }
            }
        }

        return ans;
    }

    /**
     * It gives answer in O(n) complexity
     * @param k
     * @return
     */
    public boolean twoSumPro(int k){
        boolean ans = false;

        HashMap<Integer,Integer> op = new HashMap<>();


        for(int i=0; i< this.arr.length; i++){
            int target = k - this.arr[i];
            if(op.containsKey(target)){
                return true;
            }else{
                op.put(this.arr[i],i);
            }
        }

        return ans;
    }

    public int[] reverseArray(){

    int flag = this.arr.length-1;
    int[] ar = this.arr.clone();

        for(int i=0; i< ar.length/2; i++){
            int temp = ar[i];
            ar[i] = ar[flag];
            ar[flag] = temp;
            flag--;
        }

        return ar;
    }

    public int[] rotate(int k){

        if(k > this.arr.length){
            k = k%this.arr.length;
        }

        int b = this.arr.length - k -1;

        int ar[] =  this.arr.clone();

        helper(0, b,ar);
        helper(b+1,this.arr.length-1,ar);
        helper(0,this.arr.length-1,ar);

        return ar;
    }


    public int[] antiRotate(int k){

        if(k > this.arr.length){
            k = k%this.arr.length;
        }

        int b = k -1;

        int ar[] =  this.arr.clone();
        helper(0, b,ar);
        helper(b+1,this.arr.length-1,ar);
        helper(0,this.arr.length-1,ar);

        return ar;
    }

    public int[] helper(int start, int end, int[] ar){

        int flag = end;

        for(int i=start; i<= (start+end)/2; i++){
            int temp = ar[i];
            ar[i] = ar[flag];
            ar[flag] = temp;
            flag--;
        }

        return ar;
    }

    public int[] reverseArrayFromToIndex(int start, int end){

        int flag = end;
        int[] ar = this.arr.clone();

        for(int i=start; i< (start+end)/2; i++){
            int temp = ar[i];
            ar[i] = ar[flag];
            ar[flag] = temp;
            flag--;
        }

        return ar;
    }

    public int findMax(){

        int max = Integer.MIN_VALUE;

        for (int n:this.arr) {
            max = Math.max(max,n);
        }

        return max;
    }


}
