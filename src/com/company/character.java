package com.company;

public class character {
    int x;
    int y;
    int prevousX;
    int prevousY;
    String symbol;

    character(int x, int y, String symbol){
        this.x=x;
        this.y=y;
        this.symbol=symbol;
    }

    String getSymbol(){
        return symbol;
    }

    int getX(){
        return x;
    }
    int getY(){
        return y;
    }

    void moveUp(){
        prevousY=y;
        y+=1;
    }
    void moveDown(){
        prevousY=y;
        y-=1;
    }
    void moveLeft(){
        prevousX=x;
        x-=1;
    }
    void moveRight(){
        prevousX=x;
        x+=1;
    }

    void setX(int X){
        this.x=X;

    }
    void setY(int Y){
        this.y=Y;
    }
}
