package com.allhearts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hakyoshyt on 10/2/17.
 */
@Controller
public class AllheartsController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
