package com.itchen.gateway.predicate;

import lombok.Data;

import java.time.LocalTime;

/**
 * TimeBetween 配置类 .
 *
 * @author BibiChen
 * @version v1.0
 * @since 2020-02-23
 */
@Data
public class TimeBetweenConfig {

    private LocalTime start;

    private LocalTime end;

}
