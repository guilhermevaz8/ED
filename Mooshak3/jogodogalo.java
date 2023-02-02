import java.util.Scanner;

class Game {
   int n;       
   char jogo[][];  

   
   Game(int n) {
      this.n = n;
      jogo = new char[n][n];
   }

   
   void read(Scanner stdin) {
      for (int i=0; i<n; i++) {
         String linha= stdin.next();
         for (int j=0; j<n; j++)
            jogo[i][j] = linha.charAt(j);
      }	
   }

   
   void win(char player) {
      System.out.println("Ganhou o " + player);
      System.exit (0);
   }

  
   void verify(int y, int x, int incy, int incx) {
      if (jogo[y][x] == '.') return;
      for (int i=0, yy=y, xx=x; i<n; i++, yy+=incy, xx+=incx)
         if (jogo[y][x] != jogo[yy][xx]) return;
      win(jogo[y][x]);
   }

   
   boolean finished() {
      for (int i=0; i<n; i++)
         for (int j=0; j<n; j++)
            if (jogo[i][j] == '.') return false;
      return true;
   }

   
   void check() {
      for (int i=0; i<n; i++) verify(i, 0, 0, 1); 
      for (int j=0; j<n; j++) verify(0, j, 1, 0); 
      verify(0, 0, 1, 1);                         
      verify(0, n-1, 1, -1);                     
	
      if (!finished()) System.out.println("Jogo incompleto");
      else             System.out.println("Empate");
	
   }    
}

public class jogodogalo {    
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Game g = new Game(n);
      g.read(in);
      g.check();
   }
}