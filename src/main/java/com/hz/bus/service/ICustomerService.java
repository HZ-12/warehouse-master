package com.hz.bus.service;

import com.hz.bus.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

/**by67
 * <p>
 * InnoDB free: 9216 kB 服务类
 * </p>
 */
public interface ICustomerService extends IService<Customer> {

    /**
     * 根据客户id删除客户
     * @param id    客户id
     */
    void deleteCustomerById(Integer id);
}
