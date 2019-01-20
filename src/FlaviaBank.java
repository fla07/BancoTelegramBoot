/**
 * @author Flavia Pino
 * Projeto final DESENVOLVIMENTO DE APLICAÇÕES JAVA SOA E INTERNET DAS COISAS
 * FUNDAMENTOS DA TECNOLOGIA JAVA E MODELAGEM VISUAL UML 2.0
 * Turma 32SCJ
 *  
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class FlaviaBank {
   ArrayList<Conta> contas;
   ArrayList<Cliente> correntistas;
	public FlaviaBank(){
	   contas=new ArrayList<Conta>(1);
	   correntistas=new ArrayList<Cliente>(1);
   }
	
	public static void main(String[] args) {
		String nomeaux, emailaux, tpClienteaux;
		FlaviaBank b=new FlaviaBank();
		Scanner in =new Scanner(System.in);
		int op = 00;
		while(op != 0){
			 System.out.println("Bem-vindo ao Flavia Bank");
			 System.out.println("1->Incluir Cliente");
			 System.out.println("2->Incluir Conta Corrente");
			 System.out.println("3->Incluir Conta Poupança");
			 System.out.println("4-> Listar dados do Cliente");
			 System.out.println("5-> Depósito");
			 System.out.println("6-> Emprestimo");
			 System.out.println("7-> Saque");
			 System.out.println("8-> Extrato");
			 System.out.println("9-> Lançamentos");
			 System.out.println("10-> Tarifas");
			 System.out.println("11-> Saldo Devedor");
			 System.out.println("0 ->Finalizar contato ");
			 op=in.nextInt();
			 in.nextLine();
			 switch(op){
			 
			 	case 1: 
			 		    System.out.println("Digite o nome do Cliente");
			 		    nomeaux=in.nextLine();
			 		    if(b.verificaCliente(nomeaux)== -1 ){
			 		    	System.out.println("Digite o email do Cliente");
			 		    	emailaux=in.nextLine();
			 		    	tpClienteaux = in.nextLine();
							b.cadastrarClientes(nomeaux, emailaux, tpClienteaux);
			 		    }else{
				 		    System.out.println("Cliente ja Cadastrado!");
			 		    }
			 			break;
			 	case 2: b.cadastrarContas();
			 			break;
			 	case 3: b.listarClientes();
			 	        break;
			 	case 9: System.exit(0);
			 			break;
			 	default:
			 		    System.out.println("Opcao invalida!");
			 		    break;
			 }
		}
	}
	
	public void cadastrarClientes(String n, String e, String tpC){
	     correntistas.add(new Cliente(n,e,tpC));	
	}
	public void cadastrarContas(){
		
	}
	
	public void listarClientes(){
		 for(int i=0;i<correntistas.size();i++){
			 System.out.println(correntistas.get(i).getNome()+" email: "+
					 correntistas.get(i).getEmail());
		 }
		 
		 for(Cliente x: correntistas){
			 System.out.println(x.getNome()+" "+x.getEmail());
		 } 
	}
	public int verificaCliente(String n){
		int status=-1;
		 for(int i=0;i<correntistas.size();i++){
			 if(n.equals(correntistas.get(i).getNome())){
				 status=i;
				 break;
			 }
		 } 
		
		
		return status;
	}
	
}
