package 数据迁移Excel数据编辑用;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/3/4
 */
public class SplitTable {
    public static void main(String[] args) {
        String table = "shelf_display_block\n" +
                "shelf_display_block_customized_design\n" +
                "shelf_display_block_detail\n" +
                "shelf_display_block_detail_extend\n" +
                "shelf_page\n" +
                "shelf_page_language";
        String x = table.replaceAll("\n", "\t");
        System.out.println(x);
        String[] split = x.split("\t");
        List<String> collect = Arrays.asList(split).stream().map(y -> "\"" + y + "\",").collect(Collectors.toList());
        System.out.println(String.join("",collect));

    }
}
