
/**
 * @author Flavia Pino
 * Projeto final DESENVOLVIMENTO DE APLICAÇÕES JAVA SOA E INTERNET DAS COISAS
 * FUNDAMENTOS DA TECNOLOGIA JAVA E MODELAGEM VISUAL UML 2.0
 * Turma 32SCJ
 *  
 */
public abstract class Conta {
	//Dados basicos de uma conta
	private String nomeTitular;
	private String[] nomeDependente;
	private String tpConta;
	private int numeroConta;
	private int digitoConta;
	private int agencia;
	private String senha;
	private double saldo;
	
	// Inicializador da classe Conta
	// Uma conta pode ser do tipo Corrente ou do tipo Poupanca
	Conta(String nmTitular, String[] nmDep, String tpConta, int nmConta, int dgConta, int agencia, String senha, double saldo) {}

}
