package enums;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/2/25
 */
public enum JDBCENUM {


    OLD("jdbc:mysql://awschina-nx-app-test-rds-01.crag5sximeqt.rds.cn-northwest-1.amazonaws.com.cn:3306/inc_gr_passage_00", "income_test1_ro", "lxbEyCzHrPppCeaa"),

    NEW("jdbc:mysql://awschina-nx-app-test2-rds-01.crag5sximeqt.rds.cn-northwest-1.amazonaws.com.cn:3306/incomenew_dm_backend_00", "incomenew_dmtest1_rw", "tjJg7NohARX8xjM4"),

    NEWPAYMENT("jdbc:mysql://awschina-nx-app-test2-rds-01.crag5sximeqt.rds.cn-northwest-1.amazonaws.com.cn:3306/incomenew_payment_gateway_00","incomenew_dmtest1_rw","tjJg7NohARX8xjM4"),

    LOCAL("jdbc:mysql://localhost:3306/incomenew_dm_backend_00", "root", "root");


    public String url;

    public String name;

    public String password;

    JDBCENUM(String url, String name, String password) {
        this.url = url;
        this.name = name;
        this.password = password;
    }
}
