package site.zhangcui.database.addr.entity;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user")
public class User {

    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "user_id",type = IdType.AUTO)//指定自增策略
    private Long userId;
    //若没有开启驼峰命名，或者表中列名不符合驼峰规则，可通过该注解指定数据库表中的列名，exist标明数据表中有没有对应列
    @TableField(value = "user_account",exist = true)
    private String userAccount;
    @TableField(value = "user_name",exist = true)
    private String userName;
    @TableField(value = "phone_number",exist = true)
    private String phoneNumber;
    @TableField(value = "email",exist = true)
    private String email;
    @TableField(value = "icon",exist = true)
    private String icon;
    @TableField(value = "icon",exist = true)
    private String password;
    @TableField(value = "gmt_create",exist = true)
    private Date gmtCreate;
    @TableField(value = "creator",exist = true)
    private JSONObject creator;
    @TableField(value = "gmt_modified",exist = true)
    private Date gmtModified;
    @TableField(value = "modifier",exist = true)
    private JSONObject modifier;
    @TableField(value = "state",exist = true)
    private int state;
}
