public class Desktop extends Computadora{
    private String teclado;
    private String mouse;
    private String grafica;

    public Desktop(String marca, String modelo, String color, String ram, String almacenamiento, String procesador,String teclado,String mouse,String grafica) {
        super(marca, modelo, color, ram, almacenamiento, procesador);
        this.teclado=teclado;
        this.mouse=mouse;
        this.grafica=grafica;
    }

    public String getTeclado(){
        return  teclado;
    }
    public String getMouse(){
        return mouse;
    }
    public String getGrafica(){
        return grafica;
    }

    @Override
    public void mostrardetalles() {
        super.mostrardetalles();
        System.out.println("teclado: "+getTeclado()+" mouse: "+getMouse()+" grafica: "+getGrafica());
    }
}
