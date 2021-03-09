package exercicio02;

import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.Start();
		
		
	}

	private void Start() {
		
		System.out.print("Digite o valor do produto: ");
		Scanner obterValorDoUsuario = new Scanner(System.in);
		
		double valor = obterValorDoUsuario.nextDouble();
		int valorComCast = (int) valor;
		System.out.println("valor com casa decimais: " + valor + " | Valor Inteiro: "+ valorComCast);
	
		
	
	}
}
