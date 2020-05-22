package leetcode.test.zhang;

import java.util.Scanner;


    class Solution {
        public int numberOfSteps(int num) {
            int step = 0;
            while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
                step++;
            }
            return step;
        }
    }
public  class TestSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println( solution.numberOfSteps(x));
    }
}