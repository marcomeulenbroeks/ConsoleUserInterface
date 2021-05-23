package Controller;

import Model.MenuOptionModel;
import View.*;

public class MenuController implements PostProcessor<MenuOptionModel> {
    @Override
    public void process(MenuOptionModel menuOptionModel) {
        Displayable displayable = new MenuView(new MenuController());
        switch (menuOptionModel.getOption()) {
            case 1 -> displayable = new ProductListView(new ProductListController().process());
            case 2 -> displayable = new ProductAddView(new ProductAddController());
            case 3 -> displayable = new ProductFilterView(new ProductListController());
        }
        displayable.display();
    }
}
