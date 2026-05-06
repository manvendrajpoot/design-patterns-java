package main.java.org.manvendra.CreationalDP.BuilderPattern.SqlQueryBuilderExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectQueryBuilder {
    private List<String> columns = new ArrayList<>();
    private String table;
    private List<String> whereClauses = new ArrayList<>();
    private String orderByColumn;
    private Integer limit;

    // Fluent setter: Select columns
    public SelectQueryBuilder select(String... cols) {
        this.columns.addAll(Arrays.asList(cols));
        return this;
    }

    // Fluent setter: From table
    public SelectQueryBuilder from(String table) {
        this.table = table;
        return this;
    }

    // Fluent setter: Where conditions (can be called multiple times)
    public SelectQueryBuilder where(String condition) {
        this.whereClauses.add(condition);
        return this;
    }

    // Fluent setter: Order By
    public SelectQueryBuilder orderBy(String column) {
        this.orderByColumn = column;
        return this;
    }

    // Fluent setter: Limit
    public SelectQueryBuilder limit(int limit) {
        this.limit = limit;
        return this;
    }

    // The critical assembly step
    public SelectQuery build() {
        // 1. Validation
        if (table == null || table.trim().isEmpty()) {
            throw new IllegalStateException("Table name is mandatory.");
        }

        // 2. Construction
        StringBuilder sql = new StringBuilder();

        // SELECT
        sql.append("SELECT ");
        if (columns.isEmpty()) {
            sql.append("*");
        } else {
            sql.append(String.join(", ", columns));
        }

        // FROM
        sql.append(" FROM ").append(table);

        // WHERE
        if (!whereClauses.isEmpty()) {
            sql.append(" WHERE ");
            sql.append(String.join(" AND ", whereClauses));
        }

        // ORDER BY
        if (orderByColumn != null) {
            sql.append(" ORDER BY ").append(orderByColumn);
        }

        // LIMIT
        if (limit != null) {
            sql.append(" LIMIT ").append(limit);
        }

        // Return the final product
        return new SelectQuery(sql.toString().trim() + ";");
    }
}
