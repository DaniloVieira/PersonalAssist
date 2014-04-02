package br.com.personalAssist.aluno;

import java.util.List;

public interface AlunoDAO {

	public void salvar(Aluno usuario);

	public void atualizar(Aluno usuario);

	public void excluir(Aluno usuario);

	public Aluno carregar(Integer codigo);

	public Aluno buscarPorLogin(String login);

	public List<Aluno> listar();

	public List<Aluno> listar(String ordem);

	public List<Aluno> listar(String nome, String ordem);
}
