package p7;

import java.awt.*;

public class DemoClothing {
    public static void main(String[] args) {
        Clothing pant1 = new Pant(ClothingSize.M, 35, "Серый");
        Clothing pant2 = new Pant(ClothingSize.L, 38, "Черный");
        Clothing shirt1 = new Shirt(ClothingSize.XS, 36, "Белый");
        Clothing shirt2 = new Shirt(ClothingSize.M, 39, "Синий");
        Clothing skirt = new Skirt(ClothingSize.XS, 29, "Розовый");
        Clothing tie = new Tie(ClothingSize.M, 23, "Синий в белый горошек");
        Clothing[] clothing = {pant1, pant2, shirt1, shirt2, skirt, tie};

        Atelier atelier = new Atelier();
        atelier.dressMan(clothing);
        System.out.println("---");
        atelier.dressWoman(clothing);
    }
}
