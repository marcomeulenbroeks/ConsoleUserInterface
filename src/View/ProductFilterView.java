package View;

import Controller.PostProcessor;
import Model.ProductFilterModel;
import View.Form.Controls.Label;
import View.Form.FormView;
import View.Form.Input.InputField;
import View.Form.Input.StringInputField;

import java.util.ArrayList;
import java.util.List;


public class ProductFilterView extends FormView<ProductFilterModel> {
    public ProductFilterView(PostProcessor<ProductFilterModel> postProcessor) {
        super(postProcessor, new ArrayList<>() {
            {
                add(new StringInputField(new Label("Name")));
            }
        });
    }

    @Override
    public void submit(List<InputField> fields, PostProcessor<ProductFilterModel> processor) {
        StringInputField nameField = (StringInputField) fields.get(0);
        ProductFilterModel filter = new ProductFilterModel(nameField.getValue());
        processor.process(filter);
    }
}
