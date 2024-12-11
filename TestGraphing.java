import java.io.IOException;
import java.util.ArrayList;

public class TestGraphing
{
    public static void main(String[] args)
    {
        ArrayList<Double> xValues = new ArrayList<>();
        for(double newValue = -10; newValue <= 10; newValue += .5)
        {
            xValues.add(newValue);
        }

        Plotter testPlotter = new Plotter(xValues);
        Salter testSalter = new Salter(xValues);
        Smoother testSmoother = new Smoother(xValues, 2);

        try{
            testPlotter.toFile("Part1-PSS1-JavaFiles/plotterOut.txt");
            testSalter.toFile("Part1-PSS1-JavaFiles/salterOut.txt");
            testSmoother.toFile("Part1-PSS1-JavaFiles/smootherOut.txt");
        }
        catch(IOException e){
            System.out.println("One or More Files Could Not Be Found");
        }
    }
}