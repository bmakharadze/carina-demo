package com.solvd.gui.amazon.components.filters;

public enum Menu {

    UNDER500("500$"), TO600("$500 to $600");

    private String menuName;

    Menu(String menuName) {
        this.menuName = menuName;
    }

    public String getPrice() {
        return menuName;
    }
}
