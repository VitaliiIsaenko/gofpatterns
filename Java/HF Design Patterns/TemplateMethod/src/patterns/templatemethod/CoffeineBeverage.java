package patterns.templatemethod;

public abstract class CoffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("pourInCup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("boilWater");
    }
}
