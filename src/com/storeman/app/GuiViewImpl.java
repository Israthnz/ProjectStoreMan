package com.storeman.app;

public class GuiViewImpl implements GuiView {

	@Override
	public void initializeView() {
		System.out.println("Initial View");
	}

	@Override
	public void loadComponents() {
		System.out.println("Load Comp");
	}

}
