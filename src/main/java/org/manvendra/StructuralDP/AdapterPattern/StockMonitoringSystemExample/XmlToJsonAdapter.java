package main.java.org.manvendra.StructuralDP.AdapterPattern.StockMonitoringSystemExample;

public class XmlToJsonAdapter implements IAnalyticsTool{
    private SmartJsonAnalyticsLib jsonLibrary;

    public XmlToJsonAdapter(SmartJsonAnalyticsLib jsonLibrary) {
        this.jsonLibrary = jsonLibrary;
    }

    @Override
    public void analyzeStockData(String xmlData) {
        System.out.println("Adapter: Converting XML to JSON...");
        String jsonData = convertXmlToJson(xmlData);
        jsonLibrary.generateBeautifulChartFromJson(jsonData);
    }

    private String convertXmlToJson(String xml) {
        // Mocking impl
        String ticker = xml.substring(xml.indexOf("<ticker>") + 8, xml.indexOf("</ticker>"));
        String price = xml.substring(xml.indexOf("<price>") + 7, xml.indexOf("</price>"));
        return "{ \"stock\": { \"ticker\": \"" + ticker + "\", \"price\": " + price + " } }";
    }

}
