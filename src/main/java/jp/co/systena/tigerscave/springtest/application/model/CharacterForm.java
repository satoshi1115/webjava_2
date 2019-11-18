package jp.co.systena.tigerscave.springtest.application.model;

public class CharacterForm {


  private String warrior;
  private String magician;
  private String name;

  public String getWarrior() {
    return warrior;
  }

  public void setWarrior(String warrior) {
    this.warrior = warrior;
  }

  public String getMagician() {
    return magician;
  }

  public void setMagician(String magician) {
    this.magician = magician;
  }


  public String getName(String name) {
    this.name = name;

    return name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
