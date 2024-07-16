package singleton;
// creational design pattern
// only create one object of the class in the entire runtime of the app.
// eg: database connector objects

public class Singleton {
    public static void main (String[] args){
        DBConnector con1=DBConnector.get();
        System.out.println("con1: "+con1.hashCode());

        DBConnector con2=DBConnector.get();
        System.out.println("con2: "+con2.hashCode());

    }
}
