package p7;

public class Tie extends Clothing implements ManClothing{
    public Tie(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Галстук: " + '\'' +
                "размер= " + getSize() + '\n' +
                "стоимость= " + getPrice() + '\n' +
                "цвет=" + getColor() + '\'';
    }
}
