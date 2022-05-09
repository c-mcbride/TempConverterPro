package tempconversions;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This program simply converts Fahrenheit to Celsius and Visa Versa
 * @author Califf McBride 4-29-2022
 */
public class TempConverter 
{
    private double fahrenheit;
    private double celsius;
    private String fahrenheitString; //String used here to display in the GUI. String type also allows for the decimal format method to work properly 
    private String celsiusString;
    
    public TempConverter()
    {
        this.fahrenheit = 0;
        this.celsius = 0;
        this.fahrenheitString = null;
        this.celsiusString = null;
    }
    
    public void setFahrenheit (double fahrenheit)
    {
        this.fahrenheit = fahrenheit;
    }
    
    public void setCelsius (double celsius)
    {
        this.celsius = celsius;
    }
    
    public String getFahrenheit (double celsius)
    {
        DecimalFormat df = new DecimalFormat ("#.#"); //This rounds the temperature to one decimal place
        this.fahrenheit = ((9/5.0 * celsius) + 32); //Converts the temp
        this.fahrenheitString = df.format (this.fahrenheit); //Stores the rounded temp in a string to display in the GUI 
        
       // System.out.print(fahrenheitString);
        return this.fahrenheitString;
    }
    
    public String getCelsuis (double fahrenheit)
    {
        DecimalFormat df = new DecimalFormat ("#.#"); //This rounds the temperature to one decimal place
        this.celsius = (5/9.0) * (fahrenheit - 32); //Converts the temp
        this.celsiusString = df.format(this.celsius); //Stores the rounded temp in a string to display in the GUI 
        
        //System.out.print(celsiusString);
        return this.celsiusString;
    }
}
