package com.destiny.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.destiny.entities.fighter.FighterEntity;
import com.destiny.services.fighter.FighterService;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private FighterService fighterService;

    @RequestMapping(value = "/findAllFighter", method = RequestMethod.GET)
    public List<FighterEntity> findTeam() {
        return fighterService.findAll();
    }
}
