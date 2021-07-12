package site.zhangcui.database.addr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import site.zhangcui.database.addr.pojo.entity.IpInfo;
import site.zhangcui.database.addr.service.SystemService;

import java.util.List;

/**
 * @author 97664
 * @program addr
 * @time 2021/6/7 17:54
 */
@RestController
public class SystemController {
    @Autowired
    SystemService systemService;

    @RequestMapping(value = "/ipInfo", method = RequestMethod.GET)
    public List<IpInfo> ipInfo(IpInfo ipInfo) {
        return systemService.queryIpInfoList(ipInfo);
    }
}
