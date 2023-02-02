import java.util.Scanner;

class Process{
        String name;
        int time;
        
        Process (String name, int time){
            this.name=name;
            this.time=time;
        }
        public int time(){
            return time;
        }
        

        public String name(){
            return name;
        }

        public void SetTime(int time){
            this.time=time;

        }

        
    }
    public class ED237eu {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            MyQueue<Process> fila=new LinkedListQueue<>();
            int tempomax=in.nextInt();
            int ite=0;
            int tempopassado=0;
            int numeroprocesso=in.nextInt();
            Process processosair;
            for (int i=0;i<numeroprocesso;i++){
                String nomeprocesso=in.next();
                int tempoNecessario=in.nextInt();
                Process p=new Process(nomeprocesso, tempoNecessario);
                fila.enqueue(p);
            }
            while(!fila.isEmpty()){
                int tempodepoisite=fila.first().time()-tempomax;
                ite++;
                if (tempodepoisite==0){
                    tempopassado+=tempomax;
                    processosair=fila.dequeue();
                    System.out.println(processosair.name()+" "+ tempopassado+" "+ite);
                }
                else if (tempodepoisite<0){
                    tempopassado+=fila.first().time();
                    processosair=fila.dequeue();
                    System.out.println(processosair.name()+" "+ tempopassado+" "+ite);
                }
                else{
                    tempopassado+=tempomax;
                    processosair=fila.dequeue();
                    processosair.SetTime(processosair.time()-tempomax);
                    fila.enqueue(processosair);


                }
            }   
            }
        }    

