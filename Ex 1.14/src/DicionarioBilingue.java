public class DicionarioBilingue {
	public String nome, autor, editora;
	public int datadelan�amento;

	public void Livros(String nomedodicionario, String nomedoautor, String editora, int datadelan�amento){
		this.nome  = nomedodicionario;
		this.autor = nomedoautor;
		this.editora = editora;
		this.datadelan�amento = datadelan�amento;
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
	
		public String getEditora() {
		return this.editora;
	  }

}
