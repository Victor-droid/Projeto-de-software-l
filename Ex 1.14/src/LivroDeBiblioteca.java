
public class LivroDeBiblioteca {
		public String nome, autor, editora;
		public int datadelan�amento;
		public int numera��odolivro;

		public void Livros(String nomedolivro, String nomedoautor, String editora, int datadelan�amento,int numera��odolivro){
			this.nome  = nomedolivro;
			this.autor = nomedoautor;
			this.editora = editora;
			this.datadelan�amento = datadelan�amento;
			this.numera��odolivro = numera��odolivro;
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
			public int getNumera��odolivro() {
			return this.numera��odolivro;

	}
}
