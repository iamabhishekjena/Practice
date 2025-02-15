package Reflection;

import Singleton.DBConnection;
import Singleton.Single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Check {
    public static void main(String args[]) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class test = Test.class;
        /**
         * Getting methods of classes
         * */

        // Will return all public methods in the class as well as in parent class
        // Method[] methods = test.getMethods();
        Method[] methods = test.getDeclaredMethods();
        for (Method method:methods){
            System.out.println("Method Name: "+ method.getName());
        }

        Class singleton = Single.class;
        Constructor[] constructors = singleton.getDeclaredConstructors();
        for(Constructor constructor: constructors){
            constructor.setAccessible(true);
            Single single = (Single) constructor.newInstance();
            single.fly();
        }
    }
}
