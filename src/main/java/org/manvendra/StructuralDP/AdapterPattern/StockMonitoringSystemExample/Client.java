package main.java.org.manvendra.StructuralDP.AdapterPattern.StockMonitoringSystemExample;

public class Client {
    public static void main(String[] args) {
        // Scenario 1: Using the JSON Analytics Library
        System.out.println("--- SCENARIO 1: Using JSON Analytics Library ---");
        SmartJsonAnalyticsLib jsonLib = new SmartJsonAnalyticsLib();
        IAnalyticsTool jsonAdapter = new XmlToJsonAdapter(jsonLib);

        StockMonitoringApp app1 = new StockMonitoringApp(jsonAdapter);
        app1.processData("AAPL");

        // Scenario 2: Swapping to the YAML Predictive Library
        System.out.println("--- SCENARIO 2: Using YAML Analytics Library ---");
        SmartYamlAnalyticsLib yamlLib = new SmartYamlAnalyticsLib();
        IAnalyticsTool yamlAdapter = new XmlToYamlAdapter(yamlLib);

        StockMonitoringApp app2 = new StockMonitoringApp(yamlAdapter);
        app2.processData("MSFT");
    }
}
