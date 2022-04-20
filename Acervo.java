package SistemaDeLocadora;

import java.util.LinkedList;

public class Acervo {
	private int id;
	private String codigo;
	private String titulo;
	private float valor;
	private LinkedList<Exemplar>exemplares;
	private TipoMidia tipoMidia;
	private TipoAcervo tipoAcervo;
	private TipoClassificacao tipoClassificacao;
	public Acervo(int id, String codigo, String titulo, float valor, LinkedList<Exemplar> exemplares,
			TipoMidia tipoMidia, TipoAcervo tipoAcervo, TipoClassificacao tipoClassificacao) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
		this.valor = valor;
		this.exemplares = exemplares;
		this.tipoMidia = tipoMidia;
		this.tipoAcervo = tipoAcervo;
		this.tipoClassificacao = tipoClassificacao;
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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public LinkedList<Exemplar> getExemplares() {
		return exemplares;
	}
	public void setExemplares(LinkedList<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	public TipoMidia getTipoMidia() {
		return tipoMidia;
	}
	public void setTipoMidia(TipoMidia tipoMidia) {
		this.tipoMidia = tipoMidia;
	}
	public TipoAcervo getTipoAcervo() {
		return tipoAcervo;
	}
	public void setTipoAcervo(TipoAcervo tipoAcervo) {
		this.tipoAcervo = tipoAcervo;
	}
	public TipoClassificacao getTipoClassificacao() {
		return tipoClassificacao;
	}
	public void setTipoClassificacao(TipoClassificacao tipoClassificacao) {
		this.tipoClassificacao = tipoClassificacao;
	}
	public void AdicionarExemplo(Exemplar exemplar) {
		this.exemplares.add(exemplar);
		
	}
}
