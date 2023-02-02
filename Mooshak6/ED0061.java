public class ED0061 {

    static int converterparaint(String a){
        return (a.split(" ").length);
    }
    
    static void game(int players, int words, String names[]){
        CircularLinkedList<String> roda= new CircularLinkedList<>();
        for(int i=0;i<players;i++)
            roda.addLast(names[i]);
        while(roda.size()>1){
            for (int i=2;i<words;i++)
                roda.rotate();
            roda.removeFirst();
        }
    }
    
}
