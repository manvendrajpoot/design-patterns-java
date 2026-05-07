package main.java.org.manvendra.StructuralDP.AdapterPattern.StockMonitoringSystemExample;



// 2. THE 3RD-PARTY LIBRARIES (Adaptees)
// We cannot change this code! They strictly expect JSON or YAML.
// ==========================================
public class SmartYamlAnalyticsLib {
    public void generatePredictiveModelFromYaml(String yamlData) {
        System.out.println("[3rd Party YAML Lib] Building prediction model using data: ");
        System.out.println(yamlData);
    }
}
