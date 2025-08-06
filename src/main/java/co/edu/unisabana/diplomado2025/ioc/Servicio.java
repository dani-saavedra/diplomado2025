package co.edu.unisabana.diplomado2025.ioc;

import org.springframework.stereotype.Service;

@Service
public class Servicio {

    private Proveedor proveedor;



    //Inyección de dependencias
    public Servicio(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void algo() {
        proveedor.cualquierCosa();
    }

    public void otraCosa() {
        proveedor.cualquierCosa();
    }
}
