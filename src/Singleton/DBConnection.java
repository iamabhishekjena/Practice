package Singleton;

import jdk.nashorn.internal.ir.SplitReturn;

public class DBConnection {

    /***
     *
     * Eager Initialisation
    private static DBConnection connectionObject = new DBConnection();

    private DBConnection(){}

    public static DBConnection getInstance(){
        return connectionObject;

     */
    /***
     *
     * Lazy Initialisation
    private static DBConnection connectionObject;
    private DBConnection(){}

    public static DBConnection getInstance(){
        if(connectionObject==null){
            connectionObject = new DBConnection();
        }
        return connectionObject;
    }
     */

    /***
     *
     * Synchronized

    private static DBConnection connectionObject;
    private DBConnection(){}
    synchronized public static DBConnection getInstance(){
        if(connectionObject==null){
            connectionObject=new DBConnection();
        }
        return connectionObject;
    }
     */

    /***
     *
     * Double-Checked Locking

    private static volatile DBConnection connectionObject;
    private DBConnection(){}
    public static DBConnection getInstance(){
        if(connectionObject==null){
            synchronized (DBConnection.class){
                if(connectionObject==null){
                    connectionObject = new DBConnection();
                }
            }
        }
        return connectionObject;
    }

     */


    /**
     * Bill Pugh Solution
     * */
    private DBConnection(){}
    private static class DBConnectionHelper{
        private static final DBConnection INSTANCE_OBJECT = new DBConnection();
    }
    public static DBConnection getInstance(){
        return DBConnectionHelper.INSTANCE_OBJECT;
    }

    public void fly(){};



}
