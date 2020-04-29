package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float c = this.getValue();
        return new Fahrenheit(((c*9)/5) + 32);
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}