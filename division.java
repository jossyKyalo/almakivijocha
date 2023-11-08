
    public class division extends Main{
        
        
        public static double div(double num7, double num8) {
            if (num8== 0) {
                System.out.println("Error: Division by zero.");
                return Double.NaN;
            }
           
            double d=num7/num8;
            return d;
    }
    }

