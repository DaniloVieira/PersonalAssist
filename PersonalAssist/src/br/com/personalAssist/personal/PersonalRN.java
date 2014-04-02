package br.com.personalAssist.personal;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.personalAssist.util.DAOFactory;
import br.com.personalAssist.util.RNException;

@Service
@Transactional
public class PersonalRN {

	@Autowired
	private PersonalDAO	personalDAO;

//	public PersonalRN() {
//		this.usuarioDAO = DAOFactory.criarPersonalDAO();
//	}

	public Personal carregar(Integer codigo) {
		return this.personalDAO.carregar(codigo);
	}

	public Personal buscarPorLogin(String login) {
		return this.personalDAO.buscarPorLogin(login);
	}

	public String salvar(Personal personal) {

		Integer codigo = personal.getCodigo();
		if (codigo == null || codigo == 0) {
			//personal.getUsuario().getPermissao().add("ROLE_USUARIO_VIP");
//			CategoriaRN categoriaRN = new CategoriaRN();
//			categoriaRN.salvaEstruturaPadrao(usuario);
		}
		this.personalDAO.salvar(personal);
		
		return  " ";
	}

	public void excluir(Personal usuario) {
		
//		CategoriaRN categoriaRN = new CategoriaRN();
//		categoriaRN.excluir(usuario);
		
		this.personalDAO.excluir(usuario);
	}

	public List<Personal> listar() {
		return this.personalDAO.listar();
	}
	
	public void enviarEmailPosCadastramento(Personal usuario) throws RNException {
		//Enviando um e-mail conforme o idioma do usuário
			
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