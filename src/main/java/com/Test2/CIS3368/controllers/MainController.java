package com.Test2.CIS3368.controllers;

import com.Test2.CIS3368.Models.VirusesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    VirusesRepo virusesRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("viruseslist", virusesRepo.findAll());

        return mv;
    }



}
