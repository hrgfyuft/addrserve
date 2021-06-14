package site.zhangcui.database.addr.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import site.zhangcui.database.addr.entity.IpInfo;
import site.zhangcui.database.addr.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
