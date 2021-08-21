package implementacao;
import javax.swing.JOptionPane;

import beans.Produto;

public class Produto2Executar {
	
	public static String texto(String txt) 
	{
		return JOptionPane.showInputDialog(txt);
	}
	
	public static void main(String[] args) {		
		//MONTANDO CONSTRUTOR
		Produto impressora = new Produto();
		int resposta;
		
		impressora.setDescricao(JOptionPane.showInputDialog("Descricao"));
		impressora.setMarca(JOptionPane.showInputDialog("Marca"));
		impressora.setValor(Float.parseFloat(JOptionPane.showInputDialog("Preço")));
		
		impressora.setPromocao(false);
		resposta = (JOptionPane.showConfirmDialog(null, "Promoção ?", " Escolha", JOptionPane.YES_NO_OPTION));
		
		if(resposta == 0) 
		{
			impressora.setPromocao(true);
		}
		
		//CONSTRUTOR COM INFOMAÇÕES
		Produto notebook = new Produto(JOptionPane.showInputDialog("Descricao"), JOptionPane.showInputDialog("Marca"), Float.parseFloat(JOptionPane.showInputDialog("Preço")), 
				Boolean.parseBoolean(JOptionPane.showInputDialog("Promoção: ")));
		
		//EXIBINDO CONSTRUTOR
		System.out.println(notebook.detalhe());
	}
}