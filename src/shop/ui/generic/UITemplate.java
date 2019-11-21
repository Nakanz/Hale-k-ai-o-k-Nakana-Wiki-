package shop.ui.generic;

public abstract class UITemplate<V> {
	private final String heading;
	private final UtilPair<String, V>[] options;
	
	final static class UtilPair<U,V> {
		private final U prompt;
		private final V operation;
		UtilPair(U _prompt, V _operation) {
			prompt = _prompt;
			operation = _operation;
		}
		
		U getPrompt() { return prompt; }
		V getOperation() { return operation; }
	}
	
	UITemplate(String heading, UtilPair<String, V>[] options) {
		this.heading = heading;
		this.options = options;
	}

	public int size() {
		return options.length;
	}

	public String getHeading() {
		return heading;
	}

	public String getPrompt(int i) {
		return options[i].getPrompt();
	}
}
