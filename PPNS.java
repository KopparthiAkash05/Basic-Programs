import java.util.*;

class PPNS {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();

        for (int i = start; i <= end; i++) {
            if (i <= 1)
                continue;

            int c = 0;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    c = 1;  
                    break;
                }
            }

            if (c == 0) {
                System.out.print(i + " ");
            }
        }
    }
}