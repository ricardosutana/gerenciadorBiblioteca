package com.br.Biblioteca;

public class Revista extends Documento{
	private String periodicidade;
	
	public Revista(String titulo, String autor, String datapublicacao, String periodicidade) {
		super(titulo, autor, datapublicacao);
		this.setPeriodicidade(periodicidade);
	}

	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}
	
	//SOBREESCRITA DE UM METODO DA CLASSE MAE [POLIMORFISMO]
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Periodicidade: " + getPeriodicidade());
	}
	

}
