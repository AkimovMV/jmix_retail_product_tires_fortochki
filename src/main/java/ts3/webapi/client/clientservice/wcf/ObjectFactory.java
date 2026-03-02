
package ts3.webapi.client.clientservice.wcf;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfGetOrderStatusResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfGetStatusListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfPriceList;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfRestList;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfSaveInventoryMarkCode;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfSaveInventoryProduct;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfSetReMarkingDocumentItem;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfSetReturnToOhProductContainer;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfSupplierPriceItem;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CancelInventoryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CheckInventoryMarkCodeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CheckVerificationCodeByQRCodeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CheckVerificationCodeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ClientSoapResultDM;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ConsigneeCreateContainer;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ConsigneeListContainer;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ConsigneeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CreateInventoryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CreateMarketplaceOrderParameters;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CreateOrderResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.DeleteDeliveryAddressResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.DeliveryInfoContainer;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.FindChangeOrderFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.FindDiskFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.FindOrderCommentFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.FindOrderFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.FindTyreFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.FinishInventoryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetAddressListFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetAddressListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetAvailableWarehousesForInventoryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetChangeOrderResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetConsumableFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetConsumableResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetCustomerListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetDeliveryPeriodResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFastenerFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFastenerResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFindCameraFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFindCameraResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFindWheelFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFindWheelResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetGoodsByCarFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetGoodsByCarResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetGoodsPriceRestByCodeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetInventoryInfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetInventoryListFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetInventoryListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMX1InfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMX3InfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMarkaAvtoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMovementListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMx1ListFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMx1ListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMx3ListFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMx3ListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOilFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOilResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderCommentResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderCustomerListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderInfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderInfoResult2;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderListFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPressureSensorFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPressureSensorResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPriceFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPriceResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPrintableUpdResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPurchaseReturnInfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPurchaseReturnListFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPurchaseReturnListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetReMarkingDocumentListFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetReMarkingDocumentListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetReMarkingDocumentResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRestFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRestResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRtuCorrectionInfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRtuCorrectionListFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRtuCorrectionListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetStoOrderInfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetStoOrderListFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetStoOrderListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetSupplierPriceResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetTKTerminalListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetTKTerminalPriceResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetUserListResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetWarehousesResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GoodsPriceRestFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.MovementFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.MovementInfoContainer;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Order;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.OrderReadyToWaitResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Params;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ProposeGoodsContainer;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.PutDeliveryAddressParameters;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.PutDeliveryAddressResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result2;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result3;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result4;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result5;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result6;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result7;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result8;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ResultFindDisk;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ResultFindTyre;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ResultGetGoodsInfo;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ResultSetCancelDelivery;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SaleFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SaveInventoryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SendPaymentToPhoneResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SendVerificationCodeResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetDeliveryAddresResultContainer;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetDeliveryAddressParams;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetDeliveryInfoResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetMergeOrdersResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetMoveServicesToNewOrderResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderCommentResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderDeliveryByTKResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderDeliveryParameters;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderDeliveryResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderUpdateParameters;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderUpdateResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetPriceResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetReMarkingDocumentResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetRestResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetReturnToOhResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetStoDeclineServicesResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetSupplierPriceResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetWorkCompletedResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc.TireCalcParameters;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc.TireCalcResult;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ts3.webapi.client.clientservice.wcf package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _GetFindTyreLogin_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "login");
    private static final QName _GetFindTyrePassword_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "password");
    private static final QName _GetFindTyreFilter_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "filter");
    private static final QName _GetFindTyrePageSize_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "pageSize");
    private static final QName _GetFindTyreResponseGetFindTyreResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetFindTyreResult");
    private static final QName _GetFindDiskResponseGetFindDiskResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetFindDiskResult");
    private static final QName _GetGoodsPriceRestByCodeResponseGetGoodsPriceRestByCodeResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetGoodsPriceRestByCodeResult");
    private static final QName _GetGoodsInfoCodeList_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "code_list");
    private static final QName _GetGoodsInfoResponseGetGoodsInfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetGoodsInfoResult");
    private static final QName _GetGoodsByCarResponseGetGoodsByCarResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetGoodsByCarResult");
    private static final QName _GetMarkaAvtoResponseGetMarkaAvtoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetMarkaAvtoResult");
    private static final QName _GetModelAvtoMarka_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "marka");
    private static final QName _GetModelAvtoResponseGetModelAvtoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetModelAvtoResult");
    private static final QName _GetYearAvtoModel_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "model");
    private static final QName _GetYearAvtoResponseGetYearAvtoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetYearAvtoResult");
    private static final QName _GetModificationAvtoResponseGetModificationAvtoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetModificationAvtoResult");
    private static final QName _SetRestList_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "list");
    private static final QName _SetRestResponseSetRestResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetRestResult");
    private static final QName _SetPriceResponseSetPriceResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetPriceResult");
    private static final QName _CreateOrderOrder_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "order");
    private static final QName _CreateOrderResponseCreateOrderResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "CreateOrderResult");
    private static final QName _CreateMarketplaceOrderMarketplaceOrder_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "marketplaceOrder");
    private static final QName _CreateMarketplaceOrderResponseCreateMarketplaceOrderResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "CreateMarketplaceOrderResult");
    private static final QName _GetChangeOrderResponseGetChangeOrderResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetChangeOrderResult");
    private static final QName _SetOrderStatusOrderNumber_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "orderNumber");
    private static final QName _SetOrderStatusResponseSetOrderStatusResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetOrderStatusResult");
    private static final QName _SetOrderStatusSatelliteResponseSetOrderStatusSatelliteResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetOrderStatusSatelliteResult");
    private static final QName _GetOrderStatusResponseGetOrderStatusResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetOrderStatusResult");
    private static final QName _SetMergeOrdersOrderNumberList_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "orderNumber_list");
    private static final QName _SetMergeOrdersResponseSetMergeOrdersResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetMergeOrdersResult");
    private static final QName _GetOrderInfoDate_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "date");
    private static final QName _GetOrderInfoResponseGetOrderInfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetOrderInfoResult");
    private static final QName _GetStatusListResponseGetStatusListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetStatusListResult");
    private static final QName _GetOrderCommentResponseGetOrderCommentResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetOrderCommentResult");
    private static final QName _GetUserListResponseGetUserListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetUserListResult");
    private static final QName _SetOrderCommentComment_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "comment");
    private static final QName _SetOrderCommentResponseSetOrderCommentResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetOrderCommentResult");
    private static final QName _SetCancelDeliveryResponseSetCancelDeliveryResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetCancelDeliveryResult");
    private static final QName _SetDeliveryInfoDeliveryInfo_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "deliveryInfo");
    private static final QName _SetDeliveryInfoResponseSetDeliveryInfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetDeliveryInfoResult");
    private static final QName _GetWarehousesAddressId_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "addressId");
    private static final QName _GetWarehousesResponseGetWarehousesResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetWarehousesResult");
    private static final QName _SetToMoveParameters_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "parameters");
    private static final QName _SetToMoveResponseSetToMoveResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetToMoveResult");
    private static final QName _TireCalcResponseTireCalcResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "TireCalcResult");
    private static final QName _GetPressureSensorResponseGetPressureSensorResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetPressureSensorResult");
    private static final QName _OrderReadyToWaitResponseOrderReadyToWaitResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "OrderReadyToWaitResult");
    private static final QName _ProposeGoodsProposal_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "proposal");
    private static final QName _ProposeGoodsResponseProposeGoodsResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "ProposeGoodsResult");
    private static final QName _CreateMovementOrderNumberList_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "orderNumberList");
    private static final QName _CreateMovementResponseCreateMovementResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "CreateMovementResult");
    private static final QName _SetMovementStatusMovementNumber_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "movementNumber");
    private static final QName _SetMovementStatusResponseSetMovementStatusResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetMovementStatusResult");
    private static final QName _GetMovementListResponseGetMovementListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetMovementListResult");
    private static final QName _GetMovementInfoGuid_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "guid");
    private static final QName _GetMovementInfoResponseGetMovementInfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetMovementInfoResult");
    private static final QName _GetFastenerPage_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "page");
    private static final QName _GetFastenerResponseGetFastenerResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetFastenerResult");
    private static final QName _GetAddressListResponseGetAddressListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetAddressListResult");
    private static final QName _GetDeliveryPeriodResponseGetDeliveryPeriodResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetDeliveryPeriodResult");
    private static final QName _SetDeliveryAddressResponseSetDeliveryAddressResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetDeliveryAddressResult");
    private static final QName _SetOrderDeliveryResponseSetOrderDeliveryResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetOrderDeliveryResult");
    private static final QName _SetRemoveFromOHMarkCodeList_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "markCodeList");
    private static final QName _SetRemoveFromOHResponseSetRemoveFromOHResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetRemoveFromOHResult");
    private static final QName _SetStoRemoveFromOHVerificationCode_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "verificationCode");
    private static final QName _SetStoRemoveFromOHResponseSetStoRemoveFromOHResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetStoRemoveFromOHResult");
    private static final QName _SetMarkCodeListResponseSetMarkCodeListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetMarkCodeListResult");
    private static final QName _GetSaleInfoNumber_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "number");
    private static final QName _GetSaleInfoResponseGetSaleInfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetSaleInfoResult");
    private static final QName _GetSaleListResponseGetSaleListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetSaleListResult");
    private static final QName _GetConsumableResponseGetConsumableResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetConsumableResult");
    private static final QName _CreateConsigneeConsigneeCreateContainer_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "consigneeCreateContainer");
    private static final QName _CreateConsigneeResponseCreateConsigneeResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "CreateConsigneeResult");
    private static final QName _DeleteConsigneeResponseDeleteConsigneeResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "DeleteConsigneeResult");
    private static final QName _DeleteDeliveryAddressResponseDeleteDeliveryAddressResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "DeleteDeliveryAddressResult");
    private static final QName _GetConsigneeListResponseGetConsigneeListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetConsigneeListResult");
    private static final QName _GetPriceResponseGetPriceResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetPriceResult");
    private static final QName _GetRestResponseGetRestResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetRestResult");
    private static final QName _GetOilResponseGetOilResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetOilResult");
    private static final QName _GetStoOrderListResponseGetStoOrderListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetStoOrderListResult");
    private static final QName _GetStoOrderInfoDateTime_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "dateTime");
    private static final QName _GetStoOrderInfoOrderID_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "orderID");
    private static final QName _GetStoOrderInfoResponseGetStoOrderInfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetStoOrderInfoResult");
    private static final QName _GetMX3ListResponseGetMX3ListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetMX3ListResult");
    private static final QName _GetMX3InfoResponseGetMX3InfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetMX3InfoResult");
    private static final QName _GetMX1ListResponseGetMX1ListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetMX1ListResult");
    private static final QName _GetMX1InfoResponseGetMX1InfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetMX1InfoResult");
    private static final QName _GetTKTerminalListResponseGetTKTerminalListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetTKTerminalListResult");
    private static final QName _GetTKTerminalPriceResponseGetTKTerminalPriceResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetTKTerminalPriceResult");
    private static final QName _SetOrderDeliveryByTKResponseSetOrderDeliveryByTKResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetOrderDeliveryByTKResult");
    private static final QName _GetPurchaseReturnListResponseGetPurchaseReturnListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetPurchaseReturnListResult");
    private static final QName _GetPurchaseReturnInfoResponseGetPurchaseReturnInfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetPurchaseReturnInfoResult");
    private static final QName _GetRtuCorrectionListResponseGetRtuCorrectionListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetRtuCorrectionListResult");
    private static final QName _GetRtuCorrectionInfoResponseGetRtuCorrectionInfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetRtuCorrectionInfoResult");
    private static final QName _SetWorkCompletedCode_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "code");
    private static final QName _SetWorkCompletedResponseSetWorkCompletedResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetWorkCompletedResult");
    private static final QName _SendPaymentToPhoneResponseSendPaymentToPhoneResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SendPaymentToPhoneResult");
    private static final QName _SetReturnToOHProductList_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "productList");
    private static final QName _SetReturnToOHResponseSetReturnToOHResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetReturnToOHResult");
    private static final QName _GetPrintableUpdResponseGetPrintableUpdResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetPrintableUpdResult");
    private static final QName _SendVerificationCodeResponseSendVerificationCodeResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SendVerificationCodeResult");
    private static final QName _CheckVerificationCodeResponseCheckVerificationCodeResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "CheckVerificationCodeResult");
    private static final QName _SetStoDeclineServicesResponseSetStoDeclineServicesResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetStoDeclineServicesResult");
    private static final QName _GetFindCameraResponseGetFindCameraResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetFindCameraResult");
    private static final QName _PutDeliveryAddressResponsePutDeliveryAddressResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "PutDeliveryAddressResult");
    private static final QName _SetSupplierPriceResponseSetSupplierPriceResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetSupplierPriceResult");
    private static final QName _GetSupplierPriceCodeList_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "codeList");
    private static final QName _GetSupplierPriceResponseGetSupplierPriceResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetSupplierPriceResult");
    private static final QName _GetOrderListResponseGetOrderListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetOrderListResult");
    private static final QName _GetOrderInfo2ResponseGetOrderInfo2Result_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetOrderInfo2Result");
    private static final QName _GetReMarkingDocumentResponseGetReMarkingDocumentResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetReMarkingDocumentResult");
    private static final QName _GetReMarkingDocumentListResponseGetReMarkingDocumentListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetReMarkingDocumentListResult");
    private static final QName _SetReMarkingDocumentResponseSetReMarkingDocumentResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetReMarkingDocumentResult");
    private static final QName _GetFindWheelResponseGetFindWheelResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetFindWheelResult");
    private static final QName _CheckVerificationCodeByQRCodeQrCode_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "qrCode");
    private static final QName _CheckVerificationCodeByQRCodeResponseCheckVerificationCodeByQRCodeResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "CheckVerificationCodeByQRCodeResult");
    private static final QName _GetInventoryListResponseGetInventoryListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetInventoryListResult");
    private static final QName _GetInventoryInfoResponseGetInventoryInfoResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetInventoryInfoResult");
    private static final QName _GetAvailableWarehousesForInventoryResponseGetAvailableWarehousesForInventoryResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetAvailableWarehousesForInventoryResult");
    private static final QName _CreateInventoryScannerType_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "scannerType");
    private static final QName _CreateInventoryResponseCreateInventoryResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "CreateInventoryResult");
    private static final QName _CancelInventoryResponseCancelInventoryResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "CancelInventoryResult");
    private static final QName _SaveInventoryResponsiblePerson_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "responsiblePerson");
    private static final QName _SaveInventoryResponseSaveInventoryResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SaveInventoryResult");
    private static final QName _FinishInventoryResponseFinishInventoryResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "FinishInventoryResult");
    private static final QName _CheckInventoryMarkCodeMarkCodeString_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "markCodeString");
    private static final QName _CheckInventoryMarkCodeResponseCheckInventoryMarkCodeResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "CheckInventoryMarkCodeResult");
    private static final QName _SetOrderUpdateResponseSetOrderUpdateResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetOrderUpdateResult");
    private static final QName _GetOrderCustomerListResponseGetOrderCustomerListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetOrderCustomerListResult");
    private static final QName _GetCustomerListResponseGetCustomerListResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "GetCustomerListResult");
    private static final QName _SetMoveServicesToNewOrderResponseSetMoveServicesToNewOrderResult_QNAME = new QName("Wcf.ClientService.Client.WebAPI.TS3", "SetMoveServicesToNewOrderResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ts3.webapi.client.clientservice.wcf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFindTyre }
     * 
     * @return
     *     the new instance of {@link GetFindTyre }
     */
    public GetFindTyre createGetFindTyre() {
        return new GetFindTyre();
    }

    /**
     * Create an instance of {@link GetFindTyreResponse }
     * 
     * @return
     *     the new instance of {@link GetFindTyreResponse }
     */
    public GetFindTyreResponse createGetFindTyreResponse() {
        return new GetFindTyreResponse();
    }

    /**
     * Create an instance of {@link GetFindDisk }
     * 
     * @return
     *     the new instance of {@link GetFindDisk }
     */
    public GetFindDisk createGetFindDisk() {
        return new GetFindDisk();
    }

    /**
     * Create an instance of {@link GetFindDiskResponse }
     * 
     * @return
     *     the new instance of {@link GetFindDiskResponse }
     */
    public GetFindDiskResponse createGetFindDiskResponse() {
        return new GetFindDiskResponse();
    }

    /**
     * Create an instance of {@link GetGoodsPriceRestByCode }
     * 
     * @return
     *     the new instance of {@link GetGoodsPriceRestByCode }
     */
    public GetGoodsPriceRestByCode createGetGoodsPriceRestByCode() {
        return new GetGoodsPriceRestByCode();
    }

    /**
     * Create an instance of {@link GetGoodsPriceRestByCodeResponse }
     * 
     * @return
     *     the new instance of {@link GetGoodsPriceRestByCodeResponse }
     */
    public GetGoodsPriceRestByCodeResponse createGetGoodsPriceRestByCodeResponse() {
        return new GetGoodsPriceRestByCodeResponse();
    }

    /**
     * Create an instance of {@link GetGoodsInfo }
     * 
     * @return
     *     the new instance of {@link GetGoodsInfo }
     */
    public GetGoodsInfo createGetGoodsInfo() {
        return new GetGoodsInfo();
    }

    /**
     * Create an instance of {@link GetGoodsInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetGoodsInfoResponse }
     */
    public GetGoodsInfoResponse createGetGoodsInfoResponse() {
        return new GetGoodsInfoResponse();
    }

    /**
     * Create an instance of {@link GetGoodsByCar }
     * 
     * @return
     *     the new instance of {@link GetGoodsByCar }
     */
    public GetGoodsByCar createGetGoodsByCar() {
        return new GetGoodsByCar();
    }

    /**
     * Create an instance of {@link GetGoodsByCarResponse }
     * 
     * @return
     *     the new instance of {@link GetGoodsByCarResponse }
     */
    public GetGoodsByCarResponse createGetGoodsByCarResponse() {
        return new GetGoodsByCarResponse();
    }

    /**
     * Create an instance of {@link GetMarkaAvto }
     * 
     * @return
     *     the new instance of {@link GetMarkaAvto }
     */
    public GetMarkaAvto createGetMarkaAvto() {
        return new GetMarkaAvto();
    }

    /**
     * Create an instance of {@link GetMarkaAvtoResponse }
     * 
     * @return
     *     the new instance of {@link GetMarkaAvtoResponse }
     */
    public GetMarkaAvtoResponse createGetMarkaAvtoResponse() {
        return new GetMarkaAvtoResponse();
    }

    /**
     * Create an instance of {@link ts3.webapi.client.clientservice.wcf.GetModelAvto }
     * 
     * @return
     *     the new instance of {@link ts3.webapi.client.clientservice.wcf.GetModelAvto }
     */
    public ts3.webapi.client.clientservice.wcf.GetModelAvto createGetModelAvto() {
        return new ts3.webapi.client.clientservice.wcf.GetModelAvto();
    }

    /**
     * Create an instance of {@link GetModelAvtoResponse }
     * 
     * @return
     *     the new instance of {@link GetModelAvtoResponse }
     */
    public GetModelAvtoResponse createGetModelAvtoResponse() {
        return new GetModelAvtoResponse();
    }

    /**
     * Create an instance of {@link ts3.webapi.client.clientservice.wcf.GetYearAvto }
     * 
     * @return
     *     the new instance of {@link ts3.webapi.client.clientservice.wcf.GetYearAvto }
     */
    public ts3.webapi.client.clientservice.wcf.GetYearAvto createGetYearAvto() {
        return new ts3.webapi.client.clientservice.wcf.GetYearAvto();
    }

    /**
     * Create an instance of {@link GetYearAvtoResponse }
     * 
     * @return
     *     the new instance of {@link GetYearAvtoResponse }
     */
    public GetYearAvtoResponse createGetYearAvtoResponse() {
        return new GetYearAvtoResponse();
    }

    /**
     * Create an instance of {@link ts3.webapi.client.clientservice.wcf.GetModificationAvto }
     * 
     * @return
     *     the new instance of {@link ts3.webapi.client.clientservice.wcf.GetModificationAvto }
     */
    public ts3.webapi.client.clientservice.wcf.GetModificationAvto createGetModificationAvto() {
        return new ts3.webapi.client.clientservice.wcf.GetModificationAvto();
    }

    /**
     * Create an instance of {@link GetModificationAvtoResponse }
     * 
     * @return
     *     the new instance of {@link GetModificationAvtoResponse }
     */
    public GetModificationAvtoResponse createGetModificationAvtoResponse() {
        return new GetModificationAvtoResponse();
    }

    /**
     * Create an instance of {@link SetRest }
     * 
     * @return
     *     the new instance of {@link SetRest }
     */
    public SetRest createSetRest() {
        return new SetRest();
    }

    /**
     * Create an instance of {@link SetRestResponse }
     * 
     * @return
     *     the new instance of {@link SetRestResponse }
     */
    public SetRestResponse createSetRestResponse() {
        return new SetRestResponse();
    }

    /**
     * Create an instance of {@link SetPrice }
     * 
     * @return
     *     the new instance of {@link SetPrice }
     */
    public SetPrice createSetPrice() {
        return new SetPrice();
    }

    /**
     * Create an instance of {@link SetPriceResponse }
     * 
     * @return
     *     the new instance of {@link SetPriceResponse }
     */
    public SetPriceResponse createSetPriceResponse() {
        return new SetPriceResponse();
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     * @return
     *     the new instance of {@link CreateOrder }
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     * @return
     *     the new instance of {@link CreateOrderResponse }
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link CreateMarketplaceOrder }
     * 
     * @return
     *     the new instance of {@link CreateMarketplaceOrder }
     */
    public CreateMarketplaceOrder createCreateMarketplaceOrder() {
        return new CreateMarketplaceOrder();
    }

    /**
     * Create an instance of {@link CreateMarketplaceOrderResponse }
     * 
     * @return
     *     the new instance of {@link CreateMarketplaceOrderResponse }
     */
    public CreateMarketplaceOrderResponse createCreateMarketplaceOrderResponse() {
        return new CreateMarketplaceOrderResponse();
    }

    /**
     * Create an instance of {@link GetChangeOrder }
     * 
     * @return
     *     the new instance of {@link GetChangeOrder }
     */
    public GetChangeOrder createGetChangeOrder() {
        return new GetChangeOrder();
    }

    /**
     * Create an instance of {@link GetChangeOrderResponse }
     * 
     * @return
     *     the new instance of {@link GetChangeOrderResponse }
     */
    public GetChangeOrderResponse createGetChangeOrderResponse() {
        return new GetChangeOrderResponse();
    }

    /**
     * Create an instance of {@link SetOrderStatus }
     * 
     * @return
     *     the new instance of {@link SetOrderStatus }
     */
    public SetOrderStatus createSetOrderStatus() {
        return new SetOrderStatus();
    }

    /**
     * Create an instance of {@link SetOrderStatusResponse }
     * 
     * @return
     *     the new instance of {@link SetOrderStatusResponse }
     */
    public SetOrderStatusResponse createSetOrderStatusResponse() {
        return new SetOrderStatusResponse();
    }

    /**
     * Create an instance of {@link SetOrderStatusSatellite }
     * 
     * @return
     *     the new instance of {@link SetOrderStatusSatellite }
     */
    public SetOrderStatusSatellite createSetOrderStatusSatellite() {
        return new SetOrderStatusSatellite();
    }

    /**
     * Create an instance of {@link SetOrderStatusSatelliteResponse }
     * 
     * @return
     *     the new instance of {@link SetOrderStatusSatelliteResponse }
     */
    public SetOrderStatusSatelliteResponse createSetOrderStatusSatelliteResponse() {
        return new SetOrderStatusSatelliteResponse();
    }

    /**
     * Create an instance of {@link GetOrderStatus }
     * 
     * @return
     *     the new instance of {@link GetOrderStatus }
     */
    public GetOrderStatus createGetOrderStatus() {
        return new GetOrderStatus();
    }

    /**
     * Create an instance of {@link GetOrderStatusResponse }
     * 
     * @return
     *     the new instance of {@link GetOrderStatusResponse }
     */
    public GetOrderStatusResponse createGetOrderStatusResponse() {
        return new GetOrderStatusResponse();
    }

    /**
     * Create an instance of {@link SetMergeOrders }
     * 
     * @return
     *     the new instance of {@link SetMergeOrders }
     */
    public SetMergeOrders createSetMergeOrders() {
        return new SetMergeOrders();
    }

    /**
     * Create an instance of {@link SetMergeOrdersResponse }
     * 
     * @return
     *     the new instance of {@link SetMergeOrdersResponse }
     */
    public SetMergeOrdersResponse createSetMergeOrdersResponse() {
        return new SetMergeOrdersResponse();
    }

    /**
     * Create an instance of {@link GetOrderInfo }
     * 
     * @return
     *     the new instance of {@link GetOrderInfo }
     */
    public GetOrderInfo createGetOrderInfo() {
        return new GetOrderInfo();
    }

    /**
     * Create an instance of {@link GetOrderInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetOrderInfoResponse }
     */
    public GetOrderInfoResponse createGetOrderInfoResponse() {
        return new GetOrderInfoResponse();
    }

    /**
     * Create an instance of {@link GetStatusList }
     * 
     * @return
     *     the new instance of {@link GetStatusList }
     */
    public GetStatusList createGetStatusList() {
        return new GetStatusList();
    }

    /**
     * Create an instance of {@link GetStatusListResponse }
     * 
     * @return
     *     the new instance of {@link GetStatusListResponse }
     */
    public GetStatusListResponse createGetStatusListResponse() {
        return new GetStatusListResponse();
    }

    /**
     * Create an instance of {@link GetOrderComment }
     * 
     * @return
     *     the new instance of {@link GetOrderComment }
     */
    public GetOrderComment createGetOrderComment() {
        return new GetOrderComment();
    }

    /**
     * Create an instance of {@link GetOrderCommentResponse }
     * 
     * @return
     *     the new instance of {@link GetOrderCommentResponse }
     */
    public GetOrderCommentResponse createGetOrderCommentResponse() {
        return new GetOrderCommentResponse();
    }

    /**
     * Create an instance of {@link GetUserList }
     * 
     * @return
     *     the new instance of {@link GetUserList }
     */
    public GetUserList createGetUserList() {
        return new GetUserList();
    }

    /**
     * Create an instance of {@link GetUserListResponse }
     * 
     * @return
     *     the new instance of {@link GetUserListResponse }
     */
    public GetUserListResponse createGetUserListResponse() {
        return new GetUserListResponse();
    }

    /**
     * Create an instance of {@link SetOrderComment }
     * 
     * @return
     *     the new instance of {@link SetOrderComment }
     */
    public SetOrderComment createSetOrderComment() {
        return new SetOrderComment();
    }

    /**
     * Create an instance of {@link SetOrderCommentResponse }
     * 
     * @return
     *     the new instance of {@link SetOrderCommentResponse }
     */
    public SetOrderCommentResponse createSetOrderCommentResponse() {
        return new SetOrderCommentResponse();
    }

    /**
     * Create an instance of {@link SetCancelDelivery }
     * 
     * @return
     *     the new instance of {@link SetCancelDelivery }
     */
    public SetCancelDelivery createSetCancelDelivery() {
        return new SetCancelDelivery();
    }

    /**
     * Create an instance of {@link SetCancelDeliveryResponse }
     * 
     * @return
     *     the new instance of {@link SetCancelDeliveryResponse }
     */
    public SetCancelDeliveryResponse createSetCancelDeliveryResponse() {
        return new SetCancelDeliveryResponse();
    }

    /**
     * Create an instance of {@link SetDeliveryInfo }
     * 
     * @return
     *     the new instance of {@link SetDeliveryInfo }
     */
    public SetDeliveryInfo createSetDeliveryInfo() {
        return new SetDeliveryInfo();
    }

    /**
     * Create an instance of {@link SetDeliveryInfoResponse }
     * 
     * @return
     *     the new instance of {@link SetDeliveryInfoResponse }
     */
    public SetDeliveryInfoResponse createSetDeliveryInfoResponse() {
        return new SetDeliveryInfoResponse();
    }

    /**
     * Create an instance of {@link GetWarehouses }
     * 
     * @return
     *     the new instance of {@link GetWarehouses }
     */
    public GetWarehouses createGetWarehouses() {
        return new GetWarehouses();
    }

    /**
     * Create an instance of {@link GetWarehousesResponse }
     * 
     * @return
     *     the new instance of {@link GetWarehousesResponse }
     */
    public GetWarehousesResponse createGetWarehousesResponse() {
        return new GetWarehousesResponse();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     * @return
     *     the new instance of {@link Ping }
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     * @return
     *     the new instance of {@link PingResponse }
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link SetToMove }
     * 
     * @return
     *     the new instance of {@link SetToMove }
     */
    public SetToMove createSetToMove() {
        return new SetToMove();
    }

    /**
     * Create an instance of {@link SetToMoveResponse }
     * 
     * @return
     *     the new instance of {@link SetToMoveResponse }
     */
    public SetToMoveResponse createSetToMoveResponse() {
        return new SetToMoveResponse();
    }

    /**
     * Create an instance of {@link TireCalc }
     * 
     * @return
     *     the new instance of {@link TireCalc }
     */
    public TireCalc createTireCalc() {
        return new TireCalc();
    }

    /**
     * Create an instance of {@link TireCalcResponse }
     * 
     * @return
     *     the new instance of {@link TireCalcResponse }
     */
    public TireCalcResponse createTireCalcResponse() {
        return new TireCalcResponse();
    }

    /**
     * Create an instance of {@link GetPressureSensor }
     * 
     * @return
     *     the new instance of {@link GetPressureSensor }
     */
    public GetPressureSensor createGetPressureSensor() {
        return new GetPressureSensor();
    }

    /**
     * Create an instance of {@link GetPressureSensorResponse }
     * 
     * @return
     *     the new instance of {@link GetPressureSensorResponse }
     */
    public GetPressureSensorResponse createGetPressureSensorResponse() {
        return new GetPressureSensorResponse();
    }

    /**
     * Create an instance of {@link OrderReadyToWait }
     * 
     * @return
     *     the new instance of {@link OrderReadyToWait }
     */
    public OrderReadyToWait createOrderReadyToWait() {
        return new OrderReadyToWait();
    }

    /**
     * Create an instance of {@link OrderReadyToWaitResponse }
     * 
     * @return
     *     the new instance of {@link OrderReadyToWaitResponse }
     */
    public OrderReadyToWaitResponse createOrderReadyToWaitResponse() {
        return new OrderReadyToWaitResponse();
    }

    /**
     * Create an instance of {@link ProposeGoods }
     * 
     * @return
     *     the new instance of {@link ProposeGoods }
     */
    public ProposeGoods createProposeGoods() {
        return new ProposeGoods();
    }

    /**
     * Create an instance of {@link ProposeGoodsResponse }
     * 
     * @return
     *     the new instance of {@link ProposeGoodsResponse }
     */
    public ProposeGoodsResponse createProposeGoodsResponse() {
        return new ProposeGoodsResponse();
    }

    /**
     * Create an instance of {@link CreateMovement }
     * 
     * @return
     *     the new instance of {@link CreateMovement }
     */
    public CreateMovement createCreateMovement() {
        return new CreateMovement();
    }

    /**
     * Create an instance of {@link CreateMovementResponse }
     * 
     * @return
     *     the new instance of {@link CreateMovementResponse }
     */
    public CreateMovementResponse createCreateMovementResponse() {
        return new CreateMovementResponse();
    }

    /**
     * Create an instance of {@link SetMovementStatus }
     * 
     * @return
     *     the new instance of {@link SetMovementStatus }
     */
    public SetMovementStatus createSetMovementStatus() {
        return new SetMovementStatus();
    }

    /**
     * Create an instance of {@link SetMovementStatusResponse }
     * 
     * @return
     *     the new instance of {@link SetMovementStatusResponse }
     */
    public SetMovementStatusResponse createSetMovementStatusResponse() {
        return new SetMovementStatusResponse();
    }

    /**
     * Create an instance of {@link GetMovementList }
     * 
     * @return
     *     the new instance of {@link GetMovementList }
     */
    public GetMovementList createGetMovementList() {
        return new GetMovementList();
    }

    /**
     * Create an instance of {@link GetMovementListResponse }
     * 
     * @return
     *     the new instance of {@link GetMovementListResponse }
     */
    public GetMovementListResponse createGetMovementListResponse() {
        return new GetMovementListResponse();
    }

    /**
     * Create an instance of {@link GetMovementInfo }
     * 
     * @return
     *     the new instance of {@link GetMovementInfo }
     */
    public GetMovementInfo createGetMovementInfo() {
        return new GetMovementInfo();
    }

    /**
     * Create an instance of {@link GetMovementInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetMovementInfoResponse }
     */
    public GetMovementInfoResponse createGetMovementInfoResponse() {
        return new GetMovementInfoResponse();
    }

    /**
     * Create an instance of {@link GetFastener }
     * 
     * @return
     *     the new instance of {@link GetFastener }
     */
    public GetFastener createGetFastener() {
        return new GetFastener();
    }

    /**
     * Create an instance of {@link GetFastenerResponse }
     * 
     * @return
     *     the new instance of {@link GetFastenerResponse }
     */
    public GetFastenerResponse createGetFastenerResponse() {
        return new GetFastenerResponse();
    }

    /**
     * Create an instance of {@link GetAddressList }
     * 
     * @return
     *     the new instance of {@link GetAddressList }
     */
    public GetAddressList createGetAddressList() {
        return new GetAddressList();
    }

    /**
     * Create an instance of {@link GetAddressListResponse }
     * 
     * @return
     *     the new instance of {@link GetAddressListResponse }
     */
    public GetAddressListResponse createGetAddressListResponse() {
        return new GetAddressListResponse();
    }

    /**
     * Create an instance of {@link GetDeliveryPeriod }
     * 
     * @return
     *     the new instance of {@link GetDeliveryPeriod }
     */
    public GetDeliveryPeriod createGetDeliveryPeriod() {
        return new GetDeliveryPeriod();
    }

    /**
     * Create an instance of {@link GetDeliveryPeriodResponse }
     * 
     * @return
     *     the new instance of {@link GetDeliveryPeriodResponse }
     */
    public GetDeliveryPeriodResponse createGetDeliveryPeriodResponse() {
        return new GetDeliveryPeriodResponse();
    }

    /**
     * Create an instance of {@link SetDeliveryAddress }
     * 
     * @return
     *     the new instance of {@link SetDeliveryAddress }
     */
    public SetDeliveryAddress createSetDeliveryAddress() {
        return new SetDeliveryAddress();
    }

    /**
     * Create an instance of {@link SetDeliveryAddressResponse }
     * 
     * @return
     *     the new instance of {@link SetDeliveryAddressResponse }
     */
    public SetDeliveryAddressResponse createSetDeliveryAddressResponse() {
        return new SetDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link SetOrderDelivery }
     * 
     * @return
     *     the new instance of {@link SetOrderDelivery }
     */
    public SetOrderDelivery createSetOrderDelivery() {
        return new SetOrderDelivery();
    }

    /**
     * Create an instance of {@link SetOrderDeliveryResponse }
     * 
     * @return
     *     the new instance of {@link SetOrderDeliveryResponse }
     */
    public SetOrderDeliveryResponse createSetOrderDeliveryResponse() {
        return new SetOrderDeliveryResponse();
    }

    /**
     * Create an instance of {@link SetRemoveFromOH }
     * 
     * @return
     *     the new instance of {@link SetRemoveFromOH }
     */
    public SetRemoveFromOH createSetRemoveFromOH() {
        return new SetRemoveFromOH();
    }

    /**
     * Create an instance of {@link SetRemoveFromOHResponse }
     * 
     * @return
     *     the new instance of {@link SetRemoveFromOHResponse }
     */
    public SetRemoveFromOHResponse createSetRemoveFromOHResponse() {
        return new SetRemoveFromOHResponse();
    }

    /**
     * Create an instance of {@link SetStoRemoveFromOH }
     * 
     * @return
     *     the new instance of {@link SetStoRemoveFromOH }
     */
    public SetStoRemoveFromOH createSetStoRemoveFromOH() {
        return new SetStoRemoveFromOH();
    }

    /**
     * Create an instance of {@link SetStoRemoveFromOHResponse }
     * 
     * @return
     *     the new instance of {@link SetStoRemoveFromOHResponse }
     */
    public SetStoRemoveFromOHResponse createSetStoRemoveFromOHResponse() {
        return new SetStoRemoveFromOHResponse();
    }

    /**
     * Create an instance of {@link SetMarkCodeList }
     * 
     * @return
     *     the new instance of {@link SetMarkCodeList }
     */
    public SetMarkCodeList createSetMarkCodeList() {
        return new SetMarkCodeList();
    }

    /**
     * Create an instance of {@link SetMarkCodeListResponse }
     * 
     * @return
     *     the new instance of {@link SetMarkCodeListResponse }
     */
    public SetMarkCodeListResponse createSetMarkCodeListResponse() {
        return new SetMarkCodeListResponse();
    }

    /**
     * Create an instance of {@link GetSaleInfo }
     * 
     * @return
     *     the new instance of {@link GetSaleInfo }
     */
    public GetSaleInfo createGetSaleInfo() {
        return new GetSaleInfo();
    }

    /**
     * Create an instance of {@link GetSaleInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetSaleInfoResponse }
     */
    public GetSaleInfoResponse createGetSaleInfoResponse() {
        return new GetSaleInfoResponse();
    }

    /**
     * Create an instance of {@link GetSaleList }
     * 
     * @return
     *     the new instance of {@link GetSaleList }
     */
    public GetSaleList createGetSaleList() {
        return new GetSaleList();
    }

    /**
     * Create an instance of {@link GetSaleListResponse }
     * 
     * @return
     *     the new instance of {@link GetSaleListResponse }
     */
    public GetSaleListResponse createGetSaleListResponse() {
        return new GetSaleListResponse();
    }

    /**
     * Create an instance of {@link GetConsumable }
     * 
     * @return
     *     the new instance of {@link GetConsumable }
     */
    public GetConsumable createGetConsumable() {
        return new GetConsumable();
    }

    /**
     * Create an instance of {@link GetConsumableResponse }
     * 
     * @return
     *     the new instance of {@link GetConsumableResponse }
     */
    public GetConsumableResponse createGetConsumableResponse() {
        return new GetConsumableResponse();
    }

    /**
     * Create an instance of {@link CreateConsignee }
     * 
     * @return
     *     the new instance of {@link CreateConsignee }
     */
    public CreateConsignee createCreateConsignee() {
        return new CreateConsignee();
    }

    /**
     * Create an instance of {@link CreateConsigneeResponse }
     * 
     * @return
     *     the new instance of {@link CreateConsigneeResponse }
     */
    public CreateConsigneeResponse createCreateConsigneeResponse() {
        return new CreateConsigneeResponse();
    }

    /**
     * Create an instance of {@link DeleteConsignee }
     * 
     * @return
     *     the new instance of {@link DeleteConsignee }
     */
    public DeleteConsignee createDeleteConsignee() {
        return new DeleteConsignee();
    }

    /**
     * Create an instance of {@link DeleteConsigneeResponse }
     * 
     * @return
     *     the new instance of {@link DeleteConsigneeResponse }
     */
    public DeleteConsigneeResponse createDeleteConsigneeResponse() {
        return new DeleteConsigneeResponse();
    }

    /**
     * Create an instance of {@link DeleteDeliveryAddress }
     * 
     * @return
     *     the new instance of {@link DeleteDeliveryAddress }
     */
    public DeleteDeliveryAddress createDeleteDeliveryAddress() {
        return new DeleteDeliveryAddress();
    }

    /**
     * Create an instance of {@link DeleteDeliveryAddressResponse }
     * 
     * @return
     *     the new instance of {@link DeleteDeliveryAddressResponse }
     */
    public DeleteDeliveryAddressResponse createDeleteDeliveryAddressResponse() {
        return new DeleteDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link GetConsigneeList }
     * 
     * @return
     *     the new instance of {@link GetConsigneeList }
     */
    public GetConsigneeList createGetConsigneeList() {
        return new GetConsigneeList();
    }

    /**
     * Create an instance of {@link GetConsigneeListResponse }
     * 
     * @return
     *     the new instance of {@link GetConsigneeListResponse }
     */
    public GetConsigneeListResponse createGetConsigneeListResponse() {
        return new GetConsigneeListResponse();
    }

    /**
     * Create an instance of {@link GetPrice }
     * 
     * @return
     *     the new instance of {@link GetPrice }
     */
    public GetPrice createGetPrice() {
        return new GetPrice();
    }

    /**
     * Create an instance of {@link GetPriceResponse }
     * 
     * @return
     *     the new instance of {@link GetPriceResponse }
     */
    public GetPriceResponse createGetPriceResponse() {
        return new GetPriceResponse();
    }

    /**
     * Create an instance of {@link GetRest }
     * 
     * @return
     *     the new instance of {@link GetRest }
     */
    public GetRest createGetRest() {
        return new GetRest();
    }

    /**
     * Create an instance of {@link GetRestResponse }
     * 
     * @return
     *     the new instance of {@link GetRestResponse }
     */
    public GetRestResponse createGetRestResponse() {
        return new GetRestResponse();
    }

    /**
     * Create an instance of {@link GetOil }
     * 
     * @return
     *     the new instance of {@link GetOil }
     */
    public GetOil createGetOil() {
        return new GetOil();
    }

    /**
     * Create an instance of {@link GetOilResponse }
     * 
     * @return
     *     the new instance of {@link GetOilResponse }
     */
    public GetOilResponse createGetOilResponse() {
        return new GetOilResponse();
    }

    /**
     * Create an instance of {@link GetStoOrderList }
     * 
     * @return
     *     the new instance of {@link GetStoOrderList }
     */
    public GetStoOrderList createGetStoOrderList() {
        return new GetStoOrderList();
    }

    /**
     * Create an instance of {@link GetStoOrderListResponse }
     * 
     * @return
     *     the new instance of {@link GetStoOrderListResponse }
     */
    public GetStoOrderListResponse createGetStoOrderListResponse() {
        return new GetStoOrderListResponse();
    }

    /**
     * Create an instance of {@link GetStoOrderInfo }
     * 
     * @return
     *     the new instance of {@link GetStoOrderInfo }
     */
    public GetStoOrderInfo createGetStoOrderInfo() {
        return new GetStoOrderInfo();
    }

    /**
     * Create an instance of {@link GetStoOrderInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetStoOrderInfoResponse }
     */
    public GetStoOrderInfoResponse createGetStoOrderInfoResponse() {
        return new GetStoOrderInfoResponse();
    }

    /**
     * Create an instance of {@link GetMX3List }
     * 
     * @return
     *     the new instance of {@link GetMX3List }
     */
    public GetMX3List createGetMX3List() {
        return new GetMX3List();
    }

    /**
     * Create an instance of {@link GetMX3ListResponse }
     * 
     * @return
     *     the new instance of {@link GetMX3ListResponse }
     */
    public GetMX3ListResponse createGetMX3ListResponse() {
        return new GetMX3ListResponse();
    }

    /**
     * Create an instance of {@link GetMX3Info }
     * 
     * @return
     *     the new instance of {@link GetMX3Info }
     */
    public GetMX3Info createGetMX3Info() {
        return new GetMX3Info();
    }

    /**
     * Create an instance of {@link GetMX3InfoResponse }
     * 
     * @return
     *     the new instance of {@link GetMX3InfoResponse }
     */
    public GetMX3InfoResponse createGetMX3InfoResponse() {
        return new GetMX3InfoResponse();
    }

    /**
     * Create an instance of {@link GetMX1List }
     * 
     * @return
     *     the new instance of {@link GetMX1List }
     */
    public GetMX1List createGetMX1List() {
        return new GetMX1List();
    }

    /**
     * Create an instance of {@link GetMX1ListResponse }
     * 
     * @return
     *     the new instance of {@link GetMX1ListResponse }
     */
    public GetMX1ListResponse createGetMX1ListResponse() {
        return new GetMX1ListResponse();
    }

    /**
     * Create an instance of {@link GetMX1Info }
     * 
     * @return
     *     the new instance of {@link GetMX1Info }
     */
    public GetMX1Info createGetMX1Info() {
        return new GetMX1Info();
    }

    /**
     * Create an instance of {@link GetMX1InfoResponse }
     * 
     * @return
     *     the new instance of {@link GetMX1InfoResponse }
     */
    public GetMX1InfoResponse createGetMX1InfoResponse() {
        return new GetMX1InfoResponse();
    }

    /**
     * Create an instance of {@link GetTKTerminalList }
     * 
     * @return
     *     the new instance of {@link GetTKTerminalList }
     */
    public GetTKTerminalList createGetTKTerminalList() {
        return new GetTKTerminalList();
    }

    /**
     * Create an instance of {@link GetTKTerminalListResponse }
     * 
     * @return
     *     the new instance of {@link GetTKTerminalListResponse }
     */
    public GetTKTerminalListResponse createGetTKTerminalListResponse() {
        return new GetTKTerminalListResponse();
    }

    /**
     * Create an instance of {@link GetTKTerminalPrice }
     * 
     * @return
     *     the new instance of {@link GetTKTerminalPrice }
     */
    public GetTKTerminalPrice createGetTKTerminalPrice() {
        return new GetTKTerminalPrice();
    }

    /**
     * Create an instance of {@link GetTKTerminalPriceResponse }
     * 
     * @return
     *     the new instance of {@link GetTKTerminalPriceResponse }
     */
    public GetTKTerminalPriceResponse createGetTKTerminalPriceResponse() {
        return new GetTKTerminalPriceResponse();
    }

    /**
     * Create an instance of {@link SetOrderDeliveryByTK }
     * 
     * @return
     *     the new instance of {@link SetOrderDeliveryByTK }
     */
    public SetOrderDeliveryByTK createSetOrderDeliveryByTK() {
        return new SetOrderDeliveryByTK();
    }

    /**
     * Create an instance of {@link SetOrderDeliveryByTKResponse }
     * 
     * @return
     *     the new instance of {@link SetOrderDeliveryByTKResponse }
     */
    public SetOrderDeliveryByTKResponse createSetOrderDeliveryByTKResponse() {
        return new SetOrderDeliveryByTKResponse();
    }

    /**
     * Create an instance of {@link GetPurchaseReturnList }
     * 
     * @return
     *     the new instance of {@link GetPurchaseReturnList }
     */
    public GetPurchaseReturnList createGetPurchaseReturnList() {
        return new GetPurchaseReturnList();
    }

    /**
     * Create an instance of {@link GetPurchaseReturnListResponse }
     * 
     * @return
     *     the new instance of {@link GetPurchaseReturnListResponse }
     */
    public GetPurchaseReturnListResponse createGetPurchaseReturnListResponse() {
        return new GetPurchaseReturnListResponse();
    }

    /**
     * Create an instance of {@link GetPurchaseReturnInfo }
     * 
     * @return
     *     the new instance of {@link GetPurchaseReturnInfo }
     */
    public GetPurchaseReturnInfo createGetPurchaseReturnInfo() {
        return new GetPurchaseReturnInfo();
    }

    /**
     * Create an instance of {@link GetPurchaseReturnInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetPurchaseReturnInfoResponse }
     */
    public GetPurchaseReturnInfoResponse createGetPurchaseReturnInfoResponse() {
        return new GetPurchaseReturnInfoResponse();
    }

    /**
     * Create an instance of {@link GetRtuCorrectionList }
     * 
     * @return
     *     the new instance of {@link GetRtuCorrectionList }
     */
    public GetRtuCorrectionList createGetRtuCorrectionList() {
        return new GetRtuCorrectionList();
    }

    /**
     * Create an instance of {@link GetRtuCorrectionListResponse }
     * 
     * @return
     *     the new instance of {@link GetRtuCorrectionListResponse }
     */
    public GetRtuCorrectionListResponse createGetRtuCorrectionListResponse() {
        return new GetRtuCorrectionListResponse();
    }

    /**
     * Create an instance of {@link GetRtuCorrectionInfo }
     * 
     * @return
     *     the new instance of {@link GetRtuCorrectionInfo }
     */
    public GetRtuCorrectionInfo createGetRtuCorrectionInfo() {
        return new GetRtuCorrectionInfo();
    }

    /**
     * Create an instance of {@link GetRtuCorrectionInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetRtuCorrectionInfoResponse }
     */
    public GetRtuCorrectionInfoResponse createGetRtuCorrectionInfoResponse() {
        return new GetRtuCorrectionInfoResponse();
    }

    /**
     * Create an instance of {@link SetWorkCompleted }
     * 
     * @return
     *     the new instance of {@link SetWorkCompleted }
     */
    public SetWorkCompleted createSetWorkCompleted() {
        return new SetWorkCompleted();
    }

    /**
     * Create an instance of {@link SetWorkCompletedResponse }
     * 
     * @return
     *     the new instance of {@link SetWorkCompletedResponse }
     */
    public SetWorkCompletedResponse createSetWorkCompletedResponse() {
        return new SetWorkCompletedResponse();
    }

    /**
     * Create an instance of {@link SendPaymentToPhone }
     * 
     * @return
     *     the new instance of {@link SendPaymentToPhone }
     */
    public SendPaymentToPhone createSendPaymentToPhone() {
        return new SendPaymentToPhone();
    }

    /**
     * Create an instance of {@link SendPaymentToPhoneResponse }
     * 
     * @return
     *     the new instance of {@link SendPaymentToPhoneResponse }
     */
    public SendPaymentToPhoneResponse createSendPaymentToPhoneResponse() {
        return new SendPaymentToPhoneResponse();
    }

    /**
     * Create an instance of {@link SetReturnToOH }
     * 
     * @return
     *     the new instance of {@link SetReturnToOH }
     */
    public SetReturnToOH createSetReturnToOH() {
        return new SetReturnToOH();
    }

    /**
     * Create an instance of {@link SetReturnToOHResponse }
     * 
     * @return
     *     the new instance of {@link SetReturnToOHResponse }
     */
    public SetReturnToOHResponse createSetReturnToOHResponse() {
        return new SetReturnToOHResponse();
    }

    /**
     * Create an instance of {@link GetPrintableUpd }
     * 
     * @return
     *     the new instance of {@link GetPrintableUpd }
     */
    public GetPrintableUpd createGetPrintableUpd() {
        return new GetPrintableUpd();
    }

    /**
     * Create an instance of {@link GetPrintableUpdResponse }
     * 
     * @return
     *     the new instance of {@link GetPrintableUpdResponse }
     */
    public GetPrintableUpdResponse createGetPrintableUpdResponse() {
        return new GetPrintableUpdResponse();
    }

    /**
     * Create an instance of {@link SendVerificationCode }
     * 
     * @return
     *     the new instance of {@link SendVerificationCode }
     */
    public SendVerificationCode createSendVerificationCode() {
        return new SendVerificationCode();
    }

    /**
     * Create an instance of {@link SendVerificationCodeResponse }
     * 
     * @return
     *     the new instance of {@link SendVerificationCodeResponse }
     */
    public SendVerificationCodeResponse createSendVerificationCodeResponse() {
        return new SendVerificationCodeResponse();
    }

    /**
     * Create an instance of {@link CheckVerificationCode }
     * 
     * @return
     *     the new instance of {@link CheckVerificationCode }
     */
    public CheckVerificationCode createCheckVerificationCode() {
        return new CheckVerificationCode();
    }

    /**
     * Create an instance of {@link CheckVerificationCodeResponse }
     * 
     * @return
     *     the new instance of {@link CheckVerificationCodeResponse }
     */
    public CheckVerificationCodeResponse createCheckVerificationCodeResponse() {
        return new CheckVerificationCodeResponse();
    }

    /**
     * Create an instance of {@link SetStoDeclineServices }
     * 
     * @return
     *     the new instance of {@link SetStoDeclineServices }
     */
    public SetStoDeclineServices createSetStoDeclineServices() {
        return new SetStoDeclineServices();
    }

    /**
     * Create an instance of {@link SetStoDeclineServicesResponse }
     * 
     * @return
     *     the new instance of {@link SetStoDeclineServicesResponse }
     */
    public SetStoDeclineServicesResponse createSetStoDeclineServicesResponse() {
        return new SetStoDeclineServicesResponse();
    }

    /**
     * Create an instance of {@link GetFindCamera }
     * 
     * @return
     *     the new instance of {@link GetFindCamera }
     */
    public GetFindCamera createGetFindCamera() {
        return new GetFindCamera();
    }

    /**
     * Create an instance of {@link GetFindCameraResponse }
     * 
     * @return
     *     the new instance of {@link GetFindCameraResponse }
     */
    public GetFindCameraResponse createGetFindCameraResponse() {
        return new GetFindCameraResponse();
    }

    /**
     * Create an instance of {@link PutDeliveryAddress }
     * 
     * @return
     *     the new instance of {@link PutDeliveryAddress }
     */
    public PutDeliveryAddress createPutDeliveryAddress() {
        return new PutDeliveryAddress();
    }

    /**
     * Create an instance of {@link PutDeliveryAddressResponse }
     * 
     * @return
     *     the new instance of {@link PutDeliveryAddressResponse }
     */
    public PutDeliveryAddressResponse createPutDeliveryAddressResponse() {
        return new PutDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link SetSupplierPrice }
     * 
     * @return
     *     the new instance of {@link SetSupplierPrice }
     */
    public SetSupplierPrice createSetSupplierPrice() {
        return new SetSupplierPrice();
    }

    /**
     * Create an instance of {@link SetSupplierPriceResponse }
     * 
     * @return
     *     the new instance of {@link SetSupplierPriceResponse }
     */
    public SetSupplierPriceResponse createSetSupplierPriceResponse() {
        return new SetSupplierPriceResponse();
    }

    /**
     * Create an instance of {@link GetSupplierPrice }
     * 
     * @return
     *     the new instance of {@link GetSupplierPrice }
     */
    public GetSupplierPrice createGetSupplierPrice() {
        return new GetSupplierPrice();
    }

    /**
     * Create an instance of {@link GetSupplierPriceResponse }
     * 
     * @return
     *     the new instance of {@link GetSupplierPriceResponse }
     */
    public GetSupplierPriceResponse createGetSupplierPriceResponse() {
        return new GetSupplierPriceResponse();
    }

    /**
     * Create an instance of {@link GetOrderList }
     * 
     * @return
     *     the new instance of {@link GetOrderList }
     */
    public GetOrderList createGetOrderList() {
        return new GetOrderList();
    }

    /**
     * Create an instance of {@link GetOrderListResponse }
     * 
     * @return
     *     the new instance of {@link GetOrderListResponse }
     */
    public GetOrderListResponse createGetOrderListResponse() {
        return new GetOrderListResponse();
    }

    /**
     * Create an instance of {@link GetOrderInfo2 }
     * 
     * @return
     *     the new instance of {@link GetOrderInfo2 }
     */
    public GetOrderInfo2 createGetOrderInfo2() {
        return new GetOrderInfo2();
    }

    /**
     * Create an instance of {@link GetOrderInfo2Response }
     * 
     * @return
     *     the new instance of {@link GetOrderInfo2Response }
     */
    public GetOrderInfo2Response createGetOrderInfo2Response() {
        return new GetOrderInfo2Response();
    }

    /**
     * Create an instance of {@link GetReMarkingDocument }
     * 
     * @return
     *     the new instance of {@link GetReMarkingDocument }
     */
    public GetReMarkingDocument createGetReMarkingDocument() {
        return new GetReMarkingDocument();
    }

    /**
     * Create an instance of {@link GetReMarkingDocumentResponse }
     * 
     * @return
     *     the new instance of {@link GetReMarkingDocumentResponse }
     */
    public GetReMarkingDocumentResponse createGetReMarkingDocumentResponse() {
        return new GetReMarkingDocumentResponse();
    }

    /**
     * Create an instance of {@link GetReMarkingDocumentList }
     * 
     * @return
     *     the new instance of {@link GetReMarkingDocumentList }
     */
    public GetReMarkingDocumentList createGetReMarkingDocumentList() {
        return new GetReMarkingDocumentList();
    }

    /**
     * Create an instance of {@link GetReMarkingDocumentListResponse }
     * 
     * @return
     *     the new instance of {@link GetReMarkingDocumentListResponse }
     */
    public GetReMarkingDocumentListResponse createGetReMarkingDocumentListResponse() {
        return new GetReMarkingDocumentListResponse();
    }

    /**
     * Create an instance of {@link SetReMarkingDocument }
     * 
     * @return
     *     the new instance of {@link SetReMarkingDocument }
     */
    public SetReMarkingDocument createSetReMarkingDocument() {
        return new SetReMarkingDocument();
    }

    /**
     * Create an instance of {@link SetReMarkingDocumentResponse }
     * 
     * @return
     *     the new instance of {@link SetReMarkingDocumentResponse }
     */
    public SetReMarkingDocumentResponse createSetReMarkingDocumentResponse() {
        return new SetReMarkingDocumentResponse();
    }

    /**
     * Create an instance of {@link GetFindWheel }
     * 
     * @return
     *     the new instance of {@link GetFindWheel }
     */
    public GetFindWheel createGetFindWheel() {
        return new GetFindWheel();
    }

    /**
     * Create an instance of {@link GetFindWheelResponse }
     * 
     * @return
     *     the new instance of {@link GetFindWheelResponse }
     */
    public GetFindWheelResponse createGetFindWheelResponse() {
        return new GetFindWheelResponse();
    }

    /**
     * Create an instance of {@link CheckVerificationCodeByQRCode }
     * 
     * @return
     *     the new instance of {@link CheckVerificationCodeByQRCode }
     */
    public CheckVerificationCodeByQRCode createCheckVerificationCodeByQRCode() {
        return new CheckVerificationCodeByQRCode();
    }

    /**
     * Create an instance of {@link CheckVerificationCodeByQRCodeResponse }
     * 
     * @return
     *     the new instance of {@link CheckVerificationCodeByQRCodeResponse }
     */
    public CheckVerificationCodeByQRCodeResponse createCheckVerificationCodeByQRCodeResponse() {
        return new CheckVerificationCodeByQRCodeResponse();
    }

    /**
     * Create an instance of {@link GetInventoryList }
     * 
     * @return
     *     the new instance of {@link GetInventoryList }
     */
    public GetInventoryList createGetInventoryList() {
        return new GetInventoryList();
    }

    /**
     * Create an instance of {@link GetInventoryListResponse }
     * 
     * @return
     *     the new instance of {@link GetInventoryListResponse }
     */
    public GetInventoryListResponse createGetInventoryListResponse() {
        return new GetInventoryListResponse();
    }

    /**
     * Create an instance of {@link GetInventoryInfo }
     * 
     * @return
     *     the new instance of {@link GetInventoryInfo }
     */
    public GetInventoryInfo createGetInventoryInfo() {
        return new GetInventoryInfo();
    }

    /**
     * Create an instance of {@link GetInventoryInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetInventoryInfoResponse }
     */
    public GetInventoryInfoResponse createGetInventoryInfoResponse() {
        return new GetInventoryInfoResponse();
    }

    /**
     * Create an instance of {@link GetAvailableWarehousesForInventory }
     * 
     * @return
     *     the new instance of {@link GetAvailableWarehousesForInventory }
     */
    public GetAvailableWarehousesForInventory createGetAvailableWarehousesForInventory() {
        return new GetAvailableWarehousesForInventory();
    }

    /**
     * Create an instance of {@link GetAvailableWarehousesForInventoryResponse }
     * 
     * @return
     *     the new instance of {@link GetAvailableWarehousesForInventoryResponse }
     */
    public GetAvailableWarehousesForInventoryResponse createGetAvailableWarehousesForInventoryResponse() {
        return new GetAvailableWarehousesForInventoryResponse();
    }

    /**
     * Create an instance of {@link CreateInventory }
     * 
     * @return
     *     the new instance of {@link CreateInventory }
     */
    public CreateInventory createCreateInventory() {
        return new CreateInventory();
    }

    /**
     * Create an instance of {@link CreateInventoryResponse }
     * 
     * @return
     *     the new instance of {@link CreateInventoryResponse }
     */
    public CreateInventoryResponse createCreateInventoryResponse() {
        return new CreateInventoryResponse();
    }

    /**
     * Create an instance of {@link CancelInventory }
     * 
     * @return
     *     the new instance of {@link CancelInventory }
     */
    public CancelInventory createCancelInventory() {
        return new CancelInventory();
    }

    /**
     * Create an instance of {@link CancelInventoryResponse }
     * 
     * @return
     *     the new instance of {@link CancelInventoryResponse }
     */
    public CancelInventoryResponse createCancelInventoryResponse() {
        return new CancelInventoryResponse();
    }

    /**
     * Create an instance of {@link SaveInventory }
     * 
     * @return
     *     the new instance of {@link SaveInventory }
     */
    public SaveInventory createSaveInventory() {
        return new SaveInventory();
    }

    /**
     * Create an instance of {@link SaveInventoryResponse }
     * 
     * @return
     *     the new instance of {@link SaveInventoryResponse }
     */
    public SaveInventoryResponse createSaveInventoryResponse() {
        return new SaveInventoryResponse();
    }

    /**
     * Create an instance of {@link FinishInventory }
     * 
     * @return
     *     the new instance of {@link FinishInventory }
     */
    public FinishInventory createFinishInventory() {
        return new FinishInventory();
    }

    /**
     * Create an instance of {@link FinishInventoryResponse }
     * 
     * @return
     *     the new instance of {@link FinishInventoryResponse }
     */
    public FinishInventoryResponse createFinishInventoryResponse() {
        return new FinishInventoryResponse();
    }

    /**
     * Create an instance of {@link CheckInventoryMarkCode }
     * 
     * @return
     *     the new instance of {@link CheckInventoryMarkCode }
     */
    public CheckInventoryMarkCode createCheckInventoryMarkCode() {
        return new CheckInventoryMarkCode();
    }

    /**
     * Create an instance of {@link CheckInventoryMarkCodeResponse }
     * 
     * @return
     *     the new instance of {@link CheckInventoryMarkCodeResponse }
     */
    public CheckInventoryMarkCodeResponse createCheckInventoryMarkCodeResponse() {
        return new CheckInventoryMarkCodeResponse();
    }

    /**
     * Create an instance of {@link SetOrderUpdate }
     * 
     * @return
     *     the new instance of {@link SetOrderUpdate }
     */
    public SetOrderUpdate createSetOrderUpdate() {
        return new SetOrderUpdate();
    }

    /**
     * Create an instance of {@link SetOrderUpdateResponse }
     * 
     * @return
     *     the new instance of {@link SetOrderUpdateResponse }
     */
    public SetOrderUpdateResponse createSetOrderUpdateResponse() {
        return new SetOrderUpdateResponse();
    }

    /**
     * Create an instance of {@link GetOrderCustomerList }
     * 
     * @return
     *     the new instance of {@link GetOrderCustomerList }
     */
    public GetOrderCustomerList createGetOrderCustomerList() {
        return new GetOrderCustomerList();
    }

    /**
     * Create an instance of {@link GetOrderCustomerListResponse }
     * 
     * @return
     *     the new instance of {@link GetOrderCustomerListResponse }
     */
    public GetOrderCustomerListResponse createGetOrderCustomerListResponse() {
        return new GetOrderCustomerListResponse();
    }

    /**
     * Create an instance of {@link GetCustomerList }
     * 
     * @return
     *     the new instance of {@link GetCustomerList }
     */
    public GetCustomerList createGetCustomerList() {
        return new GetCustomerList();
    }

    /**
     * Create an instance of {@link GetCustomerListResponse }
     * 
     * @return
     *     the new instance of {@link GetCustomerListResponse }
     */
    public GetCustomerListResponse createGetCustomerListResponse() {
        return new GetCustomerListResponse();
    }

    /**
     * Create an instance of {@link SetMoveServicesToNewOrder }
     * 
     * @return
     *     the new instance of {@link SetMoveServicesToNewOrder }
     */
    public SetMoveServicesToNewOrder createSetMoveServicesToNewOrder() {
        return new SetMoveServicesToNewOrder();
    }

    /**
     * Create an instance of {@link SetMoveServicesToNewOrderResponse }
     * 
     * @return
     *     the new instance of {@link SetMoveServicesToNewOrderResponse }
     */
    public SetMoveServicesToNewOrderResponse createSetMoveServicesToNewOrderResponse() {
        return new SetMoveServicesToNewOrderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetFindTyre.class)
    public JAXBElement<String> createGetFindTyreLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetFindTyre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetFindTyre.class)
    public JAXBElement<String> createGetFindTyrePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetFindTyre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTyreFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindTyreFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetFindTyre.class)
    public JAXBElement<FindTyreFilter> createGetFindTyreFilter(FindTyreFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, FindTyreFilter.class, GetFindTyre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "pageSize", scope = GetFindTyre.class)
    public JAXBElement<Integer> createGetFindTyrePageSize(Integer value) {
        return new JAXBElement<>(_GetFindTyrePageSize_QNAME, Integer.class, GetFindTyre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultFindTyre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultFindTyre }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetFindTyreResult", scope = GetFindTyreResponse.class)
    public JAXBElement<ResultFindTyre> createGetFindTyreResponseGetFindTyreResult(ResultFindTyre value) {
        return new JAXBElement<>(_GetFindTyreResponseGetFindTyreResult_QNAME, ResultFindTyre.class, GetFindTyreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetFindDisk.class)
    public JAXBElement<String> createGetFindDiskLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetFindDisk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetFindDisk.class)
    public JAXBElement<String> createGetFindDiskPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetFindDisk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDiskFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindDiskFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetFindDisk.class)
    public JAXBElement<FindDiskFilter> createGetFindDiskFilter(FindDiskFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, FindDiskFilter.class, GetFindDisk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "pageSize", scope = GetFindDisk.class)
    public JAXBElement<Integer> createGetFindDiskPageSize(Integer value) {
        return new JAXBElement<>(_GetFindTyrePageSize_QNAME, Integer.class, GetFindDisk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultFindDisk }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultFindDisk }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetFindDiskResult", scope = GetFindDiskResponse.class)
    public JAXBElement<ResultFindDisk> createGetFindDiskResponseGetFindDiskResult(ResultFindDisk value) {
        return new JAXBElement<>(_GetFindDiskResponseGetFindDiskResult_QNAME, ResultFindDisk.class, GetFindDiskResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetGoodsPriceRestByCode.class)
    public JAXBElement<String> createGetGoodsPriceRestByCodeLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetGoodsPriceRestByCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetGoodsPriceRestByCode.class)
    public JAXBElement<String> createGetGoodsPriceRestByCodePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetGoodsPriceRestByCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsPriceRestFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsPriceRestFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetGoodsPriceRestByCode.class)
    public JAXBElement<GoodsPriceRestFilter> createGetGoodsPriceRestByCodeFilter(GoodsPriceRestFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GoodsPriceRestFilter.class, GetGoodsPriceRestByCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoodsPriceRestByCodeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGoodsPriceRestByCodeResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetGoodsPriceRestByCodeResult", scope = GetGoodsPriceRestByCodeResponse.class)
    public JAXBElement<GetGoodsPriceRestByCodeResult> createGetGoodsPriceRestByCodeResponseGetGoodsPriceRestByCodeResult(GetGoodsPriceRestByCodeResult value) {
        return new JAXBElement<>(_GetGoodsPriceRestByCodeResponseGetGoodsPriceRestByCodeResult_QNAME, GetGoodsPriceRestByCodeResult.class, GetGoodsPriceRestByCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetGoodsInfo.class)
    public JAXBElement<String> createGetGoodsInfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetGoodsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetGoodsInfo.class)
    public JAXBElement<String> createGetGoodsInfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetGoodsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "code_list", scope = GetGoodsInfo.class)
    public JAXBElement<ArrayOfstring> createGetGoodsInfoCodeList(ArrayOfstring value) {
        return new JAXBElement<>(_GetGoodsInfoCodeList_QNAME, ArrayOfstring.class, GetGoodsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultGetGoodsInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultGetGoodsInfo }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetGoodsInfoResult", scope = GetGoodsInfoResponse.class)
    public JAXBElement<ResultGetGoodsInfo> createGetGoodsInfoResponseGetGoodsInfoResult(ResultGetGoodsInfo value) {
        return new JAXBElement<>(_GetGoodsInfoResponseGetGoodsInfoResult_QNAME, ResultGetGoodsInfo.class, GetGoodsInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetGoodsByCar.class)
    public JAXBElement<String> createGetGoodsByCarLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetGoodsByCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetGoodsByCar.class)
    public JAXBElement<String> createGetGoodsByCarPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetGoodsByCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoodsByCarFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGoodsByCarFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetGoodsByCar.class)
    public JAXBElement<GetGoodsByCarFilter> createGetGoodsByCarFilter(GetGoodsByCarFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetGoodsByCarFilter.class, GetGoodsByCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoodsByCarResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGoodsByCarResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetGoodsByCarResult", scope = GetGoodsByCarResponse.class)
    public JAXBElement<GetGoodsByCarResult> createGetGoodsByCarResponseGetGoodsByCarResult(GetGoodsByCarResult value) {
        return new JAXBElement<>(_GetGoodsByCarResponseGetGoodsByCarResult_QNAME, GetGoodsByCarResult.class, GetGoodsByCarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetMarkaAvto.class)
    public JAXBElement<String> createGetMarkaAvtoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetMarkaAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetMarkaAvto.class)
    public JAXBElement<String> createGetMarkaAvtoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetMarkaAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMarkaAvtoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMarkaAvtoResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetMarkaAvtoResult", scope = GetMarkaAvtoResponse.class)
    public JAXBElement<GetMarkaAvtoResult> createGetMarkaAvtoResponseGetMarkaAvtoResult(GetMarkaAvtoResult value) {
        return new JAXBElement<>(_GetMarkaAvtoResponseGetMarkaAvtoResult_QNAME, GetMarkaAvtoResult.class, GetMarkaAvtoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = ts3.webapi.client.clientservice.wcf.GetModelAvto.class)
    public JAXBElement<String> createGetModelAvtoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetModelAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = ts3.webapi.client.clientservice.wcf.GetModelAvto.class)
    public JAXBElement<String> createGetModelAvtoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetModelAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "marka", scope = ts3.webapi.client.clientservice.wcf.GetModelAvto.class)
    public JAXBElement<String> createGetModelAvtoMarka(String value) {
        return new JAXBElement<>(_GetModelAvtoMarka_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetModelAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModelAvto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModelAvto }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetModelAvtoResult", scope = GetModelAvtoResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModelAvto> createGetModelAvtoResponseGetModelAvtoResult(org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModelAvto value) {
        return new JAXBElement<>(_GetModelAvtoResponseGetModelAvtoResult_QNAME, org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModelAvto.class, GetModelAvtoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = ts3.webapi.client.clientservice.wcf.GetYearAvto.class)
    public JAXBElement<String> createGetYearAvtoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetYearAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = ts3.webapi.client.clientservice.wcf.GetYearAvto.class)
    public JAXBElement<String> createGetYearAvtoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetYearAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "marka", scope = ts3.webapi.client.clientservice.wcf.GetYearAvto.class)
    public JAXBElement<String> createGetYearAvtoMarka(String value) {
        return new JAXBElement<>(_GetModelAvtoMarka_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetYearAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "model", scope = ts3.webapi.client.clientservice.wcf.GetYearAvto.class)
    public JAXBElement<String> createGetYearAvtoModel(String value) {
        return new JAXBElement<>(_GetYearAvtoModel_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetYearAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetYearAvto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetYearAvto }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetYearAvtoResult", scope = GetYearAvtoResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetYearAvto> createGetYearAvtoResponseGetYearAvtoResult(org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetYearAvto value) {
        return new JAXBElement<>(_GetYearAvtoResponseGetYearAvtoResult_QNAME, org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetYearAvto.class, GetYearAvtoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = ts3.webapi.client.clientservice.wcf.GetModificationAvto.class)
    public JAXBElement<String> createGetModificationAvtoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetModificationAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = ts3.webapi.client.clientservice.wcf.GetModificationAvto.class)
    public JAXBElement<String> createGetModificationAvtoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetModificationAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "marka", scope = ts3.webapi.client.clientservice.wcf.GetModificationAvto.class)
    public JAXBElement<String> createGetModificationAvtoMarka(String value) {
        return new JAXBElement<>(_GetModelAvtoMarka_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetModificationAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "model", scope = ts3.webapi.client.clientservice.wcf.GetModificationAvto.class)
    public JAXBElement<String> createGetModificationAvtoModel(String value) {
        return new JAXBElement<>(_GetYearAvtoModel_QNAME, String.class, ts3.webapi.client.clientservice.wcf.GetModificationAvto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModificationAvto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModificationAvto }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetModificationAvtoResult", scope = GetModificationAvtoResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModificationAvto> createGetModificationAvtoResponseGetModificationAvtoResult(org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModificationAvto value) {
        return new JAXBElement<>(_GetModificationAvtoResponseGetModificationAvtoResult_QNAME, org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModificationAvto.class, GetModificationAvtoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetRest.class)
    public JAXBElement<String> createSetRestLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetRest.class)
    public JAXBElement<String> createSetRestPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRestList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRestList }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "list", scope = SetRest.class)
    public JAXBElement<ArrayOfRestList> createSetRestList(ArrayOfRestList value) {
        return new JAXBElement<>(_SetRestList_QNAME, ArrayOfRestList.class, SetRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRestResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetRestResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetRestResult", scope = SetRestResponse.class)
    public JAXBElement<SetRestResult> createSetRestResponseSetRestResult(SetRestResult value) {
        return new JAXBElement<>(_SetRestResponseSetRestResult_QNAME, SetRestResult.class, SetRestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetPrice.class)
    public JAXBElement<String> createSetPriceLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetPrice.class)
    public JAXBElement<String> createSetPricePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceList }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "list", scope = SetPrice.class)
    public JAXBElement<ArrayOfPriceList> createSetPriceList(ArrayOfPriceList value) {
        return new JAXBElement<>(_SetRestList_QNAME, ArrayOfPriceList.class, SetPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPriceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetPriceResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetPriceResult", scope = SetPriceResponse.class)
    public JAXBElement<SetPriceResult> createSetPriceResponseSetPriceResult(SetPriceResult value) {
        return new JAXBElement<>(_SetPriceResponseSetPriceResult_QNAME, SetPriceResult.class, SetPriceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = CreateOrder.class)
    public JAXBElement<String> createCreateOrderLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, CreateOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = CreateOrder.class)
    public JAXBElement<String> createCreateOrderPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, CreateOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Order }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "order", scope = CreateOrder.class)
    public JAXBElement<Order> createCreateOrderOrder(Order value) {
        return new JAXBElement<>(_CreateOrderOrder_QNAME, Order.class, CreateOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateOrderResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "CreateOrderResult", scope = CreateOrderResponse.class)
    public JAXBElement<CreateOrderResult> createCreateOrderResponseCreateOrderResult(CreateOrderResult value) {
        return new JAXBElement<>(_CreateOrderResponseCreateOrderResult_QNAME, CreateOrderResult.class, CreateOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = CreateMarketplaceOrder.class)
    public JAXBElement<String> createCreateMarketplaceOrderLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, CreateMarketplaceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = CreateMarketplaceOrder.class)
    public JAXBElement<String> createCreateMarketplaceOrderPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, CreateMarketplaceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMarketplaceOrderParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateMarketplaceOrderParameters }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "marketplaceOrder", scope = CreateMarketplaceOrder.class)
    public JAXBElement<CreateMarketplaceOrderParameters> createCreateMarketplaceOrderMarketplaceOrder(CreateMarketplaceOrderParameters value) {
        return new JAXBElement<>(_CreateMarketplaceOrderMarketplaceOrder_QNAME, CreateMarketplaceOrderParameters.class, CreateMarketplaceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateOrderResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "CreateMarketplaceOrderResult", scope = CreateMarketplaceOrderResponse.class)
    public JAXBElement<CreateOrderResult> createCreateMarketplaceOrderResponseCreateMarketplaceOrderResult(CreateOrderResult value) {
        return new JAXBElement<>(_CreateMarketplaceOrderResponseCreateMarketplaceOrderResult_QNAME, CreateOrderResult.class, CreateMarketplaceOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetChangeOrder.class)
    public JAXBElement<String> createGetChangeOrderLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetChangeOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetChangeOrder.class)
    public JAXBElement<String> createGetChangeOrderPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetChangeOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindChangeOrderFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindChangeOrderFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetChangeOrder.class)
    public JAXBElement<FindChangeOrderFilter> createGetChangeOrderFilter(FindChangeOrderFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, FindChangeOrderFilter.class, GetChangeOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangeOrderResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetChangeOrderResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetChangeOrderResult", scope = GetChangeOrderResponse.class)
    public JAXBElement<GetChangeOrderResult> createGetChangeOrderResponseGetChangeOrderResult(GetChangeOrderResult value) {
        return new JAXBElement<>(_GetChangeOrderResponseGetChangeOrderResult_QNAME, GetChangeOrderResult.class, GetChangeOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetOrderStatus.class)
    public JAXBElement<String> createSetOrderStatusLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetOrderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetOrderStatus.class)
    public JAXBElement<String> createSetOrderStatusPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetOrderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetOrderStatus.class)
    public JAXBElement<String> createSetOrderStatusOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetOrderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientSoapResultDM }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientSoapResultDM }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetOrderStatusResult", scope = SetOrderStatusResponse.class)
    public JAXBElement<ClientSoapResultDM> createSetOrderStatusResponseSetOrderStatusResult(ClientSoapResultDM value) {
        return new JAXBElement<>(_SetOrderStatusResponseSetOrderStatusResult_QNAME, ClientSoapResultDM.class, SetOrderStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetOrderStatusSatellite.class)
    public JAXBElement<String> createSetOrderStatusSatelliteLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetOrderStatusSatellite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetOrderStatusSatellite.class)
    public JAXBElement<String> createSetOrderStatusSatellitePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetOrderStatusSatellite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetOrderStatusSatellite.class)
    public JAXBElement<String> createSetOrderStatusSatelliteOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetOrderStatusSatellite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientSoapResultDM }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientSoapResultDM }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetOrderStatusSatelliteResult", scope = SetOrderStatusSatelliteResponse.class)
    public JAXBElement<ClientSoapResultDM> createSetOrderStatusSatelliteResponseSetOrderStatusSatelliteResult(ClientSoapResultDM value) {
        return new JAXBElement<>(_SetOrderStatusSatelliteResponseSetOrderStatusSatelliteResult_QNAME, ClientSoapResultDM.class, SetOrderStatusSatelliteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetOrderStatus.class)
    public JAXBElement<String> createGetOrderStatusLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetOrderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetOrderStatus.class)
    public JAXBElement<String> createGetOrderStatusPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetOrderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOrderFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindOrderFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetOrderStatus.class)
    public JAXBElement<FindOrderFilter> createGetOrderStatusFilter(FindOrderFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, FindOrderFilter.class, GetOrderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetOrderStatusResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGetOrderStatusResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetOrderStatusResult", scope = GetOrderStatusResponse.class)
    public JAXBElement<ArrayOfGetOrderStatusResult> createGetOrderStatusResponseGetOrderStatusResult(ArrayOfGetOrderStatusResult value) {
        return new JAXBElement<>(_GetOrderStatusResponseGetOrderStatusResult_QNAME, ArrayOfGetOrderStatusResult.class, GetOrderStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetMergeOrders.class)
    public JAXBElement<String> createSetMergeOrdersLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetMergeOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetMergeOrders.class)
    public JAXBElement<String> createSetMergeOrdersPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetMergeOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber_list", scope = SetMergeOrders.class)
    public JAXBElement<ArrayOfstring> createSetMergeOrdersOrderNumberList(ArrayOfstring value) {
        return new JAXBElement<>(_SetMergeOrdersOrderNumberList_QNAME, ArrayOfstring.class, SetMergeOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMergeOrdersResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetMergeOrdersResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetMergeOrdersResult", scope = SetMergeOrdersResponse.class)
    public JAXBElement<SetMergeOrdersResult> createSetMergeOrdersResponseSetMergeOrdersResult(SetMergeOrdersResult value) {
        return new JAXBElement<>(_SetMergeOrdersResponseSetMergeOrdersResult_QNAME, SetMergeOrdersResult.class, SetMergeOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetOrderInfo.class)
    public JAXBElement<String> createGetOrderInfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetOrderInfo.class)
    public JAXBElement<String> createGetOrderInfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = GetOrderInfo.class)
    public JAXBElement<String> createGetOrderInfoOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, GetOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "date", scope = GetOrderInfo.class)
    public JAXBElement<XMLGregorianCalendar> createGetOrderInfoDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_GetOrderInfoDate_QNAME, XMLGregorianCalendar.class, GetOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderInfoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrderInfoResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetOrderInfoResult", scope = GetOrderInfoResponse.class)
    public JAXBElement<GetOrderInfoResult> createGetOrderInfoResponseGetOrderInfoResult(GetOrderInfoResult value) {
        return new JAXBElement<>(_GetOrderInfoResponseGetOrderInfoResult_QNAME, GetOrderInfoResult.class, GetOrderInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetStatusListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGetStatusListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetStatusListResult", scope = GetStatusListResponse.class)
    public JAXBElement<ArrayOfGetStatusListResult> createGetStatusListResponseGetStatusListResult(ArrayOfGetStatusListResult value) {
        return new JAXBElement<>(_GetStatusListResponseGetStatusListResult_QNAME, ArrayOfGetStatusListResult.class, GetStatusListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetOrderComment.class)
    public JAXBElement<String> createGetOrderCommentLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetOrderComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetOrderComment.class)
    public JAXBElement<String> createGetOrderCommentPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetOrderComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOrderCommentFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindOrderCommentFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetOrderComment.class)
    public JAXBElement<FindOrderCommentFilter> createGetOrderCommentFilter(FindOrderCommentFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, FindOrderCommentFilter.class, GetOrderComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderCommentResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrderCommentResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetOrderCommentResult", scope = GetOrderCommentResponse.class)
    public JAXBElement<GetOrderCommentResult> createGetOrderCommentResponseGetOrderCommentResult(GetOrderCommentResult value) {
        return new JAXBElement<>(_GetOrderCommentResponseGetOrderCommentResult_QNAME, GetOrderCommentResult.class, GetOrderCommentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetUserList.class)
    public JAXBElement<String> createGetUserListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetUserList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetUserList.class)
    public JAXBElement<String> createGetUserListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetUserList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetUserListResult", scope = GetUserListResponse.class)
    public JAXBElement<GetUserListResult> createGetUserListResponseGetUserListResult(GetUserListResult value) {
        return new JAXBElement<>(_GetUserListResponseGetUserListResult_QNAME, GetUserListResult.class, GetUserListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetOrderComment.class)
    public JAXBElement<String> createSetOrderCommentLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetOrderComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetOrderComment.class)
    public JAXBElement<String> createSetOrderCommentPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetOrderComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetOrderComment.class)
    public JAXBElement<String> createSetOrderCommentOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetOrderComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "comment", scope = SetOrderComment.class)
    public JAXBElement<String> createSetOrderCommentComment(String value) {
        return new JAXBElement<>(_SetOrderCommentComment_QNAME, String.class, SetOrderComment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrderCommentResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetOrderCommentResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetOrderCommentResult", scope = SetOrderCommentResponse.class)
    public JAXBElement<SetOrderCommentResult> createSetOrderCommentResponseSetOrderCommentResult(SetOrderCommentResult value) {
        return new JAXBElement<>(_SetOrderCommentResponseSetOrderCommentResult_QNAME, SetOrderCommentResult.class, SetOrderCommentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetCancelDelivery.class)
    public JAXBElement<String> createSetCancelDeliveryLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetCancelDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetCancelDelivery.class)
    public JAXBElement<String> createSetCancelDeliveryPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetCancelDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetCancelDelivery.class)
    public JAXBElement<String> createSetCancelDeliveryOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetCancelDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultSetCancelDelivery }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultSetCancelDelivery }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetCancelDeliveryResult", scope = SetCancelDeliveryResponse.class)
    public JAXBElement<ResultSetCancelDelivery> createSetCancelDeliveryResponseSetCancelDeliveryResult(ResultSetCancelDelivery value) {
        return new JAXBElement<>(_SetCancelDeliveryResponseSetCancelDeliveryResult_QNAME, ResultSetCancelDelivery.class, SetCancelDeliveryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetDeliveryInfo.class)
    public JAXBElement<String> createSetDeliveryInfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetDeliveryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetDeliveryInfo.class)
    public JAXBElement<String> createSetDeliveryInfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetDeliveryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetDeliveryInfo.class)
    public JAXBElement<String> createSetDeliveryInfoOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetDeliveryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryInfoContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeliveryInfoContainer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "deliveryInfo", scope = SetDeliveryInfo.class)
    public JAXBElement<DeliveryInfoContainer> createSetDeliveryInfoDeliveryInfo(DeliveryInfoContainer value) {
        return new JAXBElement<>(_SetDeliveryInfoDeliveryInfo_QNAME, DeliveryInfoContainer.class, SetDeliveryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeliveryInfoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetDeliveryInfoResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetDeliveryInfoResult", scope = SetDeliveryInfoResponse.class)
    public JAXBElement<SetDeliveryInfoResult> createSetDeliveryInfoResponseSetDeliveryInfoResult(SetDeliveryInfoResult value) {
        return new JAXBElement<>(_SetDeliveryInfoResponseSetDeliveryInfoResult_QNAME, SetDeliveryInfoResult.class, SetDeliveryInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetWarehouses.class)
    public JAXBElement<String> createGetWarehousesLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetWarehouses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetWarehouses.class)
    public JAXBElement<String> createGetWarehousesPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetWarehouses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "addressId", scope = GetWarehouses.class)
    public JAXBElement<Integer> createGetWarehousesAddressId(Integer value) {
        return new JAXBElement<>(_GetWarehousesAddressId_QNAME, Integer.class, GetWarehouses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWarehousesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWarehousesResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetWarehousesResult", scope = GetWarehousesResponse.class)
    public JAXBElement<GetWarehousesResult> createGetWarehousesResponseGetWarehousesResult(GetWarehousesResult value) {
        return new JAXBElement<>(_GetWarehousesResponseGetWarehousesResult_QNAME, GetWarehousesResult.class, GetWarehousesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = Ping.class)
    public JAXBElement<String> createPingLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, Ping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = Ping.class)
    public JAXBElement<String> createPingPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, Ping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetToMove.class)
    public JAXBElement<String> createSetToMoveLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetToMove.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetToMove.class)
    public JAXBElement<String> createSetToMovePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetToMove.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Params }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Params }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "parameters", scope = SetToMove.class)
    public JAXBElement<Params> createSetToMoveParameters(Params value) {
        return new JAXBElement<>(_SetToMoveParameters_QNAME, Params.class, SetToMove.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientSoapResultDM }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientSoapResultDM }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetToMoveResult", scope = SetToMoveResponse.class)
    public JAXBElement<ClientSoapResultDM> createSetToMoveResponseSetToMoveResult(ClientSoapResultDM value) {
        return new JAXBElement<>(_SetToMoveResponseSetToMoveResult_QNAME, ClientSoapResultDM.class, SetToMoveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = TireCalc.class)
    public JAXBElement<String> createTireCalcLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, TireCalc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = TireCalc.class)
    public JAXBElement<String> createTireCalcPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, TireCalc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcParameters }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "parameters", scope = TireCalc.class)
    public JAXBElement<TireCalcParameters> createTireCalcParameters(TireCalcParameters value) {
        return new JAXBElement<>(_SetToMoveParameters_QNAME, TireCalcParameters.class, TireCalc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "TireCalcResult", scope = TireCalcResponse.class)
    public JAXBElement<TireCalcResult> createTireCalcResponseTireCalcResult(TireCalcResult value) {
        return new JAXBElement<>(_TireCalcResponseTireCalcResult_QNAME, TireCalcResult.class, TireCalcResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetPressureSensor.class)
    public JAXBElement<String> createGetPressureSensorLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetPressureSensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetPressureSensor.class)
    public JAXBElement<String> createGetPressureSensorPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetPressureSensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPressureSensorFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPressureSensorFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetPressureSensor.class)
    public JAXBElement<GetPressureSensorFilter> createGetPressureSensorFilter(GetPressureSensorFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetPressureSensorFilter.class, GetPressureSensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "pageSize", scope = GetPressureSensor.class)
    public JAXBElement<Integer> createGetPressureSensorPageSize(Integer value) {
        return new JAXBElement<>(_GetFindTyrePageSize_QNAME, Integer.class, GetPressureSensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPressureSensorResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPressureSensorResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetPressureSensorResult", scope = GetPressureSensorResponse.class)
    public JAXBElement<GetPressureSensorResult> createGetPressureSensorResponseGetPressureSensorResult(GetPressureSensorResult value) {
        return new JAXBElement<>(_GetPressureSensorResponseGetPressureSensorResult_QNAME, GetPressureSensorResult.class, GetPressureSensorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = OrderReadyToWait.class)
    public JAXBElement<String> createOrderReadyToWaitLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, OrderReadyToWait.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = OrderReadyToWait.class)
    public JAXBElement<String> createOrderReadyToWaitPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, OrderReadyToWait.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = OrderReadyToWait.class)
    public JAXBElement<String> createOrderReadyToWaitOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, OrderReadyToWait.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderReadyToWaitResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderReadyToWaitResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "OrderReadyToWaitResult", scope = OrderReadyToWaitResponse.class)
    public JAXBElement<OrderReadyToWaitResult> createOrderReadyToWaitResponseOrderReadyToWaitResult(OrderReadyToWaitResult value) {
        return new JAXBElement<>(_OrderReadyToWaitResponseOrderReadyToWaitResult_QNAME, OrderReadyToWaitResult.class, OrderReadyToWaitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = ProposeGoods.class)
    public JAXBElement<String> createProposeGoodsLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, ProposeGoods.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = ProposeGoods.class)
    public JAXBElement<String> createProposeGoodsPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, ProposeGoods.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProposeGoodsContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProposeGoodsContainer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "proposal", scope = ProposeGoods.class)
    public JAXBElement<ProposeGoodsContainer> createProposeGoodsProposal(ProposeGoodsContainer value) {
        return new JAXBElement<>(_ProposeGoodsProposal_QNAME, ProposeGoodsContainer.class, ProposeGoods.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Result }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "ProposeGoodsResult", scope = ProposeGoodsResponse.class)
    public JAXBElement<Result> createProposeGoodsResponseProposeGoodsResult(Result value) {
        return new JAXBElement<>(_ProposeGoodsResponseProposeGoodsResult_QNAME, Result.class, ProposeGoodsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = CreateMovement.class)
    public JAXBElement<String> createCreateMovementLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, CreateMovement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = CreateMovement.class)
    public JAXBElement<String> createCreateMovementPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, CreateMovement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumberList", scope = CreateMovement.class)
    public JAXBElement<ArrayOfstring> createCreateMovementOrderNumberList(ArrayOfstring value) {
        return new JAXBElement<>(_CreateMovementOrderNumberList_QNAME, ArrayOfstring.class, CreateMovement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Result2 }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "CreateMovementResult", scope = CreateMovementResponse.class)
    public JAXBElement<Result2> createCreateMovementResponseCreateMovementResult(Result2 value) {
        return new JAXBElement<>(_CreateMovementResponseCreateMovementResult_QNAME, Result2 .class, CreateMovementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetMovementStatus.class)
    public JAXBElement<String> createSetMovementStatusLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetMovementStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetMovementStatus.class)
    public JAXBElement<String> createSetMovementStatusPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetMovementStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "movementNumber", scope = SetMovementStatus.class)
    public JAXBElement<String> createSetMovementStatusMovementNumber(String value) {
        return new JAXBElement<>(_SetMovementStatusMovementNumber_QNAME, String.class, SetMovementStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result3 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Result3 }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetMovementStatusResult", scope = SetMovementStatusResponse.class)
    public JAXBElement<Result3> createSetMovementStatusResponseSetMovementStatusResult(Result3 value) {
        return new JAXBElement<>(_SetMovementStatusResponseSetMovementStatusResult_QNAME, Result3 .class, SetMovementStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetMovementList.class)
    public JAXBElement<String> createGetMovementListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetMovementList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetMovementList.class)
    public JAXBElement<String> createGetMovementListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetMovementList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovementFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MovementFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetMovementList.class)
    public JAXBElement<MovementFilter> createGetMovementListFilter(MovementFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, MovementFilter.class, GetMovementList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovementListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMovementListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetMovementListResult", scope = GetMovementListResponse.class)
    public JAXBElement<GetMovementListResult> createGetMovementListResponseGetMovementListResult(GetMovementListResult value) {
        return new JAXBElement<>(_GetMovementListResponseGetMovementListResult_QNAME, GetMovementListResult.class, GetMovementListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetMovementInfo.class)
    public JAXBElement<String> createGetMovementInfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetMovementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetMovementInfo.class)
    public JAXBElement<String> createGetMovementInfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetMovementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "movementNumber", scope = GetMovementInfo.class)
    public JAXBElement<String> createGetMovementInfoMovementNumber(String value) {
        return new JAXBElement<>(_SetMovementStatusMovementNumber_QNAME, String.class, GetMovementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = GetMovementInfo.class)
    public JAXBElement<String> createGetMovementInfoGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, GetMovementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovementInfoContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MovementInfoContainer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetMovementInfoResult", scope = GetMovementInfoResponse.class)
    public JAXBElement<MovementInfoContainer> createGetMovementInfoResponseGetMovementInfoResult(MovementInfoContainer value) {
        return new JAXBElement<>(_GetMovementInfoResponseGetMovementInfoResult_QNAME, MovementInfoContainer.class, GetMovementInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetFastener.class)
    public JAXBElement<String> createGetFastenerLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetFastener.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetFastener.class)
    public JAXBElement<String> createGetFastenerPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetFastener.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFastenerFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFastenerFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetFastener.class)
    public JAXBElement<GetFastenerFilter> createGetFastenerFilter(GetFastenerFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetFastenerFilter.class, GetFastener.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "page", scope = GetFastener.class)
    public JAXBElement<Integer> createGetFastenerPage(Integer value) {
        return new JAXBElement<>(_GetFastenerPage_QNAME, Integer.class, GetFastener.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "pageSize", scope = GetFastener.class)
    public JAXBElement<Integer> createGetFastenerPageSize(Integer value) {
        return new JAXBElement<>(_GetFindTyrePageSize_QNAME, Integer.class, GetFastener.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFastenerResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFastenerResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetFastenerResult", scope = GetFastenerResponse.class)
    public JAXBElement<GetFastenerResult> createGetFastenerResponseGetFastenerResult(GetFastenerResult value) {
        return new JAXBElement<>(_GetFastenerResponseGetFastenerResult_QNAME, GetFastenerResult.class, GetFastenerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetAddressList.class)
    public JAXBElement<String> createGetAddressListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetAddressList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetAddressList.class)
    public JAXBElement<String> createGetAddressListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetAddressList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressListFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressListFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetAddressList.class)
    public JAXBElement<GetAddressListFilter> createGetAddressListFilter(GetAddressListFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetAddressListFilter.class, GetAddressList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetAddressListResult", scope = GetAddressListResponse.class)
    public JAXBElement<GetAddressListResult> createGetAddressListResponseGetAddressListResult(GetAddressListResult value) {
        return new JAXBElement<>(_GetAddressListResponseGetAddressListResult_QNAME, GetAddressListResult.class, GetAddressListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetDeliveryPeriod.class)
    public JAXBElement<String> createGetDeliveryPeriodLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetDeliveryPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetDeliveryPeriod.class)
    public JAXBElement<String> createGetDeliveryPeriodPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetDeliveryPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = GetDeliveryPeriod.class)
    public JAXBElement<String> createGetDeliveryPeriodOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, GetDeliveryPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeliveryPeriodResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeliveryPeriodResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetDeliveryPeriodResult", scope = GetDeliveryPeriodResponse.class)
    public JAXBElement<GetDeliveryPeriodResult> createGetDeliveryPeriodResponseGetDeliveryPeriodResult(GetDeliveryPeriodResult value) {
        return new JAXBElement<>(_GetDeliveryPeriodResponseGetDeliveryPeriodResult_QNAME, GetDeliveryPeriodResult.class, GetDeliveryPeriodResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetDeliveryAddress.class)
    public JAXBElement<String> createSetDeliveryAddressLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetDeliveryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetDeliveryAddress.class)
    public JAXBElement<String> createSetDeliveryAddressPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetDeliveryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeliveryAddressParams }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetDeliveryAddressParams }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "parameters", scope = SetDeliveryAddress.class)
    public JAXBElement<SetDeliveryAddressParams> createSetDeliveryAddressParameters(SetDeliveryAddressParams value) {
        return new JAXBElement<>(_SetToMoveParameters_QNAME, SetDeliveryAddressParams.class, SetDeliveryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeliveryAddresResultContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetDeliveryAddresResultContainer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetDeliveryAddressResult", scope = SetDeliveryAddressResponse.class)
    public JAXBElement<SetDeliveryAddresResultContainer> createSetDeliveryAddressResponseSetDeliveryAddressResult(SetDeliveryAddresResultContainer value) {
        return new JAXBElement<>(_SetDeliveryAddressResponseSetDeliveryAddressResult_QNAME, SetDeliveryAddresResultContainer.class, SetDeliveryAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetOrderDelivery.class)
    public JAXBElement<String> createSetOrderDeliveryLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetOrderDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetOrderDelivery.class)
    public JAXBElement<String> createSetOrderDeliveryPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetOrderDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrderDeliveryParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetOrderDeliveryParameters }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "parameters", scope = SetOrderDelivery.class)
    public JAXBElement<SetOrderDeliveryParameters> createSetOrderDeliveryParameters(SetOrderDeliveryParameters value) {
        return new JAXBElement<>(_SetToMoveParameters_QNAME, SetOrderDeliveryParameters.class, SetOrderDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrderDeliveryResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetOrderDeliveryResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetOrderDeliveryResult", scope = SetOrderDeliveryResponse.class)
    public JAXBElement<SetOrderDeliveryResult> createSetOrderDeliveryResponseSetOrderDeliveryResult(SetOrderDeliveryResult value) {
        return new JAXBElement<>(_SetOrderDeliveryResponseSetOrderDeliveryResult_QNAME, SetOrderDeliveryResult.class, SetOrderDeliveryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetRemoveFromOH.class)
    public JAXBElement<String> createSetRemoveFromOHLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetRemoveFromOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetRemoveFromOH.class)
    public JAXBElement<String> createSetRemoveFromOHPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetRemoveFromOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetRemoveFromOH.class)
    public JAXBElement<String> createSetRemoveFromOHOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetRemoveFromOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "markCodeList", scope = SetRemoveFromOH.class)
    public JAXBElement<ArrayOfstring> createSetRemoveFromOHMarkCodeList(ArrayOfstring value) {
        return new JAXBElement<>(_SetRemoveFromOHMarkCodeList_QNAME, ArrayOfstring.class, SetRemoveFromOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result4 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Result4 }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetRemoveFromOHResult", scope = SetRemoveFromOHResponse.class)
    public JAXBElement<Result4> createSetRemoveFromOHResponseSetRemoveFromOHResult(Result4 value) {
        return new JAXBElement<>(_SetRemoveFromOHResponseSetRemoveFromOHResult_QNAME, Result4 .class, SetRemoveFromOHResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetStoRemoveFromOH.class)
    public JAXBElement<String> createSetStoRemoveFromOHLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetStoRemoveFromOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetStoRemoveFromOH.class)
    public JAXBElement<String> createSetStoRemoveFromOHPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetStoRemoveFromOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetStoRemoveFromOH.class)
    public JAXBElement<String> createSetStoRemoveFromOHOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetStoRemoveFromOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "verificationCode", scope = SetStoRemoveFromOH.class)
    public JAXBElement<String> createSetStoRemoveFromOHVerificationCode(String value) {
        return new JAXBElement<>(_SetStoRemoveFromOHVerificationCode_QNAME, String.class, SetStoRemoveFromOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "markCodeList", scope = SetStoRemoveFromOH.class)
    public JAXBElement<ArrayOfstring> createSetStoRemoveFromOHMarkCodeList(ArrayOfstring value) {
        return new JAXBElement<>(_SetRemoveFromOHMarkCodeList_QNAME, ArrayOfstring.class, SetStoRemoveFromOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result5 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Result5 }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetStoRemoveFromOHResult", scope = SetStoRemoveFromOHResponse.class)
    public JAXBElement<Result5> createSetStoRemoveFromOHResponseSetStoRemoveFromOHResult(Result5 value) {
        return new JAXBElement<>(_SetStoRemoveFromOHResponseSetStoRemoveFromOHResult_QNAME, Result5 .class, SetStoRemoveFromOHResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetMarkCodeList.class)
    public JAXBElement<String> createSetMarkCodeListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetMarkCodeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetMarkCodeList.class)
    public JAXBElement<String> createSetMarkCodeListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetMarkCodeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetMarkCodeList.class)
    public JAXBElement<String> createSetMarkCodeListOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetMarkCodeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "markCodeList", scope = SetMarkCodeList.class)
    public JAXBElement<ArrayOfstring> createSetMarkCodeListMarkCodeList(ArrayOfstring value) {
        return new JAXBElement<>(_SetRemoveFromOHMarkCodeList_QNAME, ArrayOfstring.class, SetMarkCodeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result6 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Result6 }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetMarkCodeListResult", scope = SetMarkCodeListResponse.class)
    public JAXBElement<Result6> createSetMarkCodeListResponseSetMarkCodeListResult(Result6 value) {
        return new JAXBElement<>(_SetMarkCodeListResponseSetMarkCodeListResult_QNAME, Result6 .class, SetMarkCodeListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetSaleInfo.class)
    public JAXBElement<String> createGetSaleInfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetSaleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetSaleInfo.class)
    public JAXBElement<String> createGetSaleInfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetSaleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "number", scope = GetSaleInfo.class)
    public JAXBElement<String> createGetSaleInfoNumber(String value) {
        return new JAXBElement<>(_GetSaleInfoNumber_QNAME, String.class, GetSaleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = GetSaleInfo.class)
    public JAXBElement<String> createGetSaleInfoGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, GetSaleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result7 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Result7 }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetSaleInfoResult", scope = GetSaleInfoResponse.class)
    public JAXBElement<Result7> createGetSaleInfoResponseGetSaleInfoResult(Result7 value) {
        return new JAXBElement<>(_GetSaleInfoResponseGetSaleInfoResult_QNAME, Result7 .class, GetSaleInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetSaleList.class)
    public JAXBElement<String> createGetSaleListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetSaleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetSaleList.class)
    public JAXBElement<String> createGetSaleListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetSaleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaleFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaleFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetSaleList.class)
    public JAXBElement<SaleFilter> createGetSaleListFilter(SaleFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, SaleFilter.class, GetSaleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result8 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Result8 }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetSaleListResult", scope = GetSaleListResponse.class)
    public JAXBElement<Result8> createGetSaleListResponseGetSaleListResult(Result8 value) {
        return new JAXBElement<>(_GetSaleListResponseGetSaleListResult_QNAME, Result8 .class, GetSaleListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetConsumable.class)
    public JAXBElement<String> createGetConsumableLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetConsumable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetConsumable.class)
    public JAXBElement<String> createGetConsumablePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetConsumable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsumableFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConsumableFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetConsumable.class)
    public JAXBElement<GetConsumableFilter> createGetConsumableFilter(GetConsumableFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetConsumableFilter.class, GetConsumable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "pageSize", scope = GetConsumable.class)
    public JAXBElement<Integer> createGetConsumablePageSize(Integer value) {
        return new JAXBElement<>(_GetFindTyrePageSize_QNAME, Integer.class, GetConsumable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsumableResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConsumableResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetConsumableResult", scope = GetConsumableResponse.class)
    public JAXBElement<GetConsumableResult> createGetConsumableResponseGetConsumableResult(GetConsumableResult value) {
        return new JAXBElement<>(_GetConsumableResponseGetConsumableResult_QNAME, GetConsumableResult.class, GetConsumableResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = CreateConsignee.class)
    public JAXBElement<String> createCreateConsigneeLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, CreateConsignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = CreateConsignee.class)
    public JAXBElement<String> createCreateConsigneePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, CreateConsignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsigneeCreateContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsigneeCreateContainer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "consigneeCreateContainer", scope = CreateConsignee.class)
    public JAXBElement<ConsigneeCreateContainer> createCreateConsigneeConsigneeCreateContainer(ConsigneeCreateContainer value) {
        return new JAXBElement<>(_CreateConsigneeConsigneeCreateContainer_QNAME, ConsigneeCreateContainer.class, CreateConsignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsigneeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsigneeResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "CreateConsigneeResult", scope = CreateConsigneeResponse.class)
    public JAXBElement<ConsigneeResult> createCreateConsigneeResponseCreateConsigneeResult(ConsigneeResult value) {
        return new JAXBElement<>(_CreateConsigneeResponseCreateConsigneeResult_QNAME, ConsigneeResult.class, CreateConsigneeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = DeleteConsignee.class)
    public JAXBElement<String> createDeleteConsigneeLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, DeleteConsignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = DeleteConsignee.class)
    public JAXBElement<String> createDeleteConsigneePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, DeleteConsignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsigneeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsigneeResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "DeleteConsigneeResult", scope = DeleteConsigneeResponse.class)
    public JAXBElement<ConsigneeResult> createDeleteConsigneeResponseDeleteConsigneeResult(ConsigneeResult value) {
        return new JAXBElement<>(_DeleteConsigneeResponseDeleteConsigneeResult_QNAME, ConsigneeResult.class, DeleteConsigneeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = DeleteDeliveryAddress.class)
    public JAXBElement<String> createDeleteDeliveryAddressLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, DeleteDeliveryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = DeleteDeliveryAddress.class)
    public JAXBElement<String> createDeleteDeliveryAddressPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, DeleteDeliveryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDeliveryAddressResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDeliveryAddressResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "DeleteDeliveryAddressResult", scope = DeleteDeliveryAddressResponse.class)
    public JAXBElement<DeleteDeliveryAddressResult> createDeleteDeliveryAddressResponseDeleteDeliveryAddressResult(DeleteDeliveryAddressResult value) {
        return new JAXBElement<>(_DeleteDeliveryAddressResponseDeleteDeliveryAddressResult_QNAME, DeleteDeliveryAddressResult.class, DeleteDeliveryAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetConsigneeList.class)
    public JAXBElement<String> createGetConsigneeListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetConsigneeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetConsigneeList.class)
    public JAXBElement<String> createGetConsigneeListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetConsigneeList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsigneeListContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsigneeListContainer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetConsigneeListResult", scope = GetConsigneeListResponse.class)
    public JAXBElement<ConsigneeListContainer> createGetConsigneeListResponseGetConsigneeListResult(ConsigneeListContainer value) {
        return new JAXBElement<>(_GetConsigneeListResponseGetConsigneeListResult_QNAME, ConsigneeListContainer.class, GetConsigneeListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetPrice.class)
    public JAXBElement<String> createGetPriceLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetPrice.class)
    public JAXBElement<String> createGetPricePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPriceFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetPrice.class)
    public JAXBElement<GetPriceFilter> createGetPriceFilter(GetPriceFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetPriceFilter.class, GetPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPriceResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetPriceResult", scope = GetPriceResponse.class)
    public JAXBElement<GetPriceResult> createGetPriceResponseGetPriceResult(GetPriceResult value) {
        return new JAXBElement<>(_GetPriceResponseGetPriceResult_QNAME, GetPriceResult.class, GetPriceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetRest.class)
    public JAXBElement<String> createGetRestLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetRest.class)
    public JAXBElement<String> createGetRestPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRestFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRestFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetRest.class)
    public JAXBElement<GetRestFilter> createGetRestFilter(GetRestFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetRestFilter.class, GetRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRestResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRestResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetRestResult", scope = GetRestResponse.class)
    public JAXBElement<GetRestResult> createGetRestResponseGetRestResult(GetRestResult value) {
        return new JAXBElement<>(_GetRestResponseGetRestResult_QNAME, GetRestResult.class, GetRestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetOil.class)
    public JAXBElement<String> createGetOilLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetOil.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetOil.class)
    public JAXBElement<String> createGetOilPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetOil.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOilFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOilFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetOil.class)
    public JAXBElement<GetOilFilter> createGetOilFilter(GetOilFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetOilFilter.class, GetOil.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "pageSize", scope = GetOil.class)
    public JAXBElement<Integer> createGetOilPageSize(Integer value) {
        return new JAXBElement<>(_GetFindTyrePageSize_QNAME, Integer.class, GetOil.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOilResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOilResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetOilResult", scope = GetOilResponse.class)
    public JAXBElement<GetOilResult> createGetOilResponseGetOilResult(GetOilResult value) {
        return new JAXBElement<>(_GetOilResponseGetOilResult_QNAME, GetOilResult.class, GetOilResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetStoOrderList.class)
    public JAXBElement<String> createGetStoOrderListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetStoOrderList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetStoOrderList.class)
    public JAXBElement<String> createGetStoOrderListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetStoOrderList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStoOrderListFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStoOrderListFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetStoOrderList.class)
    public JAXBElement<GetStoOrderListFilter> createGetStoOrderListFilter(GetStoOrderListFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetStoOrderListFilter.class, GetStoOrderList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStoOrderListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStoOrderListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetStoOrderListResult", scope = GetStoOrderListResponse.class)
    public JAXBElement<GetStoOrderListResult> createGetStoOrderListResponseGetStoOrderListResult(GetStoOrderListResult value) {
        return new JAXBElement<>(_GetStoOrderListResponseGetStoOrderListResult_QNAME, GetStoOrderListResult.class, GetStoOrderListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetStoOrderInfo.class)
    public JAXBElement<String> createGetStoOrderInfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetStoOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetStoOrderInfo.class)
    public JAXBElement<String> createGetStoOrderInfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetStoOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = GetStoOrderInfo.class)
    public JAXBElement<String> createGetStoOrderInfoOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, GetStoOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "dateTime", scope = GetStoOrderInfo.class)
    public JAXBElement<XMLGregorianCalendar> createGetStoOrderInfoDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_GetStoOrderInfoDateTime_QNAME, XMLGregorianCalendar.class, GetStoOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderID", scope = GetStoOrderInfo.class)
    public JAXBElement<Integer> createGetStoOrderInfoOrderID(Integer value) {
        return new JAXBElement<>(_GetStoOrderInfoOrderID_QNAME, Integer.class, GetStoOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStoOrderInfoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStoOrderInfoResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetStoOrderInfoResult", scope = GetStoOrderInfoResponse.class)
    public JAXBElement<GetStoOrderInfoResult> createGetStoOrderInfoResponseGetStoOrderInfoResult(GetStoOrderInfoResult value) {
        return new JAXBElement<>(_GetStoOrderInfoResponseGetStoOrderInfoResult_QNAME, GetStoOrderInfoResult.class, GetStoOrderInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetMX3List.class)
    public JAXBElement<String> createGetMX3ListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetMX3List.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetMX3List.class)
    public JAXBElement<String> createGetMX3ListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetMX3List.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMx3ListFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMx3ListFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetMX3List.class)
    public JAXBElement<GetMx3ListFilter> createGetMX3ListFilter(GetMx3ListFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetMx3ListFilter.class, GetMX3List.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMx3ListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMx3ListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetMX3ListResult", scope = GetMX3ListResponse.class)
    public JAXBElement<GetMx3ListResult> createGetMX3ListResponseGetMX3ListResult(GetMx3ListResult value) {
        return new JAXBElement<>(_GetMX3ListResponseGetMX3ListResult_QNAME, GetMx3ListResult.class, GetMX3ListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetMX3Info.class)
    public JAXBElement<String> createGetMX3InfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetMX3Info.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetMX3Info.class)
    public JAXBElement<String> createGetMX3InfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetMX3Info.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = GetMX3Info.class)
    public JAXBElement<String> createGetMX3InfoGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, GetMX3Info.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMX3InfoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMX3InfoResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetMX3InfoResult", scope = GetMX3InfoResponse.class)
    public JAXBElement<GetMX3InfoResult> createGetMX3InfoResponseGetMX3InfoResult(GetMX3InfoResult value) {
        return new JAXBElement<>(_GetMX3InfoResponseGetMX3InfoResult_QNAME, GetMX3InfoResult.class, GetMX3InfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetMX1List.class)
    public JAXBElement<String> createGetMX1ListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetMX1List.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetMX1List.class)
    public JAXBElement<String> createGetMX1ListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetMX1List.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMx1ListFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMx1ListFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetMX1List.class)
    public JAXBElement<GetMx1ListFilter> createGetMX1ListFilter(GetMx1ListFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetMx1ListFilter.class, GetMX1List.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMx1ListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMx1ListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetMX1ListResult", scope = GetMX1ListResponse.class)
    public JAXBElement<GetMx1ListResult> createGetMX1ListResponseGetMX1ListResult(GetMx1ListResult value) {
        return new JAXBElement<>(_GetMX1ListResponseGetMX1ListResult_QNAME, GetMx1ListResult.class, GetMX1ListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetMX1Info.class)
    public JAXBElement<String> createGetMX1InfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetMX1Info.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetMX1Info.class)
    public JAXBElement<String> createGetMX1InfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetMX1Info.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = GetMX1Info.class)
    public JAXBElement<String> createGetMX1InfoGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, GetMX1Info.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMX1InfoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMX1InfoResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetMX1InfoResult", scope = GetMX1InfoResponse.class)
    public JAXBElement<GetMX1InfoResult> createGetMX1InfoResponseGetMX1InfoResult(GetMX1InfoResult value) {
        return new JAXBElement<>(_GetMX1InfoResponseGetMX1InfoResult_QNAME, GetMX1InfoResult.class, GetMX1InfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetTKTerminalList.class)
    public JAXBElement<String> createGetTKTerminalListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetTKTerminalList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetTKTerminalList.class)
    public JAXBElement<String> createGetTKTerminalListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetTKTerminalList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = GetTKTerminalList.class)
    public JAXBElement<String> createGetTKTerminalListOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, GetTKTerminalList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTKTerminalListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTKTerminalListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetTKTerminalListResult", scope = GetTKTerminalListResponse.class)
    public JAXBElement<GetTKTerminalListResult> createGetTKTerminalListResponseGetTKTerminalListResult(GetTKTerminalListResult value) {
        return new JAXBElement<>(_GetTKTerminalListResponseGetTKTerminalListResult_QNAME, GetTKTerminalListResult.class, GetTKTerminalListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetTKTerminalPrice.class)
    public JAXBElement<String> createGetTKTerminalPriceLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetTKTerminalPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetTKTerminalPrice.class)
    public JAXBElement<String> createGetTKTerminalPricePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetTKTerminalPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = GetTKTerminalPrice.class)
    public JAXBElement<String> createGetTKTerminalPriceOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, GetTKTerminalPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTKTerminalPriceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTKTerminalPriceResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetTKTerminalPriceResult", scope = GetTKTerminalPriceResponse.class)
    public JAXBElement<GetTKTerminalPriceResult> createGetTKTerminalPriceResponseGetTKTerminalPriceResult(GetTKTerminalPriceResult value) {
        return new JAXBElement<>(_GetTKTerminalPriceResponseGetTKTerminalPriceResult_QNAME, GetTKTerminalPriceResult.class, GetTKTerminalPriceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetOrderDeliveryByTK.class)
    public JAXBElement<String> createSetOrderDeliveryByTKLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetOrderDeliveryByTK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetOrderDeliveryByTK.class)
    public JAXBElement<String> createSetOrderDeliveryByTKPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetOrderDeliveryByTK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetOrderDeliveryByTK.class)
    public JAXBElement<String> createSetOrderDeliveryByTKOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetOrderDeliveryByTK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrderDeliveryByTKResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetOrderDeliveryByTKResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetOrderDeliveryByTKResult", scope = SetOrderDeliveryByTKResponse.class)
    public JAXBElement<SetOrderDeliveryByTKResult> createSetOrderDeliveryByTKResponseSetOrderDeliveryByTKResult(SetOrderDeliveryByTKResult value) {
        return new JAXBElement<>(_SetOrderDeliveryByTKResponseSetOrderDeliveryByTKResult_QNAME, SetOrderDeliveryByTKResult.class, SetOrderDeliveryByTKResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetPurchaseReturnList.class)
    public JAXBElement<String> createGetPurchaseReturnListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetPurchaseReturnList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetPurchaseReturnList.class)
    public JAXBElement<String> createGetPurchaseReturnListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetPurchaseReturnList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseReturnListFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPurchaseReturnListFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetPurchaseReturnList.class)
    public JAXBElement<GetPurchaseReturnListFilter> createGetPurchaseReturnListFilter(GetPurchaseReturnListFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetPurchaseReturnListFilter.class, GetPurchaseReturnList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseReturnListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPurchaseReturnListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetPurchaseReturnListResult", scope = GetPurchaseReturnListResponse.class)
    public JAXBElement<GetPurchaseReturnListResult> createGetPurchaseReturnListResponseGetPurchaseReturnListResult(GetPurchaseReturnListResult value) {
        return new JAXBElement<>(_GetPurchaseReturnListResponseGetPurchaseReturnListResult_QNAME, GetPurchaseReturnListResult.class, GetPurchaseReturnListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetPurchaseReturnInfo.class)
    public JAXBElement<String> createGetPurchaseReturnInfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetPurchaseReturnInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetPurchaseReturnInfo.class)
    public JAXBElement<String> createGetPurchaseReturnInfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetPurchaseReturnInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "number", scope = GetPurchaseReturnInfo.class)
    public JAXBElement<String> createGetPurchaseReturnInfoNumber(String value) {
        return new JAXBElement<>(_GetSaleInfoNumber_QNAME, String.class, GetPurchaseReturnInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = GetPurchaseReturnInfo.class)
    public JAXBElement<String> createGetPurchaseReturnInfoGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, GetPurchaseReturnInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseReturnInfoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPurchaseReturnInfoResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetPurchaseReturnInfoResult", scope = GetPurchaseReturnInfoResponse.class)
    public JAXBElement<GetPurchaseReturnInfoResult> createGetPurchaseReturnInfoResponseGetPurchaseReturnInfoResult(GetPurchaseReturnInfoResult value) {
        return new JAXBElement<>(_GetPurchaseReturnInfoResponseGetPurchaseReturnInfoResult_QNAME, GetPurchaseReturnInfoResult.class, GetPurchaseReturnInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetRtuCorrectionList.class)
    public JAXBElement<String> createGetRtuCorrectionListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetRtuCorrectionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetRtuCorrectionList.class)
    public JAXBElement<String> createGetRtuCorrectionListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetRtuCorrectionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRtuCorrectionListFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRtuCorrectionListFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetRtuCorrectionList.class)
    public JAXBElement<GetRtuCorrectionListFilter> createGetRtuCorrectionListFilter(GetRtuCorrectionListFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetRtuCorrectionListFilter.class, GetRtuCorrectionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRtuCorrectionListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRtuCorrectionListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetRtuCorrectionListResult", scope = GetRtuCorrectionListResponse.class)
    public JAXBElement<GetRtuCorrectionListResult> createGetRtuCorrectionListResponseGetRtuCorrectionListResult(GetRtuCorrectionListResult value) {
        return new JAXBElement<>(_GetRtuCorrectionListResponseGetRtuCorrectionListResult_QNAME, GetRtuCorrectionListResult.class, GetRtuCorrectionListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetRtuCorrectionInfo.class)
    public JAXBElement<String> createGetRtuCorrectionInfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetRtuCorrectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetRtuCorrectionInfo.class)
    public JAXBElement<String> createGetRtuCorrectionInfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetRtuCorrectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "number", scope = GetRtuCorrectionInfo.class)
    public JAXBElement<String> createGetRtuCorrectionInfoNumber(String value) {
        return new JAXBElement<>(_GetSaleInfoNumber_QNAME, String.class, GetRtuCorrectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = GetRtuCorrectionInfo.class)
    public JAXBElement<String> createGetRtuCorrectionInfoGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, GetRtuCorrectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRtuCorrectionInfoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRtuCorrectionInfoResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetRtuCorrectionInfoResult", scope = GetRtuCorrectionInfoResponse.class)
    public JAXBElement<GetRtuCorrectionInfoResult> createGetRtuCorrectionInfoResponseGetRtuCorrectionInfoResult(GetRtuCorrectionInfoResult value) {
        return new JAXBElement<>(_GetRtuCorrectionInfoResponseGetRtuCorrectionInfoResult_QNAME, GetRtuCorrectionInfoResult.class, GetRtuCorrectionInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetWorkCompleted.class)
    public JAXBElement<String> createSetWorkCompletedLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetWorkCompleted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetWorkCompleted.class)
    public JAXBElement<String> createSetWorkCompletedPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetWorkCompleted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetWorkCompleted.class)
    public JAXBElement<String> createSetWorkCompletedOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetWorkCompleted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "code", scope = SetWorkCompleted.class)
    public JAXBElement<String> createSetWorkCompletedCode(String value) {
        return new JAXBElement<>(_SetWorkCompletedCode_QNAME, String.class, SetWorkCompleted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetWorkCompletedResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetWorkCompletedResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetWorkCompletedResult", scope = SetWorkCompletedResponse.class)
    public JAXBElement<SetWorkCompletedResult> createSetWorkCompletedResponseSetWorkCompletedResult(SetWorkCompletedResult value) {
        return new JAXBElement<>(_SetWorkCompletedResponseSetWorkCompletedResult_QNAME, SetWorkCompletedResult.class, SetWorkCompletedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SendPaymentToPhone.class)
    public JAXBElement<String> createSendPaymentToPhoneLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SendPaymentToPhone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SendPaymentToPhone.class)
    public JAXBElement<String> createSendPaymentToPhonePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SendPaymentToPhone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SendPaymentToPhone.class)
    public JAXBElement<String> createSendPaymentToPhoneOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SendPaymentToPhone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPaymentToPhoneResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendPaymentToPhoneResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SendPaymentToPhoneResult", scope = SendPaymentToPhoneResponse.class)
    public JAXBElement<SendPaymentToPhoneResult> createSendPaymentToPhoneResponseSendPaymentToPhoneResult(SendPaymentToPhoneResult value) {
        return new JAXBElement<>(_SendPaymentToPhoneResponseSendPaymentToPhoneResult_QNAME, SendPaymentToPhoneResult.class, SendPaymentToPhoneResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetReturnToOH.class)
    public JAXBElement<String> createSetReturnToOHLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetReturnToOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetReturnToOH.class)
    public JAXBElement<String> createSetReturnToOHPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetReturnToOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetReturnToOH.class)
    public JAXBElement<String> createSetReturnToOHOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetReturnToOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSetReturnToOhProductContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSetReturnToOhProductContainer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "productList", scope = SetReturnToOH.class)
    public JAXBElement<ArrayOfSetReturnToOhProductContainer> createSetReturnToOHProductList(ArrayOfSetReturnToOhProductContainer value) {
        return new JAXBElement<>(_SetReturnToOHProductList_QNAME, ArrayOfSetReturnToOhProductContainer.class, SetReturnToOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "markCodeList", scope = SetReturnToOH.class)
    public JAXBElement<ArrayOfstring> createSetReturnToOHMarkCodeList(ArrayOfstring value) {
        return new JAXBElement<>(_SetRemoveFromOHMarkCodeList_QNAME, ArrayOfstring.class, SetReturnToOH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetReturnToOhResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetReturnToOhResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetReturnToOHResult", scope = SetReturnToOHResponse.class)
    public JAXBElement<SetReturnToOhResult> createSetReturnToOHResponseSetReturnToOHResult(SetReturnToOhResult value) {
        return new JAXBElement<>(_SetReturnToOHResponseSetReturnToOHResult_QNAME, SetReturnToOhResult.class, SetReturnToOHResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetPrintableUpd.class)
    public JAXBElement<String> createGetPrintableUpdLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetPrintableUpd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetPrintableUpd.class)
    public JAXBElement<String> createGetPrintableUpdPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetPrintableUpd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = GetPrintableUpd.class)
    public JAXBElement<String> createGetPrintableUpdOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, GetPrintableUpd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrintableUpdResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPrintableUpdResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetPrintableUpdResult", scope = GetPrintableUpdResponse.class)
    public JAXBElement<GetPrintableUpdResult> createGetPrintableUpdResponseGetPrintableUpdResult(GetPrintableUpdResult value) {
        return new JAXBElement<>(_GetPrintableUpdResponseGetPrintableUpdResult_QNAME, GetPrintableUpdResult.class, GetPrintableUpdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SendVerificationCode.class)
    public JAXBElement<String> createSendVerificationCodeLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SendVerificationCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SendVerificationCode.class)
    public JAXBElement<String> createSendVerificationCodePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SendVerificationCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SendVerificationCode.class)
    public JAXBElement<String> createSendVerificationCodeOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SendVerificationCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendVerificationCodeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendVerificationCodeResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SendVerificationCodeResult", scope = SendVerificationCodeResponse.class)
    public JAXBElement<SendVerificationCodeResult> createSendVerificationCodeResponseSendVerificationCodeResult(SendVerificationCodeResult value) {
        return new JAXBElement<>(_SendVerificationCodeResponseSendVerificationCodeResult_QNAME, SendVerificationCodeResult.class, SendVerificationCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = CheckVerificationCode.class)
    public JAXBElement<String> createCheckVerificationCodeLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, CheckVerificationCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = CheckVerificationCode.class)
    public JAXBElement<String> createCheckVerificationCodePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, CheckVerificationCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = CheckVerificationCode.class)
    public JAXBElement<String> createCheckVerificationCodeOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, CheckVerificationCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "verificationCode", scope = CheckVerificationCode.class)
    public JAXBElement<String> createCheckVerificationCodeVerificationCode(String value) {
        return new JAXBElement<>(_SetStoRemoveFromOHVerificationCode_QNAME, String.class, CheckVerificationCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckVerificationCodeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckVerificationCodeResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "CheckVerificationCodeResult", scope = CheckVerificationCodeResponse.class)
    public JAXBElement<CheckVerificationCodeResult> createCheckVerificationCodeResponseCheckVerificationCodeResult(CheckVerificationCodeResult value) {
        return new JAXBElement<>(_CheckVerificationCodeResponseCheckVerificationCodeResult_QNAME, CheckVerificationCodeResult.class, CheckVerificationCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetStoDeclineServices.class)
    public JAXBElement<String> createSetStoDeclineServicesLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetStoDeclineServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetStoDeclineServices.class)
    public JAXBElement<String> createSetStoDeclineServicesPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetStoDeclineServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "orderNumber", scope = SetStoDeclineServices.class)
    public JAXBElement<String> createSetStoDeclineServicesOrderNumber(String value) {
        return new JAXBElement<>(_SetOrderStatusOrderNumber_QNAME, String.class, SetStoDeclineServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStoDeclineServicesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetStoDeclineServicesResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetStoDeclineServicesResult", scope = SetStoDeclineServicesResponse.class)
    public JAXBElement<SetStoDeclineServicesResult> createSetStoDeclineServicesResponseSetStoDeclineServicesResult(SetStoDeclineServicesResult value) {
        return new JAXBElement<>(_SetStoDeclineServicesResponseSetStoDeclineServicesResult_QNAME, SetStoDeclineServicesResult.class, SetStoDeclineServicesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetFindCamera.class)
    public JAXBElement<String> createGetFindCameraLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetFindCamera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetFindCamera.class)
    public JAXBElement<String> createGetFindCameraPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetFindCamera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFindCameraFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFindCameraFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetFindCamera.class)
    public JAXBElement<GetFindCameraFilter> createGetFindCameraFilter(GetFindCameraFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetFindCameraFilter.class, GetFindCamera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "pageSize", scope = GetFindCamera.class)
    public JAXBElement<Integer> createGetFindCameraPageSize(Integer value) {
        return new JAXBElement<>(_GetFindTyrePageSize_QNAME, Integer.class, GetFindCamera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFindCameraResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFindCameraResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetFindCameraResult", scope = GetFindCameraResponse.class)
    public JAXBElement<GetFindCameraResult> createGetFindCameraResponseGetFindCameraResult(GetFindCameraResult value) {
        return new JAXBElement<>(_GetFindCameraResponseGetFindCameraResult_QNAME, GetFindCameraResult.class, GetFindCameraResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = PutDeliveryAddress.class)
    public JAXBElement<String> createPutDeliveryAddressLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, PutDeliveryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = PutDeliveryAddress.class)
    public JAXBElement<String> createPutDeliveryAddressPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, PutDeliveryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDeliveryAddressParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PutDeliveryAddressParameters }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "parameters", scope = PutDeliveryAddress.class)
    public JAXBElement<PutDeliveryAddressParameters> createPutDeliveryAddressParameters(PutDeliveryAddressParameters value) {
        return new JAXBElement<>(_SetToMoveParameters_QNAME, PutDeliveryAddressParameters.class, PutDeliveryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDeliveryAddressResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PutDeliveryAddressResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "PutDeliveryAddressResult", scope = PutDeliveryAddressResponse.class)
    public JAXBElement<PutDeliveryAddressResult> createPutDeliveryAddressResponsePutDeliveryAddressResult(PutDeliveryAddressResult value) {
        return new JAXBElement<>(_PutDeliveryAddressResponsePutDeliveryAddressResult_QNAME, PutDeliveryAddressResult.class, PutDeliveryAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetSupplierPrice.class)
    public JAXBElement<String> createSetSupplierPriceLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetSupplierPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetSupplierPrice.class)
    public JAXBElement<String> createSetSupplierPricePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetSupplierPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSupplierPriceItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSupplierPriceItem }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "list", scope = SetSupplierPrice.class)
    public JAXBElement<ArrayOfSupplierPriceItem> createSetSupplierPriceList(ArrayOfSupplierPriceItem value) {
        return new JAXBElement<>(_SetRestList_QNAME, ArrayOfSupplierPriceItem.class, SetSupplierPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSupplierPriceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetSupplierPriceResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetSupplierPriceResult", scope = SetSupplierPriceResponse.class)
    public JAXBElement<SetSupplierPriceResult> createSetSupplierPriceResponseSetSupplierPriceResult(SetSupplierPriceResult value) {
        return new JAXBElement<>(_SetSupplierPriceResponseSetSupplierPriceResult_QNAME, SetSupplierPriceResult.class, SetSupplierPriceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetSupplierPrice.class)
    public JAXBElement<String> createGetSupplierPriceLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetSupplierPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetSupplierPrice.class)
    public JAXBElement<String> createGetSupplierPricePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetSupplierPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "codeList", scope = GetSupplierPrice.class)
    public JAXBElement<ArrayOfstring> createGetSupplierPriceCodeList(ArrayOfstring value) {
        return new JAXBElement<>(_GetSupplierPriceCodeList_QNAME, ArrayOfstring.class, GetSupplierPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierPriceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSupplierPriceResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetSupplierPriceResult", scope = GetSupplierPriceResponse.class)
    public JAXBElement<GetSupplierPriceResult> createGetSupplierPriceResponseGetSupplierPriceResult(GetSupplierPriceResult value) {
        return new JAXBElement<>(_GetSupplierPriceResponseGetSupplierPriceResult_QNAME, GetSupplierPriceResult.class, GetSupplierPriceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetOrderList.class)
    public JAXBElement<String> createGetOrderListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetOrderList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetOrderList.class)
    public JAXBElement<String> createGetOrderListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetOrderList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderListFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrderListFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetOrderList.class)
    public JAXBElement<GetOrderListFilter> createGetOrderListFilter(GetOrderListFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetOrderListFilter.class, GetOrderList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrderListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetOrderListResult", scope = GetOrderListResponse.class)
    public JAXBElement<GetOrderListResult> createGetOrderListResponseGetOrderListResult(GetOrderListResult value) {
        return new JAXBElement<>(_GetOrderListResponseGetOrderListResult_QNAME, GetOrderListResult.class, GetOrderListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetOrderInfo2 .class)
    public JAXBElement<String> createGetOrderInfo2Login(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetOrderInfo2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetOrderInfo2 .class)
    public JAXBElement<String> createGetOrderInfo2Password(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetOrderInfo2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderInfoResult2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrderInfoResult2 }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetOrderInfo2Result", scope = GetOrderInfo2Response.class)
    public JAXBElement<GetOrderInfoResult2> createGetOrderInfo2ResponseGetOrderInfo2Result(GetOrderInfoResult2 value) {
        return new JAXBElement<>(_GetOrderInfo2ResponseGetOrderInfo2Result_QNAME, GetOrderInfoResult2 .class, GetOrderInfo2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetReMarkingDocument.class)
    public JAXBElement<String> createGetReMarkingDocumentLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetReMarkingDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetReMarkingDocument.class)
    public JAXBElement<String> createGetReMarkingDocumentPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetReMarkingDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = GetReMarkingDocument.class)
    public JAXBElement<String> createGetReMarkingDocumentGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, GetReMarkingDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReMarkingDocumentResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReMarkingDocumentResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetReMarkingDocumentResult", scope = GetReMarkingDocumentResponse.class)
    public JAXBElement<GetReMarkingDocumentResult> createGetReMarkingDocumentResponseGetReMarkingDocumentResult(GetReMarkingDocumentResult value) {
        return new JAXBElement<>(_GetReMarkingDocumentResponseGetReMarkingDocumentResult_QNAME, GetReMarkingDocumentResult.class, GetReMarkingDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetReMarkingDocumentList.class)
    public JAXBElement<String> createGetReMarkingDocumentListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetReMarkingDocumentList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetReMarkingDocumentList.class)
    public JAXBElement<String> createGetReMarkingDocumentListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetReMarkingDocumentList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReMarkingDocumentListFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReMarkingDocumentListFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetReMarkingDocumentList.class)
    public JAXBElement<GetReMarkingDocumentListFilter> createGetReMarkingDocumentListFilter(GetReMarkingDocumentListFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetReMarkingDocumentListFilter.class, GetReMarkingDocumentList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReMarkingDocumentListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReMarkingDocumentListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetReMarkingDocumentListResult", scope = GetReMarkingDocumentListResponse.class)
    public JAXBElement<GetReMarkingDocumentListResult> createGetReMarkingDocumentListResponseGetReMarkingDocumentListResult(GetReMarkingDocumentListResult value) {
        return new JAXBElement<>(_GetReMarkingDocumentListResponseGetReMarkingDocumentListResult_QNAME, GetReMarkingDocumentListResult.class, GetReMarkingDocumentListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetReMarkingDocument.class)
    public JAXBElement<String> createSetReMarkingDocumentLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetReMarkingDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetReMarkingDocument.class)
    public JAXBElement<String> createSetReMarkingDocumentPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetReMarkingDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSetReMarkingDocumentItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSetReMarkingDocumentItem }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "parameters", scope = SetReMarkingDocument.class)
    public JAXBElement<ArrayOfSetReMarkingDocumentItem> createSetReMarkingDocumentParameters(ArrayOfSetReMarkingDocumentItem value) {
        return new JAXBElement<>(_SetToMoveParameters_QNAME, ArrayOfSetReMarkingDocumentItem.class, SetReMarkingDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetReMarkingDocumentResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetReMarkingDocumentResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetReMarkingDocumentResult", scope = SetReMarkingDocumentResponse.class)
    public JAXBElement<SetReMarkingDocumentResult> createSetReMarkingDocumentResponseSetReMarkingDocumentResult(SetReMarkingDocumentResult value) {
        return new JAXBElement<>(_SetReMarkingDocumentResponseSetReMarkingDocumentResult_QNAME, SetReMarkingDocumentResult.class, SetReMarkingDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetFindWheel.class)
    public JAXBElement<String> createGetFindWheelLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetFindWheel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetFindWheel.class)
    public JAXBElement<String> createGetFindWheelPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetFindWheel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFindWheelFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFindWheelFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetFindWheel.class)
    public JAXBElement<GetFindWheelFilter> createGetFindWheelFilter(GetFindWheelFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetFindWheelFilter.class, GetFindWheel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFindWheelResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFindWheelResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetFindWheelResult", scope = GetFindWheelResponse.class)
    public JAXBElement<GetFindWheelResult> createGetFindWheelResponseGetFindWheelResult(GetFindWheelResult value) {
        return new JAXBElement<>(_GetFindWheelResponseGetFindWheelResult_QNAME, GetFindWheelResult.class, GetFindWheelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = CheckVerificationCodeByQRCode.class)
    public JAXBElement<String> createCheckVerificationCodeByQRCodeLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, CheckVerificationCodeByQRCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = CheckVerificationCodeByQRCode.class)
    public JAXBElement<String> createCheckVerificationCodeByQRCodePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, CheckVerificationCodeByQRCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "qrCode", scope = CheckVerificationCodeByQRCode.class)
    public JAXBElement<String> createCheckVerificationCodeByQRCodeQrCode(String value) {
        return new JAXBElement<>(_CheckVerificationCodeByQRCodeQrCode_QNAME, String.class, CheckVerificationCodeByQRCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckVerificationCodeByQRCodeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckVerificationCodeByQRCodeResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "CheckVerificationCodeByQRCodeResult", scope = CheckVerificationCodeByQRCodeResponse.class)
    public JAXBElement<CheckVerificationCodeByQRCodeResult> createCheckVerificationCodeByQRCodeResponseCheckVerificationCodeByQRCodeResult(CheckVerificationCodeByQRCodeResult value) {
        return new JAXBElement<>(_CheckVerificationCodeByQRCodeResponseCheckVerificationCodeByQRCodeResult_QNAME, CheckVerificationCodeByQRCodeResult.class, CheckVerificationCodeByQRCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetInventoryList.class)
    public JAXBElement<String> createGetInventoryListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetInventoryList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetInventoryList.class)
    public JAXBElement<String> createGetInventoryListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetInventoryList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryListFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInventoryListFilter }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "filter", scope = GetInventoryList.class)
    public JAXBElement<GetInventoryListFilter> createGetInventoryListFilter(GetInventoryListFilter value) {
        return new JAXBElement<>(_GetFindTyreFilter_QNAME, GetInventoryListFilter.class, GetInventoryList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "pageSize", scope = GetInventoryList.class)
    public JAXBElement<Integer> createGetInventoryListPageSize(Integer value) {
        return new JAXBElement<>(_GetFindTyrePageSize_QNAME, Integer.class, GetInventoryList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInventoryListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetInventoryListResult", scope = GetInventoryListResponse.class)
    public JAXBElement<GetInventoryListResult> createGetInventoryListResponseGetInventoryListResult(GetInventoryListResult value) {
        return new JAXBElement<>(_GetInventoryListResponseGetInventoryListResult_QNAME, GetInventoryListResult.class, GetInventoryListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetInventoryInfo.class)
    public JAXBElement<String> createGetInventoryInfoLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetInventoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetInventoryInfo.class)
    public JAXBElement<String> createGetInventoryInfoPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetInventoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = GetInventoryInfo.class)
    public JAXBElement<String> createGetInventoryInfoGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, GetInventoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryInfoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInventoryInfoResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetInventoryInfoResult", scope = GetInventoryInfoResponse.class)
    public JAXBElement<GetInventoryInfoResult> createGetInventoryInfoResponseGetInventoryInfoResult(GetInventoryInfoResult value) {
        return new JAXBElement<>(_GetInventoryInfoResponseGetInventoryInfoResult_QNAME, GetInventoryInfoResult.class, GetInventoryInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetAvailableWarehousesForInventory.class)
    public JAXBElement<String> createGetAvailableWarehousesForInventoryLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetAvailableWarehousesForInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetAvailableWarehousesForInventory.class)
    public JAXBElement<String> createGetAvailableWarehousesForInventoryPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetAvailableWarehousesForInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableWarehousesForInventoryResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAvailableWarehousesForInventoryResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetAvailableWarehousesForInventoryResult", scope = GetAvailableWarehousesForInventoryResponse.class)
    public JAXBElement<GetAvailableWarehousesForInventoryResult> createGetAvailableWarehousesForInventoryResponseGetAvailableWarehousesForInventoryResult(GetAvailableWarehousesForInventoryResult value) {
        return new JAXBElement<>(_GetAvailableWarehousesForInventoryResponseGetAvailableWarehousesForInventoryResult_QNAME, GetAvailableWarehousesForInventoryResult.class, GetAvailableWarehousesForInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = CreateInventory.class)
    public JAXBElement<String> createCreateInventoryLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, CreateInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = CreateInventory.class)
    public JAXBElement<String> createCreateInventoryPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, CreateInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "scannerType", scope = CreateInventory.class)
    public JAXBElement<Short> createCreateInventoryScannerType(Short value) {
        return new JAXBElement<>(_CreateInventoryScannerType_QNAME, Short.class, CreateInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInventoryResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateInventoryResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "CreateInventoryResult", scope = CreateInventoryResponse.class)
    public JAXBElement<CreateInventoryResult> createCreateInventoryResponseCreateInventoryResult(CreateInventoryResult value) {
        return new JAXBElement<>(_CreateInventoryResponseCreateInventoryResult_QNAME, CreateInventoryResult.class, CreateInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = CancelInventory.class)
    public JAXBElement<String> createCancelInventoryLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, CancelInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = CancelInventory.class)
    public JAXBElement<String> createCancelInventoryPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, CancelInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = CancelInventory.class)
    public JAXBElement<String> createCancelInventoryGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, CancelInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelInventoryResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelInventoryResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "CancelInventoryResult", scope = CancelInventoryResponse.class)
    public JAXBElement<CancelInventoryResult> createCancelInventoryResponseCancelInventoryResult(CancelInventoryResult value) {
        return new JAXBElement<>(_CancelInventoryResponseCancelInventoryResult_QNAME, CancelInventoryResult.class, CancelInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SaveInventory.class)
    public JAXBElement<String> createSaveInventoryLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SaveInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SaveInventory.class)
    public JAXBElement<String> createSaveInventoryPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SaveInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = SaveInventory.class)
    public JAXBElement<String> createSaveInventoryGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, SaveInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "responsiblePerson", scope = SaveInventory.class)
    public JAXBElement<String> createSaveInventoryResponsiblePerson(String value) {
        return new JAXBElement<>(_SaveInventoryResponsiblePerson_QNAME, String.class, SaveInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryMarkCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryMarkCode }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "markCodeList", scope = SaveInventory.class)
    public JAXBElement<ArrayOfSaveInventoryMarkCode> createSaveInventoryMarkCodeList(ArrayOfSaveInventoryMarkCode value) {
        return new JAXBElement<>(_SetRemoveFromOHMarkCodeList_QNAME, ArrayOfSaveInventoryMarkCode.class, SaveInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryProduct }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "productList", scope = SaveInventory.class)
    public JAXBElement<ArrayOfSaveInventoryProduct> createSaveInventoryProductList(ArrayOfSaveInventoryProduct value) {
        return new JAXBElement<>(_SetReturnToOHProductList_QNAME, ArrayOfSaveInventoryProduct.class, SaveInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveInventoryResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveInventoryResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SaveInventoryResult", scope = SaveInventoryResponse.class)
    public JAXBElement<SaveInventoryResult> createSaveInventoryResponseSaveInventoryResult(SaveInventoryResult value) {
        return new JAXBElement<>(_SaveInventoryResponseSaveInventoryResult_QNAME, SaveInventoryResult.class, SaveInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = FinishInventory.class)
    public JAXBElement<String> createFinishInventoryLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, FinishInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = FinishInventory.class)
    public JAXBElement<String> createFinishInventoryPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, FinishInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = FinishInventory.class)
    public JAXBElement<String> createFinishInventoryGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, FinishInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "responsiblePerson", scope = FinishInventory.class)
    public JAXBElement<String> createFinishInventoryResponsiblePerson(String value) {
        return new JAXBElement<>(_SaveInventoryResponsiblePerson_QNAME, String.class, FinishInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryMarkCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryMarkCode }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "markCodeList", scope = FinishInventory.class)
    public JAXBElement<ArrayOfSaveInventoryMarkCode> createFinishInventoryMarkCodeList(ArrayOfSaveInventoryMarkCode value) {
        return new JAXBElement<>(_SetRemoveFromOHMarkCodeList_QNAME, ArrayOfSaveInventoryMarkCode.class, FinishInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryProduct }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "productList", scope = FinishInventory.class)
    public JAXBElement<ArrayOfSaveInventoryProduct> createFinishInventoryProductList(ArrayOfSaveInventoryProduct value) {
        return new JAXBElement<>(_SetReturnToOHProductList_QNAME, ArrayOfSaveInventoryProduct.class, FinishInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinishInventoryResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinishInventoryResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "FinishInventoryResult", scope = FinishInventoryResponse.class)
    public JAXBElement<FinishInventoryResult> createFinishInventoryResponseFinishInventoryResult(FinishInventoryResult value) {
        return new JAXBElement<>(_FinishInventoryResponseFinishInventoryResult_QNAME, FinishInventoryResult.class, FinishInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = CheckInventoryMarkCode.class)
    public JAXBElement<String> createCheckInventoryMarkCodeLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, CheckInventoryMarkCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = CheckInventoryMarkCode.class)
    public JAXBElement<String> createCheckInventoryMarkCodePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, CheckInventoryMarkCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "guid", scope = CheckInventoryMarkCode.class)
    public JAXBElement<String> createCheckInventoryMarkCodeGuid(String value) {
        return new JAXBElement<>(_GetMovementInfoGuid_QNAME, String.class, CheckInventoryMarkCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "markCodeString", scope = CheckInventoryMarkCode.class)
    public JAXBElement<String> createCheckInventoryMarkCodeMarkCodeString(String value) {
        return new JAXBElement<>(_CheckInventoryMarkCodeMarkCodeString_QNAME, String.class, CheckInventoryMarkCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInventoryMarkCodeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckInventoryMarkCodeResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "CheckInventoryMarkCodeResult", scope = CheckInventoryMarkCodeResponse.class)
    public JAXBElement<CheckInventoryMarkCodeResult> createCheckInventoryMarkCodeResponseCheckInventoryMarkCodeResult(CheckInventoryMarkCodeResult value) {
        return new JAXBElement<>(_CheckInventoryMarkCodeResponseCheckInventoryMarkCodeResult_QNAME, CheckInventoryMarkCodeResult.class, CheckInventoryMarkCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetOrderUpdate.class)
    public JAXBElement<String> createSetOrderUpdateLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetOrderUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetOrderUpdate.class)
    public JAXBElement<String> createSetOrderUpdatePassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetOrderUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrderUpdateParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetOrderUpdateParameters }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "parameters", scope = SetOrderUpdate.class)
    public JAXBElement<SetOrderUpdateParameters> createSetOrderUpdateParameters(SetOrderUpdateParameters value) {
        return new JAXBElement<>(_SetToMoveParameters_QNAME, SetOrderUpdateParameters.class, SetOrderUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrderUpdateResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetOrderUpdateResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetOrderUpdateResult", scope = SetOrderUpdateResponse.class)
    public JAXBElement<SetOrderUpdateResult> createSetOrderUpdateResponseSetOrderUpdateResult(SetOrderUpdateResult value) {
        return new JAXBElement<>(_SetOrderUpdateResponseSetOrderUpdateResult_QNAME, SetOrderUpdateResult.class, SetOrderUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetOrderCustomerList.class)
    public JAXBElement<String> createGetOrderCustomerListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetOrderCustomerList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetOrderCustomerList.class)
    public JAXBElement<String> createGetOrderCustomerListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetOrderCustomerList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderCustomerListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrderCustomerListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetOrderCustomerListResult", scope = GetOrderCustomerListResponse.class)
    public JAXBElement<GetOrderCustomerListResult> createGetOrderCustomerListResponseGetOrderCustomerListResult(GetOrderCustomerListResult value) {
        return new JAXBElement<>(_GetOrderCustomerListResponseGetOrderCustomerListResult_QNAME, GetOrderCustomerListResult.class, GetOrderCustomerListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = GetCustomerList.class)
    public JAXBElement<String> createGetCustomerListLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, GetCustomerList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = GetCustomerList.class)
    public JAXBElement<String> createGetCustomerListPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, GetCustomerList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerListResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "GetCustomerListResult", scope = GetCustomerListResponse.class)
    public JAXBElement<GetCustomerListResult> createGetCustomerListResponseGetCustomerListResult(GetCustomerListResult value) {
        return new JAXBElement<>(_GetCustomerListResponseGetCustomerListResult_QNAME, GetCustomerListResult.class, GetCustomerListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "login", scope = SetMoveServicesToNewOrder.class)
    public JAXBElement<String> createSetMoveServicesToNewOrderLogin(String value) {
        return new JAXBElement<>(_GetFindTyreLogin_QNAME, String.class, SetMoveServicesToNewOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "password", scope = SetMoveServicesToNewOrder.class)
    public JAXBElement<String> createSetMoveServicesToNewOrderPassword(String value) {
        return new JAXBElement<>(_GetFindTyrePassword_QNAME, String.class, SetMoveServicesToNewOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMoveServicesToNewOrderResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetMoveServicesToNewOrderResult }{@code >}
     */
    @XmlElementDecl(namespace = "Wcf.ClientService.Client.WebAPI.TS3", name = "SetMoveServicesToNewOrderResult", scope = SetMoveServicesToNewOrderResponse.class)
    public JAXBElement<SetMoveServicesToNewOrderResult> createSetMoveServicesToNewOrderResponseSetMoveServicesToNewOrderResult(SetMoveServicesToNewOrderResult value) {
        return new JAXBElement<>(_SetMoveServicesToNewOrderResponseSetMoveServicesToNewOrderResult_QNAME, SetMoveServicesToNewOrderResult.class, SetMoveServicesToNewOrderResponse.class, value);
    }

}
