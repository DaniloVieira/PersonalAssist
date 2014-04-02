package br.com.personalAssist.web;


import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.personalAssist.aluno.Aluno;
import br.com.personalAssist.personal.Personal;
import br.com.personalAssist.personal.PersonalRN;


//@ManagedBean(name="personalBean")
//@RequestScoped
@Controller
@Scope("request")
public class PersonalBean {
	
	@Autowired
	private PersonalRN personalRN;
	private Personal personal = new Personal();
	private String	       confirmarSenha;
	private List<Personal>	lista;
	private String	       destinoSalvar;
	private String	       permissao;
	
	
	public String novo(){
		
		this.personal = new Personal();
		return "cadastro/cadastroPersonal";
	}
	public String salvar(){
		FacesContext context = FacesContext.getCurrentInstance();	
		
		String senha = this.personal.getUsuario().getSenha();
		if (!senha.equals(this.confirmarSenha)) {
			FacesMessage facesMessage = new FacesMessage("A senha não foi confirmada corretamente");
			context.addMessage(null, facesMessage);
			return "";
		}
		
		if(this.personal.getCodigo() == null){
			personal.getUsuario().getPermissao().add("ROLE_USUARIO_VIP");
			personal.getUsuario().setAtivo(true);
		}
		
		PersonalRN personalRN = new PersonalRN();
		personalRN.salvar(this.personal);		
		return this.destinoSalvar;
	}
	public String excluir(){
		return "";
	}	
	
	
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public String getConfirmarSenha() {
		return confirmarSenha;
	}
	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}
	public List<Personal> getLista() {
		return lista;
	}
	public void setLista(List<Personal> lista) {
		this.lista = lista;
	}
	public String getDestinoSalvar() {
		return destinoSalvar;
	}
	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	
	
	
	

}
