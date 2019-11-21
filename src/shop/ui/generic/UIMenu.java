package shop.ui.generic;

import shop.ui.UIMenuAction;

final class UIMenu extends UITemplate<UIMenuAction>{
	private final UtilPair<String, UIMenuAction>[] _menu;
	UIMenu(String heading, UtilPair<String, UIMenuAction>[] options) {
		super(heading, options);
		_menu = options;
	}
	public void runAction(int i) {
			
	    _menu[i].getOperation().run();
	}

}
