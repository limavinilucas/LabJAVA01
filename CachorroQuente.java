package cachorroQuenteGeraArvore;

import java.util.Scanner;

public class CachorroQuente {

	String[] opcaoProteina = { "Salsicha", "Linguica", "Frango", "Bacon" };
	String[] opcaoQueijo = { "Mussarela", "Prato", "Parmesao", "Coalho" };
	String[] opcaoBebida = { "Coca Cola", "Delrio", "Suco do Chaves" };
	int qntHotDogs;

	CachorroQuente() {

	}

	CachorroQuente(String opcaoProteina[], String opcaoQueijo[], String opcaoBebida[], String qntHotDogs[]) {
		this.opcaoProteina = opcaoProteina;
		this.opcaoQueijo = opcaoQueijo;
		this.opcaoBebida = opcaoBebida;

		int cont = 0;

		for (cont = 0; cont < opcaoProteina.length; cont++) {
			String contadorOpcoes = opcaoProteina[cont];
			System.out.println(cont + "a opcao: " + contadorOpcoes);
		}
	}

	private boolean verificarOpcao(String[] opcoes, String opcao) {
		for (String item : opcoes) {
			if (item.equalsIgnoreCase(opcao)) {
				return true;
			}
		}
		return false;
	}

	public static void anotarPedidos() {
		String opcaoProteina = "";
		String opcaoQueijo = "";
		String opcaoBebida = "";

		Scanner armazenaPedidos = new Scanner(System.in);
		Scanner hotDogsQnt = new Scanner(System.in);

		CachorroQuente pedidoCliente = new CachorroQuente();
		
		System.out.println(" - Digite a quantidade de Cachorros Quentes voce deseja: ");
		pedidoCliente.qntHotDogs = hotDogsQnt.nextInt();

		while (pedidoCliente.verificarOpcao(pedidoCliente.opcaoProteina, opcaoProteina) == false) {
			System.out.println("Digite sua opcao de Proteina:");
			opcaoProteina = armazenaPedidos.nextLine();

			if (pedidoCliente.verificarOpcao(pedidoCliente.opcaoProteina, opcaoProteina) == false) {
				System.out.println("Opcao de Proteina Invalida! Digite uma opcao valida de Proteina: ");
				opcaoProteina = armazenaPedidos.nextLine();

			}

		}
		while (pedidoCliente.verificarOpcao(pedidoCliente.opcaoQueijo, opcaoQueijo) == false) {
			System.out.println("Digite sua opcao de Queijo: ");
			opcaoQueijo = armazenaPedidos.nextLine();
			if (pedidoCliente.verificarOpcao(pedidoCliente.opcaoQueijo, opcaoQueijo) == false) {
				System.out.println("Opcao de Queijo Invalida! Digite uma opcao valida de Queijo: ");
				opcaoQueijo = armazenaPedidos.nextLine();
			}
		}
		while (pedidoCliente.verificarOpcao(pedidoCliente.opcaoBebida, opcaoBebida) == false) {
			System.out.println("Digite sua opcao de Bebida: ");
			opcaoBebida = armazenaPedidos.nextLine();
			if (pedidoCliente.verificarOpcao(pedidoCliente.opcaoBebida, opcaoBebida) == false) {
				System.out.println("Opcao Invalida! Digite uma opcao valida de Bebida: ");
				opcaoBebida = armazenaPedidos.nextLine();
			}
		}

		System.out.println("Seu pedido foi: ");
		System.out.println("Quantidade de Hot-Dogs: " + pedidoCliente.qntHotDogs);
		System.out.println(opcaoProteina + ", \n" + opcaoQueijo + ",\n" + opcaoBebida + ".");

		hotDogsQnt.close();
		armazenaPedidos.close();

	}

}