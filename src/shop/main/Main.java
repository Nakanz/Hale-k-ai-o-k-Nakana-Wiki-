package shop.main;

import shop.ui.UIFactory;
import shop.data.Data;

public class Main {
  private Main() {}
  public static void main(String[] args) {
    Control control1 = new Control(Data.newInventory(), UIFactory.uiPopup());
    control1.run();
//    Control control2 = new Control(Data.newInventory(), UIFactory.uiText());
//    control2.run();
  }
}
