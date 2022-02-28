package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	public void pVet1000(int[] vet1000) {
		
//		Concatena Vetor de 1000
		double tempoInicial = System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
		    vet1000[i] = 0 ;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("1000 ==>"+tempoTotal+" s.");
						
	}
	
    public void pVet10000(int[] vet10000) {
		
//		Concatena Vetor de 10000
		double tempoInicial = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
		    vet10000[i] = 0 ;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("10000 ==>"+tempoTotal+" s.");
						
	}
    
    public void pVet100000(int[] vet100000) {
		
//		Concatena Vetor de 100000
		double tempoInicial = System.nanoTime();
		
		for (int i = 0; i < 100000; i++) {
		    vet100000[i] = 0 ;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("100000 ==>"+tempoTotal+" s.");
						
	}

}
