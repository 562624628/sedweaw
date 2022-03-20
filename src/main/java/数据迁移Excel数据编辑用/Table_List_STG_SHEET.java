package 数据迁移Excel数据编辑用;

import config.Config;
import helper.IdHelper;
import objects.Table_List_STG_LINE;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/26
 */
public class Table_List_STG_SHEET {
    public static void main(String[] args) {
        List<Table_List_STG_LINE> table_list_stg_sheet = new ArrayList<>();
        //循环主参数
        for (String table : Config.tables) {
            Table_List_STG_LINE table_list_stg_line = new Table_List_STG_LINE();
            table_list_stg_line.setRUN_ID(IdHelper.idand10000(Config.Table_List_STG_SHEET_RUNID));
            table_list_stg_line.setMODULE(Config.module.toUpperCase());
            table_list_stg_line.setSUB_MODULE(table.toUpperCase());
            table_list_stg_line.setTAB_TYPE("PRE_TAR");
            table_list_stg_line.setTAB_NAME("dc_"+table);
            table_list_stg_line.setHEAD_COL_NAME("");
            table_list_stg_line.setPK_COL_NAME("");
            table_list_stg_line.setDESC(table + ":增量处理结果表");
            table_list_stg_line.setSHORT_DESC("");
            table_list_stg_line.setCREATE_METHOD("INT");
            table_list_stg_line.setTAB_DB_CODE("STG_"+Config.module.toUpperCase());
            table_list_stg_line.setPHASE("MID");
            table_list_stg_line.setINC_RELATED("");
            table_list_stg_line.setTASK_OPTION("INSERT");
            table_list_stg_line.setIS_SPLIT("");
            table_list_stg_line.setPAGE_SIZE("");
            table_list_stg_line.setIS_IMPORT("Y");
            table_list_stg_sheet.add(table_list_stg_line);
        }
        //循环dc_pk_map参数
        for (String table : Config.tables) {
            Table_List_STG_LINE table_list_stg_line = new Table_List_STG_LINE();
            table_list_stg_line.setRUN_ID(IdHelper.idand1(Config.Table_List_STG_SHEET_dcPkMapId));
            table_list_stg_line.setMODULE(Config.module.toUpperCase());
            table_list_stg_line.setSUB_MODULE(table.toUpperCase());
            table_list_stg_line.setTAB_TYPE("PKMAP");
            table_list_stg_line.setTAB_NAME("dc_pk_map_"+table);
            table_list_stg_line.setHEAD_COL_NAME("");
            table_list_stg_line.setPK_COL_NAME("id");
            table_list_stg_line.setDESC(table + ":新老主键id映射任务");
            table_list_stg_line.setSHORT_DESC("");
            table_list_stg_line.setCREATE_METHOD("INT");
            table_list_stg_line.setTAB_DB_CODE("STG_"+Config.module.toUpperCase());
            table_list_stg_line.setPHASE("MID");
            table_list_stg_line.setINC_RELATED("");
            table_list_stg_line.setTASK_OPTION("PKMAP");
            table_list_stg_line.setIS_SPLIT("");
            table_list_stg_line.setPAGE_SIZE("");
            table_list_stg_line.setIS_IMPORT("Y");
            table_list_stg_sheet.add(table_list_stg_line);
        }
        for (Table_List_STG_LINE table_list_stg_line : table_list_stg_sheet) {
            System.out.println(table_list_stg_line.toString());
        }
    }
}
