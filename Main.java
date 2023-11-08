import java.util.Scanner;
//Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");//The Main Java Hello World Program
        try (Scanner scanner = new Scanner(System.in)) {
            //For the classes input queries
            System.out.println("Select your arithmetic operation:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication"); 
            System.out.println("4.Division");
            System.out.println("5.Rectangle perimeter");
            System.out.println("6.Triangle area");
            System.out.println("7.Circle area");
            System.out.println("8.Circle perimeter");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter the first number: ");
                    int firstNumber = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int secondNumber = scanner.nextInt();
                    //add method for addition and the output statement for result
                    int sum = Addition.add(firstNumber,secondNumber);
                    System.out.println("Result of addition: " + sum);
                    break;
             case 2:
                    System.out.print("Enter the first number: ");
                    double num3 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    double num4 = scanner.nextInt();
                    //add method for substraction and the output statement for result
                    double difference = SubtractionCalculator.subtract(num3,num4);
                    System.out.println("Result of subtraction: " + difference);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    int num5 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num6 = scanner.nextInt();
                    //add method for multiplication and the output statement for result
                    int product = Multiplication.multiply(num5, num6);
                    System.out.println("Result of multiplication: " + product);
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    double num7 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num8 = scanner.nextDouble();
                    //add method for division and the output statement for result
                    double Divi = division.div(num7, num8);
                    System.out.println("The Area is: " + Divi);
                    break;
                case 5:
                    System.out.print("Enter the length: ");
                    int length = scanner.nextInt();
                    System.out.print("Enter the width: ");
                    int width = scanner.nextInt();
                    //add method for rectangle's perimeter and the output statement for result
                    int recperimeter = Rectangleperimeter.perimeter(length, width);
                    System.out.println("The perimeter is: " + recperimeter);
                    break;
                case 6:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height: ");
                    double height = scanner.nextDouble();
                    //add method for computing the area of a right-angled triangle and the output statement for result
                    double triarea = TriangleArea.area(base, height);
                    System.out.println("The Area is: " + triarea);
                    break;
                case 7:
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                   //add method for calculating area of the circle and the output statement for result
                   double Cirarea = Circlearea.area( radius);
                    System.out.println("The Area is: " + Cirarea);
                    break;
                case 8:
                    System.out.print("Enter the radius: ");
                    double circleRadius = scanner.nextDouble();
                    //add method for finding perimeter of the circle and the output statement for result
                    double circumfer = circleperimeter.circumference( circleRadius);
                    System.out.println("The Area is: " + circumfer);
                    break;
                default:
                    System.out.println("Invalid choice! You can try again now.");
            }
        }

      
    }
}

    
