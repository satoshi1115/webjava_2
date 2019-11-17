package jp.co.systena.tigerscave.springtest.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.springtest.application.model.Magician;
import jp.co.systena.tigerscave.springtest.application.model.Warrior;

@Controller
public class CharacterController {

  // @Autowired
  // ListService listService;


  // (valueの箇所はサーバーで起動したときのURLの場所。)
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView list(ModelAndView mav) {

    // CharacterForm型のcharacterメソッドを使用。
    /*
     * テンプレートに値を渡す内容を設定 第一引数は「変数」、第二引数は実際に渡す「オブジェクト」
     */
    Warrior warrior = new Warrior();
    Magician magician = new Magician();

    mav.addObject("warrior", warrior);
    mav.addObject("magician", magician);

    // テンプレートファイル名を入力
    mav.setViewName("Character");

    return mav;

  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public ModelAndView information(ModelAndView mav) {


    // Viewのテンプレート名を設定
    mav.setViewName("ListView");

    return mav;



  }
}
