package Lanchonete;

public class Combo {
	
	private Burger burger = new Burger();
	private Bebida bebida = new Bebida();
	private Sobremesa sobremesa = new Sobremesa();
	
	
	
	public void CriarCombo(int tipo) {
		
		
		int tipo1 = 0;
		
		switch(tipo1) {
		
		case 1: System.out.println("Combo 1: ");
		burger.GramasBurguer();
		bebida.TipoBebida();
		sobremesa.TipoSobremesa();
		
		case 2: System.out.println("Combo 2: ");
		burger.GramasBurguer();
		bebida.TipoBebida();
		sobremesa.TipoSobremesa();
		
	
	}
}
	
	public void MostraCombo(int tipo) {
		if(tipo == 1) {
			System.out.println("Burger de: 180 gramas, Sobremesa pequena e Bebida 200 ML.");
		}
		else {
			System.out.println("Burguer 400 gramas, Sobremesa grande e Bebida 500 ML.");
		}
		
	}
	
}

