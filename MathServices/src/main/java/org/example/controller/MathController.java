package org.example.controller;
import java.util.concurrent.atomic.AtomicLong;
import org.example.service.MathServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController
public class MathController {
    MathServices mathServices = new MathServices();
    @GetMapping("/factor")
    public ArrayList factor(@RequestParam(value = "number", defaultValue = "1") int number) {
        return mathServices.factor(number);
    }
    @GetMapping("/primo")
    public ArrayList primo(@RequestParam(value = "number", defaultValue = "1") int number) {
        return mathServices.primo(number);
    }
}