package br.com.personalAssist.treino;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import br.com.personalAssist.enumeration.NivelTreinamento;
import br.com.personalAssist.exercicio.Exercicio;

@Entity
public class Treino {

	@Id
	@GeneratedValue
	@Column(name = "cod_treino")
	private Integer codigo;
	
	@Enumerated(EnumType.STRING)
	private NivelTreinamento nivelTreinamento;
	
	private String descricao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "treino")
	private List<Exercicio> ListaExercicio = new ArrayList<Exercicio>();

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public List<Exercicio> getListaExercicio() {
		return ListaExercicio;
	}

	public void setListaExercicio(List<Exercicio> listaExercicio) {
		ListaExercicio = listaExercicio;
	}

	public NivelTreinamento getNivelTreinamento() {
		return nivelTreinamento;
	}

	public void setNivelTreinamento(NivelTreinamento nivelTreinamento) {
		this.nivelTreinamento = nivelTreinamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Treino [Nivel: " +  nivelTreinamento + ", "
				+ descricao + "]";
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	

}
