package com.br.Interfaces;

public interface Emprestavel {
	//metodo para empresta um livro
	void emprestar();

	// Método para devolver um item
	void devolver();

	// Método para verificar se o item está emprestado
	boolean isEmprestado();
}

