

public class SerializationDemo {

    public static void main(String[] args) {

        PersonDao dao = new PersonDao("person.ser");
        
        Person person = new Person("Alice", 30, "secretPassword");
        dao.save(person);
        
        Person deserializedPerson = dao.read();
        
        // Display deserialized Person data
        System.out.println("Deserialized Person...");
        System.out.println(deserializedPerson);
    }
}

