package wb0x02;
// 윷놀이 - 다시 풀기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ctn2490 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        for(int i = 0; i < 3; i++) {

            int[] a = new int[4];

            do {
                a[0] = fr.nextInt();
                a[1] = fr.nextInt();
                a[2] = fr.nextInt();
                a[3] = fr.nextInt();
            } while (
                    (a[0] != 0 && a[0] != 1) ||
                    (a[1] != 0 && a[1] != 1) ||
                    (a[2] != 0 && a[2] != 1) ||
                    (a[3] != 0 && a[3] != 1)
            );

            int temp = a[0] + a[1] + a[2] + a[3];


            if (temp == 4)
                System.out.println("E");

            else if (temp == 3)
                System.out.println("A");

            else if (temp == 2)
                System.out.println("B");

            else if (temp == 1)
                System.out.println("C");

            else if (temp == 0) {
                System.out.println("D");
            }

        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}