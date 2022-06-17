package ejerciciosTema4;

public class SmartPhone extends SmartDevice {
    private String sistemaOperativo;
    private Double tamanoPantalla;
    private Double peso;


    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, String tipo, int memoria, String sistemaOperativo, Double tamanoPantalla, Double peso) {
        super(marca, modelo, color, tipo, memoria);
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.peso = peso;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(Double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "SmartPhone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamanoPantalla=" + tamanoPantalla +
                ", peso=" + peso +
                '}';
    }
}



