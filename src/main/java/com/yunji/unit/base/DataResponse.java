package com.yunji.unit.base;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Description 业务描叙信息
 *
 * @author Created by Iritchie.ren on 2020/5/14.
 */


@Data
@NoArgsConstructor
@Accessors(chain = true)
public class DataResponse<T> implements Serializable {

    private int code = 0;
    private String msg = "";
    private T data = null;

    public final static String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    /**
     * 构造默认调用成功无返回值Response
     *
     * @param <T> 返回值类型
     * @return 调用结果Response
     */
    public static <T> DataResponse<T> buildSuccess() {
        return buildSuccess(null);
    }

    /**
     * 构造调用成功带返回值T的Response
     *
     * @param data 返回值
     * @param <T>  返回值类型
     * @return 调用结果Response
     */
    public static <T> DataResponse<T> buildSuccess(T data) {
        return buildSuccess(DEFAULT_SUCCESS_MESSAGE, data);
    }

    /**
     * 构造调用成功带提示信息+返回值T的Response
     *
     * @param msg  提示信息
     * @param data 返回值
     * @param <T>  返回值类型
     * @return 调用结果Response
     */
    public static <T> DataResponse<T> buildSuccess(String msg, T data) {
        return buildCommon(0, msg, data);
    }

    /**
     * 用业务线代码+业务自定义返回码+提示信息+返回值构造Response，用于指定业务返回码
     *
     * @param baseCode     业务线代码
     * @param businessCode 业务返回码
     * @param msg          提示信息
     * @param data         返回值
     * @param <T>          返回值类型
     * @return 调用结果Response
     */
    public static <T> DataResponse<T> buildBusiness(int baseCode, int businessCode, String msg, T data) {
        return buildCommon(10000001, msg, data);
    }

    /**
     * 用返回码+提示信息+返回值构造Response，用于指定通用码
     *
     * @param code 返回码
     * @param msg  提示信息
     * @param data 返回值
     * @param <T>  返回值类型
     * @return 调用结果Response
     */
    public static <T> DataResponse<T> buildCommon(int code, String msg, T data) {
        return new DataResponse<T>()
                .setCode(code)
                .setMsg(msg)
                .setData(data);
    }

    /**
     * 用返回码+提示信息构造Response，用于指定通用码
     *
     * @param code 返回码
     * @param msg  提示信息
     * @param <T>  返回值类型
     * @return 调用结果Response
     */
    public static <T> DataResponse<T> buildCommon(int code, String msg) {
        return buildCommon(code, msg, null);
    }

}
