package br.com.personalAssist.tipoExercicio;

import java.util.List;

import br.com.personalAssist.enumeration.GrupoMuscular;
import br.com.personalAssist.personal.Personal;
import br.com.personalAssist.treino.Treino;

public interface TipoExercicioDAO {

	public void salvar(Treino treino);

	public void atualizar(Treino treino);

	public void excluir(Treino treino);

	public TipoExercicio carregar(Integer codigo);
	
	public List<TipoExercicio> listarExercicioPorGrupoMuscular(GrupoMuscular grupo);


	public List<Personal> listar();

	
}
