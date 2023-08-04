package BitManipulation;

public class BitBasics {

    /**
     * XOR of 2 number will lead to 0
     *
     */

    int arr[];

    public BitBasics(int[] arr) {
        this.arr = arr;
    }

    /**
    Single Number 1
     Give a list off number the single odd repeating number will be sent
     */
    public int getOddRepeatingNumber(){
        int x= 0;

        for (int i = 0; i < this.arr.length; i++) {
            x = x ^ this.arr[i];
        }

        return x;
    }
}
