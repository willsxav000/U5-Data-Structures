public class Main {

    /* A 2D array is simply an array of arrays. You can see this relationship when manually creating a 2D array. Java is ROW sensitive */

    public static void main(String[] args){
        //Manually declare a 2D array
        int[][] integerTable = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        //Declare an empty array
        int[][] emptyArray = new int[3][5];

        //Accessing data in a 2D array

        //Accessing a single element
        System.out.println(integerTable[1][2]);

        //Access an entire array
        System.out.println(integerTable[0]);

        //Length of 2D Array
        System.out.println(integerTable.length);

        //Get the length of the arrays in the 2D array
        System.out.println(integerTable[0].length);

        //Add data to an empty array
        for(int i = 0; i < emptyArray.length; i++){
            for(int j = 0; j < emptyArray[0].length; j++){
                emptyArray[i][j] = i * j;
            }
        }

        //Display contents of the 2D array
        for(int[] arr: emptyArray){
            for(int value: arr){
                System.out.print(value + "\t");
            }
            System.out.println();
        }

    }

}
