package shop.ui.generic;


/**
 * <p> A utility pair for types U and V, prompt and the pair's operation</p>
 * Records can only be created and destroyed using the Inventory.
 * @see UITemplate
 */
public interface UtilPair<U,V> {
	
	/**
	 * Sets <code>this</code> UtilPair's prompt
	 * @param prompt
	 */
	void setPrompt(U prompt);
	
	/**
	 * Sets <code>this</code> UtilPair's operation
	 * @param operation
	 */
	void setOperation(V operation);
	
	/**
	 * Gets the prompt of <code>this</code> UtilPair
	 * @return <code>U</code>, the prompt
	 */
	U getPrompt();
	
	/**
	 * Gets the operation of <code>this</code> UtilPair
	 * @return <code>V</code>, the operation
	 */
	V getOperation();
	
	/**
	 * If <code>input</code> is null it's a UIMenuAction, otherwise; UIFormTest...but it doesn't matter right?
	 * I can make an inner function with any specification
	 * @param input
	 * @return <code>true</code> if <code>this</code> UtilPair's run method is successful
	 */
	boolean run(U input);
}
