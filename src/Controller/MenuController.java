package Controller;

import Model.MenuOptionModel;
import View.*;

public class MenuController implements Controller<MenuOptionModel> {
    @Override
    public Displayable execute(MenuOptionModel menuOptionModel) {
        Displayable displayable = new MenuView(new MenuController());
        switch (menuOptionModel.getOption()) {
            case 1 -> displayable = new ProductListController().execute(null);
            case 2 -> displayable = new ProductAddView(new ProductAddController());
            case 3 -> displayable = new ProductFilterView(new ProductListController());
        }
        return displayable;
    }
}
