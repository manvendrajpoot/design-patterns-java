package main.java.org.manvendra.StructuralDP.DecoratorPattern.CachingLayersExample;

// 3. BASE DECORATOR (Optional, but best practice)
// ==========================================
public class DataSourceDecorator implements DataSource{
    protected DataSource wrapper;

    DataSourceDecorator(DatabaseSource databaseSource) {
        this.wrapper = databaseSource;
    }

    @Override
    public String getData(String id) {
        return wrapper.getData(id);
    }
}
