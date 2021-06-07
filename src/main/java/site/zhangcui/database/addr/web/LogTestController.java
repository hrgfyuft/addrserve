package site.zhangcui.database.addr.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.zhangcui.database.addr.common.enums.ExceptionEnum;
import site.zhangcui.database.addr.exception.NoPermissionException;
import site.zhangcui.database.addr.exception.result.ResponseMessage;
import site.zhangcui.database.addr.exception.result.ResponseResult;


@RestController
public class LogTestController {

    protected static Logger logger=LoggerFactory.getLogger(LogTestController.class);
    @RequestMapping("/test")
    public ResponseResult Test(@RequestParam(value="role") Integer role) throws Exception{

        logger.info("访问Controller");
        int i = role;

        if(i<0){
            throw new NoPermissionException(ExceptionEnum.WRONG_PERMISSIONS.toString());

        }
        else{
            return new ResponseResult(ResponseMessage.OK);
        }


    }

}
