import com.sun.jdi.PathSearchingVirtualMachine;

import java.security.KeyStore;
import java.sql.SQLOutput;

public class sundayHomework2 {

     public static void main(String[] args) {
        // Question - 1
        String firstName;
        String lastName;
        firstName = "Nusrat";
        lastName = "Jahan";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //Question - 2

        int[] firstArray = {103,23,34,41,75};
        int[] secondArray = {66,75,18,91,120};
         System.out.println(firstArray[3]* secondArray[1]);
         firstArray[firstArray.lenght-1]=69;
         System.out.println(firstArray[3] * secondArray[1]/firstArray[1]);

        // Question - 3

        System.out.println("I like indian songs, that's why I am gonna choose my artists from there" + ".");

        String Artists = {"Arjit","Shreya","Armaan"};
        int indexposition = 0;
        while (indexposition<Artists.lenght) {
        System.out.println("My top three artists are:" + Artists[indexposition]);
            indexposition++;}
         System.out.println(returnvalue());

        parameter(10);

        // Question - 4

            public static String returnvalue() {
             String X = "Learning Java is FUn";
             return X;
         }

            // Question - 5
         public static void parameter(int number){
                for (int N =0; N<=number; N++){
                    System.out.println(N + " ");}}

            //Question - 6
                for (int L = 13; L<20> ; L++){
                    System.out.println(L);
                }

            // Question _ 7
                    int oddnumbers =20;
                for (int x=0; x<oddnumbers>; x++)
                {if (x%2!=0){
                    System.out.println(x);

                }
         }

                //Question - 8
                    int studentsGrade = 95;
         System.out.println(studentsGrade);
         if (studentsGrade<100 && studentsGrade>90){
             System.out.println("You got an A");}
         



























