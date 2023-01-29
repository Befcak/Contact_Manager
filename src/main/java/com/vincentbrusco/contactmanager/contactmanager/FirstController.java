package com.vincentbrusco.contactmanager.contactmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FirstController {

    @RequestMapping(path = "/")
    public String indexPage()
    {
        return "index";
    }

    @RequestMapping(path = "/submit")
    public String submitPage()
    {
        return "submit";
    }
    
}
