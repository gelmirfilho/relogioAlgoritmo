import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// --------------------------------------------------
		// Unitins - TOCANTINS
		// Algoritmo feito por Gelmir Elias Baumgratz Filho
		// Para a aula de Sistemas Operacionais
		// --------------------------------------------------

		ArrayList<Pagina> lista = new ArrayList<Pagina>();
		Scanner scan = new Scanner(System.in);
		Pagina pagina = new Pagina();

		int min = 0;
		int max = 1;
		for (int i = 1; i < 11; i++) {
			lista.add(new Pagina(i, ((int) (Math.random() * (max - min + 1) + min)),
					((int) (Math.random() * (max - min + 1) + min))));
		}
		System.out.println("Lista circular criada, o primeiro da fila SEMPRE é o mais antigo: \n \n" + lista
				+ "\n");

		int escolha = 0;
		while (escolha == 0) {
			System.out.println("------------------------------------------------");
			System.out.println(" Digite 1 para a substituir uma página \n ");
			System.out.println("\n Digite 2 para desligar o computador");
			System.out.println("------------------------------------------------");
			escolha = scan.nextInt();

			if (escolha == 1) {
				for (int i = 0; i < 11; i++) {
					if (lista.get(0).r == 0) {
						lista.remove(0);
						lista.add(new Pagina(pagina.maiorId(lista)+1, ((int) (Math.random() * (max - min + 1) + min)),
								((int) (Math.random() * (max - min + 1) + min))));
						System.out.println(lista + "\n");
						System.out.println("A nova página foi substituida com sucesso");
						escolha = 0;
						break;
					} else {
						lista.add(lista.remove(0));
					}
				}
			} else if (escolha == 2) {
				System.out.println("Computador desligado");
				System.out.println("Criado por Gelmir Elias");
				lista.removeAll(lista);
				scan.close();
			}
		}
	}
}
