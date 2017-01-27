/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author davisj
 */
public class InputDataAnalyzer extends DataAnalyzer {
    void inputData() {
        System.out.println("Enter your data, one number per line");
        System.out.println("When you are finished, input a blank line");
        BufferedReader reader = new BufferedReader(
                                    new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
            while (!"".equals(input)) {
                try {
                    double d = Double.parseDouble(input);
                    add(d);
                } catch (NumberFormatException ex) {
                    System.out.println("Please enter a floating point number");
                }
                input = reader.readLine();
            }   
        } catch (IOException ex) {
            // Do nothing
        }
    }
    
    public static void main(String[] args) {
        InputDataAnalyzer analyzer = new InputDataAnalyzer();
        analyzer.inputData();
        analyzer.report();
    }
}
