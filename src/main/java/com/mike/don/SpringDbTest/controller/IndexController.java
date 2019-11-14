package com.mike.don.SpringDbTest.controller;

import com.mike.don.SpringDbTest.dto.Game;
import com.mike.don.SpringDbTest.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    IGameService service;

    @RequestMapping("/")
    public String index() {
        var games = (List<Game>) service.findAll();


        return "Hallo lul";
    }

}
