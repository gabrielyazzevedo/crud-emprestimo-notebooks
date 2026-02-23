package sistemaEmprestimoNotebooks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.time.LocalDate;
import java.util.function.Consumer;

public class Gerenciador {

	private List<Emprestimo> listaEmprestimos = new ArrayList<>();

	public void criarEmprestimo(int idEmprestimo, String nomeUsuario, Notebook idNotebook, LocalDate dataEmprestimo,
			LocalDate dataDevolucao) {

		for (Emprestimo emprestimoAtual : listaEmprestimos) {
			if (emprestimoAtual.getIdEmprestimo() == idEmprestimo) {
				System.out.println("ID já existente. Tente novamente. ");
				return;
			}
		}

		Emprestimo novoEmprestimo = new Emprestimo(idEmprestimo, nomeUsuario, idNotebook, dataEmprestimo,
				dataDevolucao);
		listaEmprestimos.add(novoEmprestimo);
		System.out.println("Emprestimo criado com sucesso. ");

	}

	public void listarEmprestimo() {
		for (Emprestimo emprestimoAtual : listaEmprestimos) {
			System.out.println("ID do emprestimo: " + emprestimoAtual.getIdEmprestimo());
			System.out.println("Nome de usuário: " + emprestimoAtual.getNomeUsuario());
			System.out.println("ID do notebook: " + emprestimoAtual.getIdNotebook());
			System.out.println("Data do emprestimo: " + emprestimoAtual.getDataEmprestimo());
			System.out.println("Data de devolucao: " + emprestimoAtual.getDataDevolucao());
			System.out.println("-------------------------------------");
		}

	}

	public void atualizarEmprestimo(int idEmprestimo, Consumer<Emprestimo> acao) {
		for (Emprestimo e : listaEmprestimos) {
			if (e.getIdEmprestimo() == idEmprestimo) {
				acao.accept(e);
				return;
			}
		}
		System.out.println("Empréstimo não encontrado.");
	}

	public boolean deletarEmprestimo(int idEmprestimo) {
		Iterator<Emprestimo> iterator = listaEmprestimos.iterator();

		while (iterator.hasNext()) {
			Emprestimo emprestimos = iterator.next();

			if (emprestimos.getIdEmprestimo() == idEmprestimo) {
				iterator.remove();
				return true;

			}

		}
		return false;
	}
}