package com.goitjava16.demo.seasondetector;


import com.goitjava16.demo.seasondetector.service.SeasonDetectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
@RequestMapping("/season")
public class SeasonDetectorController {
    private final SeasonDetectorService seasonDetectorService;

    @GetMapping
    public String show() {
        return "seasondetector";
    }

    @PostMapping
    public ModelAndView handlePost(
            @RequestParam(name = "month", required = false) String month) {
        ModelAndView result = new ModelAndView("seasondetector");
        result.addObject("result", seasonDetectorService.detect(month));
        return result;
    }
}
