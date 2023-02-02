import java.util.Scanner;

public class ED005{

    public static void main(String[] args){
        MyStack<Character> a= new LinkedListStack<>();
        Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        int resultado=1;
        String exp= new String();
        exp=in.nextLine();
        for (int i=0;i<b;i++){
            for (int k=0;k<exp.length();k++){
                char letra=exp.charAt(k);
                if (a.size()>=2 && (letra=='x' || letra=='-' || letra=='+'|| letra=='/')){
                    int v1=a.pop();
                    int v2=a.pop();
                    if (letra=='x') resultado=v1*v2;
                    else if (letra=='-') resultado=v1-v2;
                    else if (letra=='+') resultado=v1+v2;
                    else if (letra=='/') resultado=v1/v2;}
                else if (Character.isDigit(letra)) a.push(letra);}
            exp=in.nextLine();
            System.out.println(resultado);
            
        }

           
        }}

   
    

