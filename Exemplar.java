package SistemaDeLocadora;

import java.util.Date;

public class Exemplar {
	private int id;
	private int sequencial;
	private Date dataRegistro;
	private Acervo acervo;
	public Exemplar(int id, int sequencial, Date dataRegistro, Acervo acervo) {
		super();
		this.id = id;
		this.sequencial = sequencial;
		this.dataRegistro = dataRegistro;
		this.acervo = acervo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSequencial() {
		return sequencial;
	}
	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public Acervo getAcervo() {
		return acervo;
	}
	public void setAcervo(Acervo acervo) {
		this.acervo = acervo;
	}
}
