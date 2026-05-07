package main.java.org.manvendra.StructuralDP.AdapterPattern.StockMonitoringSystemExample;


// 2. THE 3RD-PARTY LIBRARIES (Adaptees)
// We cannot change this code! They strictly expect JSON or YAML.
// ==========================================
public class SmartJsonAnalyticsLib {
    public void generateBeautifulChartFromJson(String jsonData) {
        System.out.println("[3rd Party JSON Lib] Generating chart using data: ");
        System.out.println(jsonData);
    }
}
