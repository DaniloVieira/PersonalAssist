package br.com.personalAssist.web;

import java.util.List;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.sun.xml.internal.bind.v2.runtime.Name;

import br.com.personalAssist.aluno.Aluno;
import br.com.personalAssist.aluno.AlunoRN;
import br.com.personalAssist.personal.Personal;
import br.com.personalAssist.personal.PersonalRN;

/*@ManagedBean(name = "contextoBean")
@SessionScoped*/
@Controller
@Scope("session")
public class ContextoBean {
	
	@Autowired
	private PersonalRN personalRN;
	private Personal 	personalLogado = null;
	private Aluno 		alunoAtivo = null;	
	
	public Personal getPersonalLogado() {
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext external = context.getExternalContext();
		String sessionLogin = external.getRemoteUser();
		String login = this.personalLogado != null? this.personalLogado.getUsuario().getEmail():"";
		if (this.personalLogado == null || !sessionLogin.equals(login)) {
				//PersonalRN personalRN = new PersonalRN();
				this.personalLogado = personalRN.buscarPorLogin(sessionLogin);
				this.alunoAtivo = null;
		}
		return personalLogado;
	}
	
	public Aluno getAlunoAtivo() {
//		if (this.alunoAtivo == null) {
//			Personal personal = this.getPersonalLogado();
//			
//			AlunoRN alunoRN = new AlunoRN(); 
//			this.alunoAtivo = alunoRN.buscarFavorita(personal);
//
//			if (this.alunoAtivo == null) {
//				List<Aluno> alunos = alunoRN.listar(personal);
//				if (alunos != null) {
//					for (Aluno aluno : alunos) {
//						this.alunoAtivo = aluno;
//						break;
//					}
//				}
//			}
//		}
		
		return alunoAtivo;
	}

	public void setPersonalLogado(Personal personalLogado) {
		this.personalLogado = personalLogado;
	}

	public void setAlunoAtivo(Aluno alunoAtivo) {
		this.alunoAtivo = alunoAtivo;
	}

	
	
	
	
	
	
	

}
