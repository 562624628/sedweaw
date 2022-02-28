package 数据迁移Excel数据编辑用;

import config.Config;
import objects.Table_List_Pre_tar_LINE;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/26
 */
public class Table_List_Pre_tar_SHEET {
    public static void main(String[] args) {
        List<Table_List_Pre_tar_LINE> table_list_Pre_tar_sheet = new ArrayList<>();
        //循环主参数
        for (String table : Config.tables) {
            Table_List_Pre_tar_LINE table_list_pre_tar_line = new Table_List_Pre_tar_LINE();
            table_list_pre_tar_line.setRUN_ID(Config.Table_List_Pre_tar_SHEET_RUNDID++);
            table_list_pre_tar_line.setMODULE("PASSAGE");
            table_list_pre_tar_line.setSUB_MODULE("PASSAGE");
            table_list_pre_tar_line.setTAB_TYPE("PRE_TAR");
            table_list_pre_tar_line.setTAB_NAME("dm_"+table);
            table_list_pre_tar_line.setHEAD_COL_NAME("");
            table_list_pre_tar_line.setPK_COL_NAME("");
            table_list_pre_tar_line.setDESC(table + ":前置核心全量数据表");
            table_list_pre_tar_line.setSHORT_DESC("");
            table_list_pre_tar_line.setCREATE_METHOD("INT");
            table_list_pre_tar_line.setTAB_DB_CODE("PRE_TAR_PASSAGE");
            table_list_pre_tar_line.setPHASE("PRE_TAR");
            table_list_pre_tar_line.setINC_RELATED("");
            table_list_pre_tar_line.setTASK_OPTION("INSERT");
            table_list_pre_tar_line.setIS_SPLIT("");
            table_list_pre_tar_line.setPAGE_SIZE("");
            table_list_pre_tar_line.setIS_IMPORT("Y");
            table_list_Pre_tar_sheet.add(table_list_pre_tar_line);
        }
        //循环dc_pk_map参数
        for (String table : Config.tables) {
            Table_List_Pre_tar_LINE table_list_pre_tar_line = new Table_List_Pre_tar_LINE();
            table_list_pre_tar_line.setRUN_ID(Config.Table_List_Pre_tar_SHEET_dcPkMapId++);
            table_list_pre_tar_line.setMODULE("PASSAGE");
            table_list_pre_tar_line.setSUB_MODULE("PASSAGE");
            table_list_pre_tar_line.setTAB_TYPE("PRE_TAR");
            table_list_pre_tar_line.setTAB_NAME("dm_"+table);
            table_list_pre_tar_line.setHEAD_COL_NAME("");
            table_list_pre_tar_line.setPK_COL_NAME("");
            table_list_pre_tar_line.setDESC(table + ":前置核心全量数据表");
            table_list_pre_tar_line.setSHORT_DESC("");
            table_list_pre_tar_line.setCREATE_METHOD("INT");
            table_list_pre_tar_line.setTAB_DB_CODE("PRE_TAR_PASSAGE");
            table_list_pre_tar_line.setPHASE("PRE_TAR");
            table_list_pre_tar_line.setINC_RELATED("");
            table_list_pre_tar_line.setTASK_OPTION("REPLACE");
            table_list_pre_tar_line.setIS_SPLIT("");
            table_list_pre_tar_line.setPAGE_SIZE("");
            table_list_pre_tar_line.setIS_IMPORT("Y");
            table_list_Pre_tar_sheet.add(table_list_pre_tar_line);
        }
        for (Table_List_Pre_tar_LINE table_list_pre_tar_line : table_list_Pre_tar_sheet) {
            System.out.println(table_list_pre_tar_line.toString());
        }
    }
}
