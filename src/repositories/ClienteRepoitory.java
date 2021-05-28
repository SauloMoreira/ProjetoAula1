package repositories;

import java.io.FileWriter;

import entities.Cliente;

//classe para iplementar as operações de cliente
// em gravação, leitura etc em arquivo
public class ClienteRepoitory {

	public void exportardados(Cliente cliente) throws Exception {
		
		//abrir um arquivo em modo de escrita
		FileWriter fileWriter = new FileWriter("c:\\temp\\cliente.txt");
		
		//escrever os dados do cliente neste arquivo
		fileWriter.write(cliente.toString());
		
		//salvar e fechar o arquivo
		fileWriter.flush();
		fileWriter.close();
		
	}
	
}
