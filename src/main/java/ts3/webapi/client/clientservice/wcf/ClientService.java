
package ts3.webapi.client.clientservice.wcf;

import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;
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
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModelAvto;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModificationAvto;
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
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetYearAvto;
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
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ClientService", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class,
    org.datacontract.schemas._2004._07.ts3_domain_models_client.ObjectFactory.class,
    org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ObjectFactory.class,
    org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc.ObjectFactory.class,
    ts3.webapi.client.clientservice.wcf.ObjectFactory.class
})
public interface ClientService {


    /**
     * 
     * @param filter
     * @param login
     * @param page
     * @param pageSize
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ResultFindTyre
     */
    @WebMethod(operationName = "GetFindTyre", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetFindTyre")
    @WebResult(name = "GetFindTyreResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetFindTyre", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetFindTyre")
    @ResponseWrapper(localName = "GetFindTyreResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetFindTyreResponse")
    public ResultFindTyre getFindTyre(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        FindTyreFilter filter,
        @WebParam(name = "page", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer page,
        @WebParam(name = "pageSize", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer pageSize);

    /**
     * 
     * @param filter
     * @param login
     * @param page
     * @param pageSize
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ResultFindDisk
     */
    @WebMethod(operationName = "GetFindDisk", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetFindDisk")
    @WebResult(name = "GetFindDiskResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetFindDisk", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetFindDisk")
    @ResponseWrapper(localName = "GetFindDiskResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetFindDiskResponse")
    public ResultFindDisk getFindDisk(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        FindDiskFilter filter,
        @WebParam(name = "page", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer page,
        @WebParam(name = "pageSize", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer pageSize);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetGoodsPriceRestByCodeResult
     */
    @WebMethod(operationName = "GetGoodsPriceRestByCode", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetGoodsPriceRestByCode")
    @WebResult(name = "GetGoodsPriceRestByCodeResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetGoodsPriceRestByCode", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetGoodsPriceRestByCode")
    @ResponseWrapper(localName = "GetGoodsPriceRestByCodeResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetGoodsPriceRestByCodeResponse")
    public GetGoodsPriceRestByCodeResult getGoodsPriceRestByCode(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GoodsPriceRestFilter filter);

    /**
     * 
     * @param codeList
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ResultGetGoodsInfo
     */
    @WebMethod(operationName = "GetGoodsInfo", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetGoodsInfo")
    @WebResult(name = "GetGoodsInfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetGoodsInfo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetGoodsInfo")
    @ResponseWrapper(localName = "GetGoodsInfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetGoodsInfoResponse")
    public ResultGetGoodsInfo getGoodsInfo(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "code_list", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfstring codeList);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetGoodsByCarResult
     */
    @WebMethod(operationName = "GetGoodsByCar", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetGoodsByCar")
    @WebResult(name = "GetGoodsByCarResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetGoodsByCar", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetGoodsByCar")
    @ResponseWrapper(localName = "GetGoodsByCarResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetGoodsByCarResponse")
    public GetGoodsByCarResult getGoodsByCar(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetGoodsByCarFilter filter);

    /**
     * 
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMarkaAvtoResult
     */
    @WebMethod(operationName = "GetMarkaAvto", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetMarkaAvto")
    @WebResult(name = "GetMarkaAvtoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetMarkaAvto", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMarkaAvto")
    @ResponseWrapper(localName = "GetMarkaAvtoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMarkaAvtoResponse")
    public GetMarkaAvtoResult getMarkaAvto(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password);

    /**
     * 
     * @param login
     * @param marka
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModelAvto
     */
    @WebMethod(operationName = "GetModelAvto", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetModelAvto")
    @WebResult(name = "GetModelAvtoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetModelAvto", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetModelAvto")
    @ResponseWrapper(localName = "GetModelAvtoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetModelAvtoResponse")
    public GetModelAvto getModelAvto(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "marka", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String marka);

    /**
     * 
     * @param login
     * @param marka
     * @param model
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetYearAvto
     */
    @WebMethod(operationName = "GetYearAvto", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetYearAvto")
    @WebResult(name = "GetYearAvtoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetYearAvto", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetYearAvto")
    @ResponseWrapper(localName = "GetYearAvtoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetYearAvtoResponse")
    public GetYearAvto getYearAvto(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "marka", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String marka,
        @WebParam(name = "model", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String model);

    /**
     * 
     * @param login
     * @param marka
     * @param model
     * @param password
     * @param yearBeg
     * @param yearEnd
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetModificationAvto
     */
    @WebMethod(operationName = "GetModificationAvto", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetModificationAvto")
    @WebResult(name = "GetModificationAvtoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetModificationAvto", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetModificationAvto")
    @ResponseWrapper(localName = "GetModificationAvtoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetModificationAvtoResponse")
    public GetModificationAvto getModificationAvto(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "marka", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String marka,
        @WebParam(name = "model", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String model,
        @WebParam(name = "year_beg", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer yearBeg,
        @WebParam(name = "year_end", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer yearEnd);

    /**
     * 
     * @param list
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetRestResult
     */
    @WebMethod(operationName = "SetRest", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetRest")
    @WebResult(name = "SetRestResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetRest", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetRest")
    @ResponseWrapper(localName = "SetRestResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetRestResponse")
    public SetRestResult setRest(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "list", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfRestList list);

    /**
     * 
     * @param list
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetPriceResult
     */
    @WebMethod(operationName = "SetPrice", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetPrice")
    @WebResult(name = "SetPriceResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetPrice", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetPrice")
    @ResponseWrapper(localName = "SetPriceResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetPriceResponse")
    public SetPriceResult setPrice(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "list", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfPriceList list);

    /**
     * 
     * @param login
     * @param order
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CreateOrderResult
     */
    @WebMethod(operationName = "CreateOrder", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/CreateOrder")
    @WebResult(name = "CreateOrderResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "CreateOrder", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CreateOrder")
    @ResponseWrapper(localName = "CreateOrderResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CreateOrderResponse")
    public CreateOrderResult createOrder(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "order", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Order order);

    /**
     * 
     * @param login
     * @param marketplaceOrder
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CreateOrderResult
     */
    @WebMethod(operationName = "CreateMarketplaceOrder", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/CreateMarketplaceOrder")
    @WebResult(name = "CreateMarketplaceOrderResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "CreateMarketplaceOrder", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CreateMarketplaceOrder")
    @ResponseWrapper(localName = "CreateMarketplaceOrderResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CreateMarketplaceOrderResponse")
    public CreateOrderResult createMarketplaceOrder(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "marketplaceOrder", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        CreateMarketplaceOrderParameters marketplaceOrder);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetChangeOrderResult
     */
    @WebMethod(operationName = "GetChangeOrder", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetChangeOrder")
    @WebResult(name = "GetChangeOrderResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetChangeOrder", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetChangeOrder")
    @ResponseWrapper(localName = "GetChangeOrderResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetChangeOrderResponse")
    public GetChangeOrderResult getChangeOrder(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        FindChangeOrderFilter filter);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @param statusID
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ClientSoapResultDM
     */
    @WebMethod(operationName = "SetOrderStatus", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetOrderStatus")
    @WebResult(name = "SetOrderStatusResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetOrderStatus", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderStatus")
    @ResponseWrapper(localName = "SetOrderStatusResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderStatusResponse")
    public ClientSoapResultDM setOrderStatus(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "statusID", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer statusID);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @param statusID
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ClientSoapResultDM
     */
    @WebMethod(operationName = "SetOrderStatusSatellite", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetOrderStatusSatellite")
    @WebResult(name = "SetOrderStatusSatelliteResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetOrderStatusSatellite", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderStatusSatellite")
    @ResponseWrapper(localName = "SetOrderStatusSatelliteResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderStatusSatelliteResponse")
    public ClientSoapResultDM setOrderStatusSatellite(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "statusID", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer statusID);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfGetOrderStatusResult
     */
    @WebMethod(operationName = "GetOrderStatus", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetOrderStatus")
    @WebResult(name = "GetOrderStatusResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetOrderStatus", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderStatus")
    @ResponseWrapper(localName = "GetOrderStatusResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderStatusResponse")
    public ArrayOfGetOrderStatusResult getOrderStatus(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        FindOrderFilter filter);

    /**
     * 
     * @param login
     * @param orderNumberList
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetMergeOrdersResult
     */
    @WebMethod(operationName = "SetMergeOrders", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetMergeOrders")
    @WebResult(name = "SetMergeOrdersResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetMergeOrders", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetMergeOrders")
    @ResponseWrapper(localName = "SetMergeOrdersResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetMergeOrdersResponse")
    public SetMergeOrdersResult setMergeOrders(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber_list", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfstring orderNumberList);

    /**
     * 
     * @param date
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderInfoResult
     */
    @WebMethod(operationName = "GetOrderInfo", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetOrderInfo")
    @WebResult(name = "GetOrderInfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetOrderInfo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderInfo")
    @ResponseWrapper(localName = "GetOrderInfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderInfoResponse")
    public GetOrderInfoResult getOrderInfo(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "date", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        XMLGregorianCalendar date);

    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfGetStatusListResult
     */
    @WebMethod(operationName = "GetStatusList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetStatusList")
    @WebResult(name = "GetStatusListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetStatusList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetStatusList")
    @ResponseWrapper(localName = "GetStatusListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetStatusListResponse")
    public ArrayOfGetStatusListResult getStatusList();

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderCommentResult
     */
    @WebMethod(operationName = "GetOrderComment", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetOrderComment")
    @WebResult(name = "GetOrderCommentResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetOrderComment", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderComment")
    @ResponseWrapper(localName = "GetOrderCommentResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderCommentResponse")
    public GetOrderCommentResult getOrderComment(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        FindOrderCommentFilter filter);

    /**
     * 
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetUserListResult
     */
    @WebMethod(operationName = "GetUserList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetUserList")
    @WebResult(name = "GetUserListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetUserList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetUserList")
    @ResponseWrapper(localName = "GetUserListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetUserListResponse")
    public GetUserListResult getUserList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password);

    /**
     * 
     * @param comment
     * @param isForManagerPISH
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderCommentResult
     */
    @WebMethod(operationName = "SetOrderComment", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetOrderComment")
    @WebResult(name = "SetOrderCommentResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetOrderComment", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderComment")
    @ResponseWrapper(localName = "SetOrderCommentResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderCommentResponse")
    public SetOrderCommentResult setOrderComment(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "comment", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String comment,
        @WebParam(name = "isForManagerPISH", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Boolean isForManagerPISH);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ResultSetCancelDelivery
     */
    @WebMethod(operationName = "SetCancelDelivery", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetCancelDelivery")
    @WebResult(name = "SetCancelDeliveryResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetCancelDelivery", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetCancelDelivery")
    @ResponseWrapper(localName = "SetCancelDeliveryResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetCancelDeliveryResponse")
    public ResultSetCancelDelivery setCancelDelivery(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber);

    /**
     * 
     * @param deliveryInfo
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetDeliveryInfoResult
     */
    @WebMethod(operationName = "SetDeliveryInfo", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetDeliveryInfo")
    @WebResult(name = "SetDeliveryInfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetDeliveryInfo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetDeliveryInfo")
    @ResponseWrapper(localName = "SetDeliveryInfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetDeliveryInfoResponse")
    public SetDeliveryInfoResult setDeliveryInfo(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "deliveryInfo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        DeliveryInfoContainer deliveryInfo);

    /**
     * 
     * @param addressId
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetWarehousesResult
     */
    @WebMethod(operationName = "GetWarehouses", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetWarehouses")
    @WebResult(name = "GetWarehousesResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetWarehouses", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetWarehouses")
    @ResponseWrapper(localName = "GetWarehousesResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetWarehousesResponse")
    public GetWarehousesResult getWarehouses(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "addressId", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer addressId);

    /**
     * 
     * @param login
     * @param password
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Ping", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/Ping")
    @WebResult(name = "PingResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "Ping", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.PingResponse")
    public Boolean ping(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password);

    /**
     * 
     * @param login
     * @param parameters
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ClientSoapResultDM
     */
    @WebMethod(operationName = "SetToMove", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetToMove")
    @WebResult(name = "SetToMoveResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetToMove", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetToMove")
    @ResponseWrapper(localName = "SetToMoveResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetToMoveResponse")
    public ClientSoapResultDM setToMove(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "parameters", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Params parameters);

    /**
     * 
     * @param login
     * @param parameters
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc.TireCalcResult
     */
    @WebMethod(operationName = "TireCalc", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/TireCalc")
    @WebResult(name = "TireCalcResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "TireCalc", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.TireCalc")
    @ResponseWrapper(localName = "TireCalcResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.TireCalcResponse")
    public TireCalcResult tireCalc(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "parameters", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        TireCalcParameters parameters);

    /**
     * 
     * @param filter
     * @param login
     * @param page
     * @param pageSize
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPressureSensorResult
     */
    @WebMethod(operationName = "GetPressureSensor", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetPressureSensor")
    @WebResult(name = "GetPressureSensorResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetPressureSensor", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetPressureSensor")
    @ResponseWrapper(localName = "GetPressureSensorResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetPressureSensorResponse")
    public GetPressureSensorResult getPressureSensor(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetPressureSensorFilter filter,
        @WebParam(name = "page", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer page,
        @WebParam(name = "pageSize", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer pageSize);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.OrderReadyToWaitResult
     */
    @WebMethod(operationName = "OrderReadyToWait", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/OrderReadyToWait")
    @WebResult(name = "OrderReadyToWaitResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "OrderReadyToWait", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.OrderReadyToWait")
    @ResponseWrapper(localName = "OrderReadyToWaitResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.OrderReadyToWaitResponse")
    public OrderReadyToWaitResult orderReadyToWait(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber);

    /**
     * 
     * @param login
     * @param password
     * @param proposal
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result
     */
    @WebMethod(operationName = "ProposeGoods", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/ProposeGoods")
    @WebResult(name = "ProposeGoodsResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "ProposeGoods", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.ProposeGoods")
    @ResponseWrapper(localName = "ProposeGoodsResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.ProposeGoodsResponse")
    public Result proposeGoods(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "proposal", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ProposeGoodsContainer proposal);

    /**
     * 
     * @param idStoreFrom
     * @param idStoreTo
     * @param login
     * @param orderNumberList
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result2
     */
    @WebMethod(operationName = "CreateMovement", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/CreateMovement")
    @WebResult(name = "CreateMovementResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "CreateMovement", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CreateMovement")
    @ResponseWrapper(localName = "CreateMovementResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CreateMovementResponse")
    public Result2 createMovement(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "idStoreFrom", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer idStoreFrom,
        @WebParam(name = "idStoreTo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer idStoreTo,
        @WebParam(name = "orderNumberList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfstring orderNumberList);

    /**
     * 
     * @param login
     * @param movementNumber
     * @param password
     * @param statusId
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result3
     */
    @WebMethod(operationName = "SetMovementStatus", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetMovementStatus")
    @WebResult(name = "SetMovementStatusResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetMovementStatus", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetMovementStatus")
    @ResponseWrapper(localName = "SetMovementStatusResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetMovementStatusResponse")
    public Result3 setMovementStatus(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "movementNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String movementNumber,
        @WebParam(name = "statusId", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer statusId);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMovementListResult
     */
    @WebMethod(operationName = "GetMovementList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetMovementList")
    @WebResult(name = "GetMovementListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetMovementList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMovementList")
    @ResponseWrapper(localName = "GetMovementListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMovementListResponse")
    public GetMovementListResult getMovementList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        MovementFilter filter);

    /**
     * 
     * @param guid
     * @param login
     * @param movementNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.MovementInfoContainer
     */
    @WebMethod(operationName = "GetMovementInfo", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetMovementInfo")
    @WebResult(name = "GetMovementInfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetMovementInfo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMovementInfo")
    @ResponseWrapper(localName = "GetMovementInfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMovementInfoResponse")
    public MovementInfoContainer getMovementInfo(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "movementNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String movementNumber,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid);

    /**
     * 
     * @param filter
     * @param login
     * @param page
     * @param pageSize
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFastenerResult
     */
    @WebMethod(operationName = "GetFastener", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetFastener")
    @WebResult(name = "GetFastenerResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetFastener", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetFastener")
    @ResponseWrapper(localName = "GetFastenerResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetFastenerResponse")
    public GetFastenerResult getFastener(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetFastenerFilter filter,
        @WebParam(name = "page", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer page,
        @WebParam(name = "pageSize", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer pageSize);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetAddressListResult
     */
    @WebMethod(operationName = "GetAddressList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetAddressList")
    @WebResult(name = "GetAddressListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetAddressList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetAddressList")
    @ResponseWrapper(localName = "GetAddressListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetAddressListResponse")
    public GetAddressListResult getAddressList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetAddressListFilter filter);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetDeliveryPeriodResult
     */
    @WebMethod(operationName = "GetDeliveryPeriod", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetDeliveryPeriod")
    @WebResult(name = "GetDeliveryPeriodResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetDeliveryPeriod", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetDeliveryPeriod")
    @ResponseWrapper(localName = "GetDeliveryPeriodResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetDeliveryPeriodResponse")
    public GetDeliveryPeriodResult getDeliveryPeriod(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber);

    /**
     * 
     * @param login
     * @param parameters
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetDeliveryAddresResultContainer
     */
    @WebMethod(operationName = "SetDeliveryAddress", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetDeliveryAddress")
    @WebResult(name = "SetDeliveryAddressResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetDeliveryAddress", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetDeliveryAddress")
    @ResponseWrapper(localName = "SetDeliveryAddressResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetDeliveryAddressResponse")
    public SetDeliveryAddresResultContainer setDeliveryAddress(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "parameters", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        SetDeliveryAddressParams parameters);

    /**
     * 
     * @param login
     * @param parameters
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderDeliveryResult
     */
    @WebMethod(operationName = "SetOrderDelivery", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetOrderDelivery")
    @WebResult(name = "SetOrderDeliveryResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetOrderDelivery", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderDelivery")
    @ResponseWrapper(localName = "SetOrderDeliveryResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderDeliveryResponse")
    public SetOrderDeliveryResult setOrderDelivery(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "parameters", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        SetOrderDeliveryParameters parameters);

    /**
     * 
     * @param login
     * @param markCodeList
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result4
     */
    @WebMethod(operationName = "SetRemoveFromOH", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetRemoveFromOH")
    @WebResult(name = "SetRemoveFromOHResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetRemoveFromOH", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetRemoveFromOH")
    @ResponseWrapper(localName = "SetRemoveFromOHResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetRemoveFromOHResponse")
    public Result4 setRemoveFromOH(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "markCodeList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfstring markCodeList);

    /**
     * 
     * @param login
     * @param markCodeList
     * @param orderNumber
     * @param password
     * @param verificationCode
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result5
     */
    @WebMethod(operationName = "SetStoRemoveFromOH", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetStoRemoveFromOH")
    @WebResult(name = "SetStoRemoveFromOHResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetStoRemoveFromOH", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetStoRemoveFromOH")
    @ResponseWrapper(localName = "SetStoRemoveFromOHResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetStoRemoveFromOHResponse")
    public Result5 setStoRemoveFromOH(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "verificationCode", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String verificationCode,
        @WebParam(name = "markCodeList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfstring markCodeList);

    /**
     * 
     * @param login
     * @param markCodeList
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result6
     */
    @WebMethod(operationName = "SetMarkCodeList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetMarkCodeList")
    @WebResult(name = "SetMarkCodeListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetMarkCodeList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetMarkCodeList")
    @ResponseWrapper(localName = "SetMarkCodeListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetMarkCodeListResponse")
    public Result6 setMarkCodeList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "markCodeList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfstring markCodeList);

    /**
     * 
     * @param guid
     * @param login
     * @param number
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result7
     */
    @WebMethod(operationName = "GetSaleInfo", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetSaleInfo")
    @WebResult(name = "GetSaleInfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetSaleInfo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetSaleInfo")
    @ResponseWrapper(localName = "GetSaleInfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetSaleInfoResponse")
    public Result7 getSaleInfo(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "number", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String number,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.Result8
     */
    @WebMethod(operationName = "GetSaleList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetSaleList")
    @WebResult(name = "GetSaleListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetSaleList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetSaleList")
    @ResponseWrapper(localName = "GetSaleListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetSaleListResponse")
    public Result8 getSaleList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        SaleFilter filter);

    /**
     * 
     * @param filter
     * @param login
     * @param page
     * @param pageSize
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetConsumableResult
     */
    @WebMethod(operationName = "GetConsumable", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetConsumable")
    @WebResult(name = "GetConsumableResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetConsumable", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetConsumable")
    @ResponseWrapper(localName = "GetConsumableResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetConsumableResponse")
    public GetConsumableResult getConsumable(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetConsumableFilter filter,
        @WebParam(name = "page", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer page,
        @WebParam(name = "pageSize", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer pageSize);

    /**
     * 
     * @param consigneeCreateContainer
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ConsigneeResult
     */
    @WebMethod(operationName = "CreateConsignee", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/CreateConsignee")
    @WebResult(name = "CreateConsigneeResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "CreateConsignee", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CreateConsignee")
    @ResponseWrapper(localName = "CreateConsigneeResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CreateConsigneeResponse")
    public ConsigneeResult createConsignee(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "consigneeCreateContainer", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ConsigneeCreateContainer consigneeCreateContainer);

    /**
     * 
     * @param consigneeId
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ConsigneeResult
     */
    @WebMethod(operationName = "DeleteConsignee", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/DeleteConsignee")
    @WebResult(name = "DeleteConsigneeResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "DeleteConsignee", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.DeleteConsignee")
    @ResponseWrapper(localName = "DeleteConsigneeResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.DeleteConsigneeResponse")
    public ConsigneeResult deleteConsignee(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "consigneeId", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer consigneeId);

    /**
     * 
     * @param deliveryAddresId
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.DeleteDeliveryAddressResult
     */
    @WebMethod(operationName = "DeleteDeliveryAddress", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/DeleteDeliveryAddress")
    @WebResult(name = "DeleteDeliveryAddressResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "DeleteDeliveryAddress", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.DeleteDeliveryAddress")
    @ResponseWrapper(localName = "DeleteDeliveryAddressResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.DeleteDeliveryAddressResponse")
    public DeleteDeliveryAddressResult deleteDeliveryAddress(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "deliveryAddresId", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer deliveryAddresId);

    /**
     * 
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ConsigneeListContainer
     */
    @WebMethod(operationName = "GetConsigneeList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetConsigneeList")
    @WebResult(name = "GetConsigneeListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetConsigneeList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetConsigneeList")
    @ResponseWrapper(localName = "GetConsigneeListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetConsigneeListResponse")
    public ConsigneeListContainer getConsigneeList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPriceResult
     */
    @WebMethod(operationName = "GetPrice", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetPrice")
    @WebResult(name = "GetPriceResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetPrice", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetPrice")
    @ResponseWrapper(localName = "GetPriceResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetPriceResponse")
    public GetPriceResult getPrice(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetPriceFilter filter);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRestResult
     */
    @WebMethod(operationName = "GetRest", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetRest")
    @WebResult(name = "GetRestResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetRest", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetRest")
    @ResponseWrapper(localName = "GetRestResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetRestResponse")
    public GetRestResult getRest(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetRestFilter filter);

    /**
     * 
     * @param filter
     * @param login
     * @param page
     * @param pageSize
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOilResult
     */
    @WebMethod(operationName = "GetOil", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetOil")
    @WebResult(name = "GetOilResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetOil", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOil")
    @ResponseWrapper(localName = "GetOilResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOilResponse")
    public GetOilResult getOil(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetOilFilter filter,
        @WebParam(name = "page", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer page,
        @WebParam(name = "pageSize", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer pageSize);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetStoOrderListResult
     */
    @WebMethod(operationName = "GetStoOrderList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetStoOrderList")
    @WebResult(name = "GetStoOrderListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetStoOrderList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetStoOrderList")
    @ResponseWrapper(localName = "GetStoOrderListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetStoOrderListResponse")
    public GetStoOrderListResult getStoOrderList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetStoOrderListFilter filter);

    /**
     * 
     * @param dateTime
     * @param login
     * @param orderID
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetStoOrderInfoResult
     */
    @WebMethod(operationName = "GetStoOrderInfo", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetStoOrderInfo")
    @WebResult(name = "GetStoOrderInfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetStoOrderInfo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetStoOrderInfo")
    @ResponseWrapper(localName = "GetStoOrderInfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetStoOrderInfoResponse")
    public GetStoOrderInfoResult getStoOrderInfo(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "dateTime", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        XMLGregorianCalendar dateTime,
        @WebParam(name = "orderID", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer orderID);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMx3ListResult
     */
    @WebMethod(operationName = "GetMX3List", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetMX3List")
    @WebResult(name = "GetMX3ListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetMX3List", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMX3List")
    @ResponseWrapper(localName = "GetMX3ListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMX3ListResponse")
    public GetMx3ListResult getMX3List(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetMx3ListFilter filter);

    /**
     * 
     * @param guid
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMX3InfoResult
     */
    @WebMethod(operationName = "GetMX3Info", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetMX3Info")
    @WebResult(name = "GetMX3InfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetMX3Info", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMX3Info")
    @ResponseWrapper(localName = "GetMX3InfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMX3InfoResponse")
    public GetMX3InfoResult getMX3Info(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMx1ListResult
     */
    @WebMethod(operationName = "GetMX1List", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetMX1List")
    @WebResult(name = "GetMX1ListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetMX1List", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMX1List")
    @ResponseWrapper(localName = "GetMX1ListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMX1ListResponse")
    public GetMx1ListResult getMX1List(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetMx1ListFilter filter);

    /**
     * 
     * @param guid
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMX1InfoResult
     */
    @WebMethod(operationName = "GetMX1Info", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetMX1Info")
    @WebResult(name = "GetMX1InfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetMX1Info", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMX1Info")
    @ResponseWrapper(localName = "GetMX1InfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetMX1InfoResponse")
    public GetMX1InfoResult getMX1Info(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid);

    /**
     * 
     * @param deliveryAddressId
     * @param login
     * @param orderNumber
     * @param password
     * @param searchRange
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetTKTerminalListResult
     */
    @WebMethod(operationName = "GetTKTerminalList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetTKTerminalList")
    @WebResult(name = "GetTKTerminalListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetTKTerminalList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetTKTerminalList")
    @ResponseWrapper(localName = "GetTKTerminalListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetTKTerminalListResponse")
    public GetTKTerminalListResult getTKTerminalList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "deliveryAddressId", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer deliveryAddressId,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "searchRange", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer searchRange);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @param terminalId
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetTKTerminalPriceResult
     */
    @WebMethod(operationName = "GetTKTerminalPrice", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetTKTerminalPrice")
    @WebResult(name = "GetTKTerminalPriceResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetTKTerminalPrice", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetTKTerminalPrice")
    @ResponseWrapper(localName = "GetTKTerminalPriceResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetTKTerminalPriceResponse")
    public GetTKTerminalPriceResult getTKTerminalPrice(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "terminalId", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer terminalId);

    /**
     * 
     * @param deliveryAddressId
     * @param login
     * @param orderNumber
     * @param password
     * @param paymentTypeByte
     * @param terminalId
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderDeliveryByTKResult
     */
    @WebMethod(operationName = "SetOrderDeliveryByTK", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetOrderDeliveryByTK")
    @WebResult(name = "SetOrderDeliveryByTKResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetOrderDeliveryByTK", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderDeliveryByTK")
    @ResponseWrapper(localName = "SetOrderDeliveryByTKResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderDeliveryByTKResponse")
    public SetOrderDeliveryByTKResult setOrderDeliveryByTK(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "deliveryAddressId", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer deliveryAddressId,
        @WebParam(name = "terminalId", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer terminalId,
        @WebParam(name = "paymentTypeByte", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Short paymentTypeByte);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPurchaseReturnListResult
     */
    @WebMethod(operationName = "GetPurchaseReturnList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetPurchaseReturnList")
    @WebResult(name = "GetPurchaseReturnListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetPurchaseReturnList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetPurchaseReturnList")
    @ResponseWrapper(localName = "GetPurchaseReturnListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetPurchaseReturnListResponse")
    public GetPurchaseReturnListResult getPurchaseReturnList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetPurchaseReturnListFilter filter);

    /**
     * 
     * @param guid
     * @param login
     * @param number
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPurchaseReturnInfoResult
     */
    @WebMethod(operationName = "GetPurchaseReturnInfo", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetPurchaseReturnInfo")
    @WebResult(name = "GetPurchaseReturnInfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetPurchaseReturnInfo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetPurchaseReturnInfo")
    @ResponseWrapper(localName = "GetPurchaseReturnInfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetPurchaseReturnInfoResponse")
    public GetPurchaseReturnInfoResult getPurchaseReturnInfo(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "number", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String number,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRtuCorrectionListResult
     */
    @WebMethod(operationName = "GetRtuCorrectionList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetRtuCorrectionList")
    @WebResult(name = "GetRtuCorrectionListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetRtuCorrectionList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetRtuCorrectionList")
    @ResponseWrapper(localName = "GetRtuCorrectionListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetRtuCorrectionListResponse")
    public GetRtuCorrectionListResult getRtuCorrectionList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetRtuCorrectionListFilter filter);

    /**
     * 
     * @param guid
     * @param login
     * @param number
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetRtuCorrectionInfoResult
     */
    @WebMethod(operationName = "GetRtuCorrectionInfo", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetRtuCorrectionInfo")
    @WebResult(name = "GetRtuCorrectionInfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetRtuCorrectionInfo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetRtuCorrectionInfo")
    @ResponseWrapper(localName = "GetRtuCorrectionInfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetRtuCorrectionInfoResponse")
    public GetRtuCorrectionInfoResult getRtuCorrectionInfo(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "number", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String number,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid);

    /**
     * 
     * @param code
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetWorkCompletedResult
     */
    @WebMethod(operationName = "SetWorkCompleted", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetWorkCompleted")
    @WebResult(name = "SetWorkCompletedResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetWorkCompleted", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetWorkCompleted")
    @ResponseWrapper(localName = "SetWorkCompletedResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetWorkCompletedResponse")
    public SetWorkCompletedResult setWorkCompleted(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "code", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String code);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SendPaymentToPhoneResult
     */
    @WebMethod(operationName = "SendPaymentToPhone", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SendPaymentToPhone")
    @WebResult(name = "SendPaymentToPhoneResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SendPaymentToPhone", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SendPaymentToPhone")
    @ResponseWrapper(localName = "SendPaymentToPhoneResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SendPaymentToPhoneResponse")
    public SendPaymentToPhoneResult sendPaymentToPhone(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber);

    /**
     * 
     * @param login
     * @param markCodeList
     * @param orderNumber
     * @param password
     * @param productList
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetReturnToOhResult
     */
    @WebMethod(operationName = "SetReturnToOH", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetReturnToOH")
    @WebResult(name = "SetReturnToOHResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetReturnToOH", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetReturnToOH")
    @ResponseWrapper(localName = "SetReturnToOHResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetReturnToOHResponse")
    public SetReturnToOhResult setReturnToOH(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "productList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfSetReturnToOhProductContainer productList,
        @WebParam(name = "markCodeList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfstring markCodeList);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPrintableUpdResult
     */
    @WebMethod(operationName = "GetPrintableUpd", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetPrintableUpd")
    @WebResult(name = "GetPrintableUpdResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetPrintableUpd", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetPrintableUpd")
    @ResponseWrapper(localName = "GetPrintableUpdResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetPrintableUpdResponse")
    public GetPrintableUpdResult getPrintableUpd(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SendVerificationCodeResult
     */
    @WebMethod(operationName = "SendVerificationCode", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SendVerificationCode")
    @WebResult(name = "SendVerificationCodeResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SendVerificationCode", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SendVerificationCode")
    @ResponseWrapper(localName = "SendVerificationCodeResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SendVerificationCodeResponse")
    public SendVerificationCodeResult sendVerificationCode(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @param verificationCode
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CheckVerificationCodeResult
     */
    @WebMethod(operationName = "CheckVerificationCode", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/CheckVerificationCode")
    @WebResult(name = "CheckVerificationCodeResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "CheckVerificationCode", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CheckVerificationCode")
    @ResponseWrapper(localName = "CheckVerificationCodeResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CheckVerificationCodeResponse")
    public CheckVerificationCodeResult checkVerificationCode(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber,
        @WebParam(name = "verificationCode", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String verificationCode);

    /**
     * 
     * @param login
     * @param orderNumber
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetStoDeclineServicesResult
     */
    @WebMethod(operationName = "SetStoDeclineServices", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetStoDeclineServices")
    @WebResult(name = "SetStoDeclineServicesResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetStoDeclineServices", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetStoDeclineServices")
    @ResponseWrapper(localName = "SetStoDeclineServicesResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetStoDeclineServicesResponse")
    public SetStoDeclineServicesResult setStoDeclineServices(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderNumber", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String orderNumber);

    /**
     * 
     * @param filter
     * @param login
     * @param page
     * @param pageSize
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFindCameraResult
     */
    @WebMethod(operationName = "GetFindCamera", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetFindCamera")
    @WebResult(name = "GetFindCameraResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetFindCamera", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetFindCamera")
    @ResponseWrapper(localName = "GetFindCameraResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetFindCameraResponse")
    public GetFindCameraResult getFindCamera(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetFindCameraFilter filter,
        @WebParam(name = "page", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer page,
        @WebParam(name = "pageSize", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer pageSize);

    /**
     * 
     * @param login
     * @param parameters
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.PutDeliveryAddressResult
     */
    @WebMethod(operationName = "PutDeliveryAddress", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/PutDeliveryAddress")
    @WebResult(name = "PutDeliveryAddressResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "PutDeliveryAddress", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.PutDeliveryAddress")
    @ResponseWrapper(localName = "PutDeliveryAddressResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.PutDeliveryAddressResponse")
    public PutDeliveryAddressResult putDeliveryAddress(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "parameters", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        PutDeliveryAddressParameters parameters);

    /**
     * 
     * @param list
     * @param login
     * @param password
     * @param priceTypeID
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetSupplierPriceResult
     */
    @WebMethod(operationName = "SetSupplierPrice", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetSupplierPrice")
    @WebResult(name = "SetSupplierPriceResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetSupplierPrice", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetSupplierPrice")
    @ResponseWrapper(localName = "SetSupplierPriceResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetSupplierPriceResponse")
    public SetSupplierPriceResult setSupplierPrice(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "priceTypeID", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer priceTypeID,
        @WebParam(name = "list", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfSupplierPriceItem list);

    /**
     * 
     * @param codeList
     * @param login
     * @param password
     * @param priceTypeID
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetSupplierPriceResult
     */
    @WebMethod(operationName = "GetSupplierPrice", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetSupplierPrice")
    @WebResult(name = "GetSupplierPriceResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetSupplierPrice", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetSupplierPrice")
    @ResponseWrapper(localName = "GetSupplierPriceResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetSupplierPriceResponse")
    public GetSupplierPriceResult getSupplierPrice(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "priceTypeID", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer priceTypeID,
        @WebParam(name = "codeList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfstring codeList);

    /**
     * 
     * @param filter
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderListResult
     */
    @WebMethod(operationName = "GetOrderList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetOrderList")
    @WebResult(name = "GetOrderListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetOrderList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderList")
    @ResponseWrapper(localName = "GetOrderListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderListResponse")
    public GetOrderListResult getOrderList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetOrderListFilter filter);

    /**
     * 
     * @param login
     * @param orderId
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderInfoResult2
     */
    @WebMethod(operationName = "GetOrderInfo2", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetOrderInfo2")
    @WebResult(name = "GetOrderInfo2Result", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetOrderInfo2", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderInfo2")
    @ResponseWrapper(localName = "GetOrderInfo2Response", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderInfo2Response")
    public GetOrderInfoResult2 getOrderInfo2(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderId", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer orderId);

    /**
     * 
     * @param guid
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetReMarkingDocumentResult
     */
    @WebMethod(operationName = "GetReMarkingDocument", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetReMarkingDocument")
    @WebResult(name = "GetReMarkingDocumentResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetReMarkingDocument", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetReMarkingDocument")
    @ResponseWrapper(localName = "GetReMarkingDocumentResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetReMarkingDocumentResponse")
    public GetReMarkingDocumentResult getReMarkingDocument(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid);

    /**
     * 
     * @param filter
     * @param login
     * @param page
     * @param pageSize
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetReMarkingDocumentListResult
     */
    @WebMethod(operationName = "GetReMarkingDocumentList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetReMarkingDocumentList")
    @WebResult(name = "GetReMarkingDocumentListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetReMarkingDocumentList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetReMarkingDocumentList")
    @ResponseWrapper(localName = "GetReMarkingDocumentListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetReMarkingDocumentListResponse")
    public GetReMarkingDocumentListResult getReMarkingDocumentList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetReMarkingDocumentListFilter filter,
        @WebParam(name = "page", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer page,
        @WebParam(name = "pageSize", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer pageSize);

    /**
     * 
     * @param login
     * @param parameters
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetReMarkingDocumentResult
     */
    @WebMethod(operationName = "SetReMarkingDocument", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetReMarkingDocument")
    @WebResult(name = "SetReMarkingDocumentResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetReMarkingDocument", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetReMarkingDocument")
    @ResponseWrapper(localName = "SetReMarkingDocumentResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetReMarkingDocumentResponse")
    public SetReMarkingDocumentResult setReMarkingDocument(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "parameters", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfSetReMarkingDocumentItem parameters);

    /**
     * 
     * @param filter
     * @param login
     * @param page
     * @param pageSize
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetFindWheelResult
     */
    @WebMethod(operationName = "GetFindWheel", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetFindWheel")
    @WebResult(name = "GetFindWheelResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetFindWheel", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetFindWheel")
    @ResponseWrapper(localName = "GetFindWheelResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetFindWheelResponse")
    public GetFindWheelResult getFindWheel(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetFindWheelFilter filter,
        @WebParam(name = "page", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer page,
        @WebParam(name = "pageSize", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer pageSize);

    /**
     * 
     * @param login
     * @param password
     * @param qrCode
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CheckVerificationCodeByQRCodeResult
     */
    @WebMethod(operationName = "CheckVerificationCodeByQRCode", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/CheckVerificationCodeByQRCode")
    @WebResult(name = "CheckVerificationCodeByQRCodeResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "CheckVerificationCodeByQRCode", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CheckVerificationCodeByQRCode")
    @ResponseWrapper(localName = "CheckVerificationCodeByQRCodeResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CheckVerificationCodeByQRCodeResponse")
    public CheckVerificationCodeByQRCodeResult checkVerificationCodeByQRCode(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "qrCode", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String qrCode);

    /**
     * 
     * @param filter
     * @param login
     * @param page
     * @param pageSize
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetInventoryListResult
     */
    @WebMethod(operationName = "GetInventoryList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetInventoryList")
    @WebResult(name = "GetInventoryListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetInventoryList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetInventoryList")
    @ResponseWrapper(localName = "GetInventoryListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetInventoryListResponse")
    public GetInventoryListResult getInventoryList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "filter", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        GetInventoryListFilter filter,
        @WebParam(name = "page", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer page,
        @WebParam(name = "pageSize", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer pageSize);

    /**
     * 
     * @param guid
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetInventoryInfoResult
     */
    @WebMethod(operationName = "GetInventoryInfo", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetInventoryInfo")
    @WebResult(name = "GetInventoryInfoResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetInventoryInfo", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetInventoryInfo")
    @ResponseWrapper(localName = "GetInventoryInfoResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetInventoryInfoResponse")
    public GetInventoryInfoResult getInventoryInfo(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid);

    /**
     * 
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetAvailableWarehousesForInventoryResult
     */
    @WebMethod(operationName = "GetAvailableWarehousesForInventory", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetAvailableWarehousesForInventory")
    @WebResult(name = "GetAvailableWarehousesForInventoryResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetAvailableWarehousesForInventory", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetAvailableWarehousesForInventory")
    @ResponseWrapper(localName = "GetAvailableWarehousesForInventoryResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetAvailableWarehousesForInventoryResponse")
    public GetAvailableWarehousesForInventoryResult getAvailableWarehousesForInventory(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password);

    /**
     * 
     * @param login
     * @param password
     * @param scannerType
     * @param warehouseID
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CreateInventoryResult
     */
    @WebMethod(operationName = "CreateInventory", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/CreateInventory")
    @WebResult(name = "CreateInventoryResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "CreateInventory", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CreateInventory")
    @ResponseWrapper(localName = "CreateInventoryResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CreateInventoryResponse")
    public CreateInventoryResult createInventory(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "warehouseID", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer warehouseID,
        @WebParam(name = "scannerType", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Short scannerType);

    /**
     * 
     * @param guid
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CancelInventoryResult
     */
    @WebMethod(operationName = "CancelInventory", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/CancelInventory")
    @WebResult(name = "CancelInventoryResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "CancelInventory", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CancelInventory")
    @ResponseWrapper(localName = "CancelInventoryResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CancelInventoryResponse")
    public CancelInventoryResult cancelInventory(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid);

    /**
     * 
     * @param guid
     * @param login
     * @param markCodeList
     * @param password
     * @param productList
     * @param responsiblePerson
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SaveInventoryResult
     */
    @WebMethod(operationName = "SaveInventory", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SaveInventory")
    @WebResult(name = "SaveInventoryResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SaveInventory", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SaveInventory")
    @ResponseWrapper(localName = "SaveInventoryResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SaveInventoryResponse")
    public SaveInventoryResult saveInventory(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid,
        @WebParam(name = "responsiblePerson", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String responsiblePerson,
        @WebParam(name = "markCodeList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfSaveInventoryMarkCode markCodeList,
        @WebParam(name = "productList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfSaveInventoryProduct productList);

    /**
     * 
     * @param guid
     * @param login
     * @param markCodeList
     * @param password
     * @param productList
     * @param responsiblePerson
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.FinishInventoryResult
     */
    @WebMethod(operationName = "FinishInventory", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/FinishInventory")
    @WebResult(name = "FinishInventoryResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "FinishInventory", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.FinishInventory")
    @ResponseWrapper(localName = "FinishInventoryResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.FinishInventoryResponse")
    public FinishInventoryResult finishInventory(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid,
        @WebParam(name = "responsiblePerson", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String responsiblePerson,
        @WebParam(name = "markCodeList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfSaveInventoryMarkCode markCodeList,
        @WebParam(name = "productList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        ArrayOfSaveInventoryProduct productList);

    /**
     * 
     * @param guid
     * @param login
     * @param markCodeString
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.CheckInventoryMarkCodeResult
     */
    @WebMethod(operationName = "CheckInventoryMarkCode", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/CheckInventoryMarkCode")
    @WebResult(name = "CheckInventoryMarkCodeResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "CheckInventoryMarkCode", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CheckInventoryMarkCode")
    @ResponseWrapper(localName = "CheckInventoryMarkCodeResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.CheckInventoryMarkCodeResponse")
    public CheckInventoryMarkCodeResult checkInventoryMarkCode(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "guid", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String guid,
        @WebParam(name = "markCodeString", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String markCodeString);

    /**
     * 
     * @param login
     * @param parameters
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderUpdateResult
     */
    @WebMethod(operationName = "SetOrderUpdate", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetOrderUpdate")
    @WebResult(name = "SetOrderUpdateResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetOrderUpdate", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderUpdate")
    @ResponseWrapper(localName = "SetOrderUpdateResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetOrderUpdateResponse")
    public SetOrderUpdateResult setOrderUpdate(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "parameters", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        SetOrderUpdateParameters parameters);

    /**
     * 
     * @param login
     * @param orderID
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetOrderCustomerListResult
     */
    @WebMethod(operationName = "GetOrderCustomerList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetOrderCustomerList")
    @WebResult(name = "GetOrderCustomerListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetOrderCustomerList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderCustomerList")
    @ResponseWrapper(localName = "GetOrderCustomerListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetOrderCustomerListResponse")
    public GetOrderCustomerListResult getOrderCustomerList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderID", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer orderID);

    /**
     * 
     * @param login
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetCustomerListResult
     */
    @WebMethod(operationName = "GetCustomerList", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/GetCustomerList")
    @WebResult(name = "GetCustomerListResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "GetCustomerList", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetCustomerList")
    @ResponseWrapper(localName = "GetCustomerListResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.GetCustomerListResponse")
    public GetCustomerListResult getCustomerList(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password);

    /**
     * 
     * @param login
     * @param orderID
     * @param password
     * @return
     *     returns org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetMoveServicesToNewOrderResult
     */
    @WebMethod(operationName = "SetMoveServicesToNewOrder", action = "Wcf.ClientService.Client.WebAPI.TS3/ClientService/SetMoveServicesToNewOrder")
    @WebResult(name = "SetMoveServicesToNewOrderResult", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
    @RequestWrapper(localName = "SetMoveServicesToNewOrder", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetMoveServicesToNewOrder")
    @ResponseWrapper(localName = "SetMoveServicesToNewOrderResponse", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3", className = "ts3.webapi.client.clientservice.wcf.SetMoveServicesToNewOrderResponse")
    public SetMoveServicesToNewOrderResult setMoveServicesToNewOrder(
        @WebParam(name = "login", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String login,
        @WebParam(name = "password", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        String password,
        @WebParam(name = "orderID", targetNamespace = "Wcf.ClientService.Client.WebAPI.TS3")
        Integer orderID);

}
