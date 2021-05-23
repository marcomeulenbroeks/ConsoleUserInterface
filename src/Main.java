import Controller.MenuController;
import Controller.ProductAddController;
import View.Displayable;
import View.MenuView;
import View.ProductAddView;

public class Main {

    public static void main(String[] args) {
        Displayable menu = new MenuView(new MenuController());
        menu.display();
    }
}
