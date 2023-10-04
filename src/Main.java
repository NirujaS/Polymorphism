public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal", 5);
        Mammal lion = new Mammal("Lion", 10, "Yellow");
        Bird eagle = new Bird("Eagle", 3, 6.5);
        Dog goldenRetriever = new Dog("Buddy", 2, "Golden", "Golden Retriever");

        genericAnimal.makeSound();
        System.out.println(genericAnimal);

        lion.makeSound();
        System.out.println(lion);

        eagle.makeSound();
        System.out.println(eagle);

        goldenRetriever.makeSound();
        System.out.println(goldenRetriever);
    }
}