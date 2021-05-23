package View.Form;

import Controller.PostProcessor;
import View.Displayable;
import View.Form.Input.*;

import java.util.List;
import java.util.Scanner;

public abstract class FormView<T> implements Displayable, Submittable<T> {
    private static final Scanner scanner = new Scanner(System.in);
    private final PostProcessor<T> postProcessor;
    private final List<InputField> fields;

    public FormView(PostProcessor<T> postProcessor, List<InputField> fields) {
        this.postProcessor = postProcessor;
        this.fields = fields;
    }

    @Override
    public final void display() {
        this.displayInfo();
        fields.forEach(field -> {
            System.out.println(field.getLabel().getName());
            field.trySetValue(scanner.nextLine());
            System.out.println();
            while (!field.isValid()) {
                System.out.println(field.getErrorMessage());
                field.trySetValue(scanner.nextLine());
            }
        });
        this.submit(this.fields, postProcessor);
    }

    protected void displayInfo() {}
}
