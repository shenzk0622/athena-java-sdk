package com.uniubi.cloud.athena.sdk.clients;

import com.uniubi.cloud.athena.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.athena.sdk.common.models.SdkResult;

/**
 * 测试api接口
 *
 * @author jingmu
 * @date 2020/5/8
 */
public interface SdkTestApi {

    /**
     * 测试接口
     * @return 测试接口返回的测试数据
     */
    @RequestMark(name = "test", version = "v1", desc = "测试接口")
    SdkResult<String> test();

}