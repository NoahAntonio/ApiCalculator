package at.technikum.calculator;
import org.springframework.web.bind.annotation.*;


@RestController
public class CalculatorController {
    @GetMapping ("/sum")
    public int sum(@RequestParam int a, @RequestParam int b){
        return a + b;

    }
}
