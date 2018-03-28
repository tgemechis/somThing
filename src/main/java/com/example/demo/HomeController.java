package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String loadFormPage(@RequestParam("input") String input, Model model) {
        int a, b, c, d, e;
        double x, y, z;
        String one, two, red, blue, green;
        StringBuilder output = new StringBuilder();

        a = 5;
        b = 10;
        c = a + b;
        output.append(input);
        output.append("<br/>");
        output.append(doSomething());

        output.append("<br/>");
        output.append("a is " + a + ", b is " + b);
        output.append("<br/>");
        output.append("a + b is " + c);
        output.append("<br/>");
        d = a - b;

        output.append(" a - b is " + d);
        output.append("<br/>");
        e = a * b;
        output.append(" a * b is " + e);
        output.append("<br/>");
        e = a / b;

        output.append(" a / b is " + e);
        output.append("<br/>");
        e = b / a;
        output.append(" b / a is " + e);
        output.append("<br/>");
        e = a % b;
        output.append(" a % b is " + e);
        output.append("<br/>");
        e = b % a;
        output.append(" b % a is " + e);
        output.append("<br/>");

        x = 1.5;
        output.append(" x is " + x);
        output.append("<br/>");
        y = x * x;
        output.append(" x is " + y);
        output.append("<br/>");
        z = b * 3;
        output.append("b / 3 is " + z);
        output.append("<br/>");


        one = "one";
        two = "two";
        red = "red";
        blue = "blue";
        green = "green";

        output.append("Green is " + green);
        output.append("<br/>");
        output.append(one + " fish " + two + " fish ");
        output.append("<br/>");
        output.append(red + " fish " + blue + " fish ");
        output.append("<br/>");
        output.append(String.format("%s fish $s fish $s fish $ fish", one, two, red, blue));
        output.append("<br/>");

        model.addAttribute("output", output);
        //send index.html back to the browser
        return "index";
    }

    private String doSomething() {
        return "I just did something";
    }
}







