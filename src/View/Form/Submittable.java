package View.Form;

import Controller.Controller;
import View.Form.Input.InputField;

import java.util.List;

public interface Submittable<T> {
    void submit(List<InputField> fields, Controller<T> controller);
}
