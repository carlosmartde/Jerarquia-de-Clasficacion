public class DispositivoMovil  extends DispositivoElectronico{
    private String ram;
    private String almacenamiento;

    public DispositivoMovil(String marca, String modelo, String color,String ram,String almacenamiento) {
        super(marca, modelo, color);
        this.ram=ram;
        this.almacenamiento=almacenamiento;
    }
    public String getRam(){
        return ram;
    }
    public String getAlmacenamiento(){
        return almacenamiento;
    }

    @Override
    public void mostrardetalles() {
        System.out.println("Marca: "+getMarca()+" Modelo: "+getModelo()+" color: "+getColor());
        System.out.println("Ram: "+getRam()+" almacenamiento: "+getAlmacenamiento());
    }
}
