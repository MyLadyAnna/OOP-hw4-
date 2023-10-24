public class Dog extends User {
                                        // SRP - у класса нет функций, структура/функциональность которых может поменяться
    String breed;
                                        // LSP - функциональность методов при наследуемости не была нарушена
    public Dog(String firstName, int age, String breed) {
        super(firstName, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

}
