package com.back;

public class Calc {
    public static int run(String exp) {
        String[] bits = exp.split(" ");

        int result = Integer.parseInt(bits[0]);

        for (int i = 1; i < bits.length; i += 2) {
            String op = bits[i];
            int num = Integer.parseInt(bits[i + 1]);

            if (op.equals("+")) result += num;
            else if (op.equals("-")) result -= num;
            else if (op.equals("*")) result *= num;
        }
        return result;
    }
}
