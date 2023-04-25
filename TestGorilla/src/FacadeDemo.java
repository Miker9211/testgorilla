import java.util.Locale;
import java.util.Scanner;

public class FacadeDemo {
    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the figure that you want write: ");
        String word = sc.nextLine();


        switch (word.toLowerCase()){
            case "circle":
                shapeMaker.drawCircle(word);
                break;
            case "rectangle":
                shapeMaker.drawRectangle(word);
                break;
            case "square":
                shapeMaker.drawSquare(word);
                break;
            default:
                System.out.println("Not exist the previous figure.");

        }

    }
}