public class SmartDivice {

    String fabricante;
    String modelo;
    int onoff;
    int almacenamiento;
    boolean wifi;
    boolean bluetooth;

    public SmartDivice () {

    }

    public SmartDivice ( String fabricante, String modelo, int almacenamiento, boolean wifi, boolean bluetooth) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
    }


}
