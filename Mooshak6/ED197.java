public class ED197 {
    public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
        MyQueue<Integer> q = new LinkedListQueue<Integer>();
        int val1=0,val2=0;
        boolean flag1=true,flag2=true;
        while(a.size()!=0 || b.size()!=0 ){
            if(a.size()!=0 && flag1==true){
                val1=a.dequeue();
            }
            if(b.size()!=0 && flag2==true){
                val2=b.dequeue();
            }
            
            if(val1>val2){
                q.enqueue(val2);
                flag1=false;
                flag2=true;
                val2=999;
            }
            else{
                if(val2>val1){
                    q.enqueue(val1);
                    flag2=false;
                    flag1=true;
                    val1=999;
                }
                else{
                    q.enqueue(val1);
                    q.enqueue(val1);
                    flag2=true;
                    flag1=true;
                    val2=999;
                    val1=999;

                }
            }
        }
        if(val1!=999){
            q.enqueue(val1);
        }
        if(val2!=999){
            q.enqueue(val2);
        }
        
        return q;
 
    }

    public static void main(String[] args) {
 
        // Criacao da fila
        MyQueue<Integer> q = new LinkedListQueue<>();
        MyQueue<Integer> a = new LinkedListQueue<>();
        MyQueue<Integer> b = new LinkedListQueue<>();
  
        
        a.enqueue(2);
        a.enqueue(4);
        a.enqueue(8);
        a.enqueue(10);

        b.enqueue(1);
        b.enqueue(4);
        b.enqueue(9);
   

    
        
        q=merge(a,b);
        System.out.println(q);


        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(4);
        a.enqueue(5);

        b.enqueue(2);
        b.enqueue(3);
        b.enqueue(5);
        b.enqueue(6);
        b.enqueue(8);

        q=merge(a,b);

        System.out.println(q);
        

     }
}