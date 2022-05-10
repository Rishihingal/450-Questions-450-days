import java.util.Arrays;
import java.util.HashSet;

public class subarraysum{
    public static void main(String[] args) {
            int[] A = {-1,1};
            int[] PS = new int[A.length];
            HashSet<Integer> hs = new HashSet<Integer>();
            PS[0] = A[0];
            for(int i=1;i<A.length;i++){
                PS[i] = (int) ((long) PS[i-1] + A[i]);
            }
            System.out.println(Arrays.toString(PS));
            for(int i=0;i<PS.length;i++){
                if(hs.contains(PS[i])){
                    System.out.println(1);
                }
                else {
                    hs.add(PS[i]);
                }
            }
            if(hs.contains(0)){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
