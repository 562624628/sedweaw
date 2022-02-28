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
public class Fields_Mapping_Pre_Tar_LINE {
    protected Integer ID;
    protected Integer RUN_ID;
    protected String TABLE_NAME;
    protected String COLUMN_NAME;
    protected String DATA_TYPE;
    protected Integer LENGTH;
    protected String NULLABLE;
    protected String IS_PK;
    protected String DEFAULT_VALUE;
    protected String DESC;
    protected String DESC_EN;
    protected String FK_TAB;
    protected String CODE_TABLE;
    protected String SOURCE_TAB;
    protected String SOURCE_COLUMN;
    protected String MAPPING_EXPRESION;
    protected String MAPPING_RULE;
    protected String SOURCE_ALIAS;
    protected String IS_GROUP_BY;
    protected String COMMENTS;
    protected String UPDATOR;
    protected String UPDATE_TIME;
    protected String UPDATE_COMNENT;
    protected String IS_CODE_MAPPING;
    protected String IS_GEN_SQL;

    public String toString() {
        return GetSheetField(ID) + GetSheetField(RUN_ID) + GetSheetField(TABLE_NAME) + GetSheetField(COLUMN_NAME)
                + GetSheetField(DATA_TYPE) + GetSheetField(LENGTH) + GetSheetField(NULLABLE)
                + GetSheetField(IS_PK) + GetSheetField(DEFAULT_VALUE) + GetSheetField(DESC) + GetSheetField(DESC_EN) + GetSheetField(FK_TAB)
                + GetSheetField(CODE_TABLE) + GetSheetField(SOURCE_TAB) + GetSheetField(SOURCE_COLUMN)
                + GetSheetField(MAPPING_EXPRESION) + GetSheetField(MAPPING_RULE)
                + GetSheetField(SOURCE_ALIAS) + GetSheetField(IS_GROUP_BY) + GetSheetField(COMMENTS) + GetSheetField(UPDATOR) + GetSheetField(UPDATE_TIME)
                + GetSheetField(UPDATE_COMNENT) + GetSheetField(IS_CODE_MAPPING) + GetSheetField(IS_GEN_SQL);
    }
}
