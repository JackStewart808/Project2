package stats.statslib;

import java.util.ArrayList;
import java.util.Collections;
public class StatsLibrary
{

    public long hyperGeometric(int r, int n, int N)
    {
        return combinations(r, y) * combinations(N-r, N-y) / combinations(N, n);
    }

    public long Poisson(int lambda, int y)
    {
        return Math.pow(lambda, y) / factorial(y) * Math.pow(Math.E, -1 * lambda);
    }


    public long combinations(int n, int r) //n choose r
    {
        return factorial(n) / (factorial(r) * factorial(n-r));
    }

    public long factorial(int n)
    {
        int product = 1;
        for(int i = n; i > 1; i--)
        {
            product *= i;
        }
        return product;
    }


    /*
    public double computeMean(ArrayList<Integer> listOfNumbers) {
        int sum = 0;

        for(int singleNumber : listOfNumbers) {
            sum += singleNumber;

        }
        return sum / (double) listOfNumbers.size();
    }

    public double computeMedian(ArrayList<Integer> listOfNumbers) {
        int size = listOfNumbers.size();
        Collections.sort(listOfNumbers);
        if(size % 2 == 1){
            return (double) listOfNumbers.get(size / 2);
        }
        else {
            return ((double) listOfNumbers.get(size / 2) + (double) listOfNumbers.get((size / 2) - 1)) / 2;
        }
    }
    public double computeMode(ArrayList<Integer> listOfNumbers) {
        Collections.sort(listOfNumbers);
        int currentChainLength = 0;
        int currentChainValue = 0;
        int longestChain = 0;
        int currentMostSeenNumber = -1;
        for(int i = 0; i < listOfNumbers.size(); i++)
        {
            if(listOfNumbers.get(i) == currentChainValue)
            {
                currentChainValue ++;
            }
            else 
            {
                if(currentChainLength > longestChain)
                {
                    currentMostSeenNumber = currentChainValue;
                    longestChain = currentChainLength;
                    currentChainValue = listOfNumbers.get(i);
                    currentChainLength = 1;
                }
                else
                {
                    currentChainValue = listOfNumbers.get(i);
                    currentChainLength = 1;
                }
            }
        }
        return (double) currentMostSeenNumber;
    }

    public double standardDev(ArrayList<Integer> numbers)
    {
        double sum = 0;
        double mean;
        double standardDeviation = 0;

        for (int num : numbers) 
        {
            sum += num;
        }
        mean = sum / numbers.size();

        for (int num : numbers) 
        {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / numbers.size());
    }

    public long factorial(int n)
    {
        int product = 1;
        for(int i = n; i > 1; i--)
        {
            product *= i;
        }
        return product;
    }

    public long permutations(int n, int r) //choose r items from n
    {
        return factorial(n) / factorial(n-r);
    }

    public long combinations(int n, int r) //n choose r
    {
        return factorial(n) / (factorial(r) * factorial(n-r));
    }

    public double binomial(double successChance, int trials, int desiredNumberOfSuccesses)
    {
        return combinations(trials, desiredNumberOfSuccesses) * 
        Math.pow(successChance, desiredNumberOfSuccesses) * 
        Math.pow(1 - successChance, trials-desiredNumberOfSuccesses);
    }

    public double geometric(double successChance, int value)
    {
        return Math.pow(1 - successChance, value - 1) * successChance;
    }

    public boolean independanceCheck(double a, double b, double anb)
    {
        if(a * b - anb < 0.0001)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    */
}