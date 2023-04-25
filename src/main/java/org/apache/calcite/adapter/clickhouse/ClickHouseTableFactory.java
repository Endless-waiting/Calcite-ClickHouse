package org.apache.calcite.adapter.clickhouse;

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.schema.SchemaPlus;
import org.apache.calcite.schema.Table;
import org.apache.calcite.schema.TableFactory;
import org.apache.calcite.util.Sources;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;

/**
 * Factory that creates a {@link ClickHouseTranslatableTable}.
 *
 * <p>Allows a ClickHouse table to be included in a model.json file, even in a
 * schema that is not based upon {@link CsvSchema}.
 */
@SuppressWarnings("UnusedDeclaration")
public class ClickHouseTableFactory implements TableFactory {

    // public constructor, per factory contract
    public ClickHouseTableFactory(){
    }

    @Override
    public Table create(SchemaPlus schemaPlus, String s, Map map, @Nullable RelDataType relDataType) {
        return null;
    }
}
