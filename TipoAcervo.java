package SistemaDeLocadora;

public enum TipoAcervo {
	FILME(1),VIDEOGAME(2),MUSICA(3);
	
	private int opcao;

	private TipoAcervo(int opcao) {
		this.opcao = opcao;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	};
	

}
