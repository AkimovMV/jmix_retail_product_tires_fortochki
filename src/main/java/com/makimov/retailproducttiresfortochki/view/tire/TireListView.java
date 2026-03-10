package com.makimov.retailproducttiresfortochki.view.tire;

import com.makimov.retailproducttiresfortochki.entity.Tire;
import com.makimov.retailproducttiresfortochki.services.ProductService;
import com.makimov.retailproducttiresfortochki.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "tires", layout = MainView.class)
@ViewController(id = "Tire.list")
@ViewDescriptor(path = "tire-list-view.xml")
@LookupComponent("tiresDataGrid")
@DialogMode(width = "64em")
public class TireListView extends StandardListView<Tire> {
    @Autowired
    ProductService productService;

    @Subscribe(id = "loadingTires", subject = "clickListener")
    public void onLoadingTiresClick(final ClickEvent<JmixButton> event) {
        this.productService.saveTiresByStocksFromWsdl();
    }

}