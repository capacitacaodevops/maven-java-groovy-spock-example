package org.example;

/**
 * User: olavgjerde
 * Date: 11/05/15
 * Time: 14:47
 */
public class HelloWorldJava {

    public static void main(String[] args){
        sayHello();
    }

    public static String helloWorld() {
        return "Hello from Java";
    }

    public static void sayHello(){
        System.out.println(helloWorld());
        System.out.println(HelloWorldGroovy.getHelloMessage());
        System.out.println(HelloWorldGroovy.helloWorld());
    }
}
