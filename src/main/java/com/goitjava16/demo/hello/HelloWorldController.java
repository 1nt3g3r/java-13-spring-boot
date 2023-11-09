package com.goitjava16.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@RequestMapping("/hello")
@Controller
public class HelloWorldController {
    @GetMapping("/world")
    public ModelAndView getHelloWorld() {
        ModelAndView result = new ModelAndView("hello");
        result.addObject("username", "sw0rdf1sh");
        result.addObject("months", Arrays.asList(
                "June",
                "July",
                "August"
        ));
        return result;
    }
}
