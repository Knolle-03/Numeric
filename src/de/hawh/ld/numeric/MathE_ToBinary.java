package de.hawh.ld.numeric;

import java.math.BigDecimal;

public class MathE_ToBinary {
    public static void main(String[] args) {
        System.out.println("decimal e = " + 2.718281828459045);
        System.out.println("binary  e = " + MathE_ToBinary.doubleToBinary(Math.E));

    }

    static String doubleToBinary(double num) {
        long bits = Double.doubleToLongBits(num);
        return Long.toBinaryString(bits);
    }
}
