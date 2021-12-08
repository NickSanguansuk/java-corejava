package topics.file_system.serialization_demo.demo1_infosys;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

    public static void main(String[] args) {

        // ObjectInputStream
        // ObjectOutputStream

        String fileName1 = "src/topics/file_system/serialization_demo/demo1_infosys/EmployeeData.txt";

        try (ObjectOutputStream objStreamOut = new ObjectOutputStream(new FileOutputStream(fileName1));
             ObjectInputStream objStreamIn = new ObjectInputStream(new FileInputStream(fileName1));) {

            EmployeeDTO eDTO = new EmployeeDTO("1234", "John", "SE", 3);

            objStreamOut.writeObject(eDTO);

            // Read
            EmployeeDTO e = (EmployeeDTO) objStreamIn.readObject();

            System.out.println(e);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
