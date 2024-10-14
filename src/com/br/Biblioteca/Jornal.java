package com.br.Biblioteca;

public class Jornal extends Documento{
	
	private String editorChefe;
	
	// CONSTRUTOR
	public Jornal(String titulo, String autor, String dataPublicacao, String editorChefe) {
		super(titulo, autor, dataPublicacao);
		this.setEditorChefe(editorChefe);
		
	}

	public String getEditorChefe() {
		return editorChefe;
	}

	public void setEditorChefe(String editorChefe) {
		this.editorChefe = editorChefe;
	}
	//SOBREESCRITA DE UM METODO DA CLASSE MAE [POLIMORFISMO]
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Editor Chefe: "+ editorChefe);
	}
	

}
