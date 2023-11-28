import java.io.Serializable;

public class Person implements Serializable {
    // It's a good practice to include a serialVersionUID for Serializable classes
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient String password; // 'transient' means this field will not be serialized

    // Constructor
    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString method for displaying object information
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
