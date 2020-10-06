package aulagettersetter2;

import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {
      
        Item item1 = new Item();
       
        item1.setId("1");
        item1.setDescricao("Caneta");
        item1.setPrecoUnitario(3.90f);
        item1.setQuantidade(1);
        item1.setDesconto(0.9f);
        
        String formataNumeros = "#.###";
        DecimalFormat df = new DecimalFormat(formataNumeros);
        
        
        double valorTotal = item1.getValorTotal(item1.getPrecoUnitario(), 
                item1.getDesconto(), item1.getQuantidade());
        
        System.out.println("ID - "+item1.getId()+" - "+item1.getDescricao() + 
                " | Qnt - " + item1.getQuantidade() + " | PrecoUnt - " +
                df.format(item1.getPrecoUnitario()) + " | Desc - " +
                df.format(item1.getDesconto()) + " | Total - " + df.format(valorTotal));
    }
    
}
