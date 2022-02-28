package objects;

import lombok.Data;

import static helper.StringHelper.GetSheetField;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/25
 */
@Data
public class BASE_INIT_FIELD {
    protected int RUN_ID;
    protected String MODULE;
    protected String SUB_MODULE;
    protected String TAB_TYPE;
    protected String TAB_NAME;
    protected String HEAD_COL_NAME;
    protected String PK_COL_NAME;
    protected String DESC;
    protected String SHORT_DESC;
    protected String CREATE_METHOD;
    protected String TAB_DB_CODE;
    protected String PHASE;
    protected String INC_RELATED;
    protected String TASK_OPTION;
    protected String IS_SPLIT;
    protected String PAGE_SIZE;
    protected String IS_IMPORT;

    @Override
    public String toString() {
        return GetSheetField(RUN_ID) + GetSheetField(MODULE) + GetSheetField(SUB_MODULE)+GetSheetField(TAB_TYPE)
                + GetSheetField(TAB_NAME) + GetSheetField(HEAD_COL_NAME) + GetSheetField(PK_COL_NAME)
                + GetSheetField(DESC) + GetSheetField(SHORT_DESC)+GetSheetField(CREATE_METHOD) +GetSheetField(TAB_DB_CODE)+ GetSheetField(PHASE)
                + GetSheetField(INC_RELATED) + GetSheetField(TASK_OPTION) + GetSheetField(IS_SPLIT)
                + GetSheetField(PAGE_SIZE) + GetSheetField(IS_IMPORT);
    }
}
