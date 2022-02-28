package objects;

import lombok.Data;

import static helper.StringHelper.GetSheetField;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/25
 */
@Data
public class Table_List_SRC_LINE {
    private int RUN_ID;
    private String MODULE;
    private String SUB_MODULE;
    private String TAB_TYPE;
    private String TAB_NAME;
    private String HEAD_COL_NAME;
    private String PK_COL_NAME;
    private String DESC;
    private String SHORT_DESC;
    private String CREATE_METHOD;
    private String TAB_DB_CODE;
    private String PHASE;
    private String INC_RELATED;
    private String TASK_OPTION;
    private String IS_SPLIT;
    private String PAGE_SIZE;
    private String IS_IMPORT;

    @Override
    public String toString() {
        return GetSheetField(RUN_ID) + GetSheetField(MODULE) + GetSheetField(SUB_MODULE)+GetSheetField(TAB_TYPE)
                + GetSheetField(TAB_NAME) + GetSheetField(HEAD_COL_NAME) + GetSheetField(PK_COL_NAME)
                + GetSheetField(DESC) + GetSheetField(SHORT_DESC)+GetSheetField(CREATE_METHOD) +GetSheetField(TAB_DB_CODE)+ GetSheetField(PHASE)
                + GetSheetField(INC_RELATED) + GetSheetField(TASK_OPTION) + GetSheetField(IS_SPLIT)
                + GetSheetField(PAGE_SIZE) + GetSheetField(IS_IMPORT);
    }
}
