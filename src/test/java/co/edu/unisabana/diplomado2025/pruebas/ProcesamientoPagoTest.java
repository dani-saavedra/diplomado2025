package co.edu.unisabana.diplomado2025.pruebas;

import co.edu.unisabana.diplomado2025.DIP.alto.Notificacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProcesamientoPagoTest {

    @Mock
    Notificacion notificacion;

    @Mock
    ImpuestosRepository impuestosRepository;

    @InjectMocks
    ProcesamientoPago procesamientoPago;

    @BeforeEach
    void setUp() {
        Mockito.when(impuestosRepository.findByNombre("dian"))
                .thenReturn(new ImpuestoORM("dian", 100));
    }
    //Los unit test están para verificar la lógica de negocio.

    @Test
    void Dado_montoMenor10_Entonces_tarifaCero() {
        //AAA = preparacion, ejecucion y validacion.
        //COBERTURA = 95%, 90%, 85%,.
        int tarifa = procesamientoPago.calcularTarifa("dian", 9);
        assertEquals(0, tarifa);
        Mockito.verify(notificacion).notificar("302", "mensaje " + 9);
        //Any no sean la carta por defecto que sacamos.
    }


    @Test
    void Dado_montoMenor100_Entonces_tarifa110() {
        int tarifa = procesamientoPago.calcularTarifa("dian", 10);
        assertEquals(110, tarifa);
    }

    @Test
    void Dado_montoMayorIgual100_Entonces_tarifa2000() {
        int tarifa = procesamientoPago.calcularTarifa("dian", 100);
        assertEquals(2000, tarifa);
    }

    @Test
    void Dado_montoInvalido_Entonces_ArrojaException() {
        assertThrows(IllegalArgumentException.class, () -> procesamientoPago.calcularTarifa("dian", 0));
        //Si algo esta dificil de probar problamente algo se tiene que refactorizar.
    }
    //FIRST

    //Fast= Rapida.
    //Independent = No importa el orden o como se ejecuten
    //Repeteable = No importa donde se ejcute, el setup esta autocontenido en el código
    //Selfvalidating= Se debe entender el resultado
    //Timely = NO HAGA LAS PRUEBAS DESPUES DE HABER SALIDO A PRODUCCION Y PEOR AUN MESES DESPUES.

    //TDD
}
