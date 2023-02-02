import java.util.Scanner;
import java.lang.Comparable;

class Person implements Comparable<Person>{
    private String name;
    private int offer;

    Person(String n, int o){
        name = n;
        offer = o;
    }

    public String getName(){return name;}
    public int getOffer(){return offer;} 

    // comparador
    /*
     * queremos que as maiores ofertas tenham maior prioridade
     * como estamos a trabalhar numa MinHeap, vamos inverter a ordem 
     * de prioridade aproveitando o comparador da classe Integer
     */
    public int compareTo(Person p){
        return -1*Integer.compare(offer, p.offer);
    }
}

public class ED215{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt(); stdin.nextLine();
        MinHeap<Person> offers = new MinHeap<>(n+1);
        for (int i = 0; i < n; i++){
            // se for lida uma oferta
            if (stdin.next().equals("OFERTA")){
                // criar nova pessoa com o nome e a sua oferta
                offers.insert(new Person(stdin.next(), stdin.nextInt()));
                // ler o \n
                stdin.nextLine();
            }
            // se for lida uma venda
            else{
                Person winner = offers.removeMin();
                System.out.println(winner.getOffer() + " " + winner.getName());
            }
        }
    }
}