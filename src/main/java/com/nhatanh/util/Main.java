package com.nhatanh.util;

import com.nhatanh.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArg0RunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
        verifyFactorialGivenRightArg3RunsWell();
        verifyFactorialGivenRightArg4RunsWell();
        verifyFactorialGivenRightArg5RunsWell();
    }

    //Test case #6: Verify the GetFactorial() with n = 5;
    public static void verifyFactorialGivenRightArg5RunsWell() {
        int n = 5;
        long expected = 120; // hi vọng 120 được trả về nếu tính 5!
        long actual = MathUtility.getFactorial(n);
        //Test là so sánh
        System.out.println("5! = expected: " + expected + ", actual: " + actual);
    }

    //Test case #5: Verify the GetFactorial() with n = 4;
    public static void verifyFactorialGivenRightArg4RunsWell() {
        int n = 4;
        long expected = 24; // hi vọng 24 được trả về nếu tính 4!
        long actual = MathUtility.getFactorial(n);
        //Test là so sánh
        System.out.println("4! = expected: " + expected + ", actual: " + actual);
    }

    //Test case #4: Verify the GetFactorial() with n = 3;
    public static void verifyFactorialGivenRightArg3RunsWell() {
        int n = 3;
        long expected = 6; // hi vọng 6 được trả về nếu tính 3!
        long actual = MathUtility.getFactorial(n);
        //Test là so sánh
        System.out.println("3! = expected: " + expected + ", actual: " + actual);
    }

    //Test case #3: Verify the GetFactorial() with n = 2;
    public static void verifyFactorialGivenRightArg2RunsWell() {
        int n = 2;
        long expected = 2; // hi vọng 2 được trả về nếu tính 2!
        long actual = MathUtility.getFactorial(n);
        //Test là so sánh
        System.out.println("2! = expected: " + expected + ", actual: " + actual);
    }

    //Test case #2: Verify the GetFactorial() with n = 1;
    public static void verifyFactorialGivenRightArg1RunsWell() {
        int n = 1;
        long expected = 1; // hi vọng 1 được trả về nếu tính 1!
        long actual = MathUtility.getFactorial(n);
        //Test là so sánh
        System.out.println("1! = expected: " + expected + ", actual: " + actual);
    }


    //Test thử hàm tính giai thừa, gọi trong main()
    // Muốn test gì đó thì phải có Test Case!!!
    //TEST CASE #1: Verify the GetFactorial() with n = 0;
    //STEPS:
    //      Given n = 0
    //      Call getFactorial(n = 0)
    //EXPECTED RESULT:
    //           The method must return 1 as the result of 0! = 1
    //STATUS: PASSED / FAILED phải chờ

    public static void verifyFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1; // hi vọng 1 được trả về nếu tính 0!
        long actual = MathUtility.getFactorial(n);
        //Test là so sánh
        System.out.println("0! = expected: " + expected + ", actual: " + actual);
    }

}
// Kĩ thuật vừa gõ code, vừa gõ test case, vừa gõ test run, được gọi là
// TDD (Đưa vào CV) - TEST DRIVEN DEVELOPEMENT