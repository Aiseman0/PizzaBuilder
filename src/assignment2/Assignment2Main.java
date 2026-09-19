package assignment2;

import assignment2.parta.*;
import assignment2.partb.*;

public class Assignment2Main {
    public static void main(String[] args) {
        System.out.println("=== Part A : Factory Method ===");
        WandFactory ollivander = new OllivanderFactory();
        ollivander.prepareWand();

        WandFactory gregorovitch = new GregorovitchFactory();
        gregorovitch.prepareWand();

        System.out.println("\n=== Part B : Abstract Factory ===");
        System.out.println("--- Student of Gryffindor ---");
        HouseEquipmentFactory gryffindorFactory = new GryffindorFactory();
        Wizard harry = new Wizard(gryffindorFactory);
        harry.prepareForLesson();

        System.out.println("\n--- Student of Slytherin ---");
        HouseEquipmentFactory slytherinFactory = new SlytherinFactory();
        Wizard draco = new Wizard(slytherinFactory);
        draco.prepareForLesson();
    }
}