import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Plotter
{
    private ArrayList<Double> xValues;
    private ArrayList<Double> yValues;

    public Plotter(ArrayList<Double> xInputs)
    {
        xValues = xInputs;
        yValues = new ArrayList<Double>();
        for(double value : xValues)
        {
            //Controls the y value based off the x value set inputted
            yValues.add(value * value);
        }
    }

    public void toFile(String filePath) throws IOException
    {
        Writer fileWriter = new FileWriter(filePath);
        for(int index = 0; index < xValues.size(); index++)
        {
            //Writes in the form "x, y\n" for each value pair
            fileWriter.write(xValues.get(index) + ", " + yValues.get(index) + "\n");
        }
        fileWriter.close();
    }
}