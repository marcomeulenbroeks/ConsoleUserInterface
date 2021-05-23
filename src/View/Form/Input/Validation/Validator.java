package View.Form.Input.Validation;

import View.Form.Controls.Label;

public interface Validator<T> {
    String invalidValueMessage(Label label);
    boolean isValid(T value);
}
