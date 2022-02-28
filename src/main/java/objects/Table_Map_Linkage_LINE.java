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
public class Table_Map_Linkage_LINE {
    protected Integer ID;
    protected Integer RUN_ID;
    protected String TABLE_NAME;
    protected String HEAD_TAB_ALIAS;
    protected String SUB_TAB_ALIAS;
    protected String LINKAGE;
    protected String SRC_HEAD_COL;
    protected String FURMULA;
    protected String SRC_SUB_COL;
    protected String RULE_DESC;
    protected String PHASE;

    @Override
    public String toString() {
        return GetSheetField(ID) + GetSheetField(RUN_ID) + GetSheetField(TABLE_NAME) + GetSheetField(HEAD_TAB_ALIAS)
                + GetSheetField(SUB_TAB_ALIAS) + GetSheetField(LINKAGE) + GetSheetField(SRC_HEAD_COL)
                + GetSheetField(FURMULA) + GetSheetField(SRC_SUB_COL) + GetSheetField(RULE_DESC) + GetSheetField(PHASE);
    }
}
