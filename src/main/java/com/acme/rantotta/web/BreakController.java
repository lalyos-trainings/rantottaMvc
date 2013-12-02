package com.acme.rantotta.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acme.rantotta.service.BreakTimeService;

@Controller
public class BreakController {

    private final BreakTimeService service;
    
    @Autowired
    public BreakController(BreakTimeService service) {
        this.service = service;
    }
    
    @RequestMapping("/list")
    public String list(Model model) {
        
        model.addAttribute("breakList", service.getAll());
        return "list";
    }
}