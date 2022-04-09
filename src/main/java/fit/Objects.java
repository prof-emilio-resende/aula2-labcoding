package fit;

interface InterfaceObj {
    String think();
}

class Person implements InterfaceObj {
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    @Override
    public String think() {
        return String.format("%s pensando...", this.name);
    }

}

class SuperHero extends Person {
    public SuperHero(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}

public class Objects {
    
}
