package cachorroQuenteGeraArvore;

public class Sistema_e_Opcoes {
	
	public void Iniciar() {
		System.out.println("	-= BEM-VINDO AO SISTEMA DE VENDAS HOTDOGS UFC! =-	");
		System.out.println(" Nosso sistema foi montado para que tanto alunos quanto professores possam");
		System.out.println("realizar os pedidos de acordo como desejarem, considerando as opcoes disponiveis.");
	}

	public static void opcoesCardapio() {
		System.out.println("");
		System.out.println("		- Cardápio -		");
		System.out.println("Proteinas: "
				+ "- Salsicha"
				+ " - Linguica"
				+ " - Frango"
				+ " - Bacon");
		System.out.println("Queijos: "
				+ "- Mussarela"
				+ " - Prato"
				+ " - Parmesao"
				+ " - Coalho");
		System.out.println("Bebidas: "
				+ "- Coca Cola"
				+ " - Delrio"
				+ " - Suco do Chaves");
	}
}
