package singleton;

import java.io.Serializable;

public class DBConnector implements Serializable,Cloneable {
    private static DBConnector con;
    private DBConnector(){
        //  solution for 1.reflection API
        //  another way can be making this class an Enum
        if(con!=null){
            throw new RuntimeException("You are trying to break singleton pattern");
        }
        System.out.println("creating Object");
    }

    //lazy initialization: which needs synchronization for thread safety
    public static DBConnector get(){
        if(con==null){

            synchronized (DBConnector.class){

                //this is need when bunch of threads get queued for synchronization
                if(con==null){
                    con=new DBConnector();
                }
            }

        }
        return con;
    }

    //Solution for 2.Deserialization
    public Object readResolve(){
        return con;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

        //Solution for 2.Deserialization
        // return con;
    }

}
