package 数据迁移Excel数据编辑用;

import enums.JDBCENUM;
import helper.ConnectionHelper;
import config.Config;
import helper.IdHelper;
import objects.FieldObject;
import objects.Fields_Mapping_STG_LINE;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/26
 */
public class Fields_Mapping_STG_SHEET {
    public static void main(String[] args) {
        List<Fields_Mapping_STG_LINE> fields_mapping_stg_lines = new ArrayList<>();
        //设置jdbc
        Connection connection = ConnectionHelper.getConnection(JDBCENUM.NEW);
        for (String table : Config.tables) {
            List<FieldObject> tableFields = ConnectionHelper.getColumnNames(table, connection);
            IdHelper.idand1000(Config.Fields_Mapping_STG_SHEET_RUNID);

            for (FieldObject tableField : tableFields) {

                Fields_Mapping_STG_LINE fields_mapping_stg_line = Fields_Mapping_STG_LINE.builder()
                        .ID(null)
                        .RUN_ID(Config.Fields_Mapping_STG_SHEET_RUNID.get())
                        .TABLE_NAME("dc_" + table)
                        .COLUMN_NAME(tableField.getFieldName())
                        .DATA_TYPE(tableField.getFieldType().toLowerCase())
                        .LENGTH(tableField.getFieldSize())
                        .NULLABLE(tableField.getCanIsNull())
                        .IS_PK("id".equals(tableField.getFieldName()) ? "Y" : null)
                        .DEFAULT_VALUE(null)
                        .DESC(null)
                        .DESC_EN(null)
                        .FK_TAB(null)
                        .CODE_TABLE(null)
                        .SOURCE_TAB("tenant_code".equals(tableField.getFieldName()) ?null:table)
                        .SOURCE_COLUMN("tenant_code".equals(tableField.getFieldName()) ?null:tableField.getFieldName())
                        .MAPPING_EXPRESION("tenant_code".equals(tableField.getFieldName()) ? "'incomenew'" : "a." + tableField.getFieldName())
                        .MAPPING_RULE(null)
                        .SOURCE_ALIAS("tenant_code".equals(tableField.getFieldName()) ? null : "a")
                        .IS_GROUP_BY("id".equals(tableField.getFieldName()) ? "Y" : null)
                        .COMMENTS(null)
                        .UPDATOR(null)
                        .UPDATE_TIME(null)
                        .UPDATE_COMNENT(null)
                        .IS_CODE_MAPPING("tenant_code".equals(tableField.getFieldName()) ? null : "N")
                        .IS_GEN_SQL("Y")
                        .PHASE("tenant_code".equals(tableField.getFieldName()) ? null : "MID")
                        .build();
                fields_mapping_stg_lines.add(fields_mapping_stg_line);
            }
            //4个固定参数需要处理一下
            //dc_org_id
            Fields_Mapping_STG_LINE dc_org_id = Fields_Mapping_STG_LINE.builder()
                    .ID(null)
                    .RUN_ID(Config.Fields_Mapping_STG_SHEET_RUNID.get())
                    .TABLE_NAME("dc_" + table)
                    .COLUMN_NAME("dc_org_id")
                    .DATA_TYPE("varchar")
                    .LENGTH(750)
                    .NULLABLE("N")
                    .IS_PK(null)
                    .DEFAULT_VALUE(null)
                    .DESC(null)
                    .DESC_EN(null)
                    .FK_TAB(null)
                    .CODE_TABLE(null)
                    .SOURCE_TAB(table)
                    .SOURCE_COLUMN("id")
                    .MAPPING_EXPRESION("a.id")
                    .MAPPING_RULE(null)
                    .SOURCE_ALIAS("a")
                    .IS_GROUP_BY(null)
                    .COMMENTS(null)
                    .UPDATOR(null)
                    .UPDATE_TIME(null)
                    .UPDATE_COMNENT(null)
                    .IS_CODE_MAPPING("N")
                    .IS_GEN_SQL("Y")
                    .PHASE("MID")
                    .build();
            fields_mapping_stg_lines.add(dc_org_id);
            //dc_tab_seq
            Fields_Mapping_STG_LINE dc_tab_seq = Fields_Mapping_STG_LINE.builder()
                    .ID(null)
                    .RUN_ID(Config.Fields_Mapping_STG_SHEET_RUNID.get())
                    .TABLE_NAME("dc_" + table)
                    .COLUMN_NAME("dc_tab_seq")
                    .DATA_TYPE("smallint")
                    .LENGTH(null)
                    .NULLABLE("Y")
                    .IS_PK(null)
                    .DEFAULT_VALUE(null)
                    .DESC(null)
                    .DESC_EN(null)
                    .FK_TAB(null)
                    .CODE_TABLE(null)
                    .SOURCE_TAB(null)
                    .SOURCE_COLUMN(null)
                    .MAPPING_EXPRESION(null)
                    .MAPPING_RULE(null)
                    .SOURCE_ALIAS(null)
                    .IS_GROUP_BY(null)
                    .COMMENTS(null)
                    .UPDATOR(null)
                    .UPDATE_TIME(null)
                    .UPDATE_COMNENT(null)
                    .IS_CODE_MAPPING(null)
                    .IS_GEN_SQL("Y")
                    .PHASE(null)
                    .build();
            fields_mapping_stg_lines.add(dc_tab_seq);
            //dc_etl_date
            Fields_Mapping_STG_LINE dc_etl_date = Fields_Mapping_STG_LINE.builder()
                    .ID(null)
                    .RUN_ID(Config.Fields_Mapping_STG_SHEET_RUNID.get())
                    .TABLE_NAME("dc_" + table)
                    .COLUMN_NAME("dc_etl_date")
                    .DATA_TYPE("date")
                    .LENGTH(null)
                    .NULLABLE("N")
                    .IS_PK(null)
                    .DEFAULT_VALUE(null)
                    .DESC(null)
                    .DESC_EN(null)
                    .FK_TAB(null)
                    .CODE_TABLE(null)
                    .SOURCE_TAB(null)
                    .SOURCE_COLUMN(null)
                    .MAPPING_EXPRESION("date_format(#etl_date,'%Y%m%d')")
                    .MAPPING_RULE(null)
                    .SOURCE_ALIAS(null)
                    .IS_GROUP_BY(null)
                    .COMMENTS(null)
                    .UPDATOR(null)
                    .UPDATE_TIME(null)
                    .UPDATE_COMNENT(null)
                    .IS_CODE_MAPPING(null)
                    .IS_GEN_SQL("Y")
                    .PHASE(null)
                    .build();
            fields_mapping_stg_lines.add(dc_etl_date);
            //dc_dml_type
            Fields_Mapping_STG_LINE dc_dml_type = Fields_Mapping_STG_LINE.builder()
                    .ID(null)
                    .RUN_ID(Config.Fields_Mapping_STG_SHEET_RUNID.get())
                    .TABLE_NAME("dc_" + table)
                    .COLUMN_NAME("dc_dml_type")
                    .DATA_TYPE("varchar")
                    .LENGTH(6)
                    .NULLABLE("N")
                    .IS_PK(null)
                    .DEFAULT_VALUE(null)
                    .DESC(null)
                    .DESC_EN(null)
                    .FK_TAB(null)
                    .CODE_TABLE(null)
                    .SOURCE_TAB("dc_pk_map_"+table)
                    .SOURCE_COLUMN("new_pk_id")
                    .MAPPING_EXPRESION("IF ( ISNULL(b.new_pk_id) , 'I' , 'U' )")
                    .MAPPING_RULE(null)
                    .SOURCE_ALIAS("b")
                    .IS_GROUP_BY(null)
                    .COMMENTS(null)
                    .UPDATOR(null)
                    .UPDATE_TIME(null)
                    .UPDATE_COMNENT(null)
                    .IS_CODE_MAPPING("N")
                    .IS_GEN_SQL("Y")
                    .PHASE("MID")
                    .build();
            fields_mapping_stg_lines.add(dc_dml_type);
        }
        for (Fields_Mapping_STG_LINE fields_mapping_stg_line : fields_mapping_stg_lines) {
            System.out.println(fields_mapping_stg_line.toString());
        }
    }
}
