package com.cart.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cart.entities.Item;
import com.cart.models.ProductModel;
import com.cart.models.BoardModel;

@Controller
@RequestMapping(value = "cart")
public class CartController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "cart/index";
    }

    @RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
    public String buy(@PathVariable("id") String id, HttpSession session) {
        ProductModel productModel = new ProductModel();
        if (session.getAttribute("cart") == null) {
            List<Item> cart = new ArrayList<Item>();
            cart.add(new Item(productModel.find(id), null, 1));
            session.setAttribute("cart", cart);
        } else {
            List<Item> cart = (List<Item>) session.getAttribute("cart");
            int index = this.exists(id, cart);
            if (index == -1) {
                cart.add(new Item(productModel.find(id), null, 1));
            } else {
                int quantity = cart.get(index).getQuantity() + 1;
                cart.get(index).setQuantity(quantity);
            }
            session.setAttribute("cart", cart);
        }
        return "redirect:/cart/index";
    }

    @RequestMapping(value = "buyBoards/{id}", method = RequestMethod.GET)
    public String buyBoards(@PathVariable("id") String id, HttpSession session1) {
        BoardModel boardModel = new BoardModel();
        if (session1.getAttribute("cartb") == null) {
            List<Item> cartb = new ArrayList<Item>();
            cartb.add(new Item(null,boardModel.find(id), 1));
            session1.setAttribute("cartb", cartb);
        } else {
            List<Item> cartb = (List<Item>) session1.getAttribute("cartb");
            int index1 = this.exists1(id, cartb);
            if (index1 == -1) {
                cartb.add(new Item(null, boardModel.find(id), 1));
            } else {
                int quantity = cartb.get(index1).getQuantity() + 1;
                cartb.get(index1).setQuantity(quantity);
            }
            session1.setAttribute("cartb", cartb);
        }
        return "redirect:/cart/index";
    }


    @RequestMapping(value = "remove/{id}", method = RequestMethod.GET)
    public String remove(@PathVariable("id") String id, HttpSession session) {
        ProductModel productModel = new ProductModel();
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        int index = this.exists(id, cart);
        cart.remove(index);
        session.setAttribute("cart", cart);
        return "redirect:/cart/index";
    }
    @RequestMapping(value = "removeBoards/{id}", method = RequestMethod.GET)
    public String removeBoards(@PathVariable("id") String id, HttpSession session1) {
        List<Item> cartb = (List<Item>) session1.getAttribute("cartb");
        int index1 = this.exists1(id, cartb);
        cartb.remove(index1);
        session1.setAttribute("cartb", cartb);
        return "redirect:/cart/index";
    }

    private int exists(String id, List<Item> cart) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getProduct().getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }
    private int exists1(String id, List<Item> cartb) {
        for (int i = 0; i < cartb.size(); i++) {
            if (cartb.get(i).getSkateboard().getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }
}
