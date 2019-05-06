package com.bobbyplunkett.springcarrepairshop.controllers;

import org.springframework.stereotype.Controller;
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

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index() {
        return "mechanics/index";
    }
}
