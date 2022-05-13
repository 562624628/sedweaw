package 数据迁移Excel数据编辑用;

import config.Config;
import helper.IdHelper;
import objects.TAB_Condition_LINE;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/26
 */
public class TAB_Condition_SHEET {
    public static void main(String[] args) {
        List<TAB_Condition_LINE> tab_condition_lineList = new ArrayList<>();
        for (String table : Config.tables) {
            //2x1001
            TAB_Condition_LINE tab_condition_line_2x1 = TAB_Condition_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idand10000(Config.TAB_Condition_SHEET_Run2x1))
                    .TAR_TABLE(table)
                    .SRC_TAB("dc_inc_full_list_"+Config.module.toLowerCase())
                    .SRC_TAB_ALIAS("b")
                    .COL_NAME("b.sub_domain")
                    .EXPRESION_FURMULA("=")
                    .EXPRESION_VALUE("'" + table + "'")
                    .EXEC_POSITION("BEF")
                    .PHASE("INC")
                    .build();
            tab_condition_lineList.add(tab_condition_line_2x1);
            //3x1001
            TAB_Condition_LINE tab_condition_line_3x1 = TAB_Condition_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idand10000(Config.TAB_Condition_SHEET_Run3x1))
                    .TAR_TABLE("dc_" + table)
                    .SRC_TAB(table)
                    .SRC_TAB_ALIAS("a")
                    .COL_NAME("a.is_deleted")
                    .EXPRESION_FURMULA("=")
                    .EXPRESION_VALUE("'N'")
                    .EXEC_POSITION("BEF")
                    .PHASE("MID")
                    .build();
            tab_condition_lineList.add(tab_condition_line_3x1);

            //4x1001
            TAB_Condition_LINE tab_condition_line_4x1 = TAB_Condition_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idand10000(Config.TAB_Condition_SHEET_Run4x1))
                    .TAR_TABLE("dm_" + table)
                    .SRC_TAB("dc_" + table)
                    .SRC_TAB_ALIAS("a")
                    .COL_NAME("a.dc_dml_type")
                    .EXPRESION_FURMULA("=")
                    .EXPRESION_VALUE("'I'")
                    .EXEC_POSITION("AFT")
                    .PHASE("PRE_TAR")
                    .build();
            tab_condition_lineList.add(tab_condition_line_4x1);

            //5x1001
            TAB_Condition_LINE tab_condition_line_5x1 = TAB_Condition_LINE.builder()
                    .ID(null)
                    .RUN_ID(IdHelper.idand10000(Config.TAB_Condition_SHEET_Run5x1))
                    .TAR_TABLE("dm_" + table)
                    .SRC_TAB("dc_" + table)
                    .SRC_TAB_ALIAS("a")
                    .COL_NAME("a.dc_dml_type")
                    .EXPRESION_FURMULA("=")
                    .EXPRESION_VALUE("'U'")
                    .EXEC_POSITION("AFT")
                    .PHASE("PRE_TAR")
                    .build();
            tab_condition_lineList.add(tab_condition_line_5x1);
        }
        for (TAB_Condition_LINE tab_condition_line : tab_condition_lineList) {
            System.out.println(tab_condition_line.toString());
        }
    }

}
