package net.gtidev.sandbox.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoreController {

  @RequestMapping("/index")
  String home() {
    return "index";
  }
}
