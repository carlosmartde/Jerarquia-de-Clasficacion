public class Smartphone extends DispositivoMovil {
    private String camara;
    private String sistemaOperativo;

    public Smartphone(String marca, String modelo, String color, String ram, String almacenamiento, String camara, String sistemaOperativo) {
        super(marca, modelo, color, ram, almacenamiento);
        this.camara = camara;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getCamara() {
        return camara;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    @Override
    public void mostrardetalles() {
        super.mostrardetalles();
        System.out.println("camara: "+getCamara()+" sistema operativo: "+getSistemaOperativo());
    }
}
