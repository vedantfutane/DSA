// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
// Maximum Product of Two Elements in an Array
// Input: nums = [3,4,5,2]
// Output: 12 
// Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
package Array_Main;

public class MaxProd {
    public static int findMaxProd(int arr[]){
        int max=0;
        int sec_max=0;
        for(int num : arr){
            if(num > max){
                sec_max=max;
                max = num;
            }else if(num>sec_max){
                sec_max=num;
            }
        }
        return (max-1)*(sec_max-1);
    }
    public static void main(String[] args) { 
        int arr[]={1,2,4,3,6,5,3};
        System.out.println(findMaxProd(arr));
    }
}
