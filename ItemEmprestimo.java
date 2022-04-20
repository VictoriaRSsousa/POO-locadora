package SistemaDeLocadora;


public class ItemEmprestimo {
	private int id;
	private float valor;
	private Emprestimo emprestimo;
	private Exemplar exemplar;
	public ItemEmprestimo(int id, float valor, Emprestimo emprestimo, Exemplar exemplar) {
		super();
		this.id = id;
		this.valor = valor;
		this.emprestimo = emprestimo;
		this.exemplar = exemplar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Emprestimo getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	public Exemplar getExemplar() {
		return exemplar;
	}
	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}
	public float CalcularvalorItem() {
		return 0;
	}

}
