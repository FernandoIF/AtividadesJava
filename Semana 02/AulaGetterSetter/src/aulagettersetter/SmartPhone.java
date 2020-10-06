package aulagettersetter;

public class SmartPhone {
    
    private String modelo;
    private String marca;
    private int memoriaRam;
    private int hd;

    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getMemoriaRam(){
        return memoriaRam;
    }
    
    public void setMemoriaRam(int memoriaRam){
        this.memoriaRam = memoriaRam;
    }
    
    public int getHD(){
        return hd;
    }
    
    public void setHD(int hd){
        this.hd = hd;
    }
}
