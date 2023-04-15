package prjConta;
import java.util.Scanner;

public class AppConta {

	public static void main(String[] args) {
		String nome;
		String r = "S";
		String i = "s";

		
		Scanner in = new Scanner (System.in);
		Conta c = new Conta();
		System.out.println("||          DIGITE SEU NOME:        ||" );
		c.setNome(in.next());
		System.out.println("======================================");
		System.out.println("||   DIGITE O VALOR DO DEPÓSITO:    ||" );
		c.setSaldo(in.nextDouble());
		System.out.println("   ");
		
		System.out.println("AGORA SEU SALDO É "+ c.getSaldo());
		System.out.println("--------------------------------------");
		System.out.println("||   DESEJA FAZER UM SAQUE?[S/N]:   ||");
		r=in.next();
		if(r.equalsIgnoreCase("S")){
			System.out.println("||      QUAL O VALOR DO SAQUE?      ||");
			c.saque(in.nextDouble());
			System.out.println("======================================");
			System.out.println("||            FECHANDO...           ||");
			System.out.println("======================================");
			
		}

		else {
			System.out.println("======================================");
			System.out.println("||            FECHANDO...           ||");
			System.out.println("======================================");
		}
		c.saque(in.nextDouble());
		System.out.println(c.getSaldo());
		
	}

}	
