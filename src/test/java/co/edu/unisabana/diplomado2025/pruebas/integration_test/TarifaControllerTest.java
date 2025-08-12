package co.edu.unisabana.diplomado2025.pruebas.integration_test;

import co.edu.unisabana.diplomado2025.patrones.estructural.proxy.Internet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TarifaControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void calcularTarifa() {
        //Hacer el llamado real (O LO MAS REAL POSIBLE) de como comienza el flujo.
        //MOCKEAR LO MENOS POSIBLE (si o si, llamados a terceros)

        ResponseEntity<Integer> response = restTemplate.getForEntity("/tarifa?nombre=dian&monto=20", Integer.class);
        Assertions.assertEquals(30, response.getBody());
    }
}