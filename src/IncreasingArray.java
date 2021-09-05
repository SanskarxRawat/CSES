import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IncreasingArray {
    public static void main(String[] args) {
        FastScanner fs=new FastScanner ();
        ArrayList<Long> arrayList=new ArrayList<> ();
       int N=fs.nextInt ();
        for (int i = 0; i < N; i++) {
            arrayList.add(fs.nextLong ());
        }
        long moves=0;
        for (int i = 0; i <N-1 ; i++) {
            if(arrayList.get(i)>arrayList.get (i+1)){
                moves+=arrayList.get(i)-arrayList.get(i+1);
                arrayList.set (i+1,arrayList.get (i));
            }

        }

//        System.out.println (arrayList.get (0)<arrayList.get(1)?moves-arrayList.get (1)+arrayList.get(0):moves);
        System.out.println (moves);



    }
    static void rufflesort(int[] a){
        int n= a.length;
        Random r=new Random ();
        for (int i = 0; i < a.length; i++) {
            int oi=r.nextInt(),temp=a[i];
            a[i]=a[oi];
            a[oi]=temp;
        }
        Arrays.sort (a);

    }

    static void sort(char[] a){
        ArrayList<Character> l=new ArrayList<> ();
        for(char i:a) l.add(i);
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) a[i] = l.get (i);
    }
    static class FastScanner{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        StringTokenizer st=new StringTokenizer ("");
        String next(){
            while (!st.hasMoreTokens ()){
                try {
                    st = new StringTokenizer (br.readLine ());
                }catch (IOException e){
                    e.printStackTrace ();
                }

            }
            return st.nextToken ();
        }
        int nextInt(){
            return Integer.parseInt (next ());
        }
        int[] readArray(int n){
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=nextInt ();
            }
            return a;
        }
        long nextLong(){
            return Long.parseLong (next ());

        }
    }
}
