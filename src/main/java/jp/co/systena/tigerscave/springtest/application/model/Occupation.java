package jp.co.systena.tigerscave.springtest.application.model;

public abstract class Occupation {

  protected String work;
  protected String name;

  abstract public void fight();

  abstract public void getWork(String work);

  abstract public void setWork(String work);

  abstract public void getName(String name);

  abstract public void setName(String name);


}
