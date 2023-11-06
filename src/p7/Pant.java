package p7;

public class Pant extends Clothing implements ManClothing, WomanClothing{
    public Pant(ClothingSize size, double price, String color) {
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
        return "Брюки: " + '\'' +
                "размер= " + getSize() + '\n' +
                "стоимость= " + getPrice() + '\n' +
                "цвет=" + getColor() + '\'';
    }
}
