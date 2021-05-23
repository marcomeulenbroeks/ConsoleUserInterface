package Controller;

import Model.ProductFilterModel;
import Model.ProductViewModel;
import View.Displayable;
import View.ProductListView;

import java.util.ArrayList;
import java.util.List;

public class ProductListController implements GetProcessor<List<ProductViewModel>>, PostProcessor<ProductFilterModel> {
    @Override
    public List<ProductViewModel> process() {
        //ToDo; call logic layer to retrieve data
        return new ArrayList<>() {
            {
                add(new ProductViewModel("Ijs", 3));
                add(new ProductViewModel("Mars", 2));
            }
        };
    }

    @Override
    public void process(ProductFilterModel productFilterModel) {
        //ToDo; call logic layer to retrieve data
        List<ProductViewModel> result = new ArrayList<>();
        List<ProductViewModel> products = this.process();
        for (ProductViewModel p : products) {
            if (p.getName().equalsIgnoreCase(productFilterModel.getName())) {
                result.add(p);
            }
        }
        Displayable view = new ProductListView(result);
        view.display();
    }
}
