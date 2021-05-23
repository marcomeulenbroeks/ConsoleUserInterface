package View;

import Controller.Controller;
import Model.ProductFilterModel;
import View.Form.Controls.Label;
import View.Form.FormView;
import View.Form.Input.InputField;
import View.Form.Input.StringInputField;

import java.util.ArrayList;
import java.util.List;


public class ProductFilterView extends FormView<ProductFilterModel> {
    public ProductFilterView(Controller<ProductFilterModel> controller) {
        super(controller, new ArrayList<>() {
            {
                add(new StringInputField(new Label("Name")));
            }
        });
    }

    @Override
    public void submit(List<InputField> fields, Controller<ProductFilterModel> controller) {
        StringInputField nameField = (StringInputField) fields.get(0);
        ProductFilterModel filter = new ProductFilterModel(nameField.getValue());
        Displayable view = controller.execute(filter);
        view.display();
    }
}
