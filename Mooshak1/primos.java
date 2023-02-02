import java.io.Reader;
import java.util.Scanner;
public class primos {
    static boolean primos(int n){
        for (int i=2; i<n;i++){
            if(n%i==0)
                return false;}
        return true;
        }
    
    public static void main (String[] args){
        Scanner reader= new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int counter=0;
        while(a<=b){
            if (primos(a)) counter++;
            a++;
        }   
        System.out.println(counter);

    }
    }
    

