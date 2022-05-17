package helper;

import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class dsad {
    public static void main(String[] args) {
        String a = "上海\tST\t王冬琰\t八月 13, 2020\tISV6368\tZawdy202107.\tVDI权限删除，保留VPN\n" +
                
                "上海\tAA\t李龙龙\t三月 20, 2022\tISV6290\tZa20220303Za\t正常\n" +
                
                "上海\tAB\tAmber\t十月 15, 2021\tISV6596\tmouDJ9BKIVXpID1788\tVDI权限删除，保留VPN\n" +
                "上海\tBA\t刘岳昊\t十二月 3, 2021\tISV7126\tZa2021101010\t正常\n" +
                "新加坡\tAA\t由林国\t十月 29, 2021\tISV7125\ta8c3iEAbc234\t正常\n" +
                "大连\tAD\t周雷\t5月 12, 2022\tISV7119\tZa202201^^^^^^\t正常\n" +
                "大连\tAD\t肖辰\t四月 29, 2022\tISV7552\tZa202205666666\t正常\n" +
                "大连\tAD\t张玮\t五月 13, 2022\tISV7551\tZa202206666666\t正常\n" +
                "大连\tST\t马亚亚\t二月 11, 2022\tISV7553\tZa202202666666\t正常\n" +
                "新加坡\tPM\tBruno\t十二月 20, 2021\tISV6366\t21Q266w3e4r!@#$\t已删除\n" +
                "上海\tCM\t文钊\t二月 18, 2022\tISV7695\tN3_8hy5J-w0W\t已删除\n" +
                "新加坡\tBA\tGoh Seow Chew\t十二月 9, 2021\tISV7711\t\t正常\n" +
                "大连\tAD\t欧阳效远\t三月 4, 2022\tISV6592\tZa202202666999\t正常\n" +
                
                "上海\tAA\t薛晓\t五月 6, 2022\tISV6594\tAndrewOct3810\t正常\n" +
                "上海\tAA\t陈寿发\t五月 13, 2022\tISV6199\tZa202205123456\t正常\n" +
                
                "上海\tCM\t夏云鹤\t一月 27, 2022\tISV6891\t\tVDI权限删除\n" +
                
                "上海\tST\t王瑶\t四月 12, 2022\tISV6586\tZa20220314Za\t正常\n" +
                
                "大连\tST\t石磊\t十二月 27, 2021\tISV7833\tZa202202666666\tVDI权限删除，保留VPN\n" +
                
                "大连\tST\t赵莹\t一月 12, 2022\tISV7834\tZa202120666666\tVDI权限删除，保留VPN\n" +
                "上海\tAD\t吴冬冬\t十二月 29, 2021\tISV7832\tZa20220101Za\tVDI权限删除\n" +
                "深圳\tDBA\t童罗\t5月 10, 2022\tISV7830\tzcfU247ywRBWiXv2\t正常\n" +
                "大连\tAD\t郑义\t一月 4, 2022\tISV7905\tZa202201111111\t已删除\n" +
                
                "大连\tAD\t刁兰\t五月12,2022\tISV7906\tZa202206888888\t正常\n" +
                "大连\tAD\t王猛\t四月 18, 2022\tISV7907\tWmZa20221994\t正常\n" +
                "深圳\tPE\t李俊\t一月 21, 2022\tISV7904\t\t正常\n" +
                
                "上海\tAD\t霍延鹏\t二月 17, 2022\tISV7980\tAaa123456789\tVDI权限删除\n" +
                "大连\tAD\t安天元\t四月 19, 2022\tISV7981\t1Qaz2wsx3edc$\t正常\n" +
                "上海\tBA\tDiana\t2022/4/25\tISV7982\tZa2022041111@\t正常\n" +
                "上海\tST\t毛成艳\t四月 25, 2022\tISV8033\tZa20220425Za\t正常\n" +
                
                "大连\tAD\t孙传虎\t十一月 12, 2021\tISV8031\tZa202111777777\t已删除\n" +
                "大连\tAD\t鲁墨\t四月 06, 2022\tISV8032\tZa202205666666\t正常\n" +
                "深圳\tPE\t袁少雄\t\tISV6890\t\t已删除\n" +
                
                "大连\tAD\t时健宇\t\tISV6849\t\t已删除\n" +
                
                "上海\tST\t王侠\t\tISV6201\t\t已删除\n" +
                
                "大连\tST\t周振华\t\tISV7550\t\t已删除\n" +
                
                
                "深圳\tPE\t朱炳壁\t\tISV7667\t\t已删除\n" +
                
                "大连\tST\t谭博阳\t\tISV7554\t\t已删除\n" +
                "深圳\tPE\t邓明华\t\tISV7831\t\t已删除\n" +
                
                "上海\tBA\tAnnie\t十一月 12, 2021\tISV6367\t\tVDI权限删除，保留VPN\n" +
                
                "上海\tAD\t万健华\t\tISV6374\t\t已删除\n" +
                
                "深圳\tDBA\t余振羊\t二月 18, 2022\tISV8041\t\t正常\n" +
                
                "深圳\tPE\t李懊恒\t一月 13, 2022\tISV8040\t\t已删除\n" +
                
                "上海\tDM，AA\t孟新伟\t二月 11, 2022\tISV8411\tZa123456123456\t正常\n" +
                "上海\tST\t方大地\t一月 29, 2022·\tISV8400\tincomeEdbsi89hh\t正常\n" +
                "大连\tAD\t吴月海\t一月 27, 2022·\tISV8399\tWYHwyh@12345678\t正常\n" +
                "上海\tST\t吴谢琼\t一月 27, 2022\tISV8401\tZa20220401Za\t正常\n" +
                
                "上海\tST\t许倩雯\t四月 29, 2022\tISV8403\tZa202205xqw..\t正常\n" +
                
                "上海\tST\t李哲\t四月 7, 2022\tISV8402\tZa202204071030\t正常\n" +
                "上海\tDEV\t徐瑶\t四月 14, 2022\tISV8602\tZa202205^^^^^^\t正常\n" +
                
                "上海\tDEV\t梁益\t五月 15, 2022\tISV8601\t\t正常\n" +
                
                "大连\tDEV\t赵旭\t五月 7, 2022\tISV8599\t\t正常\n" +
                
                "上海\tDEV\t王旭\t四月 29，2022 \tISV8603\t\t正常\n" +
                
                "上海\tDEV\t曾卫东\t二月 11，2022 \tISV8408\t\t登不上\n" +
                
                "上海\tDEV\t 吴晗晗 \t\tISV8410\t\t正常\n" +
                
                "上海\tDEV\t 张绪 \t\tISV8409\t\t正常\n" +
                
                "上海\tDEV\t 闫前刚 \t三月 29，2022 \tISV8406\t\t正常\n" +
                
                "上海\tDEV\t 余振宇 \t三月 30，2022 \tISV8405\tZa202201888888\t正常\n" +
                
                "上海\tDEV\t 王敏 \t\tISV8407\t\t正常\n" +
                
                "大连\tST\t 桂爽 \t三月 29，2022 \tISV8600\tZa202203111111\t正常\n" +
                
                "上海\tPE\t谢国波\t\tISV8809\t\t正常\n" +
                
                "大连\tAD\t张 明松\t五月 5,\t ISV8832\tZa2022050555\t正常\n" +
                "\t\t \t2022\t \t\t\n" +
                "\t\t毕 仕坤\t\t ISV8831\t\t申请删除\n" +
                
                "\t\t周 坤\t\t ISV8830\t\t正常\n" +
                
                "\t\tRayson Li\t\t ISV8829\t\t已删除\n" +
                
                "\t\t孙 辉\t\t ISV8828\t\t已删除\n" +
                
                "\t\tXu,qing\t\t ISV8826\t\t已删除\n" +
                
                "大连\tST\t郭 豪奇\t五月 7，2022\t ISV8827\tZa20220507Za\t正常\n" +
                
                "上海\tST\t方 泽霞\t五月 7,\t ISV8825\tZa20220507Za\t正常\n" +
                "\t\t \t2022\t \t\t\n" +
                "\t\t吴 胜杰\t\t ISV8835\t\t正常\n" +
                
                "上海\tSIT\t陈 伟\t五月 7,\t ISV8834\t\t正常\n" +
                "\t\t \t2022\t \tP@ssWord123456\t\n" +
                "\t\t 刘 双双\t\t ISV8833\t\t已删除\n" ;
                

        String[] split = a.split("\n");
        List<VDIDO> collect = Arrays.asList(split).stream().map(x -> {
            VDIDO vdido = new VDIDO();
            String base = getBase(x,0);
            vdido.setBase(base);
            vdido.set角色(getBase(x,1));
            vdido.set姓名(getBase(x,2));
            vdido.set最近成功登录日期(getBase(x,3));
            vdido.set账号(getBase(x,4));
            vdido.set密码(getBase(x,5));
            vdido.set状态(getBase(x,6));
            return vdido;
        }).sorted(Comparator.comparing(VDIDO::get状态)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    private static String getBase(String x,int a) {
        String s = "";
        try {
            s=x.split("\t")[a];
        }catch (Exception e){
            s = "";
        }

        return s;
    }


}
