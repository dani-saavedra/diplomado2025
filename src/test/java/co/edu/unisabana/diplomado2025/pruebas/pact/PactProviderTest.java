package co.edu.unisabana.diplomado2025.pruebas.pact;

import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.loader.PactBroker;
import co.edu.unisabana.diplomado2025.pruebas.ServiceX;
import co.edu.unisabana.diplomado2025.pruebas.UserDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Provider("ProductService")
@PactBroker(url = "http://localhost:9292")
public class PactProviderTest {

    @MockitoBean
    private ServiceX serviceX;

    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    void pactVerificationTestTemplate(PactVerificationContext context) {
        context.verifyInteraction();
    }

    @BeforeEach
    void setupTestTarget(PactVerificationContext context) {
        System.setProperty("pact.verifier.publishResults", "true");
        System.setProperty("pact.provider.version", "1");
    }

    @State("El usuario existe en la base de datos")
    public void userExits() {
        Mockito.when(serviceX.consultarUsuario()).thenReturn(new UserDTO("juan@example.com", "Juan Pérez", 1));
    }

}
