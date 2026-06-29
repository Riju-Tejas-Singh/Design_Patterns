package optional.prototype;

/**
 * Shallow copy concept only holds meaning for mutable fields (meaningless for string)
 * Same for primitive fields, they are not shared, they are copied by value
 */
public class Student implements Prototype {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     * super.clone() is used to create an exact SHALLOW COPY of an object
     * by delegating the initial creation to the parent class's clone() method
     */
    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}
