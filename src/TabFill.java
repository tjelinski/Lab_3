import java.util.Random;
//11. klasa do wypełnoiania tablic liczbami losowymi
public class TabFill {
    public static void main(String[] args) {
        TabFill arrayFiller = new TabFill(); // Utworzenie obiektu klasy ArrayFiller

        int[] oneDarray = arrayFiller.fillOneDarray(); // Utworzenie jednowymiarowej tablicy i jej wypisanie
        System.out.println("One dimensional array: ");
        arrayFiller.printArray(oneDarray);

        int[][] twoDarray = arrayFiller.fillTwoDarray(); // Utworzenie dwuwymiarowej tablicy i jej wypisanie
        System.out.println("\nTwo dimensional array: ");
        arrayFiller.printArray(twoDarray);
    }
    private int[] fillOneDarray() { // Metoda do wypełniania jednowymiarowej tablicy liczbami losowymi z przedziału od 0 do 20
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21); // losowanie liczby 0 - 20
        }

        return array;
    }

    private int[][] fillTwoDarray() { // Metoda do wypełniania dwuwymiarowej tablicy liczbami losowymi z przedziału od 0 do 20
        int[][] array = new int[4][5]; // tablica 4x5
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(21); // losowanie liczby całkowitej od 0 do 20
            }
        }

        return array;
    }

    private void printArray(int[] array) { // Metoda do wypełniania jedno- lub dwuwymiarowej tablicy
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

