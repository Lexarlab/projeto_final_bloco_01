package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.ProdutoFruta;

public class Menu {

	public static void main(String[] args) {
		
		ProdutoController produto = new ProdutoController();
		
		/*ProdutoFruta p1 = new ProdutoFruta("Manga", 1234, 2.50f , "Toprical");
		produto.register(p1);
		
		ProdutoFruta p2 = new ProdutoFruta("Morango", 1274, 4.0f , "Toprical");
		produto.register(p2);
		
		ProdutoFruta p3 = new ProdutoFruta("Maracujá", 1904, 7.3f , "Citrica");
		produto.register(p3);*/
		
		Scanner scanner = new Scanner(System.in);
		
		int option, id;
		String name, category;
		float price;
		
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
			
			
			try {
				option = scanner.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				option = 0;
			}
			
			if (option == 5) {
				System.out.println("\nAté a próxima");
				about();
				scanner.close();
				System.exit(0);
			}
			
			switch(option) {
				case 1: 
					System.out.println("Cadastrar Produto\n");
					
					System.out.println("Digite o nome do Prduto: ");
					scanner.skip("\\R?");
					name = scanner.nextLine();
					System.out.println("Digite o preço: ");
					scanner.skip("\\R?");
					price = scanner.nextFloat();
					System.out.println("Digite a categoria: ");
					scanner.skip("\\R?");
					category = scanner.nextLine();
					
					produto.register(new ProdutoFruta(name, produto.generateId() , price, category));
					
					break;
				case 2: 
					System.out.println("Listar Produtos\n\n");
					produto.listAll();
					
					break;
				case 3:
					System.out.println("Atualizar Produtos\n\n");
				    
				    System.out.println("Digite o Id do produto: ");
				    id = scanner.nextInt();
				    
				    var searchProduct = produto.searchInCollection(id);
				    
				    if (searchProduct != null) {
				        System.out.println("Digite o novo preço: ");
				        float newPrice = scanner.nextFloat();
				        
				        System.out.println("Digite o novo Nome: ");
				        scanner.skip("\\R?");
				        String newName = scanner.nextLine();
				        
				        System.out.println("Digite o nova Categoria: ");
				        scanner.skip("\\R?");
				        String newCategory = scanner.nextLine();
				        
				        ProdutoFruta productUpdate = new ProdutoFruta(newName, id, newPrice, newCategory);
				        
				        produto.update(productUpdate);
				        
				        System.out.println("Produto atualizado com sucesso!");
				    } else {
				        System.out.println("Produto não encontrado.");
				    }
				    
				    break;
				case 4: 
					System.out.println("Deletar Produto\n\n");
					
					System.out.println("Digite o id do produto: ");
					id = scanner.nextInt();
					
					produto.delete(id);
					
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
	public static void keyPress() {
		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
	
}
