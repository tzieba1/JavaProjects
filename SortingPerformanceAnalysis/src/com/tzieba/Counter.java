package com.tzieba;

public class Counter
{
  int count;
  
  public Counter()
  {
    count = 0;
  }
  
  public void reset()
  {
    count = 0;
  }
  
  public void increment()
  {
    count++;
  }
  
  public int getCount()
  {
    return count;
  }
}
