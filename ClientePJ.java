package Projeto;

public class ClientePJ extends Cliente{
	private String CNPJ;
	
	public ClientePJ(String nome, String endereco, String email, String CNPJ) {
		super(nome, endereco, email);
		this.CNPJ = CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	

}