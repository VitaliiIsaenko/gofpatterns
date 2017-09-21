package patterns.decorator;

public abstract class Beverage {
    String description = "Unknown beverage";
    private Size size = Size.Medium;

    public String getDescription(){
        return description;
    }

    public abstract double getCost();

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
