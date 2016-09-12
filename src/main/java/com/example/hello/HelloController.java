package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ahn on 2016. 9. 12..
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello/hello";
    }

    @RequestMapping(value = "/welcome")
    public ModelAndView hello(@RequestParam(value="name", defaultValue="World") String name) {
        ModelAndView mav = new ModelAndView("welcome");
        mav.addObject("name", name);
        return mav;
    }

}
