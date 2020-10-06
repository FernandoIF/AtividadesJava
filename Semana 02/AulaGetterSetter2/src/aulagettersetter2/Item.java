package aulagettersetter2;


public class Item {
    
    private double precoUnitario;
    private double desconto;
    private int quantidade;
    private String descricao;
    private String id;
    
    public double getValorTotal(double precoUnitario, double desconto, int quantidade){
        if(desconto > 1.0)
            desconto = 0;
       
        return precoUnitario * quantidade - desconto;
    }
    
    public double getPrecoUnitario(){
        return precoUnitario;
    }
    
    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }
    
    public double getDesconto(){
        return desconto;
    }
    
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
}
