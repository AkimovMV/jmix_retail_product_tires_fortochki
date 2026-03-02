package com.makimov.retailproducttiresfortochki.view.warehouse;

import com.makimov.retailproducttiresfortochki.entity.Warehouse;
import com.makimov.retailproducttiresfortochki.services.ProductService;
import com.makimov.retailproducttiresfortochki.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "warehouses/:id", layout = MainView.class)
@ViewController(id = "Warehouse.detail")
@ViewDescriptor(path = "warehouse-detail-view.xml")
@EditedEntityContainer("warehouseDc")
public class WarehouseDetailView extends StandardDetailView<Warehouse> {

}