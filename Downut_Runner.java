
public class DownutRunner
{
    public static void main(String[] args)
    {
        Downut donutOne = new Downut("glazed", 5, false);
        Downut donutTwo = new Downut("chocolate", 8, true);
        
        System.out.println(donutOne);
        System.out.println(donutTwo);
        
        donutOne.eat();
        
    }
}
