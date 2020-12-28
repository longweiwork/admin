package com.lw.admin.common.api;

/**
 * 封装API的错误码
 *
 * @Author: Brian
 * @Date: 2020/12/28 13:21
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
