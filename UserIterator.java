import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserIterator<T extends User> implements Iterator<T> {
    private List<T> studentList;
    private int counter;

    public UserIterator(List<T> studentGroup) {
        this.studentList = studentGroup;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size() - 1;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return studentList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        studentList = new ArrayList<>();
        counter = 0;
    }
}
