package com.example.cloudproviderpayment8001.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloudapicommons.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
