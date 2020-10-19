package com.ruoyi.system.response;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PageResult<T> {
    private long total;
    private List<T> rows;
}
