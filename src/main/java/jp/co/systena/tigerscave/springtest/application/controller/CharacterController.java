package jp.co.systena.tigerscave.springtest.application.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.springtest.application.model.CharacterForm;
import jp.co.systena.tigerscave.springtest.application.model.Work;
import jp.co.systena.tigerscave.springtest.application.service.WorkService;

@Controller
public class CharacterController {

  @Autowired
  WorkService workservice;



  // (valueの箇所はサーバーで起動したときのURLの場所。)
  // @RequestMappingの記述を簡略化するために@GetMappingを使用
  @GetMapping(value = "/")
  public ModelAndView list(ModelAndView mav) {

    // CharacterForm型のcharacterメソッドを使用。
    /*
     * テンプレートに値を渡す内容を設定 第一引数は「変数」、第二引数は実際に渡す「オブジェクト」
     */

    // テンプレートファイル名を入力
    mav.setViewName("Character");

    return mav;

  }


  /*
   * CharacterForm型（CharacterFormクラス）の引数が入力された値を持っているため、 CharacterForm型を引数に持たせる。
   */
  // @RequestMappingの記述を簡略化するために@PostMappingを使用
  @PostMapping(value = "/command")
  public ModelAndView information(ModelAndView mav, CharacterForm characterform) {

    if (characterform != null) {

      /*
       * CharacterForm型の新しいオブジェクトを作成する。 (オブジェクトを作成するとその型に含まれていた値は引き継がれない。
       * オブジェクトを作成時に「new」をしているため新しい型として引き継がれる。)
       */
      CharacterForm character = new CharacterForm();
      Map<Integer, Work> itemListMap = workservice.getworklist();


      // 変数characterオブジェクトを用いてに引数のcharacterformが持っていた値をsetさせる。
      character.setSelectedRadio(characterform.getSelectedRadio());
      character.setName(characterform.getName());


      mav.addObject("character", character);

      // Viewのテンプレート名を設定
      mav.setViewName("Command");


    }

    return mav;

  }
}
