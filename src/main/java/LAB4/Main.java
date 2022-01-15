package LAB4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalHelper ah = new AnimalHelper();

        Animal animal1 = new Animal();
        animal1.setName("Muhtar");
        animal1.setAge(7);
        animal1.setTail(true);
        ah.add(animal1);

        Animal animal2 = new Animal();
        animal2.setName("Vovka");
        animal2.setAge(4);
        animal2.setTail(false);
        ah.add(animal2);

        List<Animal> animals = ah.getAll();
        for (Animal a : animals) {
            System.out.println(a.getId() + " " + a.getName());
        }

        Animal animal3 = ah.getById(11);
        animal3.setName("Vasya");
        ah.add(animal3);

        Animal animal4 = ah.getById(10);
        ah.remove(animal4);
    }
}
