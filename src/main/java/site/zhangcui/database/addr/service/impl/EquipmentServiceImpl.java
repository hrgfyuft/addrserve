package site.zhangcui.database.addr.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.zhangcui.database.addr.dao.EquipmentMapper;
import site.zhangcui.database.addr.pojo.entity.Equipment;
import site.zhangcui.database.addr.pojo.vo.EquipmentVO;
import site.zhangcui.database.addr.service.EquipmentService;
@Service("Equipment")
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;

    public Page<Equipment> listPageEquipment(EquipmentVO equipmentVO) {

        Wrapper<EquipmentVO> equipmentVOWrapper = new QueryWrapper<>();
        equipmentMapper.selectList(equipmentVOWrapper);
    }
}
