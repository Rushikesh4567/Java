public class Wrapper_casting
{
    public static void main(String[] args) {
        int a = 89;

        
        Integer b = a;

        double d = b.doubleValue();  
        float f = b.floatValue();    
        byte byt = b.byteValue();     

        System.out.println("Original int value: " + a);
        System.out.println("Boxed Integer object: " + b);
        System.out.println("Converted to double: " + d);
        System.out.println("Converted to float: " + f);
        System.out.println("Converted to byte: " + byt);
    }
}
