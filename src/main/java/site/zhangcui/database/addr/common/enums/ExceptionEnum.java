package site.zhangcui.database.addr.common.enums;

public enum ExceptionEnum {
    WRONG_PERMISSIONS("403", "未通过权限申请");

    String code;
    String name;

    ExceptionEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    ;

    @Override
    public String toString() {
        return "[Code:" + code + "]:" + name;
    }


}