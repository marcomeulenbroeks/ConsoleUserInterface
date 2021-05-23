package View.Form.Input.Validation;

import View.Form.Controls.Label;

public class IntegerRequiredValidation implements Validator<Integer> {
    @Override
    public String invalidValueMessage(Label label) {
        return "Please enter a value. " + label.getName() + " is required.";
    }

    @Override
    public boolean isValid(Integer value) {
        if (value == null) {
            return false;
        }
        return true;
    }
}
