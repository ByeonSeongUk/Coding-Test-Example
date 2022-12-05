package wb0x02;
// 홀수 구하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ctn2576 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int[] a = {0, 0, 0, 0, 0, 0, 0};
        int min = 0;
        int sum = 0;

        a[0] = fr.nextInt();
        a[1] = fr.nextInt();
        a[2] = fr.nextInt();
        a[3] = fr.nextInt();
        a[4] = fr.nextInt();
        a[5] = fr.nextInt();
        a[6] = fr.nextInt();

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 1) {
                sum += a[i];
            }
        }
        Arrays.sort(a);

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 1) {
                min = a[i];
                break;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
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