package main.java.org.manvendra.StructuralDP.AdapterPattern.StockMonitoringSystemExample;

// 1. THE EXISTING SYSTEM (Generates XML)
// ==========================================

public class StockDataProvider {
    public String downloadStockData(String ticker) {
        System.out.println("Downloading stock data for " + ticker + " from source...");
        // Simulating downloaded XML data
        return "<stock><ticker>" + ticker + "</ticker><price>150.50</price></stock>";
    }
}
