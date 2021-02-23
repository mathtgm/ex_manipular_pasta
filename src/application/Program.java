package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// Listar todas as pastas do caminho
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for (File folder : folders) {
			System.out.println(folder.getName());
		}
		System.out.println();

		// Listar todos arquivo do caminho
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for (File file : files) {
			System.out.println(file.getName());
		}
		System.out.println();
		// Criar uma pasta no caminho
		boolean success = new File(strPath + "\\Nova Pasta").mkdir();
		if (success)
			System.out.println("Pasta criada com sucesso: " + success);
		
		//Excluir uma pasta
		new File(strPath + "\\Nova Pasta").delete();
		sc.close();
	}

}
