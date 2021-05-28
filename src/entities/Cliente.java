package entities;

// classe de modelo de dados para entidade Cliente
public class Cliente {

	// Padrão JAVABEAN
	// atributos(campos/ dados)
	// private --> acesso somente dentro da propria classe
	private Integer IdCliente;
	private String nome;
	private String email;
	private String cpf;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	// sobrecarga de método construtor(Overloading)
	public Cliente(Integer idCliente, String nome, String email, String cpf) {
		super();
		IdCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	public Integer getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(Integer idCliente) {
		IdCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [IdCliente=" + IdCliente + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + "]";
	}

}
