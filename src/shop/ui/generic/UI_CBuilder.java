package shop.ui.generic;


public interface UI_CBuilder<C, V> {
	C toUI_V(String heading);
	void add(String prompt, V operation);
	
}
