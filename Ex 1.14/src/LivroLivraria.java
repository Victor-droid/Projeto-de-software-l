public class LivroLivraria {
	public String nome, autor, editora;
	public int datadelan�amento;
	public float pre�o;

	public void Livros(String nomedolivro, String nomedoautor, String editora, int datadelan�amento, float pre�o) {
		this.nome  = nomedolivro;
		this.autor = nomedoautor;
		this.editora = editora;
		this.datadelan�amento = datadelan�amento;
		this.pre�o = pre�o;
	 	}
	
		public String getNome(){
	    return this.nome;
		}
	
		public String getAutor(){
	    return this.autor;
	    }
	  
		public int getDatadelan�amento(){
	    return this.datadelan�amento;
	  	}
	  
		public float getPre�o(){
		return this.pre�o;
	  	}
		
		public String getEditora() {
		return this.editora;
	  }
	  

}
