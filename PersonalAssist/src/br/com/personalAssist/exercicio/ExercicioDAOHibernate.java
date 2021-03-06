package br.com.personalAssist.exercicio;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.personalAssist.personal.Personal;
import br.com.personalAssist.treino.Treino;

@Repository
public class ExercicioDAOHibernate implements ExercicioDAO {

	@Autowired
	private SessionFactory	sessionFactory;

	@Override
	public List<Exercicio> listarExercicioPorGrupoMuscular(String grupo) {
		Criteria criteria =  sessionFactory.getCurrentSession().createCriteria(Exercicio.class);
		return criteria.list();		
	}

	@Override
	public Treino buscarPorLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personal> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(Exercicio treino) {
		sessionFactory.getCurrentSession().saveOrUpdate(treino);		
	}

	@Override
	public void atualizar(Exercicio treino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Exercicio treino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Exercicio carregar(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
