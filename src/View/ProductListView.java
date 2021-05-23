package View;

import Model.ProductViewModel;
import View.Data.DataView;

import java.util.List;

public class ProductListView extends DataView<List<ProductViewModel>> {
    public ProductListView(List<ProductViewModel> productViewModelList) {
        super(productViewModelList);
    }

    @Override
    public void display() {
        for (ProductViewModel model : this.getT()) {
            System.out.println(model.getName() + " costs " + model.getPrice());
        }
        this.returnToMainMenu();
    }
}
