package nl.ivonet;

import javax.swing.*;

class Avg{
      //declare data members

       private int num1;
       private int num2;
       private int num3;
       private int avarage;

      //constructor (default values)
  public void Avg(){
      num1 = 0;
      num2 = 0;
      num3 = 0;
      avarage = 0;
  }

      //set method (one for every input variable)
  public void setNum1(int num1){
      this.num1 = num1;
  }
  public void setNum2(int num2){
      this.num2 = num2;
  }
  public void setNum3(int num3){
      this.num3 = num3;
  }


  //compute method
  public void compute(){

      avarage = (num1+num2+num3)/3;
  }

      //get method

  public int getAvarage(){
      return avarage;

     }
  }

public class Q014{
   public static void main (String args[]){

  //declare variables
int num1,num2,num3,avarage;

  //declare objects
Avg myAvg;

  //create objects
  myAvg = new Avg();

  //input
num1=Integer.parseInt(JOptionPane.showInputDialog(null,"enter a number"));
myAvg.setNum1(num1);

num2=Integer.parseInt(JOptionPane.showInputDialog(null,"enter a number"));
myAvg.setNum2(num2);

num3=Integer.parseInt(JOptionPane.showInputDialog(null,"enter a number"));
myAvg.setNum3(num3);
  //process           **ERROR AT THE LINE BELOW**
MyAvarage.compute();

  //output  **ERROR AT THE LINE BELOW**
  sum = mySum.getSum();
JOptionPane.showMessageDialog(null,"The avarage is " +sum);

  }
}
