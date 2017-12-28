package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {
	
	private Livro livro = new Livro();

	public void gravar() {
		System.out.println("Gravando Livro!" + this.livro.getTitulo());
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
