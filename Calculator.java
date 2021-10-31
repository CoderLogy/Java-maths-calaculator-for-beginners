import java.util.Scanner; 
class hello
{
    public static void main (String args[ ]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        float a = sc.nextFloat();
        System.out.println("Enter second no.");
        float b = sc.nextFloat();
        System.out.println("Enter a quick expression");
        char osd = sc.next().charAt(0);
        float s = a-b;float r = a+b;float q = a*a;float p = b*b;
        switch(osd){
            case '+':
                System.out.println("A added to B is "+ r);
                break;
            case '-':
                System.out.println("A subtracted by B is "+ s);
                break;
            case '*':
                System.out.println("A Multiplied by B is "+a*b);
                break;
            case '/':
                System.out.println("A Divided by B is "+ a/b);
                break;
            case '^':
                System.out.println("Square of A is "+ q);
                System.out.println("Square of B is "+ p);
                System.out.println("Power of A times B "+ Math.pow(a,b));
                break;
            case '$':
                System.out.println("Root of A is "+ Math.sqrt(a));
                System.out.println("Root of B is "+ Math.sqrt(b));
            default:
                error();
                break;

        }
        sc.close();
}
    public static void error(){
        throw new RuntimeException("Look at brighter side 'do it again'");
    }

}  

