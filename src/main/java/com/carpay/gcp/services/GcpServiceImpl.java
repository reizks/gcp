package com.carpay.gcp.services;

import org.springframework.stereotype.Service;

@Service
public class GcpServiceImpl implements GcpService{
    @Override
    public String getDetailInfo() {
        return "되나요";
    }
}
