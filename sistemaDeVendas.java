package cachorroQuenteGeraArvore;

public class sistemaDeVendas {

	public static void main(String[] args) {

		Sistema_e_Opcoes Sistema = new Sistema_e_Opcoes();

		Sistema.Iniciar();
		Comprador ClienteA = new Comprador();

		ClienteA.armazenaInformacoes();

		Sistema_e_Opcoes.opcoesCardapio();

		CachorroQuente.anotarPedidos();

		ClienteA.printInformacoes();

	}

}
