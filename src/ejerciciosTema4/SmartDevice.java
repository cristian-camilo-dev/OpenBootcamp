package ejerciciosTema4;

public class SmartDevice {
    private String marca;
    private String modelo;
    private String color;
    private String tipo;
    private int memoria;

    //Constructor

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String color, String tipo, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.memoria = memoria;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "SmartDevice{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo + ", memoria=" + memoria + '}';
    }
}


