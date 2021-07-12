package site.zhangcui.database.addr.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("equipment")
public class Equipment {

    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Long id;
    //若没有开启驼峰命名，或者表中列名不符合驼峰规则，可通过该注解指定数据库表中的列名，exist标明数据表中有没有对应列
    @TableField(value = "name",exist = true)
    private String name;
    @TableField(value = "type_code",exist = true)
    private String typeCode;
    @TableField(value = "version",exist = true)
    private Integer version;
    @TableField(value = "gmt_create",exist = true)
    private Date gmtCreate;
    @TableField(value = "deleted",exist = true)
    private int deleted;
}
