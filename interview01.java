public class interview {
    public static void main(String[] args) {
        // This is a comment
        getNum(10);
    }

    private static int getNum(int n) {
        int result = 0;
        if (n > 1) {
            int a = n / 2 * -1;
            if (n % 2 == 0) {
                result = a;
            } else {
                result = a + n;
            }
        } else {
            result = 1;
        }
        System.out.print(result);
        return result;
    }
}
