package Controller;

import View.Displayable;

public interface Controller<T> {
    Displayable execute(T model);
}
