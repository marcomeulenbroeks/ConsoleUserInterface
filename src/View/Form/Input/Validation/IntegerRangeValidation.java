package View.Form.Input.Validation;

import View.Form.Controls.Label;

public class IntegerRangeValidation implements Validator<Integer> {
    int lowerLimit = Integer.MIN_VALUE;
    int upperLimit = Integer.MAX_VALUE;

    public IntegerRangeValidation(Integer lowerLimit, Integer upperLimit) {
        if (lowerLimit != null) {
            this.lowerLimit = lowerLimit;
        }
        if (upperLimit != null) {
            this.upperLimit = upperLimit;
        }
    }

    @Override
    public String invalidValueMessage(Label label) {
        if (lowerLimit != Integer.MIN_VALUE && upperLimit != Integer.MAX_VALUE) {
            return "Value needs to be between " + lowerLimit + " and " + upperLimit + ".";
        }
        if (lowerLimit != Integer.MIN_VALUE) {
            return "Value needs to be greater than " + lowerLimit + ".";
        }
        return "Value needs to be less than " + upperLimit + ".";
    }

    @Override
    public boolean isValid(Integer value) {
        if (value >= lowerLimit && value <= upperLimit) {
            return true;
        }
        return false;
    }
}
