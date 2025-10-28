package h3;

public class H3_main {
    public static void main() {
        int i = 140, j = 150, k = 3;
        boolean a1 = i > j, a2 = i > 200, a3 = j > 100;
        k = -10;

        if (a1 && !a2 && !a3) {
            k = 1;
        }
        if (a1 && a2 && !a3) {
            k = 2;
        }
        if (a1 && a2 && a3) {
            k = 3;
        }
        if (!a1 && !a2 && !a3) {
            k = 4;
        }

        System.out.println(k);
    }
}
