package helper;

import lombok.Data;

@Data
public class VDIDO{
    private String base;
    private String 角色;
    private String 姓名;
    private String 最近成功登录日期;
    private String 账号;
    private String 密码;
    private String 状态;
    @Override
    public String toString(){
        return base+"\t"+角色+"\t"+姓名+"\t"+最近成功登录日期+"\t"+账号+"\t"+密码+"\t"+状态;
    }

}