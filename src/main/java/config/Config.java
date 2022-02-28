package config;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/25
 */
public class Config {
    public static  List<String> tables = Arrays.asList("channel_account","partner","partner_tribe_relation","channel_account_card","channel_account_image","channel_account_verification","holder_temp","issuance_order","tribe","tribe_bundle_relation");

    //Table_List_SRC_SHEET RUNID配置
    public static Integer Table_List_SRC_SHEET_RUNID = 171001;
    //Table_List_STG_SHEET RUNID配置
    public static Integer Table_List_STG_SHEET_RUNID = 371001;
    public static Integer Table_List_STG_SHEET_dcPkMapId = 379501;
    //Table_List_INC_SHEET RUNID 配置
    public static Integer Table_List_INC_SHEET_RUNID = 271001;
    //Table_List_Pre_tar_SHEET RUNID配置
    public static Integer Table_List_Pre_tar_SHEET_RUNDID = 471001;
    public static Integer Table_List_Pre_tar_SHEET_dcPkMapId = 571001;
    //-------------------------------------------分割线---------------------------------------------
    //Table_Mapping_SHEET
    public static Integer Table_Mapping_SHEET_RUNID = 171001;
    public static Integer Table_Mapping_SHEET_1X999 = 179999;
    public static Integer Table_Mapping_SHEET_2x = 271001;
    public static Integer Table_Mapping_SHEET_3x = 371001;
    public static Integer Table_Mapping_SHEET_3x501 = 379501;
    public static Integer Table_Mapping_SHEET_4x = 471001;
    public static Integer Table_Mapping_SHEET_5x = 571001;

    //Fields_Mapping_STG_SHEET
    public static Integer Fields_Mapping_STG_SHEET_RUNID = 371001;

    //Fields_Mapping_Pre_Tar_SHEET
    public static Integer Fields_Mapping_Pre_Tar_SHEET_RUNID = 471001;

    //TAB_Condition_SHEET
    public static Integer TAB_Condition_SHEET_Run2x1 = 271001;
    public static Integer TAB_Condition_SHEET_Run3x1 = 371001;
    public static Integer TAB_Condition_SHEET_Run4x1 = 471001;
    public static Integer TAB_Condition_SHEET_Run5x1 = 571001;

    //Table_Map_Linkage_SHEET
    public static Integer Table_Map_Linkage_SHEET_Run2x1 = 271001;
    public static Integer Table_Map_Linkage_SHEET_Run3x1 = 371001;












}
