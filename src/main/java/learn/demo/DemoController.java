package learn.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${api.message:Hello exception}")
    private String message;
    @GetMapping("/hello")
    public String Hello() {
        return message;
    }
}
