//Demonstra o escopo de bloco 
public class ScopeDemo {
	public static void main(String arg[]) {
		int x; // conhecida pelo c�digo dentro de main ()
		
		x = 10;
		if (x == 10) { // inicia novo escopo
			
			int y = 20; // conhecida apenas nesse bloco
			
			//tanto x quanto y s�o conhecidas aqui.
			System.out.println("x and y: " + x+ " " + y);
			x = y * 2;
		}
		// y = 100; Erro! Y n�o � conhecida aqui 
		
		// x ainda � conhecida aqui.
		System.out.print("x is " +x);
	}

}
