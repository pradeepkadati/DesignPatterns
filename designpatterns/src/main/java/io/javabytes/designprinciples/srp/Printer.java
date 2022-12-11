package io.javabytes.designprinciples.srp;

/**
 * Printer class which has single responsibility to print 
 * @author kadat
 *
 */
public class Printer {

	SolutionText text;
    Printer(SolutionText t) {
       this.text = t;
    }
    void printText() { 
    	System.out.println(text);
    }
}
