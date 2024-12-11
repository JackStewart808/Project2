import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Smoother
{
    private ArrayList<Double> xValues;
    private ArrayList<Double> yValues;
    private int smoothRadius;

    public Smoother(ArrayList<Double> xInputs, int inputSmoothRadius)
    {
        xValues = xInputs;
        yValues = new ArrayList<Double>();
        smoothRadius = inputSmoothRadius;

        //Handes values that would result in IndexOutOfRange Error on negative side
        for(int index = 0; index < smoothRadius; index++)
        {
            double sum = 0;
            for(int viewingIndex = 0; viewingIndex <= index + smoothRadius; viewingIndex++)
            {
                sum += Math.pow(xValues.get(viewingIndex), 2);
            }
            yValues.add(sum / (index + 3));
        }

        for(int index = smoothRadius; index < xValues.size() - smoothRadius; index++)
        {
            //Controls the y value based off the x value set inputted
            double sum = 0;
            for(int viewingIndex = index - smoothRadius; viewingIndex <= index + smoothRadius; viewingIndex++)
            {
                sum += Math.pow(xValues.get(viewingIndex), 2);
            }
            yValues.add(sum / (smoothRadius * 2 + 1));
        }

        for(int index = xValues.size() - smoothRadius; index < xValues.size(); index++)
        {
            //Controls the y value based off the x value set inputted
            double sum = 0;
            for(int viewingIndex = index - smoothRadius; viewingIndex < xValues.size(); viewingIndex++)
            {
                sum += Math.pow(xValues.get(viewingIndex), 2);
            }
            yValues.add(sum / (xValues.size() - index + 2));
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
