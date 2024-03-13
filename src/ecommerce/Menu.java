package ecommerce;

import java.util.Scanner;

import ecommerce.model.ProdutoFruta;

public class Menu {

	public static void main(String[] args) {
		
		ProdutoFruta p1 = new ProdutoFruta("Manga", 1234, 2.50f , "Toprical");
		p1.view();
		
		Scanner scanner = new Scanner(System.in);
		
		int option; 
		
		while(true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     HORTIFRUTI                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Atualizar Produtos                   ");
			System.out.println("            4 - Deletar Produto                      ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			option = scanner.nextInt();
			
			if (option == 5) {
				System.out.println("\nAté a próxima");
				about();
				scanner.close();
				System.exit(0);
			}
			
			switch(option) {
				case 1: 
					System.out.println("Cadastrar Produto\n\n");
					break;
				case 2: 
					System.out.println("Listar Produtos\n\n");
					break;
				case 3:
					System.out.println("Atualizar Produtos\n\n");
					break;
				case 4: 
					System.out.println("Deletar Produto\n\n");
					break;
				default:
					System.out.println("\nEscolha uma opção válida\n");
					break;
			}
			
		}
		
	}
	public static void about() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Alexia Bezerra ");
		System.out.println("github.com/Lexarlab");
		System.out.println("*********************************************************");

	}

}
