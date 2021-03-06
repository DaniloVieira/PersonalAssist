package br.com.personalAssist.exercicio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import br.com.personalAssist.tipoExercicio.TipoExercicio;
import br.com.personalAssist.treino.Treino;

@Entity
public class Exercicio {
	
	@Id
	@GeneratedValue
	@Column(name = "cod_exercicio")
	private Integer codigo;
	private char descricao;
	private String observacao;
	
	private int repeticoes;
	
	private int series;
	@ManyToOne(cascade = CascadeType.ALL)
	//@PrimaryKeyJoinColumn(name="cod_treino")
	private Treino treino;	
	
	@ManyToOne
	private TipoExercicio tipoExercicio ;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public char getDescricao() {
		return descricao;
	}

	public void setDescricao(char descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getRepeticoes() {
		return repeticoes;
	}

	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public Treino getTreino() {
		return treino;
	}

	public void setTreino(Treino treino) {
		this.treino = treino;
	}

	public TipoExercicio getTipoExercicio() {
		return tipoExercicio;
	}

	public void setTipoExercicio(TipoExercicio tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}	
	
}
