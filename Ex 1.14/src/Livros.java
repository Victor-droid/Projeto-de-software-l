public class Livros {
public String nome, autor, editora,contracapa;
public int datadelan�amento;

public Livros(String nomedolivro, String nomedoautor, String editora, String Contracapa, int datadelan�amento) {
	this.nome  = nomedolivro;
	this.autor = nomedoautor;
	this.editora = editora;
	this.contracapa = Contracapa;
	this.datadelan�amento = datadelan�amento;
 	}

	public String getNome(){
    return this.nome;
  }
	public String getAutor(){
    return this.autor;
  }
	public int getdatadelan�amento(){
    return this.datadelan�amento;
  }
  
	public String getContracapa(){
	return this.contracapa;
  }
  
  	public String getEditora(){
	return this.editora;
  }
  
	  
  

}
