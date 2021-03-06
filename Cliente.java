package SistemaDeLocadora;

public class Cliente {
	private int id;
	private String codigo;
	private String nome;
	private String endereco;
	private String bairro;
	private String telefone;
	private String cep;
	public Cliente(int id, String codigo, String nome, String endereco, String bairro, String telefone, String cep) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.telefone = telefone;
		this.cep = cep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
