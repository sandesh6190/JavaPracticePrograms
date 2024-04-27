class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("Length of string is " + str.length());
        }

        catch (NullPointerException e) {
            System.err.println("String is null");
        }
    }
}