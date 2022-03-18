package com.cart.controllers;

import com.cart.models.ShoeModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "shoe")
public class ShoeController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        ShoeModel shoeModel = new ShoeModel();
        modelMap.put("shoes", shoeModel.findAll());
        return "shoe/index";
    }
}
