package com.br.Biblioteca;

/*
 * DEFINICAO BASICA DE UMA CLASSE CHAMADA DOCUMENTO QUE SERA HERDADA
 * POR TODOS OS OUTROS OBJETOS EXISTENTES EM UMA BIBLIOTECA.
 *
 * */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//DEFINIÇAO DA CLASSE
public class Documento {
	private String titulo;
	private String autor;
	private LocalDate dataPublicacao;
	
	//CONSTRUTOR	
	public Documento(String titulo, String autor, String dataPublicacao) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setDataPublicacao(dataPublicacao);
	}
	//GETTERS AND SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = LocalDate.parse(dataPublicacao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // Método para formatar a data de publicação
    public String getDataPublicacaoFormatada() {
        return dataPublicacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao=" + getDataPublicacaoFormatada() +
                '}';
    }
    //EXIBE OS DETALHER DO DOCUMENTO DA CLASSE MAE
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + dataPublicacao);
    }

	
}