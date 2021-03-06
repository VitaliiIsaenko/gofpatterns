package patterns.inputdecorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try{
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("D:\\Programming\\gofpatterns\\Java\\Decorator\\src\\patterns\\inputdecorator\\text.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
