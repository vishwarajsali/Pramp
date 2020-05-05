public class Solution {
    static double root(double x, int n) {
        // your code goes here
        // x = 8.7, n = 3
        // root(x, n)
        // pow(i, n) == x ?

        double num = 0;
        while (pow(num++, n) < x)
            ;
        if (Math.pow(num, n) == x)
            return num;

        double upperLimit = num, lowerLimit = 1;

        double approRoot = (upperLimit + lowerLimit) / 2;
        ;
        while (approRoot - lowerLimit >= 0.001) {
            approRoot = (upperLimit + lowerLimit) / 2;

            if (pow(approRoot, n) > x)
                upperLimit = approRoot;
            else if (pow(approRoot, n) < x)
                lowerLimit = approRoot;
            else
                return approRoot;
        }

        return approRoot;

    }

    static double pow(double num, int x) {
        if (x == 0)
            return 1;
        return num * pow(num, x - 1);
    }

    public static void main(String[] args) {
        int x = 7, n = 3;
        System.out.println(root(x, n));
    }

}