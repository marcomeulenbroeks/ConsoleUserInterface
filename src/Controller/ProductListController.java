package Controller;

import Model.ProductFilterModel;
import Model.ProductViewModel;
import View.Displayable;
import View.ProductListView;

import java.util.ArrayList;
import java.util.List;

public class ProductListController implements Controller<ProductFilterModel> {
    @Override
    public Displayable execute(ProductFilterModel productFilterModel) {
        //ToDo; call logic layer to retrieve data
        List<ProductViewModel> result = new ArrayList<>();
        List<ProductViewModel> products = new ArrayList<>() {
            {
                add(new ProductViewModel("Ijs", 3));
                add(new ProductViewModel("Mars", 2));
            }
        };
        for (ProductViewModel p : products) {
            if (productFilterModel == null || p.getName().equalsIgnoreCase(productFilterModel.getName())) {
                result.add(p);
            }
        }
        return new ProductListView(result);
    }
}
