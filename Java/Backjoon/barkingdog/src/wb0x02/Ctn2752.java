package wb0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ctn2752 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();
        int[] arr = new int[3];

        int a;

        do {
            a = fr.nextInt();
        }
        while(!(a >= 1 && a <= 1000000));

        int b;

        do {
            b = fr.nextInt();
        }
        while(!(b >= 1 && b <= 1000000));

        int c;

        do {
            c = fr.nextInt();
        }
        while(!(c >= 1 && c <= 1000000));

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
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