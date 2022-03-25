package com.bepcms.pcms.constant;

public class Constant {

    /**
     * 登录页
     */
    public static final String LOGIN_PATH = "/login";

    public static final String CALL_BACK_URL = "sso_redirect";

    /**
     * 用户信息
     */
    public static final String SESSION_USER = "CURRENT_USER";

    public static final String SESSION_KEY_PREFIX = "SSO_SERVER:SESSION:CURRENT_USER:";

    public static String USER_TYPE_CODE_IAM = "3";
    public static String USER_TYPE_CODE_ROLE = "4";

    public static String CONNECTOR_STR = ":";

    public static String USER_LOGIN_MAX_RETRY_COUNT_LIMIT_KEY_PREFIX = "USER_LOGIN:MAX_RETRY_COUNT_LIMIT:";

    public static String USER_LOGIN_SESSION_LIST_KEY_PREFIX = "USER_LOGIN:SESSION_LIST_KEY_PREFIX:";

    /**
     * 与sessionId绑定的cookie名称
     */
    public static String SESSION_ID_COOKIE_NAME = "SID";

    /**
     * IAM要求重置密码标志
     */
    public static String IAM_FIRST_LOGIN_FLAG = "1";

    /**
     * 未绑定邮箱或手机，不提示绑定标志
     */
    public static final String BIND_NO_PROMPT = "0";

    /**
     * 账号状态，2--冻结
     */
    public static String LOGIN_STATUS_FREEZE = "2";

    /**
     * IAM重定向标识
     */
    public static String IAM_REDIRECT_FLAG_KEY = "cloudLoginCode";

}
