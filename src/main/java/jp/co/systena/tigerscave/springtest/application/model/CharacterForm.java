package jp.co.systena.tigerscave.springtest.application.model;

import java.util.LinkedHashMap;

public class CharacterForm {

  private String selectedRadio;
  private String name;


  public String getSelectedRadio() {
    LinkedHashMap<Integer, String> selectMap = new LinkedHashMap<Integer, String>();

    selectMap.put(1, "戦士");
    selectMap.put(2, "魔法使い");


    return selectedRadio;
  }

  public void setSelectedRadio(String selectedradio) {
    this.selectedRadio = selectedradio;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
