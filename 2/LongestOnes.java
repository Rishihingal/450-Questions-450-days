import java.util.Scanner;

public class LongestOnes {
   public static void main(String[] args) {
       try (Scanner in = new Scanner(System.in)) {
        String A = in.nextLine();
           int ans = Integer.MIN_VALUE, leftone =0, rightone= 0,totalone =0;
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)=='1'){
                    totalone++;
                }
            }
            if(totalone == A.length()){
                System.out.println(totalone);;
            }
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)=='0'){
                    if(i==0){
                        leftone=0;
                    }
                    else {
                        for(int j=i-1;j>=0;j--){
                            if(A.charAt(j)=='0'){
                                break;
                            }
                            leftone++;
                        }
                }
                    for(int k=i+1;k<A.length();k++){
                        if(A.charAt(k)=='0'){
                            break;
                        }
                        rightone++;
                    }
                
                    if(totalone>(rightone+leftone)){
                        ans = Math.max(ans,leftone+rightone+1);
                    }
                    else {
                        ans = Math.max(ans,leftone+rightone);
                    }
                    leftone =0;rightone=0;
                }
            }
            System.out.println(ans);
    }
   } 
}
