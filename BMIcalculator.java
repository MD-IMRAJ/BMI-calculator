import java.util.Scanner;

public class BMIcalculator {

    public static void bodyMassIndex(double weight,double height){//Mehod
        //(100*100*weight) :- cm convert into meter.
        double bmi=(100*100*weight)/(height*height);//body mass index calculate.
        if(bmi<18.5){
            System.out.print("Underweight:"+bmi);
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal Weight: "+bmi);
        }
        else if(bmi>24.9 &&bmi<=29.9){
            System.out.println("Pre-Obesity:"+bmi);
        }
        else if(bmi>29.9 &&bmi<=34.9){
            System.out.println("Obesity Class 1:"+bmi);
        }
        else if(bmi>34.9 && bmi<=39.9){
            System.out.println("Obesity Class 2:"+bmi);
        }
        else{
            System.out.println("Obesity Class 3:"+bmi);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Weight in kg:"+" ");
        double weight=sc.nextDouble();
        System.out.print("Enter height in cm:"+" ");
        double height=sc.nextDouble();
        bodyMassIndex(weight, height);//calling method.
    }
}
