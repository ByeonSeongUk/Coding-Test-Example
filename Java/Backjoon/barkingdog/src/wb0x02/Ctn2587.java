package wb0x02;
// 대표값2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ctn2587 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();


        int[] a = new int[5];
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            do {
                a[i] = fr.nextInt();
            } while (
                (!(a[i] % 10 == 0 && a[i] < 100 && a[i] > 0))
            );
            sum += a[i];
        }

        Arrays.sort(a);

        System.out.println(sum/a.length);
        System.out.println(a[2]);

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