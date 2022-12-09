package wb0x02;
// 별 찍기 - 5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ctn2443 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int n = fr.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < i; j++)
                System.out.print(" ");

            for(int j = 0; j < 2 * (n - i) - 1; j++)
                System.out.print("*");


            System.out.println();
        }

    }
    // 1 3 5 7 9
    //
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