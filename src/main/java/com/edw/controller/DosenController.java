/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edw.controller;

import com.edw.bean.Dosen;
import com.edw.service.DosenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author edwin
 */
@Controller
public class DosenController {

    @Autowired
    private DosenService dosenService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("dosens", dosenService.getDosens());
        return "index";
    }

    @RequestMapping(value = "/newdosen", method = RequestMethod.POST)
    public String simpanDosen(ModelMap modelMap, @ModelAttribute Dosen dosen) {
        dosenService.save(dosen);        
        return "redirect:/";
    }

    @RequestMapping(value = "/dosen/{id}", method = RequestMethod.GET)
    public String redirectToProfile(ModelMap modelMap, @PathVariable String id) {
        modelMap.put("dosen", dosenService.get(id));
        return "index";
    }
}
