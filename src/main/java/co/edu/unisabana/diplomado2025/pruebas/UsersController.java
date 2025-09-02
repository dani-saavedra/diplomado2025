package co.edu.unisabana.diplomado2025.pruebas;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UsersController {

    private ServiceX serviceX;

    @Value("${pod}")
    private String nombrePod;

    @GetMapping("/users/{id}")
    public UserDTO consultarUsuario(@PathVariable int id) {
        return serviceX.consultarUsuario();
    }

    @GetMapping("/usuario")
    public String consultarUsuario() {
        log.info("Consultando usuario");
        return "Daniel S. desde el pod" + nombrePod;
    }
}
