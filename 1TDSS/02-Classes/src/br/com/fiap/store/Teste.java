package br.com.fiap.store;

public class Teste {
	//Criar o método que começa a execução do programa Java
	//main -> CTRL + espaço
	public static void main(String[] args) {
		
		//Criar um objeto do tipo Editora (instanciar classe)
		Editora abril = new Editora();
		abril.nome = "Editora Abril";
		abril.endereco = "Marginal Tiete";
		abril.cnpj = "132.131.323/0001-12";
		
		Editora global = new Editora();
		global.nome = "Editora Global";
		global.endereco = "Av Aclimacao";
		global.cnpj = "123.131.323/0001-14";
		
		Ebook receita = new Ebook();
		receita.nome = "Receitas de Masterchef";
		receita.genero = "Receitas";
		receita.idioma = "Português";
		receita.isbn = "nao sei";
		receita.resumo = "Receitas legais de todas as edições do masterchef";
		receita.editora = global;
		receita.quantidadePagina = 500;
		receita.valor = 100.0;
		receita.Rating = 4.5;
		
		
				
		
		
		
		
		
		
	}
}
