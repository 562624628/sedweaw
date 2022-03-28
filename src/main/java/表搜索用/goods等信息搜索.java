package 表搜索用;

import com.alibaba.fastjson.JSON;
import enums.JDBCENUM;
import helper.ConnectionHelper;
import objects.FieldObject;
import objects.TableMapObject;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.sql.Connection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/3/22
 */
public class goods等信息搜索 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("GOODS_ID", "GOODS_CODE","GOODS_PLAN_CODE", "GOODS_NAME", "PLAN_ID", "PLAN_CODE", "PACKAGE_ID", "PACKAGE_CODE", "PRODUCT_ID", "PRODUCT_CODE");
        Connection connection = ConnectionHelper.getConnection(JDBCENUM.LOCAL);
        List<TableMapObject> tableNames = ConnectionHelper.getTableNames(connection);
        List<Object> collect = tableNames.stream().map(x -> {
            HashMap<String, List<String>> hashMap = new HashMap<>();
            List<FieldObject> columnNames = ConnectionHelper.getColumnNames(x.getTableName(), ConnectionHelper.getConnection(JDBCENUM.LOCAL));
            List<String> collect1 = columnNames.stream().map(y -> {
                for (String s : list) {
                    if (s.equalsIgnoreCase(y.getFieldName())) {
                        return s;
                    }
                }
                return null;
            }).filter(Objects::nonNull).collect(Collectors.toList());
            hashMap.put(x.getTableName(), collect1);
            if(CollectionUtils.isEmpty(collect1)){
                return null;
            }
            return hashMap;
        }).filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect));

    }
}
