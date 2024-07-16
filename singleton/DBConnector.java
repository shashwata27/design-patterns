package singleton;

public class DBConnector {
    private static DBConnector con;
    private DBConnector(){
        //  solution for reflection API
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
}
