package com.bobbyplunkett.springcarrepairshop.controllers;

import com.bobbyplunkett.springcarrepairshop.services.MechanicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.bobbyplunkett.springcarrepairshop.controllers
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
@RequestMapping("/mechanics")
@Controller
public class MechanicController {

    private final MechanicService mechanicService;

    public MechanicController(MechanicService mechanicService) {
        this.mechanicService = mechanicService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index(Model model) {
        model.addAttribute("mechanics", mechanicService.findAll());
        return "mechanics/index";
    }
}
