package com.bridgelabz;

import java.text.NumberFormat;

/**
 * @author Shubham
 * @version 1.0
 * @ssince 16-08-2021
 */


public class LineComputation {
    public double findLength(int pointX1, int pointX2, int pointY1, int pointY2) {
        double length;
        int a = pointX2 - pointX1;
        int b = pointY2 - pointY1;
        length = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(3);
        System.out.println("Length of line is : "+numberFormat.format(length));
        return length;
    }

    public void isGreaterSmaller(double length1, double length2) {
        if (Double.compare(length1, length2) == 0) {
            System.out.println("[l1=l2] The Lines are EQUAL");
        } else if (Double.compare(length1, length2) < 0) {
            System.out.println("[l1<l2] Line 2 is GREATER than Line 1");
        } else {
            System.out.println("[l1>l2] Line 1 is GREATER than Line 2");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to line computation program");
        LineComputation lineComputation = new LineComputation();
        double line1 = lineComputation.findLength(1, 3, 3, 4);
        double line2 = lineComputation.findLength(4, 2, 6, 4);
        lineComputation.isGreaterSmaller(line1, line2);
    }
}

