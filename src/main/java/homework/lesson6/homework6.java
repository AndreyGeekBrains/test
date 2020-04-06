package homework.lesson6;

public class homework6 {
        public static void main(String[] args) {
                Dog dog = new Dog();
                Animal cat = new Cat();

                dog.run(500);
                cat.run(200);


                dog.jump(0.5);
                cat.jump(2);

                dog.swim(10);
                cat.swim(0);


        }
}

abstract class Animal {
        protected int _length;
        protected double _height;

        abstract void run(int length);
        abstract void jump(double height);
        abstract void swim(int length);

        static void showResult(Object obj, boolean result) {
                System.out.println(obj.getClass().getName() + " : " + result);
        }
}

class Cat extends Animal {

        private int _lengthSwim;
        void swim(int length) {
                boolean result = length <= 0;
                if (result) _lengthSwim = length;
                showResult(this,result);
        }

        @Override
        void run(int length) {
                boolean result = length <= 200;
                if (result) _length = length;
                showResult(this,result);
        }
        @Override
        void jump(double height) {
                boolean result = height <= 2;
                if (result) _height = height;
                showResult(this,result);
        }

}

class Dog extends Animal {
        private int _lengthSwim;
        private int maxLength;

        Dog() {
                maxLength = Math.random() > 0.5 ?  400 : 600;
        }

        int getMaxLength() {
                return maxLength;
        }

        void swim(int length) {
                boolean result = length <= 10;
                if (result) _lengthSwim = length;
                showResult(this,result);
        }
        @Override
        void run(int length) {
                boolean result = length <= maxLength;
                if (result) _length = length;
                showResult(this,result);
        }
        @Override
        void jump(double height) {
                boolean result = height <= 0.5;
                if (result) _height = height;
                showResult(this,result);
        }
}




