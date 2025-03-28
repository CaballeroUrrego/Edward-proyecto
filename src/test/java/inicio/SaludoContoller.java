package inicio;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class SaludoContoller {

    @GetMapping(value = "saludo", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo() {
        return "Hola Mundo desde Spring Boot";
    }

    @GetMapping(value = "saludo/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo(@PathVariable("name") String nombre) {
        return "Bienvenido al microservicios spring boot, señor@ " + nombre;
    }

   
}
