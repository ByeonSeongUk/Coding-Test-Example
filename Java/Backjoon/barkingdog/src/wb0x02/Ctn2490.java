package wb0x02;
// 윷놀이 - 다시 풀기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Ctn2490 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int[] a = {0,0,0,0};
        int[] b = {0,0,0,0};
        int[] c = {0,0,0,0};

        a[0] = fr.nextInt();
        a[1] = fr.nextInt();
        a[2] = fr.nextInt();
        a[3] = fr.nextInt();

        while(true) {
            if (a[0] != 0 && a[0] != 1) {
                System.out.println("첫 줄 입력다시");
                a[0] = fr.nextInt();
                a[1] = fr.nextInt();
                a[2] = fr.nextInt();
                a[3] = fr.nextInt();
            } else if (a[1] != 0 && a[1] != 1) {
                System.out.println("첫 줄 입력다시");
                a[0] = fr.nextInt();
                a[1] = fr.nextInt();
                a[2] = fr.nextInt();
                a[3] = fr.nextInt();
            } else if (a[2] != 0 && a[2] != 1) {
                System.out.println("첫 줄 입력다시");
                a[0] = fr.nextInt();
                a[1] = fr.nextInt();
                a[2] = fr.nextInt();
                a[3] = fr.nextInt();
            } else if (a[3] != 0 && a[3] != 1) {
                System.out.println("첫 줄 입력다시");
                a[0] = fr.nextInt();
                a[1] = fr.nextInt();
                a[2] = fr.nextInt();
                a[3] = fr.nextInt();
            } else {
                break;
            }
        }

        b[0] = fr.nextInt();
        b[1] = fr.nextInt();
        b[2] = fr.nextInt();
        b[3] = fr.nextInt();

        while(true) {
            if (b[0] != 0 && b[0] != 1) {
                System.out.println("둘째 줄 입력다시");
                b[0] = fr.nextInt();
                b[1] = fr.nextInt();
                b[2] = fr.nextInt();
                b[3] = fr.nextInt();
            } else if (b[1] != 0 && b[1] != 1) {
                System.out.println("둘째 줄 입력다시");
                b[0] = fr.nextInt();
                b[1] = fr.nextInt();
                b[2] = fr.nextInt();
                b[3] = fr.nextInt();
            } else if (b[2] != 0 && b[2] != 1) {
                System.out.println("둘째 줄 입력다시");
                b[0] = fr.nextInt();
                b[1] = fr.nextInt();
                b[2] = fr.nextInt();
                b[3] = fr.nextInt();
            } else if (b[3] != 0 && b[3] != 1) {
                System.out.println("둘째 줄 입력다시");
                b[0] = fr.nextInt();
                b[1] = fr.nextInt();
                b[2] = fr.nextInt();
                b[3] = fr.nextInt();
            } else {
                break;
            }
        }

        c[0] = fr.nextInt();
        c[1] = fr.nextInt();
        c[2] = fr.nextInt();
        c[3] = fr.nextInt();

        while(true) {
            if (c[0] != 0 && c[0] != 1) {
                System.out.println("셋째 줄 입력다시");
                c[0] = fr.nextInt();
                c[1] = fr.nextInt();
                c[2] = fr.nextInt();
                c[3] = fr.nextInt();
            } else if (c[1] != 0 && c[1] != 1) {
                System.out.println("셋째 줄 입력다시");
                c[0] = fr.nextInt();
                c[1] = fr.nextInt();
                c[2] = fr.nextInt();
                c[3] = fr.nextInt();
            } else if (c[2] != 0 && c[2] != 1) {
                System.out.println("셋째 줄 입력다시");
                c[0] = fr.nextInt();
                c[1] = fr.nextInt();
                c[2] = fr.nextInt();
                c[3] = fr.nextInt();
            } else if (c[3] != 0 && c[3] != 1) {
                System.out.println("셋째 줄 입력다시");
                c[0] = fr.nextInt();
                c[1] = fr.nextInt();
                c[2] = fr.nextInt();
                c[3] = fr.nextInt();
            } else {
                break;
            }
        }
//            String a = fr.nextLine();
//            String b = fr.nextLine();
//            String c = fr.nextLine();
//
//            String[] a1 = a.split(" ");
//            String[] b1 = b.split(" ");
//            String[] c1 = c.split(" ");

            int[] temp = {0, 0, 0};

            for(int i = 0; i < a.length; i++) {
                temp[0] += a[i];
                temp[1] += b[i];
                temp[2] += c[i];
            }

            for(int i = 0; i < 3; i++) {
                if (temp[i] == 4)
                    System.out.println("A");

                else if (temp[i] == 3)
                    System.out.println("B");

                else if (temp[i] == 2)
                    System.out.println("C");

                else if (temp[i] == 1)
                    System.out.println("D");

                else if (temp[i] == 0) {
                    System.out.println("E");
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