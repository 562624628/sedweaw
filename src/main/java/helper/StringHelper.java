package helper;

import org.apache.commons.codec.binary.StringUtils;

import java.util.Optional;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/25
 */
public class StringHelper {
    public static String GetSheetField(Object o){
        return Optional.ofNullable(o).map(String::valueOf).filter(x->x!=null || !"".equals(x)).orElse("")+"\t";
    }
}
