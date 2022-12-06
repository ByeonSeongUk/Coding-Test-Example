package wb0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ctn10869 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int a;

        do{
            a = fr.nextInt();
        }
        while(!(a >= 1));

        int b;

        do{
            b = fr.nextInt();
        }while(!(b <= 10000));

        System.out.println("return(+) : " + (a + b));
        System.out.println("return(-) : " + (a - b));
        System.out.println("return(*) : " + (a * b));
        System.out.println("return(/) : " + (a / b));
        System.out.println("return(%) : " + (a % b));
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