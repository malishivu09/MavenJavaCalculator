import java.util.*;


  
public class CalculatorClass {
    int num1;
    int num2;
    int result1;
    int result2;
    
    Scanner inputObject = new Scanner(System.in);
    
    //getting input from the user
    public void getInput()
    {
        System.out.print("Enter first number : ");
        num1 = inputObject.nextInt();
        System.out.print("Enter second number : ");
        num2 = inputObject.nextInt();    
    }
    
    //getting user choice from the menu
    public void getUserInput()
    {
        System.out.println("\n");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Exit ");
        
        System.out.print("\n Enter Your Choice : ");
        int choice=inputObject.nextInt();
        
         switch (choice) {
            case(1): /*IF PLUS*/
                Addition();
                break;
            case(2): /*IF MINUS*/
                Subtraction();
                break;
            case(3): /*IF MULTIPLICATION*/
                Multiplication();
                break;
            case(4): /*IF DIVISION*/
                Division();
                break;
            case(5): /*Exit*/
                System.exit(0);
                break;            
        }
    }
    
    public void Addition()
    {
        result1=num1+num2;
        System.out.println("Sum is : " + result1 +"\n");
        result1=0;
        getUserInput();
    }
    public void Subtraction()
    {
        result1=num1-num2;
        System.out.println("Difference is : " + result1 +"\n");
        result1=0;
        getUserInput();
    }
    public void Multiplication()
    {
        result1=num1*num2;
        System.out.println("Product is : " + result1+ "\n");
                
        result1=0;
        getUserInput();
    }
    public void Division()
    {
        result1=num1/num2;
        result2=num1%num2;
        System.out.print("Quotient is : " + result1+ "\n");
        System.out.print("Reminder is : " + result2+ "\n");
        result1=0;
        result2=0;
        getUserInput();
    }       
}
