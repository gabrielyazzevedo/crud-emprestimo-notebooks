package sistemaEmprestimoNotebooks;

import java.time.LocalDate;

public class Emprestimo {
	int idEmprestimo;
	String nomeUsuario;
	Notebook idNotebook;
	LocalDate dataEmprestimo;
	LocalDate dataDevolucao;
	
	public Emprestimo (int idEmprestimo, String nomeUsuario, Notebook idNotebook, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
		this.idEmprestimo = idEmprestimo;
		this.nomeUsuario = nomeUsuario;
		this.idNotebook= idNotebook;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}
	
	public int getIdEmprestimo() {
		return idEmprestimo;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public Notebook getIdNotebook() {
		return idNotebook;
	}
	
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	
	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public void setIdNotebook(Notebook idNotebook) {
		this.idNotebook = idNotebook;
	}
	
	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
}