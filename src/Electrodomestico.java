public class Electrodomestico extends DispositivoElectronico{
    private String precio;
    private String uso;

    public Electrodomestico(String marca, String modelo, String color,String precio,String uso) {
        super(marca, modelo, color);
        this.precio=precio;
        this.uso=uso;
    }

    public String getPrecio(){
        return precio;
    }

    public String getUso(){
        return uso;
    }

    @Override
    public void mostrardetalles() {
        System.out.println("Marca: "+getMarca()+" Modelo: "+getModelo()+" color: "+getColor());
    }
}
