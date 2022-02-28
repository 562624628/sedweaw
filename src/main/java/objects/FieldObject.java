package objects;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

public class FieldObject {
    List<String> noNeedSize = Arrays.asList("datetime","smallint","date","text");
    private String fieldName;
    private String fieldType;
    private Integer fieldSize;
    private String canIsNull;

    public List<String> getNoNeedSize() {
        return noNeedSize;
    }

    public void setNoNeedSize(List<String> noNeedSize) {
        this.noNeedSize = noNeedSize;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        if("varchar".equalsIgnoreCase(fieldType) && 21845 == fieldSize){
            fieldType = "text";
        }
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getCanIsNull() {
        return canIsNull;
    }

    public void setCanIsNull(String canIsNull) {
        this.canIsNull = canIsNull;
    }

    public Integer getFieldSize() {
        if(noNeedSize.contains(getFieldType().toLowerCase())){
            return null;
        }
        return fieldSize;
    }

    public void setFieldSize(Integer fieldSize) {
        this.fieldSize = fieldSize;
    }
}
