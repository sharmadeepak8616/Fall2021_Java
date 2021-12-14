package Class8;

public class LabSession_Deepak {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        /*
            Value at index 4 is 5
            Value at index 3 is 4
            Value at index 2 is 3
            Value at index 1 is 2
            Value at index 0 is 1


            sout(Value at index lastIndex-0 is numbers[lastIndex-0])
            sout(Value at index lastIndex-1 is numbers[lastIndex-1])
            sout(Value at index lastIndex-2 is numbers[lastIndex-2])
            ...
            ...
            sout(Value at index lastIndex-lastIndex is numbers[lastIndex-lastIndex])



            sout(Value at index i is numbers[i])    i=lastIndex-0 , lastIndex-1 , lastIndex-2 , ... , 0     i >= 0      i--
                                                    i= 4 , 3 , 2

            sout(Value at index lastIndex-i is numbers[lastIndex-i])    i=0,1,2,...,lastIndex       i <= lastIndex      i++

         */
        System.out.println("For loop - 1");
        for (int i=numbers.length-1 ; i >= 0 ; i--) {
            System.out.println("Value at index " + i + " is " + numbers[i]);
        }

        System.out.println("For loop - 2");
        for (int i=0 ; i <= numbers.length-1 ; i++) {
            System.out.println("value at index " + (numbers.length-1-i) + " is " + numbers[numbers.length-1-i]);
        }

        int[] values = {89, 87};    // 0,1 < length(2)
        String[] names = {"Denver", "happy", "kingkong"};

        /*
            if a name have length more than 4
                print the name
                if the index is valid for values-array
                    print the value at same index from values-array

            Denver  (names[0])
            89      (values[0])
            happy   (names[1])
            87      (values[1])
            kingkong    (names(2)
                        (values[2])


            if (names[0].length() > 4) {
                sout(names[0])
                if (0 < values.length) {
                    sout(values[0])
                }
            }
            if (names[1].length() > 4) {
                sout(names[1])
                if (1 < values.length) {
                    sout(values[1])
                }
            }


            if (names[i].length() > 4) {
                sout(names[i])
                if (i < values.length) {
                    sout(values[i])
                }
            }
         */

        for (int i=0 ; i < names.length ; i++) {
            if (names[i].length() > 4) {
                System.out.println(names[i]);
                if (i < values.length) {
                    System.out.println(values[i]);
                }
            }
        }

        /**
         * print the names which contain a
         */
        System.out.println("\n\ncontains question");
        String[] allNames = {"king kong" , "living peAple", "peaceful", "lively", "Apple", "BOMBARDMENT"};

        for (int i=0 ; i <= allNames.length-1 ; i++) {
            if (allNames[i].toLowerCase().contains("a")) {
                System.out.println(allNames[i]);
            }
        }
        System.out.println("Enhanced for-loop");
        for (String word : allNames) {  // values from array will go in variable    (word = "king kong" -- allNames[0]
            if (word.toLowerCase().contains("a")) {
                System.out.println(word);
            }
        }
        System.out.println("while loop");
        int w=0;
        while (w <= allNames.length-1) {
            if (allNames[w].toLowerCase().contains("a")) {
                System.out.println(allNames[w]);
            }
            w++;
        }
        System.out.println("do-while loop");
        int d=0;
        do {
            if (allNames[d].toLowerCase().contains("a")) {
                System.out.println(allNames[d]);
            }
            d++;
        } while (d <= allNames.length-1);


    }
}
