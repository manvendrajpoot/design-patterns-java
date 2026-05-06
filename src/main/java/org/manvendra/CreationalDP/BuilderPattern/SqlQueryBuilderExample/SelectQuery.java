package main.java.org.manvendra.CreationalDP.BuilderPattern.SqlQueryBuilderExample;


// 1. The Product
public class SelectQuery {
    private final String sql;

    public SelectQuery(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }
}
