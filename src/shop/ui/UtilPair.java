package shop.ui;

final class UtilPair<U, V> {
	final U prompt;
	final V operation;

	public UtilPair(U prompt, V operation) {
		this.prompt = prompt;
		this.operation = operation;
	}
}
