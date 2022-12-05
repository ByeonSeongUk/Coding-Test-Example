package wb0x02;
// 주사위 세개
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ctn2480 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int a = fr.nextInt();
        int b = fr.nextInt();
        int c = fr.nextInt();

        if(a == b && b == c) {
            System.out.println(10000 + (a * 1000));
        }

        else if(a == b || b == c || a == c) {
            if(a == b) {
                System.out.println(1000 + (a * 100));
            }
            else if(b == c){
                System.out.println(1000 + (b * 100));
            }
            else {
                System.out.println(1000 + (c * 100));
            }
        }

        else {
            if (a > b && a > c) {
                System.out.println(a * 100);
            }
            else if (b > c) {
                System.out.println(b * 100);
            }
            else {
                System.out.println(c * 100);
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