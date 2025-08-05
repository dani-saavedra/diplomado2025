package co.edu.unisabana.diplomado2025.pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void multiplicar() {
        // Para disminuir el tiempo de certificacion (será esto cierto?)

        // Para facilitar la modificación del código (aumentar la mantenibilidad)

        int resultado = calculadora.multiplicar(2, 3);

        assertEquals(6, resultado);

        //AAA

        //Arrange = Preparación
        //Act = Ejecutar el código a validar
        //Assert = Verificar que lo hizo de manera correcta.

        //Cantidad de pruebas unitarias a construir
        // Complejidad Ciclomatica del método (Sonarquebe)

    }
}