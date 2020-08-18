package com.gfike.postrgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class KayakController {

    @Autowired
    KayakDao kayakDao;

    @GetMapping
    public String getIndex(Model model) {
        Kayak kayak = new Kayak();
        model.addAttribute("kayak", kayak);
        return "index";
    }

    @PostMapping
    public String postIndex(@ModelAttribute Kayak kayak, Model model) {
        kayakDao.save(kayak);
        return "redirect:/";
    }

    @RequestMapping(value="error", method = RequestMethod.GET)
    public String error() {
        return "error";
    }
}
