package com.tutorials.organization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class is responsible for managing
 * the spirits inventory
 */
public class SpiritManager extends Inventory {

  private Map<String, Inventory.Spirit> currentInventory;

  public SpiritManager() {
    //initialize the inventory
    currentInventory = new HashMap<String, Inventory.Spirit>();
    //populate current inventory
    currentInventory.put("Jameson12",new Jameson12());
    currentInventory.put("Jameson1" ,new Jameson());
    currentInventory.put("Sky1", new Sky());
    currentInventory.put("Jim Beam1",new JimBeam());
  }

  public boolean isInStock(String name) {
    return currentInventory.get(name).isInStock();
  }

  public void setStock(String name, boolean inStock) {
    Map<String, Inventory.Spirit> newInventory = new HashMap<String, Inventory.Spirit>();
    Inventory.Spirit spirit = currentInventory.remove(name);
    spirit.setStock(inStock);
    currentInventory.put(name,spirit);
  }

  public List<String> getRequest(List<String> names) {
    List<String> spiritStrings = new ArrayList<String>();
    for (String name : names) {
      Inventory.Spirit spirit = currentInventory.get(name);

      //only add this spirit if it is in stock
      if (spirit.isInStock()) {
        String row = spirit.getName() + ": $" + spirit.getPrice();
        spiritStrings.add(row);
      }
    }

    return spiritStrings;
  }
}
