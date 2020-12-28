package com.lw.admin.common.exception;

import com.lw.admin.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 *
 * @Author: Brian
 * @Date: 2020/12/28 13:25
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
