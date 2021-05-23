package View.Form.Input;

import View.Form.Controls.Label;
import View.Form.Input.Validation.Validator;

import java.util.List;

public class IntegerInputField extends InputField<Integer> {
    public IntegerInputField(Label label) {
        super(label);
    }

    public IntegerInputField(Label label, List<Validator<Integer>> validators) {
        super(label, validators);
    }

    @Override
    protected boolean tryParse(String value) {
        if (value == null || value.isBlank()) {
            return true;
        }
        try {
            this.parse(value);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    @Override
    protected Integer parse(String value) {
        if (value == null || value.isBlank()) {
            return null;
        }
        return Integer.parseInt(value);
    }
}
