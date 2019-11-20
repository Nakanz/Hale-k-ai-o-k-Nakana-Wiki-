package shop.ui;

abstract class Template<U,V> {
	private final U heading;
	private final UtilPair<U,V>[] options;
	
	Template(U heading, UtilPair<U,V>[] options) {
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
		return options[i].prompt;
	}
}
