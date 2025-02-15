package Annotations;

import java.lang.annotation.Annotation;

public class LocalMain {

    public static void main(String args[]){
        Annotation[] annotations = Sample.class.getAnnotations();

        for(Annotation annotation:annotations){
            System.out.println(annotation.toString());
        }
    }
}
