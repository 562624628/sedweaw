package 数据迁移Excel数据编辑用;

import config.Config;
import helper.IdHelper;
import objects.Table_Mapping_LINE;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/26
 */
public class Table_Mapping_SHEET {
    public static void main(String[] args) {
        List<Table_Mapping_LINE> table_mapping_lines = new ArrayList<>();
        //循环第一层
        for (String table : Config.tables) {
            Table_Mapping_LINE table_mapping_line = Table_Mapping_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idx(Config.Table_Mapping_SHEET_RUNID))
                    .TABLE_NAME("dc_inc_list_passage")
                    .SRC_HEAD_TAB(table)
                    .SRC_SUB_TAB(null)
                    .JOIN_TYPE(null)
                    .HEAD_TAB_ALIAS("a")
                    .SUB_TAB_ALIAS(null)
                    .MAP_RULE_DESC(null)
                    .HEAD_DB_CODE("SRC_PASSAGE")
                    .SUB_DB_CODE(null)
                    .PHASE("SRC")
                    .build();
            table_mapping_lines.add(table_mapping_line);
        }
        //179999固定内容
        Table_Mapping_LINE table_mapping_line_9999 = Table_Mapping_LINE.builder()
                .ID(null)
                .RUN_ID(Config.Table_Mapping_SHEET_1X999.get())
                .TABLE_NAME("dc_inc_full_list_passage")
                .SRC_HEAD_TAB("dc_inc_list_passage")
                .SRC_SUB_TAB(null)
                .JOIN_TYPE(null)
                .HEAD_TAB_ALIAS("a")
                .SUB_TAB_ALIAS(null)
                .MAP_RULE_DESC(null)
                .HEAD_DB_CODE("INC_PASSAGE")
                .SUB_DB_CODE(null)
                .PHASE("SRC")
                .build();
        table_mapping_lines.add(table_mapping_line_9999);
        //循环第二层
        for (String table : Config.tables) {
            Table_Mapping_LINE table_mapping_line = Table_Mapping_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idx(Config.Table_Mapping_SHEET_2x))
                    .TABLE_NAME(table)
                    .SRC_HEAD_TAB(table)
                    .SRC_SUB_TAB("dc_inc_full_list_passage")
                    .JOIN_TYPE("JOIN")
                    .HEAD_TAB_ALIAS("a")
                    .SUB_TAB_ALIAS("b")
                    .MAP_RULE_DESC(null)
                    .HEAD_DB_CODE("SRC_PASSAGE")
                    .SUB_DB_CODE("INC_PASSAGE")
                    .PHASE("INC")
                    .build();
            table_mapping_lines.add(table_mapping_line);
        }
        //循环第三层
        for (String table : Config.tables) {
            Table_Mapping_LINE table_mapping_line = Table_Mapping_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idx(Config.Table_Mapping_SHEET_3x))
                    .TABLE_NAME("dc_"+table)
                    .SRC_HEAD_TAB(table)
                    .SRC_SUB_TAB("dc_pk_map_"+table)
                    .JOIN_TYPE("LEFT JOIN")
                    .HEAD_TAB_ALIAS("a")
                    .SUB_TAB_ALIAS("b")
                    .MAP_RULE_DESC(null)
                    .HEAD_DB_CODE("INC_PASSAGE")
                    .SUB_DB_CODE("STG_PASSAGE")
                    .PHASE("MID")
                    .build();
            table_mapping_lines.add(table_mapping_line);
        }
        //循环第三层 501开始
        for (String table : Config.tables) {
            Table_Mapping_LINE table_mapping_line = Table_Mapping_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idx(Config.Table_Mapping_SHEET_3x501))
                    .TABLE_NAME("dc_pk_map_"+table)
                    .SRC_HEAD_TAB("dc_"+table)
                    .SRC_SUB_TAB("dc_pk_map_"+table)
                    .JOIN_TYPE("LEFT JOIN")
                    .HEAD_TAB_ALIAS("a")
                    .SUB_TAB_ALIAS("b")
                    .MAP_RULE_DESC(null)
                    .HEAD_DB_CODE("STG_PASSAGE")
                    .SUB_DB_CODE("STG_PASSAGE")
                    .PHASE("MID-PKMAP")
                    .build();
            table_mapping_lines.add(table_mapping_line);
        }
        //循环第四层
        for (String table : Config.tables) {
            Table_Mapping_LINE table_mapping_line = Table_Mapping_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idx(Config.Table_Mapping_SHEET_4x))
                    .TABLE_NAME("dm_"+table)
                    .SRC_HEAD_TAB("dc_"+table)
                    .SRC_SUB_TAB(null)
                    .JOIN_TYPE(null)
                    .HEAD_TAB_ALIAS("a")
                    .SUB_TAB_ALIAS(null)
                    .MAP_RULE_DESC(null)
                    .HEAD_DB_CODE("STG_PASSAGE")
                    .SUB_DB_CODE(null)
                    .PHASE("PRE_TAR")
                    .build();
            table_mapping_lines.add(table_mapping_line);
        }
        //循环第五层
        for (String table : Config.tables) {
            Table_Mapping_LINE table_mapping_line = Table_Mapping_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idx(Config.Table_Mapping_SHEET_5x))
                    .TABLE_NAME("dm_"+table)
                    .SRC_HEAD_TAB("dc_"+table)
                    .SRC_SUB_TAB(null)
                    .JOIN_TYPE(null)
                    .HEAD_TAB_ALIAS("a")
                    .SUB_TAB_ALIAS(null)
                    .MAP_RULE_DESC(null)
                    .HEAD_DB_CODE("STG_PASSAGE")
                    .SUB_DB_CODE(null)
                    .PHASE("PRE_TAR")
                    .build();
            table_mapping_lines.add(table_mapping_line);
        }
        for (Table_Mapping_LINE table_mapping_line : table_mapping_lines) {
            System.out.println(table_mapping_line.toString());
        }
    }
}
