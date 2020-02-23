package com.supreme7.dubbo.server.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Author: supreme7
 * Date: Created in 21:48 20/02/23
 * Description:
 */
@Data
public abstract class BasePojo implements Serializable {

    private Data created;
    private Data updated;
}
