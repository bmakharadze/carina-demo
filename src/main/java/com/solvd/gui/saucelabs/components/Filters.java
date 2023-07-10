package com.solvd.gui.saucelabs.components;

public enum Filters {

    NAME_AZ("Name (A to Z)"),
    NAME_ZE("Name (Z to A)"),
    PRICE_LOW("Price (low to high)"),
    PRICE_HIGH("Price (high to low)");

    private final String filter;

    Filters(String filter) {
        this.filter = filter;
    }

    public String getFilter() {
        return filter;
    }

}
