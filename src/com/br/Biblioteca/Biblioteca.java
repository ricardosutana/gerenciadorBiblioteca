package com.br.Biblioteca;


import java.util.ArrayList;

public class Biblioteca{
	
	private ArrayList<Documento> documentos;

	public Biblioteca() {
		this.documentos = new ArrayList<>();
	}
	public ArrayList<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(ArrayList<Documento> documentos) {
		this.documentos = documentos;
	}
	
	public void adicionarDocumento(Documento doc) {
		documentos.add(doc);
	}
	
	public void exibirTodosDocumentos() {
		for(Documento doc : documentos) {
			doc.exibirDetalhes();
			System.out.println();
		}
	}
	
	

}
