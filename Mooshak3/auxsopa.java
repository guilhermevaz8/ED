import java.util.Scanner;

class Game{
    int linhas;
    int colunas;
    char tabuleiro[][];
    char tabuleirofinal[][];

    Game(int x, int y){
        linhas=x;
        colunas=y;
        tabuleiro=new char[linhas][colunas];
        tabuleirofinal=new char[linhas][colunas];
    }

    void ler(Scanner stdin){
        for (int i=0;i<linhas; i++){
            String buffer=stdin.next();
            for (int j=0;j<colunas;j++){ 
                tabuleiro[i][j]=buffer.charAt(j);
                //System.out.print(tabuleiro[i][J]);
            }
        }        
    //imprimir();
    }
    
    void preenchertabuleirofinal(int linhas, int colunas){
        for (int i=0;i<linhas;i++){
            for (int j=0;j<colunas;j++)
                tabuleirofinal[i][j]='.';
        }
    //imprimir(); 
    }

    void imprimir(){
        for (int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++)
                System.out.printf("%c", tabuleirofinal[i][j]);
            System.out.println();
        }
    }

    void preenchefinal(int pos, int i, int j,String word){
        tabuleirofinal[i][j]=word.charAt(pos);
    }

    /*boolean compara(String word, int pos,int linhaatual,int colatual){
        for (int i=0; i<linhas;i++){
            for(int j=0;j<colunas;j++){
                if (tabuleiro[i][j]==(word.charAt(pos))){
                    if ((i==linhaatual+1) || (j==colatual+1) || ((j==colatual+1) && (i==linhaatual+1)) || (i==linhaatual-1) || (j==colatual-1) || ((j==colatual-1) && (i==linhaatual-1))|| ((linhaatual==i) && (colatual==j)) ){
                        preenchefinal(pos, i,j, word);
                        //linhaatual=i;
                        //colatual=j;
                        return true;}
                }
            }}
        //imprimir();
        return false;  
        }*/

    void encontrapalavra(String word, int linhas, int colunas){
        int size=word.length();
        //System.out.print(size);
        int counter=0, pos=0,linhaatual=0, colatual=0;
            for(int i=0;i<linhas;i++){
                for (int j=0;j<colunas;j++){
                    if (tabuleiro[i][j]==word.charAt(pos)){
                        linhaatual=i;                        //procura a primeira letra e guarda a posição
                        colatual=j;
                        preenchefinal(pos, i, j, word);
                        pos=1;
                        counter++;
                        break;}
                }  
            }
        
        while(counter<size){
            for (int K=0;K<colunas;K++){
                if((tabuleiro[linhaatual][K]==word.charAt(pos))&& ((Math.abs(K-colatual))==1)){
                    preenchefinal(pos, linhaatual, K, word);
                    pos++;
                    counter++;
                    colatual=K;
                }
                 
                //imprimir();
            }   
        }
        }



public class auxsopa{
    public void main(String[] args){
        Scanner stdin=new Scanner(System.in);
        int linhas=stdin.nextInt();
        int colunas=stdin.nextInt();
        Game game= new Game(linhas, colunas);
        game.preenchertabuleirofinal(linhas, colunas);
        //for (int i=0;i<linhas;i++){
            //for(int j=0;j<colunas;j++)
              //  System.out.printf("%c", tabuleirofinal[i][j]);
            //System.out.println();
        //}
        //game.imprimir();
        game.ler(stdin);
        int n=stdin.nextInt();
        while(n>0){
            String word=stdin.next();
            //System.out.print(word.charAt(0));
            game.encontrapalavra(word,linhas,colunas);
            n--;
        }
        game.imprimir();
    }
    }}

