package com.cart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cart.models.HoodieModel;

@Controller
@RequestMapping(value = "hoodie")
public class HoodieController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        HoodieModel hoodieModel = new HoodieModel();
        modelMap.put("hoodies", hoodieModel.findAll());
        return "hoodie/index";
    }
}