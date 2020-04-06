package homework.lesson7;


public class homework7 {
    public static void main(String[] args) {
        System.out.println("Коты:");
        Cat[] x = {new Cat("Cat1", 10), new Cat("Cat2", 20), new Cat("Cat3", 30)};
        Plate plate = new Plate(10);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\nПокормить");
        System.out.println("" + plate);
        System.out.println(" ");
        plate.increaseFood(10);
        System.out.println("Коты поели:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
        }
    }
}


class Cat {
        private String name;
        private int appetite;
        private boolean isFull;

        Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.isFull = false;
        }

        @Override
        public String toString() {
            return "Кот: " + name + " | Аппетит: " + appetite + "| Сытый: " + isFull;
        }

        void eat(Plate plate) {
            if (plate.getAmountOfFood() > appetite) {
                plate.decreaseFood(appetite);
                isFull = true;
            }
        }
}

class Plate {
     private int amountOfFood;

        Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    @Override
    public String toString() {
        return "Еда: " + amountOfFood;
    }

    void decreaseFood(int appetite) {
        if (amountOfFood >= appetite) {
            amountOfFood -= appetite;
        }
    }

    int getAmountOfFood() {
        return amountOfFood;
    }

    void increaseFood(int amount) {
        amountOfFood += amount;
    }
}
