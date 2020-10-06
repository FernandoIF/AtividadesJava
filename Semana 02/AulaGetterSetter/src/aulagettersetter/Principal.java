package aulagettersetter;

public class Principal {

    public static void main(String[] args) {
     
        SmartPhone Celular1 = new SmartPhone();
        Celular1.setModelo("Redmi Note 8 Pro");
        Celular1.setMarca("Xiaomi");
        Celular1.setHD(128);
        Celular1.setMemoriaRam(16);
        
        String ExibirSmartphone = "Marca: " + Celular1.getMarca() + "\n" +
                "Modelo: " + Celular1.getModelo() + "\n" + "HD: " +
                Celular1.getHD() + "\n" + "Memoria Ram: " + Celular1.getMemoriaRam();
        
        System.out.println("" + ExibirSmartphone);
              
    }
    
}
