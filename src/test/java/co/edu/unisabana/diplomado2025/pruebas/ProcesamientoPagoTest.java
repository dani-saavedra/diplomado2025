package co.edu.unisabana.diplomado2025.pruebas;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ProcesamientoPagoTest {

    ProcesamientoPago procesamientoPago = new ProcesamientoPago();

    @Test
    void Dado_montoMenor10_Entonces_tarifaCero() {
        //PA QUE ESTA ESTA PRUEBA????
        //COBERTURA = 95%, 90%, 85%,.
        ProcesamientoPago procesamientoPago = new ProcesamientoPago();
        int tarifa = procesamientoPago.calcularTarifa(9);
        assertEquals(0, tarifa);
    }

    @Test
    void Dado_montoMenor100_Entonces_tarifa10() {
        //PA QUE ESTA ESTA PRUEBA????
        ProcesamientoPago procesamientoPago = new ProcesamientoPago();
        int tarifa = procesamientoPago.calcularTarifa(20);
        assertEquals(10, tarifa);
    }

    @Test
    void Dado_montoMayo100_Entonces_tarifa20() {
        //PA QUE ESTA ESTA PRUEBA????
        ProcesamientoPago procesamientoPago = new ProcesamientoPago();
        int tarifa = procesamientoPago.calcularTarifa(200);
        assertEquals(20, tarifa);
    }

    @Test
    void Dado_montoInvalido_Entonces_ArrojaException() {
        ProcesamientoPago procesamientoPago = new ProcesamientoPago();
        assertThrows(IllegalArgumentException.class, () -> procesamientoPago.calcularTarifa(0));

        //Si algo esta dificil de probar problamente algo se tiene que refactorizar.
    }
    //FIRST

    //Fast= Rapida.
    //Independent = No importa el orden o como se ejecuten
    //Repeteable = No importa donde se ejcute, el setup esta autocontenido en el código
    //Selfvalidating= Se debe entender el resultado
    //Timely = NO HAGA LAS PRUEBAS DESPUES DE HABER SALIDO A PRODUCCION Y PEOR AUN MESES DESPUES.
}
