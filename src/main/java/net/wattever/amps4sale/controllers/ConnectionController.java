package net.wattever.amps4sale.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("connection")
public class ConnectionController {

    public static HashMap<String, String> subscribers = new HashMap<>();

    @GetMapping
    public String connectionPage(){
        return "connection";
    }
}
