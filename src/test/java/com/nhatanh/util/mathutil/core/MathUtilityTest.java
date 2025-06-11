package com.nhatanh.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test //@Test tương đương hàm main(), code trong hàm này sẽ run như hàm main()
    //biến mỗi test case thành test run, thành main để chạy
    public void verifyFactorialGivenRightArg0RunsWell() {
        //0! có là 1 hay ko
        assertEquals(1, MathUtility.getFactorial(0));
    }

    @Test
    public void verifyFactorialGivenRightArg1RunsWell() {
        //0! có là 1 hay ko
        assertEquals(1, MathUtility.getFactorial(1));
    }

    @Test
    public void verifyFactorialGivenRightArg2RunsWell() {
        //0! có là 1 hay ko
        assertEquals(2, MathUtility.getFactorial(2));
    }

    @Test
    public void verifyFactorialGivenRightArg3RunsWell() {
        //0! có là 1 hay ko
        assertEquals(6, MathUtility.getFactorial(3));
    }
}