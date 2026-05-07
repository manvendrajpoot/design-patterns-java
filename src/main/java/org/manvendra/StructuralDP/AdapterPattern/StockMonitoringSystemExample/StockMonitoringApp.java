package main.java.org.manvendra.StructuralDP.AdapterPattern.StockMonitoringSystemExample;

public class StockMonitoringApp {
    private  IAnalyticsTool tool;

    StockMonitoringApp(IAnalyticsTool tool) {
        this.tool = tool;
    }

    public void processData(String ticker) {
        StockDataProvider provider = new StockDataProvider();
        String xmlData = provider.downloadStockData(ticker);

        System.out.println("App: Sending downloaded XML data to analytics tool...");
        tool.analyzeStockData(xmlData);
    }
}
