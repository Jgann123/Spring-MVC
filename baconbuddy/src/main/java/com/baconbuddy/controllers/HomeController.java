package com.baconbuddy.controllers;

import com.baconbuddy.com.baconbuddy.models.Person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/", "/home" })
public class HomeController {

    @GetMapping()
    public String index() {
        // the string index will be looked for in src/main/resources/templates
        return "index";
    }

    // Remember Ctrl + Shift + O (Mac: Command + Shift + O) to auto import
    @PostMapping("/person")
    public String personSubmit(@ModelAttribute Person person) {
        return "result";
    }
}
// Remember Ctrl + Shift + F (Mac: Command + Shift + F) to quick format your
// file.