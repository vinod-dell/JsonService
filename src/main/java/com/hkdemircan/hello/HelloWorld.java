import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {

   @GetMapping("/hello")
    public Map<String, String> getMessage() {
        try {
            Thread.sleep(80000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Map<String, String> response = new HashMap<>();
        response.put("message", "Sleep after 80 sec");

        return response;
    }
}
