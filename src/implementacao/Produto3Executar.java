package implementacao;
import beans.Input;
import beans.Produto;

public class Produto3Executar {
	public static void main(String[] args) {
		//MONTANDO CONSTRUTOR
		Produto tv = new Produto();
		
		tv.setDescricao(Input.texto("Descricao"));
		tv.setMarca(Input.texto("Marca"));
		tv.setValor(Input.decimal("Pre�o"));
		tv.setPromocao(Input.logico("Promo��o"));
		
		//EXIBIR CONSTRUTOR
		System.out.println(tv.detalhe());
	}
}