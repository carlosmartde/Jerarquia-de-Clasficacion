abstract class DispositivoElectronico {
    private String marca;
    private String modelo;
    private String color;
    public DispositivoElectronico(String marca, String modelo, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
    }

        public String getMarca() {
           return marca;
        }
        public String getModelo() {
        return modelo;
        }
        public String getColor() {
        return color;
        }
        public abstract void mostrardetalles();
}
