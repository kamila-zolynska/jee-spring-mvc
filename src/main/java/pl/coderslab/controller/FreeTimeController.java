package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class FreeTimeController {
    private DayOfWeek currentDayOfWeek = LocalDate.now().getDayOfWeek();
    private LocalTime currentTime = LocalTime.now();

    @GetMapping("check-date")
    @ResponseBody
    public String checkDate() {
        if (DayOfWeek.SATURDAY.equals(currentDayOfWeek) || DayOfWeek.SUNDAY.equals(currentDayOfWeek)) {
            return "Wolne";
        } else if (currentTime.isAfter(LocalTime.of(9, 0)) && currentTime.isBefore(LocalTime.of(17, 0))) {
            return "Pracuje, nie dzwoń.";
        } else
            return "Po Pracy";
    }
}
