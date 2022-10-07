import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String friends[] = new String[5];

        Scanner scnr = new Scanner(System.in);

        System.out.println("Write " + friends.length + " names down: ");

        for(int i = 0; i < friends.length; i++){


            friends[i] = scnr.next();

        }

        System.out.println("Your list of friends: ");

        for (int i = 0; i < friends.length; i++){
            
            if (i < friends.length - 1) {

                System.out.print(friends[i] + ", ");

            } else {

                System.out.print(friends[i]);
            }

        }



    }//main






}//Main