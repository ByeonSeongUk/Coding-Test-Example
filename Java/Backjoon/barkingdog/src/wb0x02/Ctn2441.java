package wb0x02;
// 별 찍기 - 4
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ctn2441 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int n = fr.nextInt();

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
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