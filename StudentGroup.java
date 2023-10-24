import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements Iterable<Student> {        // // OCP - если нужно будет добавить функционал в класс создадим наследуемый класс и добавим действия в него.
    private String groupName;
    private List<Student> studentList;

    public StudentGroup(String groupName, List<Student> studentList) {
        this.groupName = groupName;
        this.studentList = new ArrayList<>();       //DIP - создается лист с типом Студент, при этом не зависит от класса.
    }
 
    public int getSize() {
        return studentList.size();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "groupName= '" + groupName + '\'' +
                ", studentList= " + studentList +
                '}';
    }

    @Override
    public UserIterator iterator() {
        return new UserIterator(studentList);
    }

}
