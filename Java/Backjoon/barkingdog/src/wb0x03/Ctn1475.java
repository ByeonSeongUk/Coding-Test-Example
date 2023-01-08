package wb0x03;
// 방 번호
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class Ctn1475 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int a = fr.nextInt();
        int[] arr = Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();
        int cnt = 0;

        int[] tmp = new int[9];
        for(int i = 1; i < 10; i++) {
            tmp[i-1] = i;
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < 8; j++) {
                // if(arr[i] == j) cnt++;
                for(int k = 0; k < arr.length; k++) {

                }
            }
        }

        System.out.println(Arrays.toString(arr));

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
            return parseInt(next());
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