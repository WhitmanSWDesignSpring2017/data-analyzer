/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalyzer;

import java.util.ArrayList;

/**
 *
 * @author davisj
 */
public class DataAnalyzer {
    
    ArrayList<Double> data;
    
    public DataAnalyzer() {
        data = new ArrayList<>();
    }
    
    public void add(double d) {
        data.add(d);
    }
    
    public void report() {
        System.out.println("Report:");
        System.out.println("Average:" + average());
        // TODO: Maximum, minimum
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataAnalyzer analyzer = new DataAnalyzer();
        analyzer.add(1.0);
        analyzer.add(2.0);
        analyzer.add(3.0);
        analyzer.report();
    }

    private double average() {
        double sum = 0.0;
        for (Double d : data) {
            sum += d;
        }
        return sum/data.size();
    }
    
}
