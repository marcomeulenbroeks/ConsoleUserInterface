package View;

import Controller.Controller;
import Model.MenuOptionModel;
import View.Form.Controls.Label;
import View.Form.FormView;
import View.Form.Input.*;
import View.Form.Input.Validation.*;
import java.util.ArrayList;
import java.util.List;


public class MenuView extends FormView<MenuOptionModel> {
    public MenuView(Controller<MenuOptionModel> controller) {
        super(controller, new ArrayList<>() {
            {
                add(new IntegerInputField(new Label("Menu Option"), new ArrayList<>() {
                    {
                        add(new IntegerRequiredValidation());
                        add(new IntegerRangeValidation(1, 3));
                    }
                }));
            }
        });
    }

    @Override
    protected final void displayInfo() {
        System.out.println("Choose an option");
        System.out.println("1. Show all products");
        System.out.println("2. Add new product");
        System.out.println("3. Filter products");
    }

    @Override
    public void submit(List<InputField> fields, Controller<MenuOptionModel> controller) {
        IntegerInputField optionField = (IntegerInputField) fields.get(0);
        MenuOptionModel option = new MenuOptionModel(optionField.getValue());
        Displayable view = controller.execute(option);
        view.display();
    }
}
