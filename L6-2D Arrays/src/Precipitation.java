import java.io.*;
import java.util.Scanner;


public class Precipitation {

    public static void main(String[] args) throws IOException {

        ArrayCalculations calc = new ArrayCalculations();
        File file = new File("indyPrecipitation.txt");
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter("averages.txt");

        String[] year = {"2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"};
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        double[][] rainfall = new double[year.length][month.length];

        for(int i = 0; i < rainfall.length; i++){
            for(int j = 0; j < rainfall[0].length; j++){
                rainfall[i][j] = input.nextDouble();
            }
        }

        input.close();

        double[] rainfallPerMonth = calc.avgPerRow(rainfall);
        double[] rainfallPerYear = calc.avgPerCol(rainfall);

        for(int i = 0; i < year.length; i++){
            output.printf("The average rainfall per month in " + year[i] + ": %.2f%n", rainfallPerMonth[i]);
        }

        for(int i = 0; i < month.length; i++){
            output.printf("The average rain in " + month[i] + "over the last 20 years: %.2f%n", rainfallPerYear[i]);
        }

        output.printf("The average month;y rainfall over the last 20 years is " + calc.avg(rainfallPerMonth));


        output.close();
    }
}
