package site.zhangcui.database.addr.common.request;

import lombok.Data;

@Data
public class BasePageQuery {
    public int pageSize;
    public int pageNum;
}
