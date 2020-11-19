package br.com.fiap.bean;

public class Usuario {
	
	private String papelFilme;
	private String sobre;
	private String nome;
	private String urlAvatar;
	
	public Usuario() {
		
	}
	
	public Usuario(String papelFilme, String sobre, String nome, String urlAvatar) {
		super();
		this.papelFilme = papelFilme;
		this.sobre = sobre;
		this.nome = nome;
		this.urlAvatar = urlAvatar;
	}



	public String getPapelFilme() {
		return papelFilme;
	}

	public void setPapelFilme(String papelFilme) {
		this.papelFilme = papelFilme;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrlAvatar() {
		return urlAvatar;
	}

	public void setUrlAvatar(String urlAvatar) {
		this.urlAvatar = urlAvatar;
	}
	
	

	
	
}
