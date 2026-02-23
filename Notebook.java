package sistemaEmprestimoNotebooks;

public class Notebook {
	int idNotebook;
	String modelo;
	boolean disponivel;

	public Notebook(int idNotebook, String modelo, boolean disponivel) {
		this.idNotebook = idNotebook;
		this.modelo = modelo;
		this.disponivel = disponivel;

	}

	public int getIdNotebook() {
		return idNotebook;
	}

	public String getModelo() {
		return modelo;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setIdNotebook(int idNotebook) {
		this.idNotebook = idNotebook;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

}
