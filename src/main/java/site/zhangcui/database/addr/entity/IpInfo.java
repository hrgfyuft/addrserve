package site.zhangcui.database.addr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "ip_info")//指定表名
public class IpInfo {
    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "UUID",type = IdType.AUTO)//指定自增策略
    private Long id;
    //若没有开启驼峰命名，或者表中列名不符合驼峰规则，可通过该注解指定数据库表中的列名，exist标明数据表中有没有对应列
    @TableField(value = "SAVE_TIME",exist = true)
    private Date saveTime;
    @TableField(value = "IP_ADDRESS",exist = true)
    private String ipAddress;
}
