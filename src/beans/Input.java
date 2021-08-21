package beans;
import javax.swing.JOptionPane;

public class Input {
	//MÉTODOS
	public static String texto(String txt)
	{
		return JOptionPane.showInputDialog(txt);
	}
	
	public static float decimal(String txt)
	{
		return Float.parseFloat(texto(txt));
	}
	
	public static int inteiro(String txt)
	{
		return Integer.parseInt(texto(txt));
	}
	
	public static boolean logico(String txt)
	{
		if(JOptionPane.showConfirmDialog(null, txt, "Pergunta", JOptionPane.YES_NO_OPTION) == 0) 
		{
			return true;
		}
		
		return false;
	}
}