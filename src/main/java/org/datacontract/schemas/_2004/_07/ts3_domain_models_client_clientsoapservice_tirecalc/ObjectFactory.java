
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.Error;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc package. 
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

    private static final QName _TireCalcParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", "TireCalcParameters");
    private static final QName _TireCalcSize_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", "TireCalcSize");
    private static final QName _TireCalcResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", "TireCalcResult");
    private static final QName _TireCalcSpeedometerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", "TireCalcSpeedometerInfo");
    private static final QName _TireCalcSizeOuterDiameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", "outer_diameter");
    private static final QName _TireCalcResultDifference_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", "difference");
    private static final QName _TireCalcResultError_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", "error");
    private static final QName _TireCalcResultNewSize_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", "new_size");
    private static final QName _TireCalcResultOldSize_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", "old_size");
    private static final QName _TireCalcResultSpeedometer_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", "speedometer");
    private static final QName _TireCalcParametersNewSize_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", "new_size");
    private static final QName _TireCalcParametersOldSize_QNAME = new QName("http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", "old_size");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TireCalcParameters }
     * 
     * @return
     *     the new instance of {@link TireCalcParameters }
     */
    public TireCalcParameters createTireCalcParameters() {
        return new TireCalcParameters();
    }

    /**
     * Create an instance of {@link TireCalcResult }
     * 
     * @return
     *     the new instance of {@link TireCalcResult }
     */
    public TireCalcResult createTireCalcResult() {
        return new TireCalcResult();
    }

    /**
     * Create an instance of {@link TireCalcSize }
     * 
     * @return
     *     the new instance of {@link TireCalcSize }
     */
    public TireCalcSize createTireCalcSize() {
        return new TireCalcSize();
    }

    /**
     * Create an instance of {@link TireCalcSpeedometerInfo }
     * 
     * @return
     *     the new instance of {@link TireCalcSpeedometerInfo }
     */
    public TireCalcSpeedometerInfo createTireCalcSpeedometerInfo() {
        return new TireCalcSpeedometerInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", name = "TireCalcParameters")
    public JAXBElement<TireCalcParameters> createTireCalcParameters(TireCalcParameters value) {
        return new JAXBElement<>(_TireCalcParameters_QNAME, TireCalcParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", name = "TireCalcSize")
    public JAXBElement<TireCalcSize> createTireCalcSize(TireCalcSize value) {
        return new JAXBElement<>(_TireCalcSize_QNAME, TireCalcSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", name = "TireCalcResult")
    public JAXBElement<TireCalcResult> createTireCalcResult(TireCalcResult value) {
        return new JAXBElement<>(_TireCalcResult_QNAME, TireCalcResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcSpeedometerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcSpeedometerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", name = "TireCalcSpeedometerInfo")
    public JAXBElement<TireCalcSpeedometerInfo> createTireCalcSpeedometerInfo(TireCalcSpeedometerInfo value) {
        return new JAXBElement<>(_TireCalcSpeedometerInfo_QNAME, TireCalcSpeedometerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", name = "outer_diameter", scope = TireCalcSize.class)
    public JAXBElement<Double> createTireCalcSizeOuterDiameter(Double value) {
        return new JAXBElement<>(_TireCalcSizeOuterDiameter_QNAME, Double.class, TireCalcSize.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", name = "difference", scope = TireCalcResult.class)
    public JAXBElement<TireCalcSize> createTireCalcResultDifference(TireCalcSize value) {
        return new JAXBElement<>(_TireCalcResultDifference_QNAME, TireCalcSize.class, TireCalcResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Error }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", name = "error", scope = TireCalcResult.class)
    public JAXBElement<Error> createTireCalcResultError(Error value) {
        return new JAXBElement<>(_TireCalcResultError_QNAME, Error.class, TireCalcResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", name = "new_size", scope = TireCalcResult.class)
    public JAXBElement<TireCalcSize> createTireCalcResultNewSize(TireCalcSize value) {
        return new JAXBElement<>(_TireCalcResultNewSize_QNAME, TireCalcSize.class, TireCalcResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", name = "old_size", scope = TireCalcResult.class)
    public JAXBElement<TireCalcSize> createTireCalcResultOldSize(TireCalcSize value) {
        return new JAXBElement<>(_TireCalcResultOldSize_QNAME, TireCalcSize.class, TireCalcResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcSpeedometerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcSpeedometerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", name = "speedometer", scope = TireCalcResult.class)
    public JAXBElement<TireCalcSpeedometerInfo> createTireCalcResultSpeedometer(TireCalcSpeedometerInfo value) {
        return new JAXBElement<>(_TireCalcResultSpeedometer_QNAME, TireCalcSpeedometerInfo.class, TireCalcResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", name = "new_size", scope = TireCalcParameters.class)
    public JAXBElement<TireCalcSize> createTireCalcParametersNewSize(TireCalcSize value) {
        return new JAXBElement<>(_TireCalcParametersNewSize_QNAME, TireCalcSize.class, TireCalcParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", name = "old_size", scope = TireCalcParameters.class)
    public JAXBElement<TireCalcSize> createTireCalcParametersOldSize(TireCalcSize value) {
        return new JAXBElement<>(_TireCalcParametersOldSize_QNAME, TireCalcSize.class, TireCalcParameters.class, value);
    }

}
