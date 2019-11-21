package shop.ui.generic;

import java.util.ArrayList;
import java.util.List;

import shop.ui.UIForm;
import shop.ui.UIFormTest;
import shop.ui.UIMenuAction;

class UIMenuBuilder implements UI_CBuilder<UIMenu, UIMenuAction> {
	private final List<Object> _menu;

	public UIMenuBuilder() {
		_menu = new ArrayList<>();
	}

	@Override
	public UIMenu toUI_V(String heading) {
		// TODO Auto-generated method stub
		if (null == heading)
      throw new IllegalArgumentException();
    if (_menu.size() <= 1)
      throw new IllegalStateException();
		return null;
	}

	@Override
	public void add(String prompt, UIMenuAction operation) {
		// TODO Auto-generated method stub

	}

}
