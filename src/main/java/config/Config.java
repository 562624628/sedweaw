package config;

import enums.JDBCENUM;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/25
 */
public class Config {
    public static Integer start = 0;
    public static String moduleNumber = "07";
    public static List<String> tables = Arrays.asList(
             "bpp_visa_merchant_campaign"
    );

    public static String module = "passage";

    public static JDBCENUM jdbcenum = JDBCENUM.NEW;

    //Table_List_SRC_SHEET RUNID配置
    //Table_List_SRC_SHEET RUNID配置
    public static AtomicInteger Table_List_SRC_SHEET_RUNID = new AtomicInteger(Integer.parseInt("1"+moduleNumber+"000001") + start * 10000);




    //Table_List_STG_SHEET RUNID配置
    public static AtomicInteger Table_List_STG_SHEET_RUNID = new AtomicInteger(Integer.parseInt("3"+moduleNumber+"000001") + start * 10000);
    public static AtomicInteger Table_List_STG_SHEET_dcPkMapId = new AtomicInteger( Integer.parseInt("3"+moduleNumber+"950000") + start);
    //Table_List_INC_SHEET RUNID 配置
    public static AtomicInteger Table_List_INC_SHEET_RUNID = new AtomicInteger(Integer.parseInt("2"+moduleNumber+"000001") + start * 10000);
    //Table_List_Pre_tar_SHEET RUNID配置
    public static AtomicInteger Table_List_Pre_tar_SHEET_RUNDID = new AtomicInteger(Integer.parseInt("4"+moduleNumber+"000001") + start * 10000);
    public static AtomicInteger Table_List_Pre_tar_SHEET_dcPkMapId = new AtomicInteger(Integer.parseInt("5"+moduleNumber+"000001") + start * 10000);
    //-------------------------------------------分割线---------------------------------------------
    //Table_Mapping_SHEET
    public static AtomicInteger Table_Mapping_SHEET_RUNID = new AtomicInteger(Integer.parseInt("1"+moduleNumber+"000001") + start * 10000);
    public static AtomicInteger Table_Mapping_SHEET_1X999 = new AtomicInteger(Integer.parseInt("1"+moduleNumber+"990999"));
    public static AtomicInteger Table_Mapping_SHEET_2x = new AtomicInteger(Integer.parseInt("2"+moduleNumber+"000001") + start * 10000);
    public static AtomicInteger Table_Mapping_SHEET_3x = new AtomicInteger(Integer.parseInt("3"+moduleNumber+"000001") + start * 10000);
    public static AtomicInteger Table_Mapping_SHEET_3x501 = new AtomicInteger( Integer.parseInt("3"+moduleNumber+"950000") + start);
    public static AtomicInteger Table_Mapping_SHEET_4x = new AtomicInteger(Integer.parseInt("4"+moduleNumber+"000001") + start * 10000);
    public static AtomicInteger Table_Mapping_SHEET_5x = new AtomicInteger(Integer.parseInt("5"+moduleNumber+"000001") + start * 10000);

    //Fields_Mapping_STG_SHEET
    public static AtomicInteger Fields_Mapping_STG_SHEET_RUNID = new AtomicInteger(Integer.parseInt("3"+moduleNumber+"000001") + start * 10000);

    //Fields_Mapping_Pre_Tar_SHEET
    public static AtomicInteger Fields_Mapping_Pre_Tar_SHEET_RUNID = new AtomicInteger(Integer.parseInt("4"+moduleNumber+"000001") + start * 10000);

    //TAB_Condition_SHEET
    public static AtomicInteger TAB_Condition_SHEET_Run2x1 = new AtomicInteger(Integer.parseInt("2"+moduleNumber+"000001") + start * 10000);
    public static AtomicInteger TAB_Condition_SHEET_Run3x1 = new AtomicInteger(Integer.parseInt("3"+moduleNumber+"000001") + start * 10000);
    public static AtomicInteger TAB_Condition_SHEET_Run4x1 = new AtomicInteger(Integer.parseInt("4"+moduleNumber+"000001") + start * 10000);
    public static AtomicInteger TAB_Condition_SHEET_Run5x1 = new AtomicInteger(Integer.parseInt("5"+moduleNumber+"000001") + start * 10000);

    //Table_Map_Linkage_SHEET
    public static AtomicInteger Table_Map_Linkage_SHEET_Run2x1 = new AtomicInteger(Integer.parseInt("2"+moduleNumber+"000001") + start * 10000);
    public static AtomicInteger Table_Map_Linkage_SHEET_Run3x1 = new AtomicInteger(Integer.parseInt("3"+moduleNumber+"000001") + start * 10000);


    public static void main(String[] args) {
        String a = "";

        String[] split = a.split("\n");
        List<String> list = Arrays.asList(split);
        list.forEach(x->
                System.out.println(x.substring(0,5)+"0"+x.substring(5))
        );
    }
}
