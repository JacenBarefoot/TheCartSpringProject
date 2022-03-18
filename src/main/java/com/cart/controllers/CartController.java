package com.cart.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cart.entities.Item;
import com.cart.models.BoardModel;
import com.cart.models.BackpackModel;
import com.cart.models.ShoeModel;
import com.cart.models.PantModel;
import com.cart.models.HoodieModel;


@Controller
@RequestMapping(value = "cart")
public class CartController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "cart/index";
    }



    @RequestMapping(value = "buyBoards/{id}", method = RequestMethod.GET)
    public String buyBoards(@PathVariable("id") String id, HttpSession session1) {
        BoardModel boardModel = new BoardModel();
        if (session1.getAttribute("cartBoards") == null) {
            List<Item> cartBoards = new ArrayList<Item>();
            cartBoards.add(new Item(boardModel.find(id), null,null, null, null, 1));
            session1.setAttribute("cartBoards", cartBoards);
        } else {
            List<Item> cartBoards = (List<Item>) session1.getAttribute("cartBoards");
            int index1 = this.exists1(id, cartBoards);
            if (index1 == -1) {
                cartBoards.add(new Item(boardModel.find(id), null, null, null, null,1));
            } else {
                int quantity = cartBoards.get(index1).getQuantity() + 1;
                cartBoards.get(index1).setQuantity(quantity);
            }
            session1.setAttribute("cartBoards", cartBoards);
        }
        return "redirect:/skateboard";
    }

    @RequestMapping(value = "buyBackpacks/{id}", method = RequestMethod.GET)
    public String buyBackpacks(@PathVariable("id") String id, HttpSession session2) {
        BackpackModel backpackModel = new BackpackModel();
        if (session2.getAttribute("cartBackpacks") == null) {
            List<Item> cartBackpacks = new ArrayList<Item>();
            cartBackpacks.add(new Item(null, backpackModel.find(id),null, null, null, 1));
            session2.setAttribute("cartBackpacks", cartBackpacks);
        } else {
            List<Item> cartBackpacks = (List<Item>) session2.getAttribute("cartBackpacks");
            int index1 = this.exists2(id, cartBackpacks);
            if (index1 == -1) {
                cartBackpacks.add(new Item(null, backpackModel.find(id), null, null, null,  1));
            } else {
                int quantity = cartBackpacks.get(index1).getQuantity() + 1;
                cartBackpacks.get(index1).setQuantity(quantity);
            }
            session2.setAttribute("cartBackpacks", cartBackpacks);
        }
        return "redirect:/backpack";
    }
    @RequestMapping(value = "buyShoes/{id}", method = RequestMethod.GET)
    public String buyShoes(@PathVariable("id") String id, HttpSession session3) {
        ShoeModel shoeModel = new ShoeModel();
        if (session3.getAttribute("cartShoes") == null) {
            List<Item> cartShoes = new ArrayList<Item>();
            cartShoes.add(new Item(null,null, shoeModel.find(id), null,null, 1));
            session3.setAttribute("cartShoes", cartShoes);
        } else {
            List<Item> cartShoes = (List<Item>) session3.getAttribute("cartShoes");
            int index1 = this.exists3(id, cartShoes);
            if (index1 == -1) {
                cartShoes.add(new Item(null, null, shoeModel.find(id),  null, null,1));
            } else {
                int quantity = cartShoes.get(index1).getQuantity() + 1;
                cartShoes.get(index1).setQuantity(quantity);
            }
            session3.setAttribute("cartShoes", cartShoes);
        }
        return "redirect:/shoe";
    }

    @RequestMapping(value = "buyHoodies/{id}", method = RequestMethod.GET)
    public String buyHoodies(@PathVariable("id") String id, HttpSession session4) {
        HoodieModel hoodieModel = new HoodieModel();
        if (session4.getAttribute("cartHoodies") == null) {
            List<Item> cartHoodies = new ArrayList<Item>();
            cartHoodies.add(new Item(null,null, null, hoodieModel.find(id),null, 1));
            session4.setAttribute("cartHoodies", cartHoodies);
        } else {
            List<Item> cartHoodies = (List<Item>) session4.getAttribute("cartHoodies");
            int index1 = this.exists4(id, cartHoodies);
            if (index1 == -1) {
                cartHoodies.add(new Item(null, null,null, hoodieModel.find(id),  null, 1));
            } else {
                int quantity = cartHoodies.get(index1).getQuantity() + 1;
                cartHoodies.get(index1).setQuantity(quantity);
            }
            session4.setAttribute("cartHoodies", cartHoodies);
        }
        return "redirect:/hoodie";
    }

    @RequestMapping(value = "buyPants/{id}", method = RequestMethod.GET)
    public String buyPants(@PathVariable("id") String id, HttpSession session5) {
        PantModel pantModel = new PantModel();
        if (session5.getAttribute("cartPants") == null) {
            List<Item> cartPants = new ArrayList<Item>();
            cartPants.add(new Item(null,null, null, null, pantModel.find(id), 1));
            session5.setAttribute("cartPants", cartPants);
        } else {
            List<Item> cartPants = (List<Item>) session5.getAttribute("cartPants");
            int index1 = this.exists5(id, cartPants);
            if (index1 == -1) {
                cartPants.add(new Item(null, null,null, null, pantModel.find(id),   1));
            } else {
                int quantity = cartPants.get(index1).getQuantity() + 1;
                cartPants.get(index1).setQuantity(quantity);
            }
            session5.setAttribute("cartPants", cartPants);
        }
        return "redirect:/pant";
    }

    @RequestMapping(value = "removeBoards/{id}", method = RequestMethod.GET)
    public String removeBoards(@PathVariable("id") String id, HttpSession session1) {
        List<Item> cartBoards = (List<Item>) session1.getAttribute("cartBoards");
        int index1 = this.exists1(id, cartBoards);
        cartBoards.remove(index1);
        session1.setAttribute("cartBoards", cartBoards);
        return "redirect:/cart/index";
    }

    @RequestMapping(value = "removeBackpacks/{id}", method = RequestMethod.GET)
    public String removeBackpacks(@PathVariable("id") String id, HttpSession session2) {
        List<Item> cartBackpacks = (List<Item>) session2.getAttribute("cartBackpacks");
        int index1 = this.exists2(id, cartBackpacks);
        cartBackpacks.remove(index1);
        session2.setAttribute("cartBackpacks", cartBackpacks);
        return "redirect:/cart/index";
    }

    @RequestMapping(value = "removeShoes/{id}", method = RequestMethod.GET)
    public String removeShoes(@PathVariable("id") String id, HttpSession session3) {
        List<Item> cartShoes = (List<Item>) session3.getAttribute("cartShoes");
        int index1 = this.exists3(id, cartShoes);
        cartShoes.remove(index1);
        session3.setAttribute("cartShoes", cartShoes);
        return "redirect:/cart/index";
    }

    @RequestMapping(value = "removeHoodies/{id}", method = RequestMethod.GET)
    public String removeHoodies(@PathVariable("id") String id, HttpSession session4) {
        List<Item> cartHoodies = (List<Item>) session4.getAttribute("cartHoodies");
        int index1 = this.exists4(id, cartHoodies);
        cartHoodies.remove(index1);
        session4.setAttribute("cartHoodies", cartHoodies);
        return "redirect:/cart/index";
    }

    @RequestMapping(value = "removePants/{id}", method = RequestMethod.GET)
    public String removePants(@PathVariable("id") String id, HttpSession session5) {
        List<Item> cartPants = (List<Item>) session5.getAttribute("cartPants");
        int index1 = this.exists5(id, cartPants);
        cartPants.remove(index1);
        session5.setAttribute("cartPants", cartPants);
        return "redirect:/cart/index";
    }

    private int exists1(String id, List<Item> cartBoards) {
        for (int i = 0; i < cartBoards.size(); i++) {
            if (cartBoards.get(i).getSkateboard().getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }
    private int exists2(String id, List<Item> cartBackpacks) {
        for (int i = 0; i < cartBackpacks.size(); i++) {
            if (cartBackpacks.get(i).getBackpack().getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    private int exists3(String id, List<Item> cartShoes) {
        for (int i = 0; i < cartShoes.size(); i++) {
            if (cartShoes.get(i).getShoe().getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    private int exists4(String id, List<Item> cartHoodies) {
        for (int i = 0; i < cartHoodies.size(); i++) {
            if (cartHoodies.get(i).getHoodie().getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    private int exists5(String id, List<Item> cartPants) {
        for (int i = 0; i < cartPants.size(); i++) {
            if (cartPants.get(i).getPant().getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }
}
