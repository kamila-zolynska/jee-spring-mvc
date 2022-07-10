package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MultiplyController {

    @GetMapping("/multiply")
    public String multiply(Model model, @RequestParam("size") int size) {
        int[][] numbers = new int[size][size];
        int[] sizeTab = new int[size];
        for (int i = 0; i < size; i++) {
            sizeTab[i] = i;
            for (int j = 0; j < size; j++) {
                numbers[i][j] = (i + 1) * (j + 1);
            }
        }
//        System.out.println(Arrays.stream(numbers).forEach(System.out::println)

        model.addAttribute("numbers", numbers);
        model.addAttribute("sizeTab", sizeTab);

        return "multiply";
    }
}
