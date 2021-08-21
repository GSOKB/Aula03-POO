package beans;

public class Produto {
    private String descricao;
    private String marca;
    private float valor;
    private boolean promocao;
    
    // CONSTRUTORES
    public Produto() {}
    
    public Produto(String descricao, String marca) 
    {
    	this.descricao = descricao;
    	this.marca = marca;
    }
    
    public Produto(String descricao, float valor) 
    {
    	this.descricao = descricao;
    	this.valor = valor;
    }
    
    public Produto(String descricao, String marca, float valor)
    {
		this.descricao = descricao;
		this.marca = marca;
		this.valor = valor;
	}
    
    public Produto(String descricao, String marca, float valor, boolean promocao)
    {
		this.descricao = descricao;
		this.marca = marca;
		this.valor = valor;
		this.promocao = promocao;
	}

	// SETTERS / GETTERS
    public String getDescricao() {
        return descricao;
    }
 
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
 
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public float getValor() {
        return valor;
    }
 
    public void setValor(float valor) {
        if (valor < 0)
        {
            this.valor = 0;
        }
        else
        {
            this.valor = valor;
        }
    }
    
    public boolean getPromocao() 
    {
    	return promocao;
    }
    
    public void setPromocao(boolean promocao) 
    {
    	this.promocao = promocao;
    }
 
    //M�TODOS
    public String detalhe() {
        return "Produto: " + descricao + "\nMarca: " + marca + "\nPre�o: " + valor + "\nPromo��o: " + promocao;
    }
}