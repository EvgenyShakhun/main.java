public class main2 {
    public static void main(String[] args) {
        printOddNumber(-1, 4);
        printOddNumber(2, 5);
        printOddNumber(0, 5);
    }

    public static void printOddNumber(int firstNumber, int secondNumber) {
        System.out.println(firstNumber % 2 == 0 ? secondNumber : firstNumber);
    }
}
