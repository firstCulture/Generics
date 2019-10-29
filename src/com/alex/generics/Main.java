package com.alex.generics;

public class Main {

    // simply code
    // safety code (static-typing)
    // voluminous code

    public static void main (String[] args) {
        // Generics

        //Demonstration that using Object making common instance is not safe because it is not recognise the type of instance.
        // And without generics we need to do variety of classes for each type what is required.
        final StringTuple student1 = new StringTuple("left", "Slava");
        final String name = (String) student1.getLeft();
        System.out.println(name);

        // Generic declare type of instance in moment when we create instance, so if the Object is not appropriate the Java will tell us.
        final Tuple<String> st2 = new Tuple<>("l", "r");
        System.out.println(st2.getLeft());
        final Tuple<Integer> st3 = new Tuple<>(1, 2);
        System.out.println(st3.getLeft() + 5);

        // Demonstration Test with class
        Tuple<SuperClass> tuple = new Tuple<>(new SuperClass(), new SuperClass());
        System.out.println( tuple.getLeft());

        //Demonstration with different types of instances
        final Tuple2<Long, String> student2 = new Tuple2<>(12l, "Alex");
        System.out.println(student2.getLeft() + 12);

    }

    // Test Class
    private static class SuperClass {
        @Override
        public String toString() {
            return "super";
        }
    }


}
