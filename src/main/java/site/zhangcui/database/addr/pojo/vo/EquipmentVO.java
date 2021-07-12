package site.zhangcui.database.addr.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import site.zhangcui.database.addr.common.request.BasePageQuery;

import java.util.Date;
import java.util.List;

@Data
public class EquipmentVO extends BasePageQuery {
    private Long id;
    private String name;
    private String typeCode;
    private Integer version;
    private List<Date> gmtCreateRange;
    private int deleted;
}
