package p7;

public class Atelier {

    public void dressMan(Clothing[] clothing) {
        for (Clothing cloth : clothing) {
            if (cloth instanceof ManClothing) {
                ((ManClothing)cloth).dressMan();
            }
        }
    }
    public void dressWoman(Clothing[] clothing) {
        for (Clothing cloth : clothing) {
            if (cloth instanceof WomanClothing) {
                ((WomanClothing)cloth).dressWoman();
            }
        }
    }
}
