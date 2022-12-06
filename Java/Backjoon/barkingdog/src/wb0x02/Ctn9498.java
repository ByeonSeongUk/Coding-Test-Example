package wb0x02;
// 시험 성적
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ctn9498 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int a;
        do {
            a = fr.nextInt();
        }

        while(!(a >= 0 && a <= 100));

        // 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F
        if(a <= 100 && a >= 90) {
            System.out.println("A");
        }
        else if(a <= 89 && a >= 80) {
            System.out.println("B");
        }
        else if(a <= 79 && a >= 70) {
            System.out.println("C");
        }
        else if(a <= 69 && a >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
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