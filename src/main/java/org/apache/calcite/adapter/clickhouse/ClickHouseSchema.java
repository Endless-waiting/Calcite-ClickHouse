package org.apache.calcite.adapter.clickhouse;

import org.apache.calcite.schema.Table;
import org.apache.calcite.schema.impl.AbstractSchema;

import java.util.Map;

public class ClickHouseSchema extends AbstractSchema {

    private Map<String, Table> tableMap;

    public ClickHouseSchema(){
        super();
    }

    @Override
    protected Map<String,Table> getTableMap(){
        if (tableMap == null){
            tableMap = createTableMap();
        }
        return tableMap;
    }

    private Map<String,Table> createTableMap(){
        // TODO: 2023/4/25 这里需要好好看看。
    }


}
