import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonDao {
	
	private String filename; 
	
	public PersonDao(String filename) {
		this.filename = filename;
	}

	public void save(Person person) {
		// Serialize the Person object to a file
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
	}
	
	public Person read() {
		
		// Deserialize the Person object from a file
        Person deserializedPerson = null;
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedPerson = (Person) in.readObject();
            in.close();
            fileIn.close();
            return deserializedPerson;
            
        } catch (IOException i) {

        	i.printStackTrace();
        	
        } catch (ClassNotFoundException c) {
            
        	System.out.println("Person class not found");
            c.printStackTrace();
            
        }
        return null;
	}
}
