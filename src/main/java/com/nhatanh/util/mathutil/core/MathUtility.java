package com.nhatanh.util.mathutil.core;

public class MathUtility {
    //Class này dùng để cung cấp các hàm tính toán Toán học
    //Bắt chước Class Math. trong JDK
    //Vì những tính toán này tính xong rồi trả ra, không cần lưu trữ lại
    //Do đó ta thiết kế nó dạng static


    //Ta làm hàm tính n! = 1.2.3.4.5...n
    //Quy ước:
    // 0! = 1
    // Không có giải thừa số âm, ví dụ -5! không hợp lệ
    // 20! vừa đ kiểu long, 21! không dùng long được
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("n must be between 0 and 20");

        if (n == 0 || n == 1) return 1;
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
