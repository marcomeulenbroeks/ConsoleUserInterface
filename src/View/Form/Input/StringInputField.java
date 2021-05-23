package View.Form.Input;

import View.Form.Input.Validation.Validator;
import View.Form.Controls.*;

import java.util.List;

public class StringInputField extends InputField<String> {
    public StringInputField(Label label) {
        super(label);
    }

    public StringInputField(Label label, List<Validator<String>> validators) {
        super(label, validators);
    }

    @Override
    protected boolean tryParse(String value) {
        return true;
    }

    @Override
    protected String parse(String value) {
        if (value == null) {
            return "";
        }
        return value;
    }
}
