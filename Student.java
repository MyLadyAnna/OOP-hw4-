public class Student extends User {     //наследование от Юзера
                                        // SRP - у класса нет функций, структура/функциональность которых может поменяться
    String lastName;
                                        // LSP - функциональность методов при наследуемости не была нарушена
    public Student(String firstName, String lastName, int age) {
        super(firstName, age);
        this.lastName = lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", age= " + age +
                '}' + "\n";
    }

}
