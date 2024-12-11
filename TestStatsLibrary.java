package stats.statslib;
import java.util.ArrayList;

public class TestStatsLibrary
{
    public static void main(String[] args) {
        StatsLibrary tester = new StatsLibrary();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(1);
        listOfNumbers.add(3);
        listOfNumbers.add(45);
        listOfNumbers.add(3);
        listOfNumbers.add(4);

        

        System.out.println(tester.computeMode(listOfNumbers));
        System.out.println(tester.computeMedian(listOfNumbers));
        System.out.println(tester.computeMean(listOfNumbers));
        System.out.println(tester.standardDev(listOfNumbers));
        System.out.println(tester.factorial(5));
        System.out.println(tester.permutations(5, 2));
        System.out.println(tester.combinations(5, 2));
        System.out.println(tester.binomial(.5, 2, 1));
        System.out.println(tester.geometric(.5, 3));
        System.out.println(tester.independanceCheck(.5, .5, .25));



    }
}