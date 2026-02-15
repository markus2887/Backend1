//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String str1 = "god gaga";
        char target = 'g';
        int antal = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) ==target) {
                antal++;
            }
        }




        System.out.println(antal);

    }
}

/*
            if (intArray[i] < 0) {
produkt = produkt * intArray[i];

        }

 */