package com.cart.controllers;

import com.cart.models.ProductModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cart.models.BoardModel;

@Controller
@RequestMapping(value = "skateboard")
public class BoardController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        BoardModel boardModel = new BoardModel();
        modelMap.put("skateboards", boardModel.findAll());
        return "boards/index";
    }
}
