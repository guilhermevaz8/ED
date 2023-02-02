import java.util.Scanner;
public class Estatistica{
    public static void main(String[] args){
        int max=-1000001;
        int min=1000001;
        double soma=0;
        Scanner reader= new Scanner(System.in);
        double counter=0;
        int n=reader.nextInt();
        while(n>0){
            int a=reader.nextInt();
            if (a>max) max=a;
            if (a<min) min=a;
            soma=soma+a;
            n=n-1;
            counter=counter+1;}
        double medium=soma/counter;
        int amplitude=max-min;
        System.out.printf("%.2f\n",medium);
        System.out.println(amplitude);

    }
}