package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// Step 1: Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyCustomAnnotation {
    String value() default "Default Value"; // An attribute with a default value
}

// Step 2: Use the custom annotation
class AnnotationExample {

    @MyCustomAnnotation(value = "Hello, Annotation!")
    public void myAnnotatedMethod() {
        System.out.println("This method is annotated.");
    }

    public void anotherMethod() {
        System.out.println("This method is not annotated.");
    }
}

// Step 3: Access annotations at runtime
public class Main {
    public static void main(String[] args) {
        try {
            Class<AnnotationExample> obj = AnnotationExample.class;

            for (Method method : obj.getDeclaredMethods()) {
                if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
                    MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
                    System.out.printf("Method: %s, Annotation Value: %s%n", method.getName(), annotation.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

