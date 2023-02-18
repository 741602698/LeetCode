package lc70;

public class Solution {
//    这个题本质是求斐波那契数列的第n项，此处是递归的解法，复杂度太高，所以用迭代
//    public int climbStairs(int n) {
//        if(n==0||n==1)
//            return 1;
//        else return climbStairs(n-1)+climbStairs(n-2);
//    }

    public int climbStairs(int n) {
        int sum1 = 1,sum2 = 1,sum = 0;//斐波那契前两项为1,1
        if(n==0||n==1)//0级台阶和1级台阶时，都是只有1种方法
            return 1;
        for(int i = 2;i<=n;i++){//有2级台阶时，有2种方法
            sum = sum1 + sum2;
            sum1 = sum2;
            sum2 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution S = new Solution();
        System.out.println(S.climbStairs(3));
    }
}
