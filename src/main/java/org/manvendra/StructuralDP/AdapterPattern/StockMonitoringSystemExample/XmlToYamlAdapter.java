package main.java.org.manvendra.StructuralDP.AdapterPattern.StockMonitoringSystemExample;

public class XmlToYamlAdapter implements IAnalyticsTool{
    private SmartYamlAnalyticsLib yamlAnalyticsLib;

    XmlToYamlAdapter(SmartYamlAnalyticsLib yamlAnalyticsLib) {
        this.yamlAnalyticsLib = yamlAnalyticsLib;
    }

    @Override
    public void analyzeStockData(String xmlData) {
        System.out.println("Adapter: Converting XML to YAML...");
        String yamlData = convertXmlToYaml(xmlData);
        yamlAnalyticsLib.generatePredictiveModelFromYaml(yamlData);
    }

    private String convertXmlToYaml(String xml) {
        // Mocking impl
        String ticker = xml.substring(xml.indexOf("<ticker>") + 8, xml.indexOf("</ticker>"));
        String price = xml.substring(xml.indexOf("<price>") + 7, xml.indexOf("</price>"));

        return "stock:\n  ticker: " + ticker + "\n  price: " + price;
    }
}
