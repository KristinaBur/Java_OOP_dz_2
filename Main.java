public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 15);
        Cat cat2 = new Cat("Васька", 7);
        Cat cat3 = new Cat("Мила", 10);
        Cat cat4 = new Cat("Жорик", 3);
        Cat cat5 = new Cat("Мурзилка", 8);
        Cat cat6 = new Cat("Матроскин", 5);

        Cat[] catsArray = new Cat[] { cat1, cat2, cat3, cat4, cat5, cat6 };

        Plate plate = new Plate(30);

        for (Cat cat : catsArray) {
            cat.eat(plate);
        }



        plate.info();
        plate.addFood(20);
        plate.info();


    }
}