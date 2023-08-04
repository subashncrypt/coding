import Array.BasicArray;
import Array.PrefixSums;
import Array.CarryForward;
import Array.SubArray;
import Array.MiscArray;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       //Arrays
        BasicArray a = new BasicArray(new int[]{-3, -2, 6, 8, 4, 8, 5});
        BasicArray b = new BasicArray(new int[]{1,1,1,1,1,1,1});
        BasicArray c = new BasicArray(new int[]{-3, -2, 6});
        BasicArray d = new BasicArray(new int[]{-3, -2});

        // Problem 1
        // Number of Elements Greater than itSelf
        System.out.println("1. Number of Elements Greater than itSelf");
        System.out.println( a.greaterThanItself());
        System.out.println( a.greaterThanItselfSingleLoop());


        // Problem 2
        // Two sum problem
        System.out.println("2. Two sum problem");
        BasicArray twoSumTest= new BasicArray(new int[]{2,4,-3,7});
        System.out.println(twoSumTest.twoSum(5));
        BasicArray twoSumTest1= new BasicArray(new int[]{2,7,11,15});
        System.out.println(twoSumTest.twoSum(9));


        // Problem 2.1
        // Two Sum different problem
        System.out.println("2.1 Two sum problem pro");
        BasicArray twoSumTest3= new BasicArray(new int[]{2,4,-3,7});
        System.out.println(twoSumTest.twoSum(5));
        BasicArray twoSumTest4= new BasicArray(new int[]{2,7,11,15});
        System.out.println(twoSumTest.twoSum(9));

        // Problem 2.3
        // THree Sum different problem
        System.out.println("2.3 Three sum problem pro");
//        BasicArray twoSumTest3= new BasicArray(new int[]{2,4,-3,7});
//        System.out.println(twoSumTest.twoSum(5));
//        BasicArray twoSumTest4= new BasicArray(new int[]{2,7,11,15});
//        System.out.println(twoSumTest.twoSum(9));



        // Problem 3
        // Reverse an array using no extra space
        System.out.println("3. Reverse an array using no extra space");
        System.out.println(Arrays.toString( twoSumTest.reverseArray()));
        BasicArray reverseTest= new BasicArray(new int[]{2,7});
        System.out.println(Arrays.toString( reverseTest.reverseArray()));
        BasicArray reverseTest2= new BasicArray(new int[]{2});
        System.out.println(Arrays.toString( reverseTest2.reverseArray()));


        // Problem 4
        // Reverse from Start to end Index in an array
        System.out.println("4. Reverse from Start to end Index in an array");
        BasicArray reverseSE= new BasicArray(new int[]{-3,4,2,8,7,9,6,2,10});
        System.out.println(Arrays.toString( reverseSE.reverseArrayFromToIndex(3,7)));
        BasicArray reverseSE1= new BasicArray(new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println(Arrays.toString( reverseSE1.reverseArrayFromToIndex(6,8)));


        // Problem 5
        // Rotate an array ClockWise
        System.out.println("5. Rotate an array ClockWise");
        BasicArray rotate3times = new BasicArray(new int[]{1,2,3,4,5,6,7});
        System.out.println(Arrays.toString( rotate3times.rotate(3)));
        BasicArray rotate6times = new BasicArray(new int[]{-1,-100,3,99});
        System.out.println(Arrays.toString( rotate6times.rotate(3)));


        // Problem 6
        // Rotate an array anti ClockWise
        System.out.println("6. Rotate an array Anti ClockWise");
        BasicArray antirotate4times = new BasicArray(new int[]{1,2,3,4,5,6,7});
        System.out.println("[1,2,3,4,5,6,7] : " + Arrays.toString(  rotate3times.antiRotate(3)));
        BasicArray antirotate6times = new BasicArray(new int[]{-1,-100,3,99});
        System.out.println("[-1,-100,3,99] : " + Arrays.toString(rotate6times.antiRotate(3)));

        /**
         * Range Sum == Prefix Sum
         * Hint
         */

        // Problem 7
        // Given an array with Equilibrium index.
        // Equilibrium index is sum of all the left index =  sum of all the right index
        System.out.println("7. Number of equilibrium index in an array");
        PrefixSums eqiCount1 = new PrefixSums(new int[]{1,2,3,4,8,10});
        System.out.println("[1,2,3,4,8,10] : " + eqiCount1.equilibreamIndex());
        PrefixSums eqiCount2 = new PrefixSums(new int[]{-7,1,5,2,-4,3,0});
        System.out.println("[1,2,3,4,5,6,7] : " + eqiCount2.equilibreamIndex());

        // Problem 7.1
        // Equilibrium index  or  Find Pivot Index
        System.out.println("7.1 Number of equilibrium index in an array");
        PrefixSums eqiCount11 = new PrefixSums(new int[]{1,2,3,4,8,10});
        System.out.println("[1,2,3,4,8,10] : " + eqiCount1.equilibreamIndexNoSpace());
        PrefixSums eqiCount21 = new PrefixSums(new int[]{-7,1,5,2,-4,3,0});
        System.out.println("[1,2,3,4,5,6,7] : " + eqiCount2.equilibreamIndexNoSpace());

        // Problem 8
        // Given a range return the sum of all the odd elements and even elements
        System.out.println("8 Range SUm of Even or Odd index");
        PrefixSums evenSum  = new PrefixSums(new int[]{2,3,1,-1,0,8,5,4});
        System.out.println("[2,3,1,-1,0,8,5,4] : " + evenSum.rangeSum(3,6,"ODD"));
        PrefixSums oddSum = new PrefixSums(new int[]{2,3,1,-1,0,8,5,4});
        System.out.println("[2,3,1,-1,0,8,5,4] : " + oddSum.rangeSum(1,5,"EVEN"));

        // Problem 9
        // Special Index // removal of index after which sum of even and odd number become equal
        System.out.println("9 removal of index after which sum of even and odd number sum will be equal");
        PrefixSums speciaIndex = new PrefixSums(new int[]{4,3,2,7,6,-2});
        System.out.println("[4,3,2,7,6,-2] : " + speciaIndex.specialIndex());

        /**
         * Carry Forward
         */

        // Problem 10
        // Pair count of a[i] == 'a' & a[j] == 'g' and i < j // calculate the number of pairs
        System.out.println("10 calculat the number of pairs");
        CarryForward  pairs = new CarryForward(new char[]{'a','c','b','a','g','k','a','g','g'});
        System.out.println("['a','c','b','a','g','k','a','g','g'] O(N~2): " + pairs.pairs());

        // Problem 11
        // Pair count of a[i] == 'a' & a[j] == 'g' and i < j // calculate the number of pairs
        System.out.println("11 calculat the number of pairs pro");
        System.out.println("['a','c','b','a','g','k','a','g','g'] O(N): " + pairs.pairsPro());


        // Problem 12
        // Pair count of a[i] == 'a' & a[j] == 'g' and i < j // calculate the number of pairs
        System.out.println("12 calculate the number of leaders");
        CarryForward  leaders = new CarryForward(new int[]{16,17,17,4,3,5,2});
        System.out.println("[16,17,17,4,3,5,2] " + leaders.leader());

        // problem 13
        // Closest Min Max in an Array [Smallest SubArray containing both min and max in an array.
        System.out.println("13 : Length of the smallest subArray containing both min and max");
        CarryForward  subArrayMinMax = new CarryForward(new int[]{1,6,4,2,2,7,5,1,3,1,1,5});
        System.out.println("[1,6,4,2,2,7,7,5,1,3,1,1,5] " + subArrayMinMax.smallestSubarry());
        System.out.println("[1,6,4,2,2,7,7,5,1,3,1,1,5] " + subArrayMinMax.smallestSubarryPro());
        CarryForward  subArrayMinMax1 = new CarryForward(new int[]{2,2,6,4,5,1,5,2,6,4,1});
        System.out.println("[2,2,6,4,5,1,5,2,6,4,1] " + subArrayMinMax1.smallestSubarry());
        System.out.println("[2,2,6,4,5,1,5,2,6,4,1] " + subArrayMinMax1.smallestSubarryPro());
//        CarryForward  subArrayMinMax2 = new CarryForward(new int[]{8,8,8,8,8});
//        System.out.println("[8,8,8,8,8] " + subArrayMinMax2.smallestSubarry());
//        System.out.println("[8,8,8,8,8] " + subArrayMinMax2.smallestSubarryPro());
//        CarryForward  subArrayMinMax3 = new CarryForward(new int[]{1,1,1,1,1,5});
//        System.out.println("[1,1,1,1,1,5 ] " + subArrayMinMax3.smallestSubarry());
//        System.out.println("[1,1,1,1,1,5 ] " + subArrayMinMax3.smallestSubarryPro());


        // Problem 14
        // Faulty wire : Number of Toggles required to switch on every thing
        System.out.println("14 : Calculate the minimun toggles required to Toggle all the lights");
        CarryForward toggle = new CarryForward(new int[]{1,0,1,0,0,1,1,0});
        System.out.println("[1,0,1,0,0,1,1,0] " + toggle.faultyToggle());

        /**
         * Sub Arrays
         */
        // Problem 15
        // Total Number of Sub Arrays
        System.out.println("15 : Total Number of SubArrays");
        SubArray totalSub = new SubArray(new int[]{1,0,1,0,0,1,1,0});
        System.out.println("[1,0,1,0,0,1,1,0] " + totalSub.TotalSubarrays());


        //Problem 16
        // Kaden's ALgo
        // Maximum Sum SubArrays
        System.out.println("16 : Total Number of SubArrays");
        SubArray maxSubarray = new SubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println("[-2,1,-3,4,-1,2,1,-5,4] " + maxSubarray.maximunSubArrySum());


        // problem 17
        // IMP _-------------------------------------------->
        // Count of SubArrays where a particular index is present
        System.out.println("17 : Count of SubArrays where a particular index is present");
        SubArray countIndexSubArrray = new SubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println("[-2,1,-3,4,-1,2,1,-5,4] " + countIndexSubArrray.countSubArrayIndex(5));


        // Problem 18
        // Sum of all SubArrays
        System.out.println("18 : Return the sum of all Sub arrays");
        SubArray allSUbArraySUm = new SubArray(new int[]{3,2,1,6});
        System.out.println("3,2,1,6: "+allSUbArraySUm.totalSumSubArray());
        SubArray allSUbArraySUm1 = new SubArray(new int[]{3,2,1,6,-1,4});
        System.out.println("3,2,1,6: "+allSUbArraySUm1.totalSumSubArray());

        // Problem 19
        // Sum of all SubArrays pro method (Number of times repeated in SubArray = (i+1 * n -i)) * (Element at Index)
        System.out.println("19 : Return the sum of all Sub arrays pro method");
        System.out.println("3,2,1,6: "+allSUbArraySUm1.totalSumSubArrayPro());
        System.out.println("3,2,1,6: "+allSUbArraySUm.totalSumSubArrayPro());


        // Problem 20
        // Best time to buy and sell a share
        System.out.println("20 : Return the sum of all Sub arrays");
        SubArray bestTimToBuy = new SubArray(new int[]{7,1,5,3,6,4});
        System.out.println("7,1,5,3,6,4: "+bestTimToBuy.bestTimetoBuySellProfit());

        /**
         * Misc Problems
         * Interviews
         */

        // Problem 21
        // Given A binary string find the max consecutive 1's replacing at most one 0
        System.out.println("21 : Max 1's in an array by replacing atmost one 0");
        MiscArray atmostOneZero = new MiscArray(new int[]{1,1,0,1,0,1,0,1,1});
        System.out.println("1,1,0,1,0,1,0,1,1: "+atmostOneZero.MaxOnesByReplaceOneZero());
        MiscArray atmostOneZero1 = new MiscArray(new int[]{1,1,1,1,1,1});
        System.out.println("1,1,1,1,1,1: "+atmostOneZero1.MaxOnesByReplaceOneZero());
        MiscArray atmostOneZero2 = new MiscArray(new int[]{1,1,1,0,1,1,0});
        System.out.println("1,1,1,0,1,1,0: "+atmostOneZero2.MaxOnesByReplaceOneZero());


        // Problem 22
        // Given A binary string find the max consecutive 1's switching at most one 0
        System.out.println("22 : Max 1's in an array by replacing atmost one 0");
        MiscArray switchingOneZero = new MiscArray(new int[]{1,1,0,1,0,1,0,1,1});
        System.out.println("1,1,0,1,0,1,0,1,1: "+switchingOneZero.MaxOnesBySwitchingOneZero());
        MiscArray switchingOneZero1 = new MiscArray(new int[]{1,1,1,0,1,1,0});
        System.out.println("1,1,1,0,1,1,0: "+ switchingOneZero1.MaxOnesBySwitchingOneZero());


        // Problem 23
        // IMP _-------------------------------------------->
        // Given an array calculate all the Triplets where i < j < k and a[i] < a[j] < a[k]
        System.out.println("23 : Given an array calculate all the Triplets where i < j < k and a[i] < a[j] < a[k]");
        MiscArray triplet1 = new MiscArray(new int[]{4,1,2,6,9,7});
        System.out.println("4,1,2,6,9,7: "+triplet1.triplets());
        System.out.println("4,1,2,6,9,7: Pro "+ triplet1.tripletsPro());



        // Problem 24
        // Number of Possible SubArrays of length K
        // Number of Sub arrays = N(N+1)/2  // Numeber of possible subarrays a give index is present is (i+1)*(N-i)
        // IMP -------------------------------------------->  Lean how to iterate over a SubArray of length k
        System.out.println("24 : Number of possible SubArrays of length K");
        MiscArray subarrayKcount = new MiscArray(new int[]{4,1,2,6,9,7});
        System.out.println("4,1,2,6,9,7: "+subarrayKcount.NumberOfSubarraysOfLength(3));


        // Problem 25
        // Print Start and end index of all subarrys of length k
        // Number of Sub arrays = N(N+1)/2  // Numeber of possible subarrays a give index is present is (i+1)*(N-i)
        // Total Number of subarrayS of legth k = (n-k+1);
        // Given an array calculate the number of possible subarrays of length K
        System.out.println("24 : Number of possible SubArrays of length K");
        MiscArray SubarrayStartEnd = new MiscArray(new int[]{4,1,2,6,9,7});
        System.out.println("4,1,2,6,9,7: ");SubarrayStartEnd.StartStopSubarrayLengthK(3);


        // Problem 26
        // Maximum SubArray sum of length k
        System.out.println("25: Maximum SUbarray sum of length K");
        MiscArray maxSumSUbArrayLengthK = new MiscArray(new int[]{4,1,2,6,9,7,8,3});
        System.out.println("4,1,2,6,9,7,8,3 : "+maxSumSUbArrayLengthK.maxSubarrayLengthK(4));
        System.out.println("4,1,2,6,9,7,8,3 : "+maxSumSUbArrayLengthK.maxSubarrayLengthKPro(4));

        //Problem 27
        //

        /**
         * Linked List
         */

        /**
         * Trees
         */
        // Problem Trees 1
        // Invert a Binary Tree
        // https://leetcode.com/problems/invert-binary-tree/

        // Problem Trees 2
        // Maximum depth of a binary tree
        // https://leetcode.com/problems/maximum-depth-of-binary-tree/

        // Problem Trees 3
        // Diameter of a binary Tree
        // https://leetcode.com/problems/diameter-of-binary-tree/

        // Problem Trees 4
        // Balanced binary Tree : if the left height and right height difference is more than 1
        // https://leetcode.com/problems/balanced-binary-tree/

        // Problem Trees 5
        // Same Trees : Check if both the trees are same or not
        // https://leetcode.com/problems/same-tree/

        // Problem Trees 6
        // Same Trees : Check if the given tree is a subtree of other tree
        // https://leetcode.com/problems/subtree-of-another-tree/

        /**
         *  Tree Traversal
         */

        // Problem Trees 7
        // In order Traversal : Left center right
        // https://leetcode.com/problems/binary-tree-inorder-traversal/

        // Problem Trees 8
        // Pre order Traversal : Center Left Right
        // https://leetcode.com/problems/binary-tree-preorder-traversal/description/

        // Problem Trees 9
        // Post order Traversal left right root
        // https://leetcode.com/problems/binary-tree-postorder-traversal/description/

        // Problem Trees 10
        // Level Order Traversal
        // -------> IMP <------------ //
        // https://leetcode.com/problems/binary-tree-level-order-traversal/

        // Problem Trees 11
        // Balanced Binary Tree
        // https://leetcode.com/problems/balanced-binary-tree/

        // Problem Trees 12
        // Lowest common ancestor of a Binary Search Tree
        // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

        // Problem Trees 13
        // Lowest Common Ancestor of a Binary Tree
        // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

        // Problem Trees 14
        // Kth Smallest Element in a Tree
        // https://leetcode.com/problems/kth-smallest-element-in-a-bst/

        // Problem Trees 15
        // Validate Binary Search Trees
        // https://leetcode.com/problems/validate-binary-search-tree/

        // Problem Trees 16
        // Count good nodes in a Binary tree
        // https://leetcode.com/problems/count-good-nodes-in-binary-tree/

        // Problem Trees 17
        // Right SIde View
        // https://leetcode.com/problems/binary-tree-right-side-view/

        // Problem Trees 18
        // Maximum Path SUm
        // https://leetcode.com/problems/binary-tree-maximum-path-sum/




    }
}