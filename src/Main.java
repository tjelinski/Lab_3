//import java.util.Arrays;
//import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //2. konwersja Stringa na typy liczbowe
        Scanner scanner = new Scanner(System.in); //utworzenie obiektu scanner na potrzeby wprowadzania danych z klawiatury
        System.out.println("Enter String ");
        String myString = scanner.nextLine(); //wczytsanie danych z konsoli

        int intString = Integer.parseInt(myString);
        long longString = Long.parseLong(myString);
        float floatString = Float.parseFloat(myString);
        double doubleString = Double.parseDouble(myString);
        //wyświetlanie skonwertowanych wartości
        System.out.println("int : " + intString + "  long : " + longString + "  float : " + floatString + "  double : " + doubleString);

        // 3. Testowanie operatora trójargumentowego.
        System.out.println("Our operation (a > b) ? a : b ");
        System.out.println("Enter the value a: ");
        int a = scanner.nextInt();
        /* Konsumowanie znaku nowej linii pozostawionego przez nextInt() w sytuacji
        gdy nie znajdował sie w kodzie nie miałem możliwosci wprowadzenia z konsoli danych dotyczących zadania nr. 9
         po wyświetleniu komunikatu o string One od razu wyświwetlał sie komunikat  o podanie Two*/
        scanner.nextLine();
        System.out.println("Enter the value b: ");
        int b = scanner.nextInt();
        scanner.nextLine(); // j/w
        int max = (a > b) ? a : b; // jeżeli a > b to max = a inaczej b = max
        System.out.println("Max value: " + max);

        //4 . Break i continue
        System.out.println("Using break:");
        Label1: //etykieta dla petli
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break Label1;   // przerwanie pętli o etykiecie Label1
            }
            System.out.println(i);
        }

        System.out.println("Using continue:");
        Label2: //etykieta dla petli
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue Label2;    //kontynuacja pętli o etykiecie Label2
            }
            System.out.println(i);
        }

        //5. Kolejność operatorów
        System.out.println("Our operation (c + d ) * 2 / 3 % 2");
        System.out.println("Enter value for c: ");
        double c = scanner.nextDouble();
        scanner.nextLine(); // Konsumowanie znaku nowej linii pozostawionego przez nextDouble()
        System.out.println("Enter value for d: ");
        double d = scanner.nextDouble();
        scanner.nextLine(); // j/w
        double myValue = (c + d) * 2 / 3 % 2;
        System.out.println("Result: " + myValue); // kolejność to dodawanie, mnożenie, dzielenie i modulo
        System.out.println();

        //6. Operator równości == oraz metoda equals
        String myStringOne = "Hello";
        String myStringTwo = "Hello";
        String myStringThree = "Something else";
        System.out.println(myStringOne.equals(myStringTwo)); // zwraca prawdę ponieważ porównuje zawartość stringów
        System.out.println(myStringTwo.equals(myStringThree)); // fałsz ponieeważ equals porównuje zawartość dwóch stringów, a nie referencje do obiektów; myStringTwo i myStringThree zawierają różne ciągi znaków
        boolean isTheSameOne = (myStringOne == myStringTwo);    // Porównanie referencji, a nie zawartości
        System.out.println(isTheSameOne);
        boolean isTheSameTwo = (myStringOne == myStringThree);
        System.out.println(isTheSameTwo);
        System.out.println();

        //7.Odwracanie tablicy
        /*"odwrócenie " działa poprawnie, ponieważ tablica tab jest tablicą obiektów (Integer[]), a nie tablicą prymitywną (int[])
        jak założyłem za pierwszym razem, wtedy drukowane były "śmieci" w odwróconej  tablicy */

        //https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html
        //https://www.geeksforgeeks.org/reverse-an-array-in-java/

        Integer[] tab = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array before : " + Arrays.toString(tab));
        System.out.println("Using reverse method");
        reverseTab(tab);    //wywołanie metody
        System.out.println("Array after : " + Arrays.toString(tab));
        System.out.println();


        //8. wykonanie kodu z instrukcji laboratoryjnej
        // args to parametry programu przekazane z wiersza poleceń
        // args.length to liczba przekazanych parametrów
        System.out.println("Liczba parametrów: " + args.length);
        // Wyświetlenie wszystkich przekazanych parametrów
        for (int i = 0; i < args.length; i++) {
            System.out.println("Parametr " + i + ": " + args[i]);
        }
        System.out.println();

        //9.Wywołanie metod zwracających boolean i użycie ich w instrukcji if z operatorami logicznymi

        System.out.println("Enter string One :");
        String stringOne = scanner.nextLine();
        System.out.println("Enter string Two :");
        String stringTwo = scanner.nextLine();
        if (equalCheck(stringOne,stringTwo) & lenghtCheck(stringOne)  | lenghtCheck(stringTwo))
        System.out.println("Condition are met");
        else System.out.println("Condition are not met");
        System.out.println();

        //10.Pobieranie liczb z parametrów i wykonanie podstawowych operacji arytmetycznych
        if (args.length > 2) {
            mathOperation(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        }
        System.out.println();

        scanner.close(); //zamkniecei obiektu scanner
    }

    // metoda do odwracania tablicy
    static void reverseTab(Integer[] tab) { // metoda odwracania tablicy za pomocą listy
        Collections.reverse(Arrays.asList(tab));
    }

    //  metody boolean dla operatorów logicznych
    private static boolean equalCheck (String stringOne, String stringTwo){ return stringOne.equals(stringTwo); } //porównanie zawartości stringa
    private static boolean lenghtCheck (String string) { return string.length() <= 5; } //porównanie długości stringa

    // metoda dla operacji matematycznych
    private static void mathOperation(int arg1, int arg2, int arg3) {
        int sum = arg1 + arg2;
        int difference = arg1 - arg3;
        int product = arg1 * arg2;
        float quotient = (float) arg2 / arg1;
        double square = (double) Math.sqrt(arg1);
        double square2 = (double) Math.sqrt(arg2);
        double square3 = (double) Math.sqrt(arg3);

        System.out.println("Sum p0 + p1: " + sum);
        System.out.println("Difference p0 - p2: " + difference);
        System.out.println("Product p0 * p1: " + product);
        System.out.println("Quotient p2 / p0: " + quotient);
        System.out.println("Square root from first argument p0: " + square);
        System.out.println("Square root rom second argument p1: " + square2);
        System.out.println("Square root from third argument p2: " + square3);
    }
}
