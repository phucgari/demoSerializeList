import java.io.*;
import java.util.LinkedList;

import Class.User;

public class Main {
    public static void main(String[] args) {
        File file=new File("demo.txt");
        User user1=new User("01","abc",333);
        User user2=new User("02","xyz",222);
        LinkedList<User>list=new LinkedList<>();
        list.add(user1);
        list.add(user2);
        sendListObjectToFile(file,list);
        LinkedList<User>read=readObjectFromFile(file);
        System.out.println(read);
    }

    private static LinkedList<User> readObjectFromFile(File file) {
        try(ObjectInputStream oos=new ObjectInputStream(new FileInputStream(file))){
            return(LinkedList<User>) oos.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sendListObjectToFile(File file, LinkedList<User> list) {
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(list);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done send List Object to file");
    }
}