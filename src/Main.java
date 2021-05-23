import Controller.MenuController;
import View.Displayable;
import View.MenuView;

public class Main {

    public static void main(String[] args) {
        Displayable menu = new MenuView(new MenuController());
        menu.display();
    }
}
