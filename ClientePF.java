package Projeto;

public class ClientePF extends Cliente{
	private String cpf;
	
	public ClientePF(String nome,String endereco,String email,String cpf) {
		super(nome,endereco,email);
		this.cpf = cpf;
		
		
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
