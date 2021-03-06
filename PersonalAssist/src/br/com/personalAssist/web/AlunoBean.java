package br.com.personalAssist.web;

import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.personalAssist.aluno.Aluno;
import br.com.personalAssist.aluno.AlunoRN;
import br.com.personalAssist.personal.Personal;

/*@ManagedBean(name="alunoBean")
@RequestScoped*/
@Controller
@Scope("request")
public class AlunoBean {

	@Autowired
	private AlunoRN        alunoRN;
	private Aluno	    aluno	= new Aluno();
	private String	       confirmarSenha;
	private String	       nomePesquisa;
	private List<Aluno>	lista;
	private String	       destinoSalvar;
	private String	       permissao;

	
	public String hello(){
		return "hello";
	}
	
	
	public String novo() {
		this.destinoSalvar = "ClienteSucesso";
		this.aluno = new Aluno();
		this.aluno.setAtivo(true);
		return "/pages/cadastro/cadastroAluno";
	}

	public String editar() {
		this.confirmarSenha = this.aluno.getSenha();
		return "/publico/Cliente/Cliente";
	}

	public String salvar() {
//		FacesContext context = FacesContext.getCurrentInstance();
		
//		AlunoRN ClienteRN = new AlunoRN();
		alunoRN.salvar(this.aluno);

		return this.destinoSalvar;
	}

	public String excluir() {
//		AlunoRN ClienteRN = new AlunoRN();
		alunoRN.excluir(this.aluno);
		this.lista = null;
		return null;
	}

	public String ativar() {
		if (this.aluno.isAtivo())
			this.aluno.setAtivo(false);
		else
			this.aluno.setAtivo(true);

//		AlunoRN ClienteRN = new AlunoRN();
		alunoRN.salvar(this.aluno);
		return null;
	}
	
	public String listarAlunos(){
		
//		AlunoRN ClienteRN = new AlunoRN();
		this.lista = alunoRN.listar(nomePesquisa, "nome");
		
		
		return "";
	}

	public List<Aluno> getLista() {
		if (this.lista == null) {
//			AlunoRN ClienteRN = new AlunoRN();
			this.lista = alunoRN.listar();
		}
		return this.lista;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public String getConfirmarSenha() {
		return confirmarSenha;
	}


	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}


	
	public String getNomePesquisa() {
		return nomePesquisa;
	}


	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
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


	public void setLista(List<Aluno> lista) {
		this.lista = lista;
	}

	

	

}
