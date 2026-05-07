package main.java.org.manvendra.StructuralDP.AdapterPattern.StockMonitoringSystemExample;


// 3. TARGET INTERFACE (What our app wants to use)
// ==========================================
public interface IAnalyticsTool {
    /// Our application only knows about XML
    void analyzeStockData(String xmlData);
}
