package com.security.elasticsearchpractice.dto.response;

import com.security.elasticsearchpractice.enums.ApiResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponseWrapper<T> {
    private int statusCode;
    private String message;
    private T data;

    public static <T> ApiResponseWrapper<T> success(T data) {
        return new ApiResponseWrapper<>(ApiResponseStatus.SUCCESS.getCode(), ApiResponseStatus.SUCCESS.getMessage(), data);
    }

    public static <T> ApiResponseWrapper<T> error(ApiResponseStatus status, T data) {
        return new ApiResponseWrapper<>(status.getCode(), status.getMessage(), data);
    }
}
