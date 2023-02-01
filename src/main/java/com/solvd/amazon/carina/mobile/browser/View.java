package com.solvd.amazon.carina.mobile.browser;

public enum View {
    NATIVE("NATIVE_APP"),
    WEB("WEBVIEW_chrome"),
    WEB1("WEBVIEW_97091.3");

    private String viewName;

    View(String viewName) {
        this.viewName = viewName;
    }

    public String getView() {
        return viewName;
    }
}