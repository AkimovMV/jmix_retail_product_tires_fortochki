package com.makimov.retailproducttiresfortochki.view.warehouse;

import com.makimov.retailproducttiresfortochki.entity.Warehouse;
import com.makimov.retailproducttiresfortochki.services.ProductService;
import com.makimov.retailproducttiresfortochki.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "warehouses", layout = MainView.class)
@ViewController(id = "Warehouse.list")
@ViewDescriptor(path = "warehouse-list-view.xml")
@LookupComponent("warehousesDataGrid")
@DialogMode(width = "64em")
public class WarehouseListView extends StandardListView<Warehouse> {

    @Autowired
    ProductService productService;

    @Subscribe(id = "loadingWarehouses", subject = "clickListener")
    public void onLoadingWarehousesClick(final ClickEvent<JmixButton> event) {
        this.productService.saveWarehousesFromWsdl();
    }
}