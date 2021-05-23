package View.Form.Input;

import View.Form.Controls.Label;
import View.Form.Input.Validation.Validator;

import java.util.List;

public abstract class InputField<T> {
    private final Label label;
    private T value;
    private boolean isValid;
    private String errorMessage;
    private final List<Validator<T>> validators;

    public InputField(Label label) {
        this(label, null);
    }

    public InputField(Label label, List<Validator<T>> validators) {
        this.label = label;
        this.validators = validators;
    }

    public final Label getLabel() {
        return label;
    }

    public final boolean isValid() {
        return isValid;
    }

    public final String getErrorMessage() {
        return errorMessage;
    }

    public final T getValue() {
        return value;
    }

    public final boolean trySetValue(T value) {
        if (this.tryParse((String)value)) {
            this.value = this.parse((String)value);
        } else {
            this.errorMessage = "Please enter a valid value.";
            this.isValid = false;
        }
        if (validators != null) {
            for (Validator validator : this.validators) {
                if (!validator.isValid(this.value)) {
                    this.errorMessage = validator.invalidValueMessage(this.label);
                    this.isValid = false;
                    return false;
                }
            }
        }
        this.isValid = true;
        return true;
    }

    protected abstract boolean tryParse(String value);
    protected abstract T parse(String value);
}
