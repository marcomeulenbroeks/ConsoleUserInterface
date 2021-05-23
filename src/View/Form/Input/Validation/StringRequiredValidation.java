package View.Form.Input.Validation;

import View.Form.Controls.Label;

public class StringRequiredValidation  implements Validator<String> {
    @Override
    public String invalidValueMessage(Label label) {
        return "Please enter a value. " + label.getName() + " is required.";
    }

    @Override
    public boolean isValid(String value) {
        if (value.isBlank()) {
            return false;
        }
        return true;
    }
}
