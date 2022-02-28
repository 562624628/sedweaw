package objects;

import lombok.Data;

import static helper.StringHelper.GetSheetField;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/25
 */
@Data
public class Table_List_INC_LINE extends BASE_INIT_FIELD {
    @Override
    public String toString() {
        return GetSheetField(RUN_ID) + GetSheetField(MODULE) + GetSheetField(SUB_MODULE)+GetSheetField(TAB_TYPE)
                + GetSheetField(TAB_NAME) + GetSheetField(HEAD_COL_NAME) + GetSheetField(PK_COL_NAME)
                + GetSheetField(DESC) + GetSheetField(SHORT_DESC)+GetSheetField(CREATE_METHOD) +GetSheetField(TAB_DB_CODE)+ GetSheetField(PHASE)
                + GetSheetField(INC_RELATED) + GetSheetField(TASK_OPTION) + GetSheetField(IS_SPLIT)
                + GetSheetField(PAGE_SIZE) + GetSheetField(IS_IMPORT);
    }
}
