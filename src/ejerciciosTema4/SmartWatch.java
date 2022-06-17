package ejerciciosTema4;

public class SmartWatch  extends SmartDevice {
    boolean resistenteAgua;



public SmartWatch() {

}

    public SmartWatch(String marca, String modelo, String color, String tipo, int memoria, boolean resistenteAgua) {
        super(marca, modelo, color, tipo, memoria);
        this.resistenteAgua = resistenteAgua;
    }


    public boolean isResistenteAgua() {
        return resistenteAgua;
    }

    public void setResistenteAgua(boolean resistenteAgua) {
        this.resistenteAgua = resistenteAgua;
    }


    @Override
    public String toString() {
        return super.toString() + "SmartWatch{" +
                "resistenteAgua=" + resistenteAgua +
                '}';
    }
}
