public class Main2 {
    public static void main(String[] args) {
        print(0, 10);
    }

    private static void print(int i, int n) {
        if (i < n) {
            print(i + 1, n);
            System.out.println(i);
        }
    }
}