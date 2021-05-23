package Controller;

import Model.ProductViewModel;
import View.Displayable;
import View.ProductListView;

import java.util.ArrayList;
import java.util.List;

public class ProductAddController implements Controller<ProductViewModel> {
    @Override
    public Displayable execute(ProductViewModel productViewModel) {
        //ToDo: make reference to logic layer
        List<ProductViewModel> models = new ArrayList<>();
        models.add(productViewModel);
        return new ProductListView(models);
    }
}
