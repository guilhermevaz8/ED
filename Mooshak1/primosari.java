import java.util.Scanner;
public class primosari {

    // Procedimento para usar o algoritmo do Crivo de Eratóstenes
    public static void sieve(int nn, boolean prime[]) {
        // meter vetor tudo verdade
		for(int i=2;i<=nn;i++){
			prime[i]=true;
		}
		//descobrir multiplos
		for(int j=2;j<=nn;j++){  // <--- Multiplicador (K) 
			for (int i=2;i<=nn;i++){		// <-- Avancar o numero pelo qual multiplica (Ki) 
				if((j*i)>nn){
					break;
				}
				else
					prime[j*i]=false;
				
			}
		}
    }
    
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
	    int n=read.nextInt();
        int nn=read.nextInt();
        int counter=0;
    	boolean[] prime = new boolean[nn+1];

	    sieve(nn, prime);

	    for (int i=n; i<=nn; i++){
	        if (prime[i])
		    counter++;
    }
    System.out.println(counter);
}}