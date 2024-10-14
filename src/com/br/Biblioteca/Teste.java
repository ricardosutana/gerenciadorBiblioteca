package com.br.Biblioteca;


public class Teste {

	public static void main(String[] args) {
		
		 
		/* Criacao do objeto polimorfico
		 * A ideia neste contexto é mostrar que o objeto polimorfico biblioteca pode armaernar
		 * diversos tipos de outros objetos sem se importar com seu tipo. Deve-se notar que a
		 * sobrecarga e sobreescrita tambem são formas de polimorfismo.
		 * 
		Biblioteca biblioteca = new Biblioteca();
		
		// Instancias de objetos individuais
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "29/07/1954", "1ª Edição");
        Revista revista = new Revista("Ciência Hoje", "Vários Autores", "01/08/2022", "Mensal");
        Jornal jornal = new Jornal("Folha de SP", "Vários Autores", "10/10/2024", "Maria Silva");

        // Adicionando documentos à biblioteca
        biblioteca.adicionarDocumento(livro);
        biblioteca.adicionarDocumento(revista);
        biblioteca.adicionarDocumento(jornal);

        // Exibindo os detalhes de todos os documentos
        biblioteca.exibirTodosDocumentos();
		*/
		
		Livro livro = new Livro("Java: Como Programar", "Deitel", "15/03/2020", "10ª Edição");

        // Exibir detalhes do livro
        livro.exibirDetalhes();
        System.out.println();
        // Emprestar o livro
        livro.emprestar();
        livro.exibirDetalhes();
        System.out.println();

        // Tentar emprestar o livro novamente (deve mostrar uma mensagem de que já está emprestado)
        livro.emprestar();
        livro.exibirDetalhes();
        System.out.println();
        // Devolver o livro
        livro.devolver();

        // Exibir detalhes novamente
        livro.exibirDetalhes();
    }
		
}


