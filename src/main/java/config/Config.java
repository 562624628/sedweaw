package config;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/25
 */
public class Config {
    static Integer start = 76;
    public static List<String> tables = Arrays.asList(
            "shelf_display_block","shelf_display_block_customized_design","shelf_display_block_detail","shelf_display_block_detail_extend","shelf_page","shelf_page_language"
    );

    //Table_List_SRC_SHEET RUNID配置
    //Table_List_SRC_SHEET RUNID配置
    public static AtomicInteger Table_List_SRC_SHEET_RUNID = new AtomicInteger(1700001 + start * 1000);
    //Table_List_STG_SHEET RUNID配置
    public static AtomicInteger Table_List_STG_SHEET_RUNID = new AtomicInteger(3700001 + start * 1000);
    public static AtomicInteger Table_List_STG_SHEET_dcPkMapId = new AtomicInteger(3795000 + start);
    //Table_List_INC_SHEET RUNID 配置
    public static AtomicInteger Table_List_INC_SHEET_RUNID = new AtomicInteger(2700001 + start * 1000);
    //Table_List_Pre_tar_SHEET RUNID配置
    public static AtomicInteger Table_List_Pre_tar_SHEET_RUNDID = new AtomicInteger(4700001 + start * 1000);
    public static AtomicInteger Table_List_Pre_tar_SHEET_dcPkMapId = new AtomicInteger(5700001 + start * 1000);
    //-------------------------------------------分割线---------------------------------------------
    //Table_Mapping_SHEET
    public static AtomicInteger Table_Mapping_SHEET_RUNID = new AtomicInteger(1700001 + start * 1000);
    public static AtomicInteger Table_Mapping_SHEET_1X999 = new AtomicInteger(1799999);
    public static AtomicInteger Table_Mapping_SHEET_2x = new AtomicInteger(2700001 + start * 1000);
    public static AtomicInteger Table_Mapping_SHEET_3x = new AtomicInteger(3700001 + start * 1000);
    public static AtomicInteger Table_Mapping_SHEET_3x501 = new AtomicInteger(3795000 + start);
    public static AtomicInteger Table_Mapping_SHEET_4x = new AtomicInteger(4700001 + start * 1000);
    public static AtomicInteger Table_Mapping_SHEET_5x = new AtomicInteger(5700001 + start * 1000);

    //Fields_Mapping_STG_SHEET
    public static AtomicInteger Fields_Mapping_STG_SHEET_RUNID = new AtomicInteger(3700001 + start * 1000);

    //Fields_Mapping_Pre_Tar_SHEET
    public static AtomicInteger Fields_Mapping_Pre_Tar_SHEET_RUNID = new AtomicInteger(4700001 + start * 1000);

    //TAB_Condition_SHEET
    public static AtomicInteger TAB_Condition_SHEET_Run2x1 = new AtomicInteger(2700001 + start * 1000);
    public static AtomicInteger TAB_Condition_SHEET_Run3x1 = new AtomicInteger(3700001 + start * 1000);
    public static AtomicInteger TAB_Condition_SHEET_Run4x1 = new AtomicInteger(4700001 + start * 1000);
    public static AtomicInteger TAB_Condition_SHEET_Run5x1 = new AtomicInteger(5700001 + start * 1000);

    //Table_Map_Linkage_SHEET
    public static AtomicInteger Table_Map_Linkage_SHEET_Run2x1 = new AtomicInteger(2700001 + start * 1000);
    public static AtomicInteger Table_Map_Linkage_SHEET_Run3x1 = new AtomicInteger(3700001 + start * 1000);


}
