import beans.Employee;

import java.io.*;

public class FileWriteExample02 {
    public static void main(String[] args){
        Employee employee = new Employee(101, "Red", "Oral", "redmunozoral@gmail.com");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employee.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
