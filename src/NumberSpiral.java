import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NumberSpiral {
    static FastScanner in=new FastScanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);

    public static void main(String[] args) {
        int test=in.nextInt();
        while(test-->0){
            int y=in.nextInt();
            int x= in.nextInt();
            if(y>x){
                if(y%2==0) {
                    y--;
                    out.println((y * y) + x-1);
                }
                else{
                    out.println((y*y)-x+1);

                }
            }
            else{
                if(x%2!=0){
                    x--;
                    out.println((x*x)+y-1);

                }
                else{
                    out.println((x * x)-y+1);
                }
            }



        }
        out.close();

    }


    static class FastScanner {

        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
    }

}
