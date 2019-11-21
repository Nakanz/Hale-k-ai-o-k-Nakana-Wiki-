package shop.ui.generic;

import shop.ui.UIFormTest;

final class UIForm extends UITemplate<UIFormTest>{
	private final UtilPair<String, UIFormTest>[] _form;
	UIForm(String heading, UtilPair<String, UIFormTest>[] options) {
		super(heading, options);
		_form = options;
	}
	public boolean checkInput(int i, String input) {
		if (null == _form[i]) {
			return true;
		}
		return _form[i].getOperation().run(input);
	}
}
