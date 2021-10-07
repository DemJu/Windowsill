import Plants.*;
import Tableware.ColorPot;
import Tableware.Materials;
import Tableware.Pot;
import Tableware.TypePot;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a flower number: ");
        TypeFlower[] typeFlower = TypeFlower.values();
        for (int i = 0; i < typeFlower.length; i++) {
            System.out.println((i+1) + ") " + typeFlower[i].toString());
        }

        int numTypeFlower = scan.nextInt();
        while ((numTypeFlower > 0) & !(numTypeFlower <= typeFlower.length)) {
            System.out.println("There is no such flower ... Select again");
            numTypeFlower = scan.nextInt();
        }

        System.out.println();

        System.out.println("Choose the pot size number: ");
        TypePot[] typePot = TypePot.values();
        for (int i = 0; i < typePot.length; i++) {
            System.out.println((i+1) + ") " + typePot[i].toString());
        }
        int numSizePot = scan.nextInt()-1;
        while ((numSizePot >= 0) & !(numSizePot < typePot.length)) {
            System.out.println("There is no such size ... Choose another one");
            numSizePot = scan.nextInt();
        }

        System.out.println();

        System.out.println("Choose the color of the pot: ");
        ColorPot[] colorPot = ColorPot.values();
        for (int i = 0; i < colorPot.length; i++) {
            System.out.println((i+1) + ") " + colorPot[i].toString());
        }
        int numColorPot = scan.nextInt()-1;
        while ((numColorPot >= 0) & !(numColorPot < colorPot.length)) {
            System.out.println("There is no such color ... Choose another one");
            numColorPot = scan.nextInt();
        }

        System.out.println();

        System.out.println("Choose the material of the pot: ");
        Materials[] materials = Materials.values();
        for (int i = 0; i < materials.length; i++) {
            System.out.println((i+1) + ") " + materials[i].toString());
        }
        int numMaterials = scan.nextInt()-1;
        while ((numMaterials >= 0) & !(numMaterials < materials.length)) {
            System.out.println("There is no such material ... Choose another one");
            numMaterials = scan.nextInt();
        }

        switch (numTypeFlower) {
            case 1:
                Flower rose = new Rose(ColorFlower.RED.toString(), 1, 20, true);
                System.out.println(rose);
                rose.harmfulness();
                break;
            case 2:
                Flower forgetMEnot = new FORGET_ME_NOT(ColorFlower.RED.toString(), 1, 20, true);
                System.out.println(forgetMEnot);
                forgetMEnot.harmfulness();
                break;
        }

        System.out.println();

        Pot pot = new Pot(typePot[numSizePot].toString(), colorPot[numColorPot].toString(), materials[numMaterials].toString());
        System.out.println(pot);
    }
}
