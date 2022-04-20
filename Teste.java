package SistemaDeLocadora;
import java.util.LinkedList;

public class Teste {

	public static void main(String[] args) {
	
		Emprestimo em = new Emprestimo(00,"123",(float)3.50,(float)2.00,(float)5.50, new LinkedList<ItemEmprestimo>(),cl);
		
		Cliente cl = new Cliente(01,"321","victoria","av.treze de maio","benfica","54646321354","54168452");
		
		ItemEmprestimo ip1 = new ItemEmprestimo(00,(float)3.00,em,ex1);
		ItemEmprestimo ip2 = new ItemEmprestimo(01,(float)3.00,em,ex2);
		
		Acervo ac1 = new Acervo(00,"654684","amarelo",(float)3.00,new LinkedList<Exemplar>(),TipoMidia.CD,TipoAcervo.FILME,TipoClassificacao.BRONZE);
		Acervo ac2 = new Acervo(01,"6456845","rosa",(float)3.00,new LinkedList<Exemplar>(),TipoMidia.CD,TipoAcervo.FILME,TipoClassificacao.BRONZE);
		
		Exemplar ex1 = new Exemplar(00,00,(Date)15122030,ac1);
		Exemplar ex2 = new Exemplar(01,01,(Date)10102001,ac2);
		
		ac1.AdicionarExemplo(ex1);
	}

}
