class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("result");
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero");
            System.out.println(e.getMessage());
        }
    }
}