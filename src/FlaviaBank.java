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
		String nomeaux, emailaux;
		FlaviaBank b=new FlaviaBank();
		Scanner in =new Scanner(System.in);
		int op=0;
		while(op != 9){
			 System.out.println("Tabajara Bank");
			 System.out.println("1->Incluir Cliente  ");
			 System.out.println("2->Incluir Conta Corrente");
			 System.out.println("3-> Listar Clientes");
			 System.out.println("9->Finalizar programa ");
			 op=in.nextInt();
			 in.nextLine();
			 switch(op){
			 
			 	case 1: 
			 		    System.out.println("Digite o nome do Cliente");
			 		    nomeaux=in.nextLine();
			 		    if(b.verificaCliente(nomeaux)== -1 ){
			 		    	System.out.println("Digite o email do Cliente");
			 		    	emailaux=in.nextLine();
			 		    	b.cadastrarClientes(nomeaux, emailaux);
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
	
	public void cadastrarClientes(String n, String e){
	     correntistas.add(new Cliente(n,e));	
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
