package org.example.functionalInterfaces;

@FunctionalInterface
interface TestPredicate<T>{
    boolean test(T t);
}

interface TestConsumer<T>{
    void accept(T t);
}

interface TestFunction<T,R>{
    R apply(T t);
}

interface TestSupplier<T> {
        T get();
}



public class LambdaFunctions {




    public static void main(String[] args) {
        int x = 5;
        TestPredicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(x));

        TestConsumer<Integer> printValue = System.out::println;
        printValue.accept(x);

        TestFunction<String,Integer> getLength = String::length;
        System.out.println(getLength.apply("Hi,I am Bhavya"));

        TestSupplier<Integer> getValue = ()-> 100 ;

        System.out.println(getValue.get().intValue());


    }
}
