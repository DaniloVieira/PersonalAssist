package br.com.personalAssist.enumeration;

public enum GrupoMuscular {
	
	COSTAS(1, "costas"),
	PEITO(2 , "peito"),
	PERNA(3 , "perna"),
	OMBRO(4 , "ombro"),
	ABDOMEM(5, "abdomem");
	
	
	private int idGrupo;
	private String nome;
	
	public static GrupoMuscular get(int i){
		
		switch (i) {
		case 1: return COSTAS;
		case 2: return PEITO;
		case 3: return PERNA;
		case 4: return OMBRO;
		case 5: return ABDOMEM;
		}
		
		return null;
	}
	
	private GrupoMuscular(int idGrupo, String nome) {
		this.idGrupo = idGrupo;
		this.nome = nome;
	}



	public int getIdGrupo() {
		return idGrupo;
	}



	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
