package comum;

import java.io.Serializable;

public class Pessoa implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5003826777659437582L;
	
	private int id;
	private String nome ;
	private String cpf;
	
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
