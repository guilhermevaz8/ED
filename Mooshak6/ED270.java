import java.util.Scanner;

class Student{
    String name;
    int doubts;
    int day;

    Student (String name, int doubts, int day){
        this.name=name;
        this.doubts=doubts;
        this.day=day;
    }

    public String name(){
        return name;
    }

    public int doubts(){
        return doubts;
    }

    public int day(){
        return day;
    }

    public void Setdoubts(int n){
        this.doubts=n;
    }

    public void Setday(int n){
        this.day=n;
    }
}


public class ED270 {

    public static void main(String[] args){
        MyQueue<Student> fila=new LinkedListQueue<>();
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        int X=in.nextInt();
        int N=in.nextInt();
        int dia=1;
        int duvidasrest=T;
        for (int i=0;i<N;i++){
            String nome=in.next();
            int nduv=in.nextInt();
            Student S=new Student(nome, nduv, 0);
            fila.enqueue(S);
        }
        while (!fila.isEmpty()){
            if(duvidasrest>0){
                duvidasrest--;
                if(fila.first().day<X){
                    Student a=fila.dequeue();
                    a.Setdoubts(a.doubts-1);
                    a.Setday(a.day+1);
                    if(a.doubts()==0) System.out.println(a.name+" "+dia+" "+ duvidasrest);
                else{
                    fila.enqueue(a);
                }
                }}
                
            else{
                dia++;
                duvidasrest=T;
                for(int i=0;i<fila.size();i++){
                    Student a=fila.dequeue();
                    a.Setday(0);
                    fila.enqueue(a);
                }  
                
            }
        }

    }
    
}
