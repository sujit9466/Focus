 package String_Array;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String [] args) {

        //products is a ref to an array of 4 references which will be referring to Product object
    	Produts [] products = new Produts[4];

        products[0] = new Produts(101, "laptop", 34000);
        products[1] = new Produts(98, "TV", 4000);
        products[2] = new Produts(103, "watch", 5600);
        products[3] = new Produts(54, "phone", 36700);

        for(int i = 0; i < products.length; i++) {
            products[i].display();
            System.out.println("----------------------------------------");
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(products[j].getId() > products[j+1].getId()) {
                	Produts product = products[j];
                    products[j] = products[j+1];
                    products[j+1] = product;
                }
            }
        }

        System.out.println();

        //for each loop
        /*for(Product p : products) {
            p.display();
        }*/

        for(int i = 0; i < products.length; i++) {
            products[i].display();
        }

        {
        int i = 10;

        //String s1 = new String("Vishal");
        String s1 = "Vishal";
        System.out.println(s1 + " " + s1.length()) ;
        System.out.println();

        //s1 = new String("BitCode");
        s1 = "BitCode";
        System.out.println(s1 + " " + s1.length()) ;
        System.out.println();

        String s2 = "BitCode";
        System.out.println("s1 == s2 -> " + (s1 == s2));

        int len = "this is a string".length();
        System.out.println(len);
        
        System.out.println(s2.replace('C', 'c'));

        }
       //Ragged array
        int [][] marks = new int[4][];
        Random random = new Random();

        marks[0] = new int[3];
        marks[1] = new int[4];
        marks[2] = new int[2];
        marks[3] = new int[3];

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                marks[i][j] = random.nextInt() % 100;
            }
        }
        System.out.println();

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }


        //int [] arr = new int[] {11, 22, 33, 44, 55};
        int [] arr = {11, 22, 33, 44, 55};
System.out.println("-----------------------");
		System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------");
        
       /* arr = new int[] {1, 2, 3, 4, 5, 6};
        //arr = {11, 22}; //will not work*/


        /*Random random = new Random();

        //int [][] marks = new int[3][2];
        int [][] marks = new int[][] { {11, 22}, {33, 44}, {55, 66} };
        //int [][] marks = { {11, 22}, {33, 44}, {55, 66} };

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                marks[i][j] = random.nextInt() % 100;
            }
        }
        System.out.println();

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }*/

        /*char [] carr = new char[5];
        int [] arr = new int[0];*/

      


        /*float f = 3.145678f;
        //int i = f; //not okay because possible loss of data
        int i = (int) f;
        float f1 = 10; //no loss of data so its okay for java*/


    }
}
