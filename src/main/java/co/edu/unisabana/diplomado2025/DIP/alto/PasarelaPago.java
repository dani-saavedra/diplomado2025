package co.edu.unisabana.diplomado2025.DIP.alto;

public class PasarelaPago {

    //Dos formas de hacer inyección dependencias:
    // Por constructor, Por parametro

    Notificacion notificacion;

    public PasarelaPago(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    void procesarPago() {
        //Bla bla bla Pagamos bla bla bla
        System.out.println("Procesando pago");
        // NotificacionAldeamo notificacion = new NotificacionAldeamo();
        notificacion.notificar("3025467079", "Hola");

    }
}
//TODO EL PRINCIIPIO DE SUSTITUCION DE LISKOV HABLA DE POLIFOMORFIMOS
//PERO NO TODO EL POLIMORFISMO CUMPLE CON LISKOV


//Yo puedo hacer Inyeccion sin Inversion
//Pero no puedo hacer inversion sin inyeccion.