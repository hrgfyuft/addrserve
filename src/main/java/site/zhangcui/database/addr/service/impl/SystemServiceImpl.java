package site.zhangcui.database.addr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.zhangcui.database.addr.dao.IpInfoMapper;
import site.zhangcui.database.addr.entity.IpInfo;
import site.zhangcui.database.addr.service.SystemService;

import java.sql.Wrapper;
import java.util.List;

@Service("system")
public class SystemServiceImpl implements SystemService {
    @Autowired
    IpInfoMapper ipInfoMapper;

    @Override
    public int insert(IpInfo ipInfo) {
         return ipInfoMapper.insert(ipInfo);
    }

    @Override
    public List<IpInfo> queryIpInfoList(IpInfo ipInfo) {
        QueryWrapper wrapper = new QueryWrapper<IpInfo>();
        return ipInfoMapper.selectList(wrapper);
    }
}
