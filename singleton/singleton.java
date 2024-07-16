package singleton;
// creational design pattern
// only create one object of the class in the entire runtime of the app.
// eg: database connector objects


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {
    public static void main (String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, RuntimeException, IOException, ClassNotFoundException {
        DBConnector con1=DBConnector.get();
        System.out.println("con1: "+con1.hashCode());

        DBConnector con2=DBConnector.get();
        System.out.println("con2: "+con2.hashCode());


        // 3 ways to break singleton pattern

        //1. reflection API
        try{
            Constructor<DBConnector> constructor=DBConnector.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            DBConnector reflectedCon=constructor.newInstance();
            System.out.println("reflected Constructor: "+ reflectedCon.hashCode());
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("reflection is successfully blocked");
        }

        // 2. Deserialization
        //  when we serialize a runtime object to a file and again read from it, separate object is created by default

        System.out.println("Serializing");
        System.out.println("before serializing con2: "+ con2.hashCode());
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("db-con-obj.ob"));
        oos.writeObject(con2);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("db-con-obj.ob"));
        DBConnector deserilizedConObj=(DBConnector) ois.readObject();
        // returns the same after implementing readResolve in singleton class
        System.out.println("After deserialization con2: "+ deserilizedConObj.hashCode());





    }
}
