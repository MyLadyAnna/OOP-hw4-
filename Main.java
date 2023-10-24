import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Ivan", "Ivanov", 21);
        Student student2 = new Student("Vladimir", "Petrov", 20);
        Student student3 = new Student("Kitty", "Monson", 22);

        students.add(student1);
        students.add(student2);
        students.add(student3);


        students.sort(new UserComparator<>());
        System.out.println(students);

        for (Student student : students) {
            System.out.println(student.getLastName());
        }

        //
        Dog dog1 = new Dog("Sharik", 5, "thai");
        Dog dog2 = new Dog("Bobik", 3, "persian");
        Dog dog3 = new Dog("Jassy", 4, "sphinx");

        List<Dog> dogs = new ArrayList<>(List.of(dog1, dog2, dog3));

        dogs.sort(new UserComparator<Dog>());
        System.out.println(dogs);

        

    }
}
