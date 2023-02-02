public class ED196 {

    public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
        String dentro[]= new String[2];
        while(q.size()!=0){
            dentro[0]=q.dequeue();
            dentro[1]=q.dequeue();
            if (dentro[1].equals("A")) a.enqueue(dentro[0]);
            else if(dentro[1].equals("B")) b.enqueue(dentro[0]);
            else if (dentro[1].equals("X")){
                if(a.size()<b.size()) a.enqueue(dentro[0]);
                else if (a.size()>b.size()) b.enqueue(dentro[0]);
            }
        }    
}}
