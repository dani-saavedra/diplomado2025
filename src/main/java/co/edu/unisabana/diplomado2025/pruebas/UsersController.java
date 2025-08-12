package co.edu.unisabana.diplomado2025.pruebas;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UsersController {

    private ServiceX serviceX;

    @GetMapping("/users/{id}")
    public UserDTO consultarUsuario(@PathVariable int id) {
        return serviceX.consultarUsuario();
    }
}
