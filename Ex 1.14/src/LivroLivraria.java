public class LivroLivraria {
	public String nome, autor, editora;
	public int datadelanšamento;
	public float prešo;

	public void Livros(String nomedolivro, String nomedoautor, String editora, int datadelanšamento, float prešo) {
		this.nome  = nomedolivro;
		this.autor = nomedoautor;
		this.editora = editora;
		this.datadelanšamento = datadelanšamento;
		this.prešo = prešo;
	 	}
	
		public String getNome(){
	    return this.nome;
		}
	
		public String getAutor(){
	    return this.autor;
	    }
	  
		public int getDatadelanšamento(){
	    return this.datadelanšamento;
	  	}
	  
		public float getPrešo(){
		return this.prešo;
	  	}
		
		public String getEditora() {
		return this.editora;
	  }
	  

}
