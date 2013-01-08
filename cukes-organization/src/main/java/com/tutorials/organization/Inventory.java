package com.tutorials.organization;

/**
 *  Pretend this class is a database
 *  not inner classes. Because that is
 *  what the app does
 */
public class Inventory {

  protected interface Spirit {
     String getName();
     boolean isInStock();
     int getAge();
     int getPrice();
     String getType();
     void setStock(boolean inStock);
  }

  protected class Jameson12 implements Spirit {
    final String name = "Jameson12";
    boolean inStock = true;
    final int price = 40;
    final int age = 12;
    final String type = "whiskey";

    @Override
    public void setStock(boolean inStock) {
      this.inStock = inStock;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public boolean isInStock() {
      return inStock;
    }

    @Override
    public int getAge() {
      return age;
    }

    @Override
    public int getPrice() {
      return price;
    }

    @Override
    public String getType() {
      return type;
    }
  }

  protected class Jameson implements Spirit {
    final String name = "Jameson";
    boolean inStock = true;
    final int price = 20;
    final int age = 1;
    final String type = "whiskey";

    @Override
    public void setStock(boolean inStock) {
      this.inStock = inStock;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public boolean isInStock() {
      return inStock;
    }

    @Override
    public int getAge() {
      return age;
    }

    @Override
    public int getPrice() {
      return price;
    }

    @Override
    public String getType() {
      return type;
    }
  }

  protected class JimBeam implements Spirit {
    final String name = "Jim Beam";
    boolean inStock = false;
    final int price = 15;
    final int age = 1;
    final String type = "whiskey";

    @Override
    public void setStock(boolean inStock) {
      this.inStock = inStock;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public boolean isInStock() {
      return inStock;
    }

    @Override
    public int getAge() {
      return age;
    }

    @Override
    public int getPrice() {
      return price;
    }

    @Override
    public String getType() {
      return type;
    }
  }

  protected class Sky implements Spirit {
     final String name = "Sky";
     boolean inStock = true;
     final int price = 15;
     final int age = 1;
     final String type = "vodka";

    @Override
    public void setStock(boolean inStock) {
      this.inStock = inStock;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public boolean isInStock() {
      return inStock;
    }

    @Override
    public int getAge() {
      return age;
    }

    @Override
    public int getPrice() {
      return price;
    }

    @Override
    public String getType() {
      return type;
    }
  }
}
