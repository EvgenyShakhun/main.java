public class main {
    public static void main(String[] args) {
        double testValuePos = 5;
        double testValueZero = 0;
        double testValueNeg = 3;
        System.out.println("x = " + testValueNeg + " y = " + calc(testValueNeg));
        System.out.println("x = " + testValueZero + " y = " + calc(testValueZero));
        System.out.println("x = " + testValuePos + " y = " + calc(testValuePos));
    }

    public static double calc(double x) {
        double y;
        if (x < 0) {
            y = Math.abs(x);
        } else if (x < 0) {
            y = 0;
        } else {
            y = x - 2;
        }
        return y;
    }
}

