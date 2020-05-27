package cn.lingnan.services;

import cn.lingnan.pojo.BasicInformation;

import java.util.List;

public interface BasicInformationService {
    int insert(BasicInformation basicinformation);

    List<BasicInformation> getAll();
}
