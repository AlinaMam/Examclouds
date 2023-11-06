package p3;

public class Horse {
    private Halter halter;

    public Horse(Halter halter) { //Агрегация
        this.halter = halter;
    }

    public Horse() {
        this.halter = new Halter(); //композиция
    }
}
