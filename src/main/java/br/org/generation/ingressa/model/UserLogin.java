package br.org.generation.ingressa.model;

public class UserLogin {
	
	private long id;
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	private String token;
	
	private String fotoPerfil;
	
	private String telefone;
	
	private String empresaAtual;
	
	private boolean usuarioEmpregador;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public boolean isUsuarioEmpregador() {
		return usuarioEmpregador;
	}

	public void setUsuarioEmpregador(boolean usuarioEmpregador) {
		this.usuarioEmpregador = usuarioEmpregador;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmpresaAtual() {
		return empresaAtual;
	}

	public void setEmpresaAtual(String empresaAtual) {
		this.empresaAtual = empresaAtual;
	}
	
	
	
	

}
