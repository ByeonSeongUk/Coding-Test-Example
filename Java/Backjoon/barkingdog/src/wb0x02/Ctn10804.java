package wb0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ctn10804 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
    }

    public static void main(String[] args) throws Exception {

        // Input Data
        FastReader fr = new FastReader();

        int[] arr = new int[20];

        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }

        int n;
        int x;

        System.out.println("Start");
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < 10; i++) {

            n = fr.nextInt();
            x = fr.nextInt();




        }
        System.out.println("END");
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