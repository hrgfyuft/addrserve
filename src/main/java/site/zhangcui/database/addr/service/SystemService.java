package site.zhangcui.database.addr.service;

import site.zhangcui.database.addr.pojo.entity.IpInfo;

import java.util.List;

public interface SystemService {
    int insert(IpInfo ipInfo);

    List<IpInfo> queryIpInfoList(IpInfo ipInfo);
}
