package patterns.templatemethod.withhook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }
    
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee? (y/n)");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = bf.readLine();
        }
        catch (IOException ex) {
            System.out.println("IO error has occurred");
        }
        if (answer == null) {
            return "no";
        }
        return answer;

    }
}
