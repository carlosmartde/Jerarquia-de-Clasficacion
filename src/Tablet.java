public class Tablet extends DispositivoMovil{
    private String tamañoPantalla;
    private String sistemaOperativo;

    public Tablet(String marca, String modelo, String color, String ram, String almacenamiento,String sistemaOperativo,String tamañoPantalla) {
        super(marca, modelo, color, ram, almacenamiento);
        this.tamañoPantalla=tamañoPantalla;
        this.sistemaOperativo=sistemaOperativo;
    }
    public String getTamañoPantalla(){
        return tamañoPantalla;
    }
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }

    @Override
    public void mostrardetalles() {
        super.mostrardetalles();
        System.out.println("tamaño de la pantalla: "+getTamañoPantalla()+" sistema operativo: "+getSistemaOperativo());
    }
}
