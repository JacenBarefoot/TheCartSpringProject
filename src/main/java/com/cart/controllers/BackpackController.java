package com.cart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cart.models.BackpackModel;

@Controller
@RequestMapping(value = "backpack")
public class BackpackController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        BackpackModel backpackModel = new BackpackModel();
        modelMap.put("backpacks", backpackModel.findAll());
        return "backpack/index";
    }
}