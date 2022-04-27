// Joseph Problem : 

//     N people in a circle person 1 has a sword he kills clockwise adjacent person & passes the sword.
//     This cycle repeats until one person is left with the sword. who is the last person
    
//     obs.1 : If N is te power of 2 the starting person will be the last one. 
//     obs.2 : (1+2*kills) will give us the answer. where kills will be nearest power of 2 <=N. 
import java.util.Scanner;
class LastManStabding {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int y = NearestPOWoftwo(n);
        int kills = n-y;
        System.out.println((1+(2*kills)));
    }
    public static int NearestPOWoftwo(int n){
        int pow = 1;
        while(pow<n){
            pow = pow *2;
            if(pow > n){
                return pow/2;
            }
        }
        return pow;
    }
}