import java.util.ArrayList;

public class Pagina {

	// Identificador unico de cada página
	int id;

	// Qtds de vezes que a pagina foi referenciada
	// Ativado sempre que página é referenciada
	int r;

	// Qtds de vezes que a pagina foi modificada
	// Ativado sempre que página é escrita
	int m;

	// Metodo para buscar o maior id da lista.
	public int maiorId(ArrayList<Pagina> lista) {
		int maiorId = 0;
		for (Pagina pagina : lista) {
			if (pagina.id > maiorId) {
				maiorId = pagina.id;
			}
		}
		return maiorId;
	}

	public Pagina(int id, int r, int m) {
		super();
		this.id = id;
		this.r = r;
		this.m = m;
	}

	public Pagina() {
	}

	@Override
	public String toString() {
		return "Página com id=" + id + ", r=" + r + ", m=" + m;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + m;
		result = prime * result + r;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagina other = (Pagina) obj;
		if (id != other.id)
			return false;
		if (m != other.m)
			return false;
		if (r != other.r)
			return false;
		return true;
	}

}
