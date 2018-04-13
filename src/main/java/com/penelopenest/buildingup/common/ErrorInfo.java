package com.penelopenest.buildingup.common;

import lombok.Data;

/**
 * @author penelopeWu
 * @version 1.0
 * @date 2018-04-13 0:34
 */
@Data
public class ErrorInfo<T> {
    public static final Integer OK = 0;
    public static final Integer ERROR = 100;

    private Integer code;
    private String message;
    private String url;
    private T data;

}
