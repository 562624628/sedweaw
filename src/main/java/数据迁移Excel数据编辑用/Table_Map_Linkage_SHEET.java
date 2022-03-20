package 数据迁移Excel数据编辑用;

import config.Config;
import helper.IdHelper;
import objects.Table_Map_Linkage_LINE;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/26
 */
public class Table_Map_Linkage_SHEET {
    public static void main(String[] args) {
        List<Table_Map_Linkage_LINE> table_map_linkage_sheet = new ArrayList<>();
        //循环第二层
        for (String table : Config.tables) {
            Table_Map_Linkage_LINE table_list_pre_tar_line = Table_Map_Linkage_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idand10000(Config.Table_Map_Linkage_SHEET_Run2x1))
                    .TABLE_NAME(table)
                    .HEAD_TAB_ALIAS("a")
                    .SUB_TAB_ALIAS("b")
                    .LINKAGE("ON")
                    .SRC_HEAD_COL("a.id")
                    .FURMULA("=")
                    .SRC_SUB_COL("b.head_id")
                    .RULE_DESC(null)
                    .PHASE("INC")
                    .build();
            table_map_linkage_sheet.add(table_list_pre_tar_line);
        }
        //循环第三层
        for (String table : Config.tables) {
            Table_Map_Linkage_LINE table_list_pre_tar_line = Table_Map_Linkage_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idand10000(Config.Table_Map_Linkage_SHEET_Run3x1))
                    .TABLE_NAME("dc_" + table)
                    .HEAD_TAB_ALIAS("a")
                    .SUB_TAB_ALIAS("b")
                    .LINKAGE("ON")
                    .SRC_HEAD_COL("a.id")
                    .FURMULA("=")
                    .SRC_SUB_COL("b.old_pk_id")
                    .RULE_DESC(null)
                    .PHASE("MID")
                    .build();
            table_map_linkage_sheet.add(table_list_pre_tar_line);
        }
        for (Table_Map_Linkage_LINE table_map_linkage_line : table_map_linkage_sheet) {
            System.out.println(table_map_linkage_line.toString());
        }
    }
}
