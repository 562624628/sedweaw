package objects;

import lombok.Data;

import java.util.List;

@Data
/**
 * @description: dsa
 * @author: zhoulei
 * @date: 2022/2/11
 */
public class TableMapObject {
    private String tableName;
    private List<FieldObject> fieldObjectList;
}
