package jp.co.systena.tigerscave.springtest.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommandController {

  // @Autowired
  // ListService listService;

  // (valueの箇所はサーバーで起動したときのURLの場所。)
  @RequestMapping(value = "/command", method = RequestMethod.POST)
  public ModelAndView list(ModelAndView mav) {

    // テンプレートファイル名を入力
    mav.setViewName("Command");

    return mav;

  }


}
