package prjConta;
import java.util.Scanner;
public class Conta {
	Scanner in = new Scanner(System.in);
	
	private String nome;
	private double saldo = 0;
	private double limiteCheque = 1000;
	private double limiteAprovado = 1000;

	
	
	public Conta(){ 
		System.out.println("======================================");
		System.out.println("||             Bem Vindo            ||"); 
		System.out.println("||     CONTA ABERTA COM SUCESSO     ||"); 
		System.out.println("======================================");
		System.out.println("||   SEU SALDO ATUALMENTE É "+ "R$ "+ saldo+"  ||");
		System.out.println(" ");
		System.out.println("||         FAÇA UM DEPÓSITO         ||");
		System.out.println("======================================");
	}
	
	public void setSaldo(double saldo){
		this.saldo=saldo;	
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public void setLimiteCheque(double limiteCheque) {
		this.limiteCheque=limiteCheque;
	}
	public double getLimiteCheque() {
		return limiteCheque;
	}
	

	public void setlimiteAprovado(double limiteAprovado) {
		this.limiteAprovado = limiteAprovado;
	}
	public double getLimiteAprovado() {
		return limiteAprovado;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	
	public void abreConta(String nome,double saldo, double limiteAprovado){
		
	}
	
	public void depositar(double saldo){
		saldo = this.saldo;
	}
	public double exibir() {
		return saldo;
	}
	public void saque ( double valorSaque) {
		if(this.saldo >= valorSaque) {
			this.saldo = this.saldo- valorSaque;
			System.out.println("saque feito com sucesso");
			exibir();
		}else if(this.saldo + this.limiteAprovado >= valorSaque){
			double pagConta;
			double deve;
			double resto = valorSaque-this.saldo ;	
			this.limiteCheque = this.limiteCheque-resto;
			this.saldo = 0;
			System.out.println("======================================");
			System.out.println("||     SAQUE FEITO COM SUCESSO      ||");
			System.out.println("  ");
			System.out.println("||MAS FOI USADO SEU LIMITE DO CHEQUE||");
			System.out.println("  ");
			System.out.println("||     AGORA SEU LIMITE É: "+this.limiteCheque+"    ||");
			System.out.println("  ");
			System.out.println("||        E SEU SALDO "+saldo+"           ||");
			System.out.println("  ");
			deve = limiteAprovado - limiteCheque;
			System.out.println("VOCE ESTA DEVENDO "+deve);
			System.out.println("FAÇA UM DEPÓSITO PARA PAGAR SUA DIVIDA");
			pagConta = in.nextDouble();
				if(pagConta>limiteCheque){
					 resto = pagConta-limiteCheque ; 
					 limiteCheque = limiteCheque+resto;
					 resto = limiteCheque - resto;
					 saldo = saldo + resto;
					 System.out.println("seu saldo "+saldo);
					 
				}else{
				 limiteCheque = limiteCheque+pagConta;	
				 System.out.println("SEU LIMITE AGORA É "+limiteCheque);
				 System.out.println("SEU SALDO É "+saldo);
				 
				}
			}else {
			System.out.println("||         SALDO INSUFICIENTE       ||");
			}
	}
	
	
}