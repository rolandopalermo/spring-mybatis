/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolandopalermo.web.controller;

import com.rolandopalermo.web.mapper.ProductMapper;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rolando
 */
@Controller
public class HomeController {

    @Autowired
    private ProductMapper productMapper;
    
    public HomeController() {
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView();
        List lst = productMapper.selectAllProduct();
        model.addObject("products", lst);
        model.setViewName("home");
        return model;
    }

}
