package View.Data;

import Controller.MenuController;
import View.Displayable;
import View.MenuView;

import java.util.Scanner;

public abstract class DataView<T> implements Displayable {
    private static final Scanner scanner = new Scanner(System.in);
    private final T t;

    public final T getT() {
        return t;
    }

    public DataView(T t) {
        this.t = t;
    }

    protected final void returnToMainMenu() {
        System.out.println("Press enter to continue...");
        scanner.nextLine();
        Displayable view = new MenuView(new MenuController());
        view.display();
    }
}
