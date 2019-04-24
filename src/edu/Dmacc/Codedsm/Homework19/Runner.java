package edu.Dmacc.Codedsm.Homework19;

import java.sql.SQLOutput;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner {

    public static void main(String[] args) {
        Function<String, Integer> plant = s -> s.length();
        System.out.println(plant.apply("Hosta"));

        BiFunction<String, String, Integer> perennials = (r,s)  -> (r.length() + s.length()); //2
        System.out.println(perennials.apply("Hosta", "Hydrangia" ));

        Consumer<String> casey = x ->  System.out.println(x);
        casey.accept("PET");

        Supplier<String> homeowork=()->"Hello";
        System.out.println(homeowork.get());

    }
}



