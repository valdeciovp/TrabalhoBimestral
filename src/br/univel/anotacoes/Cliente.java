package br.univel.anotacoes;

import br.univel.anotacoes.Coluna;
import br.univel.anotacoes.Tabela;

@Tabela("CAD_CLIENTE")
public class Cliente {
//criando a coluna
	@Coluna(pk=true)
	private int id;

	@Coluna(nome="CLNOME")
	private String nome;
	
	@Coluna(end="CLEND")
	private String end;
	
	@Coluna(fone="CLFONE")
	private String fone;

	public Cliente() {
		this(0, null, null, null);
	}	

	public Cliente(int id, String nome, String end, String fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.end = end;
		this.fone = fone;
	}


	//seta os atributos do cliente

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + "]";
	}

}
