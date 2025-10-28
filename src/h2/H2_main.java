package h2;

public class H2_main {
    public static void main() {
        int i = 20, j = 8, k = 3, min = 4, max = 5;

        // min finden
        if (i < j && i<k) {
            min = i;
        }
        else if (j < i && j < k) {
            min = j;
        }
        else if (k < i && k < j) {
            min = k;
        }

        // max finden
        if (i > j && i > k){
            max = i;
        } else if (j > i && j > k) {
            max = j;
        } else if (k > i && k > j) {
            max = k;
        }
        System.out.println("Max: " + max + " Min: " + min);
    }
}
