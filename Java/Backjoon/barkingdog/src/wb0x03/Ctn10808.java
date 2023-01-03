package wb0x03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static sun.text.normalizer.UTF16.charAt;

public class Ctn10808 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        String s = fr.next();
        int[] arr = new int[26];
        //  a == 97, z == 122

        for(int i = 0; i < s.length(); i++) {

            for(int j = 0; j < 26; j++) {

                if ((int) s.charAt(i) == 97 + j) {
                    arr[(int) s.charAt(i) - 97] = arr[(int) s.charAt(i) - 97] + 1;
                }
            }

        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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