
/**
 * @author Flavia Pino
 * Projeto final DESENVOLVIMENTO DE APLICAÇÕES JAVA SOA E INTERNET DAS COISAS
 * FUNDAMENTOS DA TECNOLOGIA JAVA E MODELAGEM VISUAL UML 2.0
 * Turma 32SCJ
 *  
 */
public abstract class Cliente {
	// dados basicos para o cadastro do cliente
	
	private String nome;
	private String cpf;
	private String email;
	private String celular;
	private String tpCliente;
	
	// Inicializador da classe cliente. O cliente pode ser Titular ou Dependente
	Cliente(String n, String cpf, String e, String c, String tpCli) {}

}
