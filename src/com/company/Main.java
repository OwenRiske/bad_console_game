package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner INPUT= new Scanner(System.in);
        String userInput="";

        ArrayList obstacleList=new ArrayList();

        character player=new character(0,0,"X");

        character rock=new character(4,-4,"O");
        obstacleList.add(rock);

        while (true) {

            //avoid rock
            if(rock.getY()==player.getY()&&rock.getX()== player.getX()){
                player.setX(player.prevousX);
                player.setY(player.prevousY);
            }

            //board
            System.out.println(" _____");
            for (int i = 0; i > -5; i--) {
                System.out.print("|");
                for (int j = 0; j < 5; j++) {
                    if (j == player.getX() && i == player.getY()) {
                        System.out.print(player.getSymbol());
                    }
                    else if (j==rock.getX()&&i== rock.getY()){
                        System.out.print(rock.getSymbol());
                    }

                    else {
                        System.out.print(" ");
                    }
                }
                System.out.print("|\n");
            }
            System.out.println(" _____");

//Player coordinates
            System.out.println("\n X: "+player.getX()+" Y:"+player.getY()+"\n");


            //player controls
            System.out.print("Move\n>");
            userInput = INPUT.nextLine();

            if (userInput.equalsIgnoreCase("d")&&player.getX()<4) {
                player.moveRight();
            }
            else if (userInput.equalsIgnoreCase("w")&&player.getY()<0){

                player.moveUp();
            }
            else if(userInput.equalsIgnoreCase("a")&&player.getX()>0){
                player.moveLeft();
            }
            else if(userInput.equalsIgnoreCase("s")&&player.getY()>-4){
                player.moveDown();
            }

        }
    }
}
