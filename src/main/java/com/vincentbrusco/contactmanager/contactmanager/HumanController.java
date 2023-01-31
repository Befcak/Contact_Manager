package com.vincentbrusco.contactmanager.contactmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/contactmanager")
public class HumanController {
    @Autowired
    private HumanRepository humanRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewHuman(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String midName){

        humanRepository.save(new Human(firstName, lastName, midName));
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Human> getAllHumans(){
        return humanRepository.findAll();
    }
    
}
