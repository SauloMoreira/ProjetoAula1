package main;

import entities.Cliente;
import repositories.ClienteRepoitory;

public class Principal {

	public static void main(String[] args) {
		// imprimir mensagem no console
		// syso + CRTL + espaço
		// CRTL + SHFIT +F IDENTA
		// CRTL + F11 RODA
		System.out.println("\n --- Projeto Controle de Cliente --- \n");
		// criar objeto para classe Cliente
		Cliente cliente = new Cliente(1, "Saulo Moreira", "saulo@gmail.com", "123.456.789-00");// instância..

		/// imprimir
		System.out.println("Dados do Cliente: ");
		System.out.println(cliente.toString());
		
		ClienteRepoitory clienteRepoitory = new ClienteRepoitory();
		try {
			clienteRepoitory.exportardados(cliente);
			System.out.println("Arquivo gravado com sucesso");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("\n ocorreu um erro!");
			System.out.println(e.getMessage());
		}
	}

}
