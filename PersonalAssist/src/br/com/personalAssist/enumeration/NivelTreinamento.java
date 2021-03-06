package br.com.personalAssist.enumeration;

public enum NivelTreinamento {
	
	INICIANTE (1 , "iniciante"),
	INTERMEDIARIO (2 , "intermediário"),
	AVANCADO (3 , "avançado"),
	ATLETA (4 , "atleta");

	private int idNivel;
	private String descricao;
	
	private NivelTreinamento (int idNiverl, String descicao){
		this.idNivel = idNiverl;
		this.descricao = descicao;
	}
	
	public static NivelTreinamento get(int i){
		
		switch (i) {
		case 1: return INICIANTE;
		case 2: return INTERMEDIARIO;
		case 3: return AVANCADO;
		case 4: return ATLETA;
		}		
		return null;
	}

	public int getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
