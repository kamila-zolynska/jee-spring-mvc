package pl.coderslab.controller;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/first")
public class FormController {

    @GetMapping("/form")
    public String hello() {
        return "form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String helloWithName(@RequestParam("paramName") String paramName,
                                @RequestParam("paramDate") String paramDate) {
        LocalDate date = LocalDate.parse(paramDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        date.format(formatter);
        return paramName + ", " + date;
    }

}
