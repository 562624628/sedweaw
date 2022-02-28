package objects;

import lombok.Builder;
import lombok.Data;

import static helper.StringHelper.GetSheetField;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/26
 */
@Data
@Builder
public class Table_Mapping_LINE {
    protected Integer ID;
    protected Integer RUN_ID;
    protected String TABLE_NAME;
    protected String SRC_HEAD_TAB;
    protected String SRC_SUB_TAB;
    protected String JOIN_TYPE;
    protected String HEAD_TAB_ALIAS;
    protected String SUB_TAB_ALIAS;
    protected String MAP_RULE_DESC;
    protected String HEAD_DB_CODE;
    protected String SUB_DB_CODE;
    protected String PHASE;
    @Override
    public String toString() {
        return GetSheetField(ID) + GetSheetField(RUN_ID) + GetSheetField(TABLE_NAME)+GetSheetField(SRC_HEAD_TAB)
                + GetSheetField(SRC_SUB_TAB) + GetSheetField(JOIN_TYPE) + GetSheetField(HEAD_TAB_ALIAS)
                + GetSheetField(SUB_TAB_ALIAS) + GetSheetField(MAP_RULE_DESC)+GetSheetField(HEAD_DB_CODE) +GetSheetField(SUB_DB_CODE)+ GetSheetField(PHASE);
    }
}
