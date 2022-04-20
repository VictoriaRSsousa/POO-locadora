package SistemaDeLocadora;

import java.util.Date;
import java.util.LinkedList;

public class Emprestimo {
	private int id;
	private String codigo;
	private float valorEmprestimo;
	private float valorMulta;
	private float valorTotal;
	private LinkedList<ItemEmprestimo> items;
	private Cliente cliente;
	public Emprestimo(int id, String codigo,float valorEmprestimo, float valorMulta, float valorTotal, LinkedList<ItemEmprestimo> items,
			Cliente cliente) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.valorEmprestimo = valorEmprestimo;
		this.valorMulta = valorMulta;
		this.valorTotal = valorTotal;
		this.items = items;
		this.cliente = cliente;
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
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Date getDataEntregaPrevista() {
		return dataEntregaPrevista;
	}
	public void setDataEntregaPrevista(Date dataEntregaPrevista) {
		this.dataEntregaPrevista = dataEntregaPrevista;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public float getValorEmprestimo() {
		return valorEmprestimo;
	}
	public void setValorEmprestimo(float valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
	public float getValorMulta() {
		return valorMulta;
	}
	public void setValorMulta(float valorMulta) {
		this.valorMulta = valorMulta;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public LinkedList<ItemEmprestimo> getItems() {
		return items;
	}
	public void setItems(LinkedList<ItemEmprestimo> items) {
		this.items = items;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void AdicionarItem(ItemEmprestimo item) {
		this.items.add(item);
	}
	public float valorEmprestimo() {
		valEmpres = valorMulta+
	}
}
