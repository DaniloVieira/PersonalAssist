package br.com.personalAssist.exercicio;

import java.util.List;

import br.com.personalAssist.personal.Personal;
import br.com.personalAssist.treino.Treino;

public interface ExercicioDAO {
	
	
	public void salvar(Exercicio treino);

	public void atualizar(Exercicio treino);

	public void excluir(Exercicio treino);

	public Exercicio carregar(Integer codigo);
	
	public List<Exercicio> listarExercicioPorGrupoMuscular(String grupo);

	public Treino buscarPorLogin(String login);

	public List<Personal> listar();

}
