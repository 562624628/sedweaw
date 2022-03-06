package 数据迁移Excel数据编辑用;

import config.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/3/6
 */
public class StandardSHEET {
    public static void main(String[] args) {
        Integer start1 = 1700;
        Integer start2 = 2700;
        Integer start3 = 3700;
        Integer start4 = 4700;
        Integer start5 = 5700;
        Integer start6 = 6700;
        Integer start7 = 7700;
        System.out.println(String.join("\t", Config.tables));
        System.out.println(String.join("\t",getIntLine(0)));
        System.out.println(String.join("\t",getIntLine(start1)));
        System.out.println(String.join("\t",getIntLine(start2)));
        System.out.println(String.join("\t",getIntLine(start3)));
        System.out.println(String.join("\t",getIntLine(start4)));
        System.out.println(String.join("\t",getIntLine(start5)));
        System.out.println(String.join("\t",getIntLine(start6)));
        System.out.println(String.join("\t",getIntLine(start7)));

    }
    public static List<String> getIntLine(Integer i){
        List<String> list = new ArrayList<>();
        for (String table : Config.tables) {
            list.add(String.valueOf(++i));
        }
        return list;
    }
}
