class animal {

    String name;

    animal(String name) {
        this.name=name;
    }
    void introduce() {
        System.out.println("私は"+name+"です。");
    }
    void sound() {
        System.out.println("鳴き声");
    }
}

class Dog extends animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("わんわん！");
    }
}

class Cat extends animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("ニャーニャー！");
    }
}

public class mainAnimal {
    public static void main(String[] args) {
    Dog dog=new Dog("ポチ");
    Cat cat=new Cat("タマ");

    dog.introduce();
    dog.sound();

    System.out.println();

    cat.introduce();
    cat.sound();
}
}