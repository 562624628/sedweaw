package 数据迁移Excel数据编辑用;

import config.Config;
import helper.IdHelper;
import objects.Table_List_INC_LINE;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/26
 */
public class Table_List_INC_SHEET {
    public static void main(String[] args) {
        List<Table_List_INC_LINE> table_list_Inc_sheet = new ArrayList<>();
        //循环主参数
        for (String table : Config.tables) {
            Table_List_INC_LINE table_list_inc_line = new Table_List_INC_LINE();
            table_list_inc_line.setRUN_ID(IdHelper.idx(Config.Table_List_INC_SHEET_RUNID));
            table_list_inc_line.setMODULE("PASSAGE");
            table_list_inc_line.setSUB_MODULE(table.toUpperCase());
            table_list_inc_line.setTAB_TYPE("INC");
            table_list_inc_line.setTAB_NAME(table);
            table_list_inc_line.setHEAD_COL_NAME("");
            table_list_inc_line.setPK_COL_NAME("");
            table_list_inc_line.setDESC(table + ":incremental source data");
            table_list_inc_line.setSHORT_DESC("");
            table_list_inc_line.setCREATE_METHOD("INT");
            table_list_inc_line.setTAB_DB_CODE("INC_PASSAGE");
            table_list_inc_line.setPHASE("INC");
            table_list_inc_line.setINC_RELATED("");
            table_list_inc_line.setTASK_OPTION("INSERT");
            table_list_inc_line.setIS_SPLIT("");
            table_list_inc_line.setPAGE_SIZE("");
            table_list_inc_line.setIS_IMPORT("Y");
            table_list_Inc_sheet.add(table_list_inc_line);
        }
        for (Table_List_INC_LINE table_list_inc_line : table_list_Inc_sheet) {
            System.out.println(table_list_inc_line.toString());
        }

    }
}
