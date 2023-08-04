package Array;

import java.util.Arrays;

public class PrefixSums {

    int arr[];

    //constructor
    public PrefixSums(int[] arr) {
        this.arr = arr;
    }


    public int equilibreamIndex(){
        int ans = 0;

        int a[] = this.arr.clone();

        for (int i = 0; i < a.length; i++) {
            if(i == 0){
                a[i] = a[i];
            }else {
                a[i] = a[i-1]+a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            int left = i == 0 ? a[i] : a[i-1];
            int right = a[a.length-1] - a[i];
            if(left == right){
                ans++;
            }
        }

        return ans;
    }

    // Index to which left Sum  == Right Sum
    public int equilibreamIndexNoSpace(){
        int ans = 0;
        int totalSum = 0;

        for (int i = 0; i < this.arr.length; i++) {
            totalSum = totalSum + this.arr[i];
        }

        int lSum = 0;
        int rSum = 0;
        for (int i = 0; i < this.arr.length; i++) {

            rSum = totalSum - lSum - this.arr[i];
            if(lSum == rSum){
                ans++;
            }
            lSum += this.arr[i];
        }

        return ans;
    }

    public int rangeSum(int start, int end, String oe){
        int ans = 0;
        int[] evenSum = new int[this.arr.length];
        int[] oddSum = new int[this.arr.length];

        for (int i = 0; i < this.arr.length; i++) {
            int even = i == 0 ? evenSum[i] :evenSum[i-1];
            int odd = i == 0 ? 0 :oddSum[i-1];

            if(i % 2 == 0){
                even += this.arr[i];
            }else {
                odd += this.arr[i];
            }

            evenSum[i] = even;
            oddSum[i] = odd;
        }

        System.out.println(Arrays.toString(evenSum));
        System.out.println(Arrays.toString(oddSum));

        if(oe == "EVEN"){
            ans = evenSum[end] - evenSum[start -1];
        }else if(oe == "ODD"){
            ans = oddSum[end] - oddSum[start -1];
        }

        return ans;
    }


    public int specialIndex(){
        int ans = 0;

        int[] evenSum = new int[this.arr.length];
        int[] oddSum = new int[this.arr.length];

        for(int i=0; i< this.arr.length; i++){
            int even = i == 0 ? evenSum[i] : evenSum[i-1];
            int odd = i == 0 ? 0 : oddSum[i-1];

            if(i % 2 == 0 && i !=0){
                even = even + this.arr[i];
            }else{
                odd += this.arr[i];
            }

            evenSum[i] = even;
            oddSum[i] = odd;

        }

        for(int i=0; i< this.arr.length; i++){
            int lsume = 0;
            int rsume = 0;
            int lsumo = 0;
            int rsumo = 0;
            int oddS = 0;
            int evenS = 0;


                lsume = i == 0 ? 0 : evenSum[i-1];
                rsume = oddSum[this.arr.length-1] - oddSum[i];
                evenS = lsume +rsume;

                lsumo = i == 0 ? 0 : oddSum[i-1];
                rsumo = evenSum[this.arr.length-1] - evenSum[i];
                oddS = lsumo + rsumo;


            if(evenS == oddS){
                ans++;
                System.out.println("Special Index "+ i + " Sum :"+ evenS);
            }

        }

        return ans;

    }


}
