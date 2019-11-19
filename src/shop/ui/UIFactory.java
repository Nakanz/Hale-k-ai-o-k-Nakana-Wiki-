package shop.ui;

public class UIFactory {
  private UIFactory() {}
  static private UI _UIP = new PopupUI();
  static private UI _UIT = new TextUI();
  static public UI uiPopup () {
    return _UIP;
  }
  static public UI uiText () {
	    return _UIT;
	  }
}