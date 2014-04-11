package br.com.personalAssist.treino;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.personalAssist.aluno.Aluno;
import br.com.personalAssist.personal.Personal;
import br.com.personalAssist.tipoExercicio.TipoExercicio;

@Repository
public class TreinoDAOHibernate implements TreinoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void salvar(Treino treino) {
		sessionFactory.getCurrentSession().saveOrUpdate(treino);
		
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
	public Treino carregar(Integer codigo) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Treino.class);
		criteria.add(Restrictions.gt("codigo", codigo));
		return (Treino) criteria.uniqueResult();
	}

	@Override
	public Treino buscarPorLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Treino> listar() {
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Treino.class);
		criteria.addOrder(Order.asc("descricao"));
		return criteria.list();
	}

}
