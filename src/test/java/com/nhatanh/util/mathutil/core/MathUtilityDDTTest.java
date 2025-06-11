package com.nhatanh.util.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //CHUẨN BỊ BỘ DATA ĐỂ RIÊNG - DD - DATA DRIVEN
    //LÁT HỒI FILL VÀO HÀM SO SÁNH T TESTING
    //FILL VÀO QUA THAM SỐ HÀM - HÀM LÀM VIỆC VỚI NHIỀU DATA
    //DDT CÒN GỌI TÊN KHÁC: PARAMETERIZED TESTING -> KIỂM THỬ THEO KIỂU THAM SỐ HÓA

    //BỘ DATA: NẰM TRONG HÀM STATIC - TĨNH
    public static Object[][] initData() {
        return new Object[][]{{0, 1},
                              {1, 1},
                              {2, 2},
                              {3, 6},
                              {4, 24},
                              {5, 120},
                              {6, 720}};
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial((n)));
    }
}