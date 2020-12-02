import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// --------------------------------------------------
		// Unitins - TOCANTINS
		// Algoritmo feito por Gelmir Elias Baumgratz Filho
		// Para a aula de Sistemas Operacionais
		// --------------------------------------------------

		// Criando a lista do tipo Pagina.
		ArrayList<Pagina> lista = new ArrayList<Pagina>();
		Scanner scan = new Scanner(System.in);
		Pagina pagina = new Pagina();

		// Inicializando as páginas da lista com os valores de 0 ou 1.
		int min = 0;
		int max = 1;
		for (int i = 1; i < 11; i++) {
			lista.add(new Pagina(i, ((int) (Math.random() * (max - min + 1) + min)),
					((int) (Math.random() * (max - min + 1) + min))));
		}
		System.out.println("Lista circular criada, o primeiro da fila SEMPRE é o mais antigo: \n");
		System.out.println(mostrarFila(lista));

		int escolha = 0;
		while (escolha == 0) {
			// Menu com as opções.
			System.out.println("------------------------------------------------");
			System.out.println(" Digite 1 para a substituir uma página \n ");
			System.out.println("\n Digite 2 para desligar o computador");
			System.out.println("------------------------------------------------");
			escolha = scan.nextInt();

			if (escolha == 1) {
				for (int i = 0; i < 11; i++) {
					// Verifica se o ponteiro está apontado para uma página com referencia igual a
					// 0. Caso estiver o algoritmo substitui a página pela nova.
					if (lista.get(0).r == 0) {
						lista.remove(0);
						lista.add(new Pagina(pagina.maiorId(lista) + 1, ((int) (Math.random() * (max - min + 1) + min)),
								((int) (Math.random() * (max - min + 1) + min))));
						System.out.println(mostrarFila(lista) + "\n");
						System.out.println("A nova página foi substituida com sucesso");
						escolha = 0;
						break;
					} else {
						// Se o ponteiro estiver apontado para uma página com referencia igual a 1,
						// ele move o ponteiro para a próxima página.
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

	// Metodo para mostrar o ponteiro.
	public static String mostrarFila(ArrayList<Pagina> lista) {
		for (int i = 0; i < lista.size(); i++) {
			if (i == 0) {
				System.out.println(lista.get(0) + " <-------- Ponteiro");
			} else {
				System.out.println(lista.get(i));
			}
		}
		return "";
	}
}
