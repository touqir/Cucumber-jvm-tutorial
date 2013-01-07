package com.tutorials.organization;

import java.lang.Math;
import java.util.List;

public class NumberCruncher {

  private int initialNumber;

  public void setInitialNumber(int num) {
    this.initialNumber = num;
  }

  public int add(int num) {
    return this.initialNumber + num;
  }

  public int subtract(int num) {
    return this.initialNumber - num;
  }

  public int multiply(int num) {
    return this.initialNumber * num;
  }

  public double getMean(List<Integer> values) {
    return calculateMean(values);
  }

  /*
   * this method calculates the sample standard
   * deviation defined here:
   *
   * http://en.wikipedia.org/wiki/Standard_deviation
   *
   *  @param integers from which to calculate standard deviation
   *
   *  @return sample standard deviation
   */
  public double getStDev(List<Integer> values) {
    //set the number of int values in this list
    double N = values.size();
    //set the mean
    double mean = calculateMean(values);

    //initialize sum
    double sum = 0;

    //calculate sum from i=1 --> N of (Xi - mean)^2
    for (Integer number : values) {
      sum += Math.pow((number - mean),2);
    }

    //return the sample standard deviation
    return Math.pow( (1.0/(N-1) * sum) , 0.5 );
  }

  /*
   * this method calculates the mean of a list
   * of integers. The mean needs to be calculated for
   * for multiple methods, so instead of copy and pasting
   * code we will create one method and call it several times
   *
   *  @param numbers used to calculate the mean
   *
   *  @return the mean
   */
  private static double calculateMean(List<Integer> values) {
    int sum = 0;
    for (Integer number : values) {
      sum += number;
    }
    return sum/(values.size()*1.0);
  }

}
