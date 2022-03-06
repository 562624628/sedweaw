package 数据迁移Excel数据编辑用;

import config.Config;
import helper.IdHelper;
import objects.Table_List_SRC_LINE;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: Table_List_SRC
 * @author: zhoulei
 * @date: 2022/2/25
 */
public class Table_List_SRC_SHEET {

    public static void main(String[] args) {
        List<Table_List_SRC_LINE> table_list_src_sheet = new ArrayList<>();
        //循环主参数
        for (String table : Config.tables) {
            Table_List_SRC_LINE table_list_src_line = new Table_List_SRC_LINE();
            table_list_src_line.setRUN_ID(IdHelper.idand1000(Config.Table_List_SRC_SHEET_RUNID));
            table_list_src_line.setMODULE("PASSAGE");
            table_list_src_line.setSUB_MODULE(table.toUpperCase());
            table_list_src_line.setTAB_TYPE("INC");
            table_list_src_line.setTAB_NAME(table);
            table_list_src_line.setHEAD_COL_NAME("id");
            table_list_src_line.setPK_COL_NAME("id");
            table_list_src_line.setDESC(table + "表");
            table_list_src_line.setSHORT_DESC("");
            table_list_src_line.setCREATE_METHOD("INT");
            table_list_src_line.setTAB_DB_CODE("SRC_PASSAGE");
            table_list_src_line.setPHASE("SRC");
            table_list_src_line.setINC_RELATED("INC_PASSAGE");
            table_list_src_line.setTASK_OPTION("INSERT");
            table_list_src_line.setIS_SPLIT("");
            table_list_src_line.setPAGE_SIZE("");
            table_list_src_line.setIS_IMPORT("Y");
            table_list_src_sheet.add(table_list_src_line);
        }
        for (Table_List_SRC_LINE table_list_src_line : table_list_src_sheet) {
            System.out.println(table_list_src_line.toString());
        }

    }

}
