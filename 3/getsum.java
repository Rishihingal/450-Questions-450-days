import java.util.HashMap;

public class getsum{
    public static void main(String[] args) {
        int[] C = {1,2,2,3,3};
        int B =2;
        long sum =0L;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<C.length;i++){
            if(hm.containsKey(C[i])){
                hm.put(C[i],hm.get(C[i])+1);
                C[i]=-1;
            }
            else{
                hm.put(C[i],1);
            }
        }
        System.out.println(hm);
        for(int i=0;i<C.length;i++){
            if(C[i]!=-1 && hm.get(C[i]) == B){
                sum += C[i];
            }
        }
        System.out.println(sum);
    }
}