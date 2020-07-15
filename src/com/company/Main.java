package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int lines = 7; lines > 0; lines--) {
            if(lines < 7){
                printDot(7-lines);
            }
            printDollar(lines);
            printDot(lines);
            printDollar(lines);
            if(lines < 7){
                printDot(7-lines);
            }
            System.out.println("");
        }
    }
    public static void printDollar(int num){
        for (int dollar = 0; dollar < num; dollar++) {
            System.out.print("$");
        }
    }
    public static void printDot(int num){
        for (int dot = 0; dot < num * 2; dot++) {
            System.out.print("*");
        }
    }
}
