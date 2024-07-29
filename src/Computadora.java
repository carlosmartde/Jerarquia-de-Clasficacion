public class Computadora extends DispositivoElectronico{
    private String ram;
    private String almacenamiento;
    private String procesador;

    public Computadora(String marca, String modelo, String color,String ram,String almacenamiento,String procesador){
        super(marca,modelo,color);
        this.ram=ram;
        this.almacenamiento=almacenamiento;
        this.procesador=procesador;
    }

    public String getRam(){
        return ram;
    }
    public String getAlmacenamiento(){
        return almacenamiento;
    }
    public String getProcesador(){
        return procesador;
    }

    @Override
    public void mostrardetalles() {
    System.out.println("Marca: "+getMarca()+" Modelo: "+getModelo()+" color: "+getColor());
    System.out.println("\nRam: "+getRam()+" Almacenamiento: "+getAlmacenamiento()+" Procesador: "+getProcesador());
    }
}
