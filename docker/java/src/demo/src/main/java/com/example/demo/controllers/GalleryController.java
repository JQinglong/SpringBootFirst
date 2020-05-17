package com.example.demo.controllers;

import com.example.demo.services.NameService; // ←追加

import org.springframework.beans.factory.annotation.Autowired; // ←追加
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GalleryController {
    @Autowired private NameService service; // ←追加

    @RequestMapping({ "/gallery" })
    public ModelAndView get(ModelAndView mav) {
        mav.addObject("names", service.getAll()); // ←追加
        mav.setViewName("gallery");
        return mav;
    }
}