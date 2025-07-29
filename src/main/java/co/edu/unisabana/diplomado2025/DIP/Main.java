package co.edu.unisabana.diplomado2025.DIP;

import co.edu.unisabana.diplomado2025.DIP.alto.PasarelaPago;
import co.edu.unisabana.diplomado2025.DIP.bajo.AdapterMassivian;

public class Main {

    //INVERSION DE DEPENDENCIAS

    //INYECCION DE DEPENDENCIAS.

    //Aldeamo & Massivan &  Twilio.

    public static void main(String[] args) {
        PasarelaPago pago = new PasarelaPago(new AdapterMassivian());
        pago.procesarPago();
    }
}
