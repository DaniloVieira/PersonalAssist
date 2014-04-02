package br.com.personalAssist.aluno;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoDAOHibernate implements AlunoDAO {

	@Autowired
	private SessionFactory	sessionFactory;

	

	public void salvar(Aluno usuario) {
		this.sessionFactory.getCurrentSession().save(usuario);
	}

	public void atualizar(Aluno usuario) {


		this.sessionFactory.getCurrentSession().update(usuario);
	}

	public void excluir(Aluno usuario) {
		this.sessionFactory.getCurrentSession().delete(usuario);
	}

	public Aluno carregar(Integer codigo) {
		//TODO o hibernate nao conseguira fazer a carga caso seja passado o Usuario
		// no parametro, tem que ser diretamente a chave (integer)
		return (Aluno) this.sessionFactory.getCurrentSession().get(Aluno.class, codigo);
	}

	public Aluno buscarPorLogin(String login) {
		String hql = "select u from Usuario u where u.login = :login";
		Query consulta = this.sessionFactory.getCurrentSession().createQuery(hql);
		consulta.setString("login", login);

		//TODO mostrar primeiramente com o list e depois apresentar o uniqueResult
		return (Aluno) consulta.uniqueResult();
	}

	public List<Aluno> listar() {
		return listar("nome");
	}

	public List<Aluno> listar(String ordem) {
		return listar("", ordem);
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> listar(String nome, String ordem) {
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Aluno.class);
		if (!nome.isEmpty()) {
			criteria.add(Restrictions.ilike("nome", nome + "%"));
		}
		criteria.addOrder(Order.asc(ordem));
		return criteria.list();
	}
}
