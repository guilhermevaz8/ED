import java.util.Scanner;
public class palindromo {
    
    static boolean palindromo(String str){
        str=str.toLowerCase();
            str=str.replaceAll("[^a-z]","");
            int size= str.length()-1;
            for (int i=0;i<size;i++){
                if(str.charAt(i)!= str.charAt(size))
                    return false;
                size--;}
            return true;
    }

    public static void main (String[] args){
        Scanner reader= new Scanner(System.in);
        int n= reader.nextInt();
        System.out.println(n);
        String str =new String();
        reader.nextLine();
        //str=reader.nextLine();
     //   n--;
        while(n>0){
            str=reader.nextLine();
            if(palindromo(str)) System.out.println("sim");
            else System.out.println("nao");
            //System.out.println( n + " ");
            n--;
        }
    }
}
