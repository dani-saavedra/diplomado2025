package co.edu.unisabana.diplomado2025.pruebas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarifaController {

    private ProcesamientoPago procesamientoPago;

    public TarifaController(ProcesamientoPago procesamientoPago) {
        this.procesamientoPago = procesamientoPago;
    }

    @GetMapping(path = "/tarifa")
    public int calcularTarifa(@RequestParam String nombre, @RequestParam int monto) {
        return procesamientoPago.calcularTarifa(nombre, monto);
    }
}
