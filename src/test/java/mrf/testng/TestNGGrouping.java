package mrf.testng;

import org.testng.annotations.Test;

public class TestNGGrouping {
  @Test(groups = {"Car", "Sedan", "Toyota"})
  public void toyotaGrandeX() {
	  System.out.println("I'm Toyota Corolla Grande X with Black Interior");
  }
  @Test(groups = {"Car", "Hatchback", "Kia"})
  public void kiaPicanto() {
	  System.out.println("I'm Kia Picanto");
  }
  @Test(groups = {"SUV", "Kia"})
  public void kiaSorento() {
	  System.out.println("I'm Kia Sorento");
  }
  @Test(groups = {"Car", "Sedan", "Honda"})
  public void hondaCivicX() {
	  System.out.println("I'm Honda Civic X");
  }
  @Test(groups = {"Car", "Sedan", "Hyundai"})
  public void hyundaiElantra() {
	  System.out.println("I'm Hyundai Elantra");
  }
  @Test(groups = {"Bike", "CD70", "Honda"})
  public void hondaCD70() {
	  System.out.println("I'm Honda CD 70 Bike");
  }
  @Test(groups = {"Bike", "CD125", "Honda"})
  public void hondaCD125() {
	  System.out.println("I'm Honda CD 125 Bike");
  }
}
