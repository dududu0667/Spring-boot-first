package com.sell.demo.VO;

public class ResultVO<T> {
    /**状态码*/
    private Integer code;

    /**返回的信息*/
    private String meg;

    /**返回的数据对象*/
    private T data;
}
