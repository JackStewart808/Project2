import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Random;

public class Salter
{
    private ArrayList<Double> xValues;
    private ArrayList<Double> yValues;

    public Salter(ArrayList<Double> xInputs)
    {
        xValues = xInputs;
        yValues = new ArrayList<Double>();
        Random rand = new Random();
        for(double value : xValues)
        {
            //Controls the y value based off the x value set inputted
            double saltValue = 5 * (rand.nextDouble() - 1);
            yValues.add(value * value + saltValue);
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