package br.com.personalAssist.teste;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


//@ManagedBean(name="testeBean")
//@SessionScoped
@Controller
@Scope("view")
public class TesteBean {
	
	private List<List<String>> lista = null;
	
	private String msg ;
	
	public void teste(){
		msg = "teste";
	}
	

	public String gerarLista(){
		
		lista = new ArrayList<List<String>>();
		
		for(int i = 0 ; i < 2 ; i++){
			List<String> subLista = new ArrayList<String>();
			lista.add(subLista);
			for(int j = 0 ; j < 3 ; j++){
				subLista.add("I"+i+"J"+j);
			}			
		}
		
		
		return "";
	}




	public List<List<String>> getLista() {
		return lista;
	}




	public void setLista(List<List<String>> lista) {
		this.lista = lista;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
	
	
	
	


	


	
	
	
	
}
