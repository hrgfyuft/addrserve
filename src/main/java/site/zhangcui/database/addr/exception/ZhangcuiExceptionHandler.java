package site.zhangcui.database.addr.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import site.zhangcui.database.addr.exception.result.ResponseResult;


@CrossOrigin
@RestControllerAdvice
public class ZhangcuiExceptionHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(ZhangcuiExceptionHandler.class);

    @ExceptionHandler
    public ResponseResult processException(Exception ex, HttpServletRequest request, HttpServletResponse response) {

        if (ex instanceof MissingServletRequestParameterException) {
            return new ResponseResult(400, ex);
        }
        if (ex instanceof NoPermissionException) {

            LOGGER.error("=======" + ex.getMessage() + "=======");
            return new ResponseResult(401, "sorry，无权限！");

        }

        if (ex instanceof DuplicateKeyException) {
            LOGGER.error("=======违反主键约束：主键重复插入=======");
            return new ResponseResult(400, "主键重复插入！");
        }

        /**
         * 未知异常
         */
        LOGGER.error(ex.toString());
        return new ResponseResult(500, ex.getMessage());

    }

}