package implementacao;
import beans.Input;
import beans.Produto;

public class ProdutoUtilExecutar {
	public static void main(String[] args) {
		//MONTANDO CONSTRUTOR
		Produto listaCompra = new Produto(Input.texto("Descricao"), Input.texto("Marca"), Input.decimal("Preço"), Input.logico("Promoção"));
		
		//EXIBIR CONSTRUTOR
		System.out.println(listaCompra.detalhe());
	}
}