package p7;

import java.awt.*;

public class Shirt extends Clothing implements ManClothing, WomanClothing {
    public Shirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this);
    }

    @Override
    public void dressWoman() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Футболка: " + '\'' +
                "размер= " + getSize() + '\n' +
                "стоимость= " + getPrice() + '\n' +
                "цвет=" + getColor() + '\'';
    }
}
