package br.com.personalAssist.tipoExercicio;

import java.util.List;

import javax.persistence.EnumType;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.personalAssist.enumeration.GrupoMuscular;
import br.com.personalAssist.exercicio.Exercicio;
import br.com.personalAssist.personal.Personal;
import br.com.personalAssist.treino.Treino;

@Repository
public class TipoExercicioDAOHibernate implements TipoExercicioDAO {

	@Autowired
	private SessionFactory	sessionFactory;
	
	@Override
	public void salvar(Treino treino) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Treino treino) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Treino treino) {
		// TODO Auto-generated method stub

	}

	@Override
	public TipoExercicio carregar(Integer codigo) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(TipoExercicio.class);
		criteria.add(Restrictions.gt("codigo", codigo));
		return (TipoExercicio) criteria.uniqueResult();
	}

	@Override
	public List<TipoExercicio> listarExercicioPorGrupoMuscular(GrupoMuscular grupo) {
		Criteria criteria =  sessionFactory.getCurrentSession().createCriteria(TipoExercicio.class);
		criteria.add(Restrictions.eq("grupoMuscular", grupo));
		
		return criteria.list();
	}

	@Override
	public List<Personal> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
