package 数据迁移Excel数据编辑用;

import enums.JDBCENUM;
import helper.ConnectionHelper;
import config.Config;
import objects.FieldObject;
import objects.Fields_Mapping_Pre_Tar_LINE;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/26
 */
public class Fields_Mapping_Pre_Tar_SHEET {
    public static void main(String[] args) {
        List<Fields_Mapping_Pre_Tar_LINE> Fields_Mapping_Pre_Tar_LINEs = new ArrayList<>();
        Connection connection = ConnectionHelper.getConnection(JDBCENUM.NEW);
        for (String table : Config.tables) {
            List<FieldObject> tableFields = ConnectionHelper.getColumnNames(table, connection);
            for (FieldObject tableField : tableFields) {
                Fields_Mapping_Pre_Tar_LINE fields_mapping_pre_tar_line = Fields_Mapping_Pre_Tar_LINE.builder()
                        .ID(null)
                        .RUN_ID(Config.Fields_Mapping_Pre_Tar_SHEET_RUNID)
                        .TABLE_NAME("dm_" + table)
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
                        .SOURCE_TAB("dc_"+table)
                        .SOURCE_COLUMN(tableField.getFieldName())
                        .MAPPING_EXPRESION("a." + tableField.getFieldName())
                        .MAPPING_RULE(null)
                        .SOURCE_ALIAS("a")
                        .IS_GROUP_BY(null)
                        .COMMENTS(null)
                        .UPDATOR(null)
                        .UPDATE_TIME(null)
                        .UPDATE_COMNENT(null)
                        .IS_CODE_MAPPING(null)
                        .IS_GEN_SQL("Y")
                        .build();
                Fields_Mapping_Pre_Tar_LINEs.add(fields_mapping_pre_tar_line);
            }
            //4个固定参数需要处理一下
            //dc_org_id
            Fields_Mapping_Pre_Tar_LINE dc_org_id = Fields_Mapping_Pre_Tar_LINE.builder()
                    .ID(null)
                    .RUN_ID(Config.Fields_Mapping_Pre_Tar_SHEET_RUNID)
                    .TABLE_NAME("dm_" + table)
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
                    .SOURCE_TAB("dm_"+table)
                    .SOURCE_COLUMN("dc_org_id")
                    .MAPPING_EXPRESION("a.dc_org_id")
                    .MAPPING_RULE(null)
                    .SOURCE_ALIAS("a")
                    .IS_GROUP_BY(null)
                    .COMMENTS(null)
                    .UPDATOR(null)
                    .UPDATE_TIME(null)
                    .UPDATE_COMNENT(null)
                    .IS_CODE_MAPPING(null)
                    .IS_GEN_SQL("Y")
                    .build();
            Fields_Mapping_Pre_Tar_LINEs.add(dc_org_id);
            //dc_tab_seq
            Fields_Mapping_Pre_Tar_LINE dc_tab_seq = Fields_Mapping_Pre_Tar_LINE.builder()
                    .ID(null)
                    .RUN_ID(Config.Fields_Mapping_Pre_Tar_SHEET_RUNID)
                    .TABLE_NAME("dm_" + table)
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
                    .SOURCE_TAB("dc_"+table)
                    .SOURCE_COLUMN("dc_tab_seq")
                    .MAPPING_EXPRESION("a.dc_tab_seq")
                    .MAPPING_RULE(null)
                    .SOURCE_ALIAS("a")
                    .IS_GROUP_BY(null)
                    .COMMENTS(null)
                    .UPDATOR(null)
                    .UPDATE_TIME(null)
                    .UPDATE_COMNENT(null)
                    .IS_CODE_MAPPING(null)
                    .IS_GEN_SQL("Y")
                    .build();
            Fields_Mapping_Pre_Tar_LINEs.add(dc_tab_seq);
            //dc_etl_date
            Fields_Mapping_Pre_Tar_LINE dc_etl_date = Fields_Mapping_Pre_Tar_LINE.builder()
                    .ID(null)
                    .RUN_ID(Config.Fields_Mapping_Pre_Tar_SHEET_RUNID)
                    .TABLE_NAME("dm_" + table)
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
                    .SOURCE_TAB("dc_"+table)
                    .SOURCE_COLUMN("dc_etl_date")
                    .MAPPING_EXPRESION("a.dc_etl_date")
                    .MAPPING_RULE(null)
                    .SOURCE_ALIAS("a")
                    .IS_GROUP_BY(null)
                    .COMMENTS(null)
                    .UPDATOR(null)
                    .UPDATE_TIME(null)
                    .UPDATE_COMNENT(null)
                    .IS_CODE_MAPPING(null)
                    .IS_GEN_SQL("Y")
                    .build();
            Fields_Mapping_Pre_Tar_LINEs.add(dc_etl_date);
            //dc_dml_type
            Fields_Mapping_Pre_Tar_LINE dc_dml_type = Fields_Mapping_Pre_Tar_LINE.builder()
                    .ID(null)
                    .RUN_ID(Config.Fields_Mapping_Pre_Tar_SHEET_RUNID)
                    .TABLE_NAME("dm_" + table)
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
                    .SOURCE_TAB("dc_"+table)
                    .SOURCE_COLUMN("dc_dml_type")
                    .MAPPING_EXPRESION("a.dc_dml_type")
                    .MAPPING_RULE(null)
                    .SOURCE_ALIAS("a")
                    .IS_GROUP_BY(null)
                    .COMMENTS(null)
                    .UPDATOR(null)
                    .UPDATE_TIME(null)
                    .UPDATE_COMNENT(null)
                    .IS_CODE_MAPPING(null)
                    .IS_GEN_SQL("Y")
                    .build();
            Fields_Mapping_Pre_Tar_LINEs.add(dc_dml_type);
            //dc_insert_timestamp
            Fields_Mapping_Pre_Tar_LINE dc_insert_timestamp = Fields_Mapping_Pre_Tar_LINE.builder()
                    .ID(null)
                    .RUN_ID(Config.Fields_Mapping_Pre_Tar_SHEET_RUNID)
                    .TABLE_NAME("dm_" + table)
                    .COLUMN_NAME("dc_insert_timestamp")
                    .DATA_TYPE("datetime")
                    .LENGTH(null)
                    .NULLABLE("N")
                    .IS_PK(null)
                    .DEFAULT_VALUE("CURRENT_TIMESTAMP")
                    .DESC(null)
                    .DESC_EN(null)
                    .FK_TAB(null)
                    .CODE_TABLE(null)
                    .SOURCE_TAB(null)
                    .SOURCE_COLUMN(null)
                    .MAPPING_EXPRESION("sysdate()")
                    .MAPPING_RULE(null)
                    .SOURCE_ALIAS("a")
                    .IS_GROUP_BY(null)
                    .COMMENTS(null)
                    .UPDATOR(null)
                    .UPDATE_TIME(null)
                    .UPDATE_COMNENT(null)
                    .IS_CODE_MAPPING(null)
                    .IS_GEN_SQL("Y")
                    .build();
            Fields_Mapping_Pre_Tar_LINEs.add(dc_insert_timestamp);
            Config.Fields_Mapping_Pre_Tar_SHEET_RUNID++;
        }
        for (Fields_Mapping_Pre_Tar_LINE Fields_Mapping_Pre_Tar_LINE : Fields_Mapping_Pre_Tar_LINEs) {
            System.out.println(Fields_Mapping_Pre_Tar_LINE.toString());
        }
    }
}
