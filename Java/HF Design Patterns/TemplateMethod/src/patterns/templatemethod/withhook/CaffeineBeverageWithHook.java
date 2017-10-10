package patterns.templatemethod.withhook;

public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public boolean customerWantsCondiments() {
        return true;
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
