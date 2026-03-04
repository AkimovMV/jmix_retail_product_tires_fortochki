package com.makimov.retailproducttiresfortochki.view.tirestock;

import com.makimov.retailproducttiresfortochki.entity.TireStock;
import com.makimov.retailproducttiresfortochki.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "tire-stocks/:id", layout = MainView.class)
@ViewController(id = "TireStock.detail")
@ViewDescriptor(path = "tire-stock-detail-view.xml")
@EditedEntityContainer("tireStockDc")
public class TireStockDetailView extends StandardDetailView<TireStock> {
}