
/**
 * @author Flavia Pino
 * Projeto final DESENVOLVIMENTO DE APLICAÇÕES JAVA SOA E INTERNET DAS COISAS
 * FUNDAMENTOS DA TECNOLOGIA JAVA E MODELAGEM VISUAL UML 2.0
 * Turma 32SCJ
 *  
 */

public class Conta {
       private int nro;
       private Cliente titular;
       private double saldo;
       private double limite;
       
    public Conta(int n, Cliente t){
    	limite=100.00;
    	titular=t;
    	nro=n;
    }
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void deposito(double dimdim){
		saldo+=dimdim;
		
	}
	public boolean retirada(double dimdim){
		boolean status=false;
		if(dimdim<= (saldo+limite))	{
			saldo-=dimdim;
			status=true;
		}
		return status;
	}

	public boolean transferencia(double dimdim, Conta xpto){
		boolean status=false;
		if(retirada(dimdim)){
			xpto.deposito(dimdim);
			status=true;
		}
		return status;
	}
	
	
}
