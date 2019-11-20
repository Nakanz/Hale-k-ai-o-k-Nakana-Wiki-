package shop.ui.generic;

public abstract class UITemplate<U,V> {
	private final U heading;
	private final UtilPair<U,V>[] options;
	
	UITemplate(U heading, UtilPair<U,V>[] options) {
		this.heading = heading;
		this.options = options;
	}
	public int size() {
		return options.length;
	}
	public U getHeading() {
		return heading;
	}
	public U getPrompt(int i) {
		return options[i].getPrompt();
	}
	
	/* below are the two methods from UIForm & UIMenu respectively (top to bottom) */
	
//	public boolean checkInput(int i, U input) {
//		if (null == options[i]) {
//			return true;
//		}
//		return options[i].operation.run(input);
//	}
//	public void runAction(int i) {
//	    _menu[i].action.run();
//	  }
	
}
