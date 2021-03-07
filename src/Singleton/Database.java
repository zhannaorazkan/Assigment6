package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private static Database instance;
    private static Connection connection;
    private static String connectionUrl="jdbc:postgresql://localhost:5432/Assigment5";
    private Database(){

    }
    public static Database getInstance(){
        if(instance==null){
            instance=new Database();
            query("Selected...");
        }
        return instance;
    }
    public static void query(String sql) {
        try{
            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection(connectionUrl,"postgres","gift111");
            System.out.println("Connected");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

