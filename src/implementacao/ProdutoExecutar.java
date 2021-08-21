package implementacao;
import beans.Produto;

public class ProdutoExecutar {
	public static void main(String[] args) {
		Produto notebook = new Produto("Dell", "Notebook Inspiron G10");
		System.out.println(notebook.detalhe());
		
		Produto tv = new Produto();
		tv.setDescricao("TV Sony 65' 4K QLED Painel IPS HDR10");
		tv.setMarca("Sony");
		System.out.println(tv.detalhe());
		
		Produto impressora = new Produto("HP DESKLINK", 250.00f);
		System.out.println(impressora.detalhe());
		System.out.println(impressora.getValor());
		
		Produto game = new Produto("PS5", "Sony", 3800.00f);
		System.out.println(game.detalhe());
		System.out.println(game.getValor());
	}
}