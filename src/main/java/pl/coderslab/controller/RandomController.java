package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    private Random random = new Random();

    @GetMapping("/show-random")
    @ResponseBody
    public String showRandom() {
        return "Wylosowano liczbę: " + random.nextInt(101);
    }

    @GetMapping("/random/{max}")
    @ResponseBody
    public String generateRandomWithMax(@PathVariable("max") int max) {
        return "Użytkownik podał wartość " + max +
                ". Wylosowano liczbę: " + (random.nextInt(max) + 1);
    }

    @GetMapping("/random/{min}/{max}")
    @ResponseBody
    public String generateRandomWithMinAndMax(@PathVariable("min") int min,
                                              @PathVariable("max") int max) {
        return "Użytkownik podał wartość " + min + "-" + max +
                ". Wylosowano liczbę: " + (random.nextInt(max - min) + min);
    }
}
