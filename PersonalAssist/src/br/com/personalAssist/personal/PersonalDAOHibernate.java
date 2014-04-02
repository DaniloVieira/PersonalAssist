package br.com.personalAssist.personal;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonalDAOHibernate implements PersonalDAO {

	@Autowired
	private SessionFactory	sessionFactory;

//	public void setSession(Session session) {
//		this.session = session;
//	}

	public void salvar(Personal usuario) {
		this.sessionFactory.getCurrentSession().save(usuario);
	}

	public void atualizar(Personal usuario) {

//		if (usuario.getPermissao() == null || usuario.getPermissao().size() == 0) {
//			Personal usuarioPermissao = this.carregar(usuario.getCodigo());
//			usuario.setPermissao(usuarioPermissao.getPermissao());
//			this.session.evict(usuarioPermissao);
//		}

		this.sessionFactory.getCurrentSession().update(usuario);
	}

	public void excluir(Personal usuario) {
		this.sessionFactory.getCurrentSession().delete(usuario);
	}

	public Personal carregar(Integer codigo) {
		//TODO o hibernate nao conseguira fazer a carga caso seja passado o Usuario
		// no parametro, tem que ser diretamente a chave (integer)
		return (Personal) this.sessionFactory.getCurrentSession().get(Personal.class, codigo);
	}

	public Personal buscarPorLogin(String login) {
		String hql = "select p from Personal p join p.usuario u where u.email = :login";
		Query consulta = this.sessionFactory.getCurrentSession().createQuery(hql);
		consulta.setString("login", login);

		//TODO mostrar primeiramente com o list e depois apresentar o uniqueResult
		return (Personal) consulta.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<Personal> listar() {
		return this.sessionFactory.getCurrentSession().createCriteria(Personal.class).list();
	}
}
