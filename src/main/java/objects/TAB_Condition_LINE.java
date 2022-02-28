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
public class TAB_Condition_LINE {
    protected Integer ID;
    protected Integer RUN_ID;
    protected String TAR_TABLE;
    protected String SRC_TAB;
    protected String SRC_TAB_ALIAS;
    protected String COL_NAME;
    protected String EXPRESION_FURMULA;
    protected String EXPRESION_VALUE;
    protected String EXEC_POSITION;
    protected String PHASE;

    @Override
    public String toString() {
        return GetSheetField(ID) + GetSheetField(RUN_ID) + GetSheetField(TAR_TABLE) + GetSheetField(SRC_TAB)
                + GetSheetField(SRC_TAB_ALIAS) + GetSheetField(COL_NAME) + GetSheetField(EXPRESION_FURMULA)
                + GetSheetField(EXPRESION_VALUE) + GetSheetField(EXEC_POSITION) + GetSheetField(PHASE);
    }
}
