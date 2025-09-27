/*
Q1: Factorial using Recursion
Problem: Given n, find factorial.
Example: n=5 → 120
Approach: Recursive function f(n) = n * f(n-1).
*/

class Q1_factorial {
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
