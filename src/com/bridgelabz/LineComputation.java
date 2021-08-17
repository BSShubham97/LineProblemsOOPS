package com.bridgelabz;
/**
 * @author Shubham
 * @version 1.0
 * @ssince 16-08-2021
 */

import java.util.Scanner;

public class LineComputation {

    public double findLength(){
        Scanner sc= new Scanner(System.in);
        int x1,x2,y1,y2;
        double length;
        System.out.println("Enter the four co-ordinates of a line x1,x2,y1,y2");
        System.out.println("Enter the value of x1: ");
        x1=sc.nextInt();
        System.out.println("Enter the value of x2: ");
        x2=sc.nextInt();
        System.out.println("Enter the value of y1: ");
        y1=sc.nextInt();
        System.out.println("Enter the value of y2: ");
        y2=sc.nextInt();

        int a=x2-x1;
        int b=y2-y1;

        length=Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
        System.out.println("Length of line is :"+length);
        return length;
    }
public void isEqual(double length1,double length2){
    if (length1==length2)
    {
        System.out.println("Lines are Equal");
    }
    else
        System.out.println("Lines are not equal");
}

    public static void main(String[] args) {
        System.out.println("Welcome to line computation program");
        LineComputation lineComputation = new LineComputation();
        LineComputation lineComputation2 = new LineComputation();
       double line1= lineComputation.findLength();
        double line2= lineComputation2.findLength();
        lineComputation.isEqual(line1,line2);
    }
    }

