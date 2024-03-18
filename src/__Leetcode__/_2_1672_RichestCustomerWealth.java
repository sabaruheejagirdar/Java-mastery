package __Leetcode__;

//https://leetcode.com/problems/richest-customer-wealth/description/
//1672. Richest Customer Wealth
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10
public class _2_1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { {1,5}, {7,3}, {3,5}};
        maximumWealth(accounts);
    }

    static public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] row: accounts){
            int sum = 0;
            for(int num: row){
                sum += num;
            }
            if(sum > max){
                max=sum;
            }
        }
        return max;
    }
}
