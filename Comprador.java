package cachorroQuenteGeraArvore;

import java.util.Scanner;

public class Comprador {

    private String nomeComprador;
    private int numeroMatricula;
    private Scanner armazenaInformacoes;

    public Comprador() {
        this.armazenaInformacoes = new Scanner(System.in);
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void armazenaInformacoes() {
        System.out.println("Entre com o nome do comprador:...........");
        setNomeComprador(armazenaInformacoes.nextLine());

        System.out.println("Entre com o numero de matricula do comprador:...........");
        setNumeroMatricula(armazenaInformacoes.nextInt());
    }

    public void printInformacoes() {
        System.out.println(" - Nome do Cliente:..........." + getNomeComprador());
        System.out.println(" - Numero de Matricula do Cliente:..........." + getNumeroMatricula());
    }

}
