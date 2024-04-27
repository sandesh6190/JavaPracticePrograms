class ArrayIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int index = 5;
        try {
            System.out.println(arr[index]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is out of bound!!");
            System.out.println(e.getMessage());
        }
    }
}