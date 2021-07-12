package site.zhangcui.database.addr.web;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import site.zhangcui.database.addr.pojo.entity.Equipment;

@RestController(value = "/require")
public class EquipmentController {
    @RequestMapping("/list")
    @ResponseBody
    public Page<Equipment> listPageRequirement() {
        return new Page<>();
    }
}
