package principal;
import banco.Conta;
import banco.Lista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import banco.Endereco;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lista lista = new Lista();
		String nome, rua, cidade;
		double saldo;
		int sair = 1;
		
		do {
			
			System.out.println("**********************************************");
			System.out.println("Digite as informações da conta");
			
			System.out.println("**********************************************");
			System.out.print("Digite o nome do titular -> ");
			nome = sc.nextLine();
			System.out.println("**********************************************");
			
			System.out.print("Digite o saldo da conta -> ");
			saldo = sc.nextDouble();
			sc.nextLine();
			System.out.println("**********************************************");
			
			System.out.print("Digite a rua -> ");
			rua = sc.nextLine();
			System.out.println("**********************************************");
			
			System.out.print("Digite a cidade -> ");
			cidade = sc.nextLine();
			System.out.println("**********************************************");
			
			lista.setConta(new Conta(nome, saldo, new Endereco(rua, cidade)));
		
			for(Conta i: lista.getConta()) {
				System.out.println(i);
			}
			
		}while(sair != 0);
	//teste teste teste	
	}
}
