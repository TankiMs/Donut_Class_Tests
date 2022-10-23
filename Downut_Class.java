public class Downut
{
    private String flavor;
    private int weight;
    private boolean creme;
    
    public Downut(String f, int w, boolean c)
    {
        flavor = f;
        weight = w; 
        creme = c;
    }
    
    
    
    public void setWeight(int w)
    {
        weight = w;
    }
    
    public void setCreme(boolean c)
    {
        creme = c;
    }
    
    public String getFlavor()
    {
        return flavor;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public boolean getCreme()
    {
        return creme;
    }
    
    public void eat()
    {
        System.out.println("YUMMY");
    }
    
    public String toString()
    {
        return "This is a " + flavor + " donut with weight = " + weight + " and cremeFilled = " + creme + ".";
    }
}
