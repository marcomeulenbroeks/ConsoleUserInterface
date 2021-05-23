package View;

import Controller.PostProcessor;
import Model.ProductViewModel;
import View.Form.FormView;
import View.Form.Input.*;
import View.Form.Controls.*;
import View.Form.Input.Validation.IntegerRangeValidation;
import View.Form.Input.Validation.IntegerRequiredValidation;
import View.Form.Input.Validation.StringRequiredValidation;

import java.util.ArrayList;
import java.util.List;

public class ProductAddView extends FormView<ProductViewModel> {

    public ProductAddView(PostProcessor<ProductViewModel> postProcessor) {
        super(postProcessor, new ArrayList<>() {
            {
                add(new StringInputField(new Label("Name"), new ArrayList<>() {
                    {
                        add(new StringRequiredValidation());
                    }
                }));
                add(new IntegerInputField(new Label("Price"), new ArrayList<>() {
                    {
                        add(new IntegerRequiredValidation());
                        add(new IntegerRangeValidation(0, null));
                    }
                }));
            }
        });
    }

    @Override
    public void submit(List<InputField> fields, PostProcessor<ProductViewModel> processor) {
        StringInputField nameField = (StringInputField) fields.get(0);
        IntegerInputField priceField = (IntegerInputField) fields.get(1);
        ProductViewModel product = new ProductViewModel(nameField.getValue(), priceField.getValue());
        processor.process(product);
    }
}
