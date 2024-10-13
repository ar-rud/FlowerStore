package org.example.flowers;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00"),
    YELLOW("#FFFF00"), WHITE("#FFFFFF");

    private String rgb;

    FlowerColor(String rgb) {
        this.rgb = rgb;
    }

    public String toString() {
        return this.rgb;
    }
}
