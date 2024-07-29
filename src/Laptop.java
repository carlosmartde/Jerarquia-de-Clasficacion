public class Laptop extends Computadora{
    private String sistemaOperativo;
    private String grafica;

    public Laptop(String marca, String modelo, String color, String ram, String almacenamiento, String procesador,String sistemaOperativo,String grafica) {
        super( marca, modelo, color, ram, almacenamiento, procesador);
        this.sistemaOperativo=sistemaOperativo;
        this.grafica=grafica;
    }


    public String getSistemaOperativo(){
        return sistemaOperativo;
    }
    public String getGrafica(){
        return grafica;
    }

    @Override
    public void mostrardetalles() {
        super.mostrardetalles();
        System.out.println("sistema operativo: "+getSistemaOperativo()+" grafica: "+getGrafica());
    }
}
