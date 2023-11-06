package p7;

public class Skirt extends Clothing implements WomanClothing{
    public Skirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Юбка: " + '\'' +
                "размер= " + getSize() + '\n' +
                "стоимость= " + getPrice() + '\n' +
                "цвет=" + getColor() + '\'';
    }
}
