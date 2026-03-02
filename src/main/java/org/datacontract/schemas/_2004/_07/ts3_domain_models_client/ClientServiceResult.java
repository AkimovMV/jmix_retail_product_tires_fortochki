
package org.datacontract.schemas._2004._07.ts3_domain_models_client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CheckInventoryMarkCodeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CheckVerificationCodeByQRCodeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CheckVerificationCodeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ConsigneeListContainer;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ConsigneeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CreateInventoryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.DeleteDeliveryAddressResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.FinishInventoryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetAddressListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetAvailableWarehousesForInventoryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetConsumableResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetCustomerListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetDeliveryPeriodResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFindCameraResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFindWheelResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetInventoryInfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetInventoryListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMX1InfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMX3InfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMovementListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMx1ListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMx3ListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOilResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderCustomerListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPriceResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPrintableUpdResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPurchaseReturnInfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPurchaseReturnListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetReMarkingDocumentListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetReMarkingDocumentResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRestResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRtuCorrectionInfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRtuCorrectionListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetStoOrderInfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetStoOrderListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetSupplierPriceResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetTKTerminalListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetTKTerminalPriceResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.PutDeliveryAddressResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result2;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result3;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result4;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result5;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result6;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result7;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result8;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SaveInventoryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SendPaymentToPhoneResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SendVerificationCodeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetDeliveryAddresResultContainer;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetMoveServicesToNewOrderResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderDeliveryByTKResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderDeliveryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderUpdateResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetReMarkingDocumentResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetReturnToOhResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetStoDeclineServicesResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetSupplierPriceResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetWorkCompletedResult;


/**
 * <p>Java class for ClientServiceResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClientServiceResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="error" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}Error" minOccurs="0"/>
 *         <element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientServiceResult", propOrder = {
    "error",
    "success"
})
@XmlSeeAlso({
    Result.class,
    Result3 .class,
    GetMovementListResult.class,
    Result2 .class,
    GetAddressListResult.class,
    GetDeliveryPeriodResult.class,
    SetDeliveryAddresResultContainer.class,
    SetOrderDeliveryResult.class,
    Result4 .class,
    Result5 .class,
    Result6 .class,
    Result7 .class,
    Result8 .class,
    GetConsumableResult.class,
    ConsigneeResult.class,
    DeleteDeliveryAddressResult.class,
    ConsigneeListContainer.class,
    GetPriceResult.class,
    GetRestResult.class,
    GetOilResult.class,
    GetStoOrderListResult.class,
    GetStoOrderInfoResult.class,
    GetMx3ListResult.class,
    GetMX3InfoResult.class,
    GetMx1ListResult.class,
    GetMX1InfoResult.class,
    GetTKTerminalListResult.class,
    GetTKTerminalPriceResult.class,
    SetOrderDeliveryByTKResult.class,
    GetPurchaseReturnListResult.class,
    GetPurchaseReturnInfoResult.class,
    GetRtuCorrectionListResult.class,
    GetRtuCorrectionInfoResult.class,
    SetWorkCompletedResult.class,
    SendPaymentToPhoneResult.class,
    SetReturnToOhResult.class,
    GetPrintableUpdResult.class,
    SendVerificationCodeResult.class,
    CheckVerificationCodeResult.class,
    SetStoDeclineServicesResult.class,
    GetFindCameraResult.class,
    PutDeliveryAddressResult.class,
    SetSupplierPriceResult.class,
    GetSupplierPriceResult.class,
    GetOrderListResult.class,
    GetReMarkingDocumentResult.class,
    GetReMarkingDocumentListResult.class,
    SetReMarkingDocumentResult.class,
    GetFindWheelResult.class,
    CheckVerificationCodeByQRCodeResult.class,
    GetInventoryListResult.class,
    GetInventoryInfoResult.class,
    GetAvailableWarehousesForInventoryResult.class,
    CreateInventoryResult.class,
    SaveInventoryResult.class,
    FinishInventoryResult.class,
    CheckInventoryMarkCodeResult.class,
    SetOrderUpdateResult.class,
    GetOrderCustomerListResult.class,
    GetCustomerListResult.class,
    SetMoveServicesToNewOrderResult.class
})
public class ClientServiceResult {

    @XmlElementRef(name = "error", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService", type = JAXBElement.class, required = false)
    protected JAXBElement<Error> error;
    protected Boolean success;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Error }{@code >}
     *     
     */
    public JAXBElement<Error> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Error }{@code >}
     *     
     */
    public void setError(JAXBElement<Error> value) {
        this.error = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }

}
