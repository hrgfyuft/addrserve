package site.zhangcui.database.addr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.zhangcui.database.addr.dao.IpInfoMapper;
import site.zhangcui.database.addr.entity.IpInfo;
import site.zhangcui.database.addr.service.SystemService;

@Service("system")
public class SystemServiceImpl implements SystemService {
    @Autowired
    IpInfoMapper ipInfoMapper;

    @Override
    public int insert(IpInfo ipInfo) {
         return ipInfoMapper.insert(ipInfo);
    }
}
