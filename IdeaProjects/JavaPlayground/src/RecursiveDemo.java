import static java.lang.System.exit;

public class RecursiveDemo {

    static void recurse(int n) {
        System.out.println(n);
        n--;
        if (n <= 0) {
            exit(0);
        }
        recurse(n);
    }

    public static void main(String[] args) {
//        recurse(10);
        int n = 10;
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

}
