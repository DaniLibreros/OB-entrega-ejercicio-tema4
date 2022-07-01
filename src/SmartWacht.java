public class SmartWacht extends SmartDivice {

    boolean contadorPasos;
    boolean calculadorSueño;
    boolean ritmoCardiaco;
    boolean cronometro;

    public SmartWacht ( ){

    }
    public SmartWacht (boolean contadorPasos, boolean calculadorSueño, boolean ritmoCardiaco, boolean cronometro){
        this.contadorPasos = contadorPasos;
        this.calculadorSueño = calculadorSueño;
        this.ritmoCardiaco = ritmoCardiaco;
        this.cronometro = cronometro;

    }

}
