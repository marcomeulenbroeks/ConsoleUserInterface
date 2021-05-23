package Controller;

import Model.ProductViewModel;
import View.Displayable;
import View.ProductListView;

import java.util.ArrayList;
import java.util.List;

public class ProductAddController implements PostProcessor<ProductViewModel> {
    @Override
    public void process(ProductViewModel productViewModel) {
        //ToDo: make reference to logic layer
        List<ProductViewModel> models = new ArrayList<>();
        models.add(productViewModel);
        Displayable view = new ProductListView(models);
        view.display();
    }
}
