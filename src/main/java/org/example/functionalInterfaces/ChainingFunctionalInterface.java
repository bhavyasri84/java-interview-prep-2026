package org.example.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChainingFunctionalInterface {

    public static void main(String[] args) {

        Predicate<Integer> ageAbove18 = age -> age > 18;
        Predicate<Integer> ageBelow50 = age -> age < 50;

        System.out.println(ageAbove18.and(ageBelow50).test(65)); //false

        System.out.println(ageAbove18.or(ageBelow50).test(51)); //true

        System.out.println(ageAbove18.negate().test(6)); //true


        Function<Integer,Integer> addBonus = salary -> salary + 5000;
        Function<Integer,Integer> tax = salary -> salary - 2000;

        System.out.println(addBonus.andThen(tax).apply(15000));
        System.out.println(addBonus.compose(tax).apply(15000));

        Consumer<String> log = s -> System.out.println("Logging: " + s);
        Consumer<String> save = s -> System.out.println("Saving: " + s);

        Consumer<String> process = log.andThen(save);

        process.accept("Order123");

        List<String> names = List.of("Bhavya","Kavya","Navya");

        names.stream().filter(s->s.length() > 3 ).map(s->s.concat(" Sree")).forEach(System.out::println);




    }





}
