package com.makimov.retailproducttiresfortochki.view.tire;

import com.makimov.retailproducttiresfortochki.entity.Tire;
import com.makimov.retailproducttiresfortochki.entity.TireStock;
import com.makimov.retailproducttiresfortochki.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;

@Route(value = "tires/:id", layout = MainView.class)
@ViewController(id = "Tire.detail")
@ViewDescriptor(path = "tire-detail-view.xml")
@EditedEntityContainer("tireDc")
public class TireDetailView extends StandardDetailView<Tire> {
    @ViewComponent
    private CollectionLoader<TireStock> tireStocksByTireDl;

    @Subscribe(id = "tireDc", target = Target.DATA_CONTAINER)
    public void onTireDcItemChange(final InstanceContainer.ItemChangeEvent<Tire> event) {
        tireStocksByTireDl.setParameter("producerArticleId",event.getItem().getProducerArticleId());
        tireStocksByTireDl.setParameter("producer",event.getItem().getProducer());
        tireStocksByTireDl.load();
    }
}