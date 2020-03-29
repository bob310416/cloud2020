package com.bobtest.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Author: bob
 * Date: 2020/3/29 - 18:32
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);


}

