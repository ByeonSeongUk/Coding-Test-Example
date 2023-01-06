package wb0x03;
// 숫자의 개수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Ctn2577 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int a = fr.nextInt();
        int b = fr.nextInt();
        int c = fr.nextInt();

        long total = (long) a * b * c;
        int length = (int) ( Math.log10(total)+1 );

        int[] arr = Stream.of(String.valueOf(total).split("")).mapToInt(Integer::parseInt).toArray();
        int[] cnt = new int[10];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < 10; j++) {
                if(arr[i] == j) cnt[j]++;
            }
        }

        for(int i = 0; i < cnt.length; i++) {
            System.out.println(cnt[i]);
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