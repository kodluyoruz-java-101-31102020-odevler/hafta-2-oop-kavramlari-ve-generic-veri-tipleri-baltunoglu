package Answer3;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
        int[] array = fillArray();
        printArray(array);
        System.out.println();
        System.out.println("-------------------");
        List repeatedArray = new ArrayList();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter >= 1) {
                if (!repeatedArray.contains(array[i])) {
                    repeatedArray.add(array[i]);
                    repeatedArray.add(" ");
                }
            }
            counter = 0;
        }
        printArrayList(repeatedArray);
    }

    public static void printArrayList(List repeatedArray) {
        for(int i=0; i < repeatedArray.size() ; i++ ) {
        	System.out.print(repeatedArray.get(i)+"");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static int[] fillArray() {
        int[] fillArray = new int[10];
        for (int i = 0; i < fillArray.length; i++) {
            fillArray[i] = (int) (Math.random() * 10);
        }
        return fillArray;
    }
		
}


