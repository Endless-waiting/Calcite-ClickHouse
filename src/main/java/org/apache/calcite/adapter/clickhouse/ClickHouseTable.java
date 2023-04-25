package org.apache.calcite.adapter.clickhouse;

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;
import org.apache.calcite.rel.type.RelProtoDataType;
import org.apache.calcite.schema.impl.AbstractTable;
import org.apache.calcite.util.Source;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for table that clickhouse.
 */
public class ClickHouseTable extends AbstractTable {

    protected final Source source;
    protected final @Nullable RelProtoDataType protoRowType;
    private @Nullable RelDataType rowType;
    private @Nullable List<RelDataType> fieldTypes;

    ClickHouseTable(Source source, @Nullable RelProtoDataType protoRowType) {
        this.source = source;
        this.protoRowType = protoRowType;
    }

    @Override
    public RelDataType getRowType(RelDataTypeFactory relDataTypeFactory) {
        if (protoRowType != null) {
            return protoRowType.apply(relDataTypeFactory);
        }
        if (rowType == null) {
            // TODO: 2023/4/25 这里需要做处理
            /** rowType = CsvEnumerator.deduceRowType((JavaTypeFactory) typeFactory, source, null, isStream()); */
        }
        return rowType;
    }

    /** Returns the field types of this clickhouse table. */
    public List<RelDataType> getFieldTypes(RelDataTypeFactory typeFactory){
        if (fieldTypes == null){
            fieldTypes = new ArrayList<>();

            // TODO: 2023/4/25 这里需要做处理
            /** CsvEnumerator.deduceRowType((JavaTypeFactory) typeFactory, source,fieldTypes, isStream());*/
        }
        return fieldTypes;
    }

    /**
     * Returns whether the table represents a stream.
     */
    protected boolean isStream() {
        return false;
    }
}