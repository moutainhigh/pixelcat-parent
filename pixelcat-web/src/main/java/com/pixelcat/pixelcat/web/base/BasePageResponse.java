package com.pixelcat.pixelcat.web.base;

import lombok.Data;

import java.util.List;

@Data
public class BasePageResponse<T> {

    private Integer code = 0;

    private String message = "SUCCESS";

    private List<T> dataList;

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 每一页大小
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer pageCount;

    /**
     * 总记录数
     */
    private Integer recordCount;

}
