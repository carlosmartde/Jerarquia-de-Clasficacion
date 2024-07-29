public class Refrigerador extends Electrodomestico{
    private String consumo;
    private String tamaño;

    public Refrigerador(String marca, String modelo, String color, String precio, String uso,String consumo,String tamaño) {
        super(marca, modelo, color, precio, uso);
        this.consumo=consumo;
        this.tamaño=tamaño;
    }

    public String getConsumo(){
        return consumo;
    }
    public String getTamaño(){
        return consumo;
    }

    @Override
    public void mostrardetalles() {
        super.mostrardetalles();
        System.out.println("consumo: "+getConsumo()+" tamaño: "+getTamaño());
    }
}
