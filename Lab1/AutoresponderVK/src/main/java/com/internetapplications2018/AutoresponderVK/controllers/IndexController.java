package com.internetapplications2018.AutoresponderVK.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @GetMapping("/")
    public ModelAndView index() {
        String message = "Hello there";

        Map<String, String> model = new HashMap<>();
        model.put("message", message);

        return new ModelAndView("index", model);
    }
}
