public class Main {
    public static void main(String[] args) {

        SmartPhone mySmartPhone = new SmartPhone("50px", true, true, true);
        System.out.println("camara: " + mySmartPhone.camara);
        System.out.println("hommebutton: " + mySmartPhone.hommebutton);
        System.out.println("microfone: " + mySmartPhone.microfone);
        System.out.println("linterna: " + mySmartPhone.linterna);

        SmartWacht mySmartWacht = new SmartWacht( true, false, true, true);
        System.out.println("contadorPasos: " + mySmartWacht.contadorPasos);
        System.out.println("calculadorSueño: " + mySmartWacht.calculadorSueño);
        System.out.println("ritmoCardiaco: " + mySmartWacht.ritmoCardiaco);
        System.out.println("cronometro: " + mySmartWacht.cronometro);
    }
}
