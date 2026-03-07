public class MathOperations {
    public static void main(String[] args) {
        //Arithmetic Operators
        int a=15;
        int b=5; 
        System.out.println("Arithmetic Operators: ");
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division: "+(a/b));
        
        //Unary Operators
        System.out.println("\nUnary operators: ");
        int x = 5;
        System.out.println("Original value:" +x);
        System.out.println("Post-increament (x++):"+(x++));
        System.out.println("After post-increament:" +x);
        
        System.out.println("Pre-increament (++x):" +(++x));
        System.out.println("After pre-increament: "+x);
        
        //Assignment Operators
        System.out.println("\nAssignment Operators: ");
        int y= 10;
        y+= 5; 
        System.out.println("y+=5: "+y);
        
        y -=3;
        System.out.println("y-=3: "+y);
        
        y *=2;
        System.out.println("y *=2: "+y);
        
        y /=4;
        System.out.println("y /=4: "+y);
        
        //Relational Operators
        System.out.println("\nRelational Operators: ");
        int p = 8;
        int q = 6;
        System.out.println("p==q: " + (p==q));
        System.out.println("p !=q: "+(p !=q));
        System.out.println("p>q: "+ (p>q));
        System.out.println("p<q: "+(p<=q));
        
        //Logical Operators 
        System.out.println("\nLogical Operators: ");
        boolean condition1= true;
        boolean condition2= false;
        System.out.println("condition1 && condition2: "+(condition1 && condition2));
        System.out.println("condition1 || condition2: "+(condition1 || condition2));
        System.out.println("!condition1: "+(!condition1));
        
        //Ternary Operator
        System.out.println("\nTernary Operators: ");
        int age = 18;
        String result = (age>=18) ? "Eligilbe to vote " : "Not eligible to vote";
        System.out.println(result);
    }
}
        
        
    
