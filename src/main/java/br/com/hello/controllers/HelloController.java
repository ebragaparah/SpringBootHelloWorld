package br.com.hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

  @RequestMapping("/")
  public String index() {
    return "index";
  }

}
