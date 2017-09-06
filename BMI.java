import java.util.Scanner;

class BMI {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height: "); // in meters
        float height = sc.nextFloat();
        System.out.println("Enter your weight: "); // in kg
        float weight = sc.nextFloat();
        
        float bmi = weight/(height * height);
        
        int mark = 0;
        
        if (bmi < 18.5)
            mark = 1;
        
        if (bmi > 18.5 && bmi < 25)
            mark = 2;
        
        if (bmi > 25 && bmi < 30)
            mark = 3;
        
        if (bmi > 30 && bmi < 35)
            mark = 4;  
        
        if (bmi > 35)
            mark = 5;
            
        System.out.println("Your BMI is: " + bmi);
        
        switch (mark) {
        
            case 1:
                System.out.println("Your weight is less than normal. Eat more!");
                break;
            case 2:
                System.out.println("Your weight is normal.");
                break;
            case 3:
                System.out.println("Not good. Go to gym.");
                break;
            case 4:
                System.out.println("Bad. Go to gym. Really.");
                break;
            case 5:
                System.out.println("You are very fat!");
                break;
            default:
                break;
        }
    }
}