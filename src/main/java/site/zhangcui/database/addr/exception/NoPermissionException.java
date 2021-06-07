package site.zhangcui.database.addr.exception;

/**
 * @author 97664
 * @program addr
 * @time 2021/6/7 22:41
 */

public class NoPermissionException extends Exception {
    private static final long serialVersionUID = 1L;

    public NoPermissionException(String msg) {
        super(msg);
    }
}
