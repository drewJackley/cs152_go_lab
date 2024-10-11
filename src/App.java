import java.util.Scanner;

public class App {

    static String[][] goBoard = new String[9][9];

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean quit = false;

        boolean flipper = true;

        int moveX = 0;
        
        int moveY = 0;

        boolean valid = false;

        while(!quit){

        valid = false;
        
        System.out.print("   ");

        for (int i = 0; i < goBoard[0].length; i++){
            System.out.print(" " + (i + 1) + " ");
        }

        System.out.println();

        for(int i = 0; i < goBoard.length; i++){
            for(int j = 0; j < goBoard[i].length; j++){

                if (j == 0){
                    System.out.print(" " + (i+1) + " ");
                }

                if (goBoard[i][j] == null){
                    System.out.print(" + ");
                }else{
                    System.out.print(goBoard[i][j]);
                }

            }
            System.out.println();
        }

        if (flipper){
            System.out.println("White's Turn:");
        }else{
            System.out.println("Black's Turn:");
        }
        
        while(!valid){
            System.out.println("Enter an X coordinate: ");
            moveX = scn.nextInt();

            System.out.println("Enter a Y coordinate: ");
            moveY = scn.nextInt();

            if((moveX > goBoard[0].length) || (moveY > goBoard.length)){
                System.out.println();
                System.out.println("Coordinates out of bounds");
                System.out.println();
            }else if (goBoard[moveY-1][moveX-1] != null){
                System.out.println();
                System.out.println("Space already occupied");
                System.out.println();
            }else{
                goBoard[moveY-1][moveX-1] = flipper ? " o " : " * ";
                valid = !valid;
                flipper = !flipper;
            }
        } 
            //Todo: implement a way to quit somehow

        }


    }
}
