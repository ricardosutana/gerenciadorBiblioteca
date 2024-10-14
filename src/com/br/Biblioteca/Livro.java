package com.br.Biblioteca;

//importa o pacote que contem as interfaces
import com.br.Interfaces.*;


public class Livro extends Documento implements Emprestavel{
	
	private String edicao;
	private boolean emprestado; //boleano para determinar se um livro esta ou nao emprestado.
	

	public Livro(String titulo, String autor, String dataPublicacao, String edicao) {
		super(titulo, autor, dataPublicacao);
		this.setEdicao(edicao);
		this.emprestado = false; //quando um livro eh criado ele esta disponivel para emprestimo
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	//SOBREESCRITA DE UM METODO DA CLASSE MAE [POLIMORFISMO]
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
        System.out.println("Edição: " + edicao);
        System.out.println("Disponibildiade: "+(emprestado ? "Emprestado":"Disponível"));
    }
	
	@Override
	public void emprestar() {
		if (!emprestado) {
			emprestado = true;
			System.out.println("Livro: "+getTitulo()+" sendo emprestado.");
		
		}
		else
			System.out.println("Livro: "+getTitulo()+" indisponível.");
	}
	
	@Override
	public void devolver() {
		if(emprestado == true) {
			emprestado = false;
			System.out.println("Livro: "+getTitulo()+" sendo devolvido.");
		}
		
		}
	
	@Override
	public boolean isEmprestado() {
		return emprestado;
	}
	}
