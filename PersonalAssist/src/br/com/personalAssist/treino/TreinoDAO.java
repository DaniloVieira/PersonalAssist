package br.com.personalAssist.treino;

import java.util.List;

import br.com.personalAssist.personal.Personal;

public interface TreinoDAO {
	
	public void salvar(Treino treino);

	public void atualizar(Treino treino);

	public void excluir(Treino treino);

	public Treino carregar(Integer codigo);

	public Treino buscarPorLogin(String login);

	public List<Personal> listar();

}
