package inicio;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;
@RestController
public class SaludoController {
@GetMapping(value="/saludo", produces=MediaType.TEXT_PLAIN_VALUE)    
    public String saludo(){
        return "Hola Mundo Con Spring Boot";
    }


}
