package br.com.personalAssist.aluno;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.personalAssist.util.DAOFactory;
import br.com.personalAssist.util.RNException;

@Service
@Transactional
public class AlunoRN {

	@Autowired
	private AlunoDAO	alunoDAO;


	public Aluno carregar(Integer codigo) {
		return this.alunoDAO.carregar(codigo);
	}

	public Aluno buscarPorLogin(String login) {
		return this.alunoDAO.buscarPorLogin(login);
	}

	public void salvar(Aluno usuario) {

		Integer codigo = usuario.getCodigo();
		if (codigo == null || codigo == 0) {
			this.alunoDAO.salvar(usuario);
//			CategoriaRN categoriaRN = new CategoriaRN();
//			categoriaRN.salvaEstruturaPadrao(usuario);
		} else {
			this.alunoDAO.atualizar(usuario);
		}
	}

	public void excluir(Aluno usuario) {
		
//		CategoriaRN categoriaRN = new CategoriaRN();
//		categoriaRN.excluir(usuario);
		
		this.alunoDAO.excluir(usuario);
	}

	public List<Aluno> listar() {
		return this.alunoDAO.listar();
	}
	public List<Aluno> listar(String ordem) {
		return this.alunoDAO.listar(ordem);
	}
	
	public List<Aluno> listar(String nome, String ordem) {
		return this.alunoDAO.listar(nome,ordem);
	}
	public void enviarEmailPosCadastramento(Aluno usuario) throws RNException {
		//Enviando um e-mail conforme o idioma do usu�rio
//		String[] info = usuario.getIdioma().split("_");
//		Locale locale = new Locale(info[0], info[1]);
			
//		String titulo = MensagemUtil.getMensagem(locale, "email_titulo");
//		String mensagem = MensagemUtil.getMensagem(locale, "email_mensagem", usuario.getNome(), usuario.getLogin(), usuario.getSenha());
//		try {		
//			EmailUtil emailUtil = new EmailUtil();
//			emailUtil.enviarEmail(null, usuario.getEmail(), titulo, mensagem);
//		} catch (UtilException e) {
//			throw new RNException(e);
//		}
	}



}