package com.cart.controllers;

import com.cart.models.PantModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "pant")
public class PantController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        PantModel pantModel = new PantModel();
        modelMap.put("pants", pantModel.findAll());
        return "pant/index";
    }
}