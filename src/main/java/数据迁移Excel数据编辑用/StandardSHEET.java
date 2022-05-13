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
        Integer start1 = 11300+Config.start;
        Integer start2 = 21300+Config.start;
        Integer start3 = 31300+Config.start;
        Integer start4 = 41300+Config.start;
        Integer start5 = 51300+Config.start;
        Integer start6 = 61300+Config.start;
        Integer start7 = 71300+Config.start;
        System.out.println(String.join("\t", Config.tables));
        System.out.println(String.join("\t",getIntLine(Config.start)));
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
