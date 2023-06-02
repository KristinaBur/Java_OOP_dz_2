public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.setFood(plate.getFood() - appetite);
            fullness = true;
            System.out.println(name + " поел(а) " + appetite + " - "  + " Полно еды");
        } else {
            System.out.println(
                    name + " хочет кушать " + appetite + " - "  + " Не хватает еды.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

}