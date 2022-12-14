package wb0x02;
// 일곱 난쟁이
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Ctn2309 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int[] a = new int[9];
        int sum = 0;
        int fake1 = 0, fake2 = 0;

        for(int i = 0; i < 9; i++){
            a[i] = fr.nextInt();
            sum += a[i];
        }

        Arrays.sort(a);


        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < 9; j++) {
                if(sum - a[i] - a[j] == 100 && a[i] != a[j]) {
                    fake1 = i;
                    fake2 = j;
                }
            }
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i] == a[fake1] || a[i] == a[fake2]) {
                continue;
            }
            System.out.println(a[i]);
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