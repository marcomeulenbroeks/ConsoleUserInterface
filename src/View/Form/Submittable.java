package View.Form;

import Controller.PostProcessor;
import View.Form.Input.InputField;

import java.util.List;

public interface Submittable<T> {
    void submit(List<InputField> fields, PostProcessor<T> processor);
}
