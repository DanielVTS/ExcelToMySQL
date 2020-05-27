package cn.lingnan.services.impl;

import cn.lingnan.mapper.BasicInformationMapper;
import cn.lingnan.pojo.BasicInformation;
import cn.lingnan.pojo.BasicInformationExample;
import cn.lingnan.services.BasicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BasicInformationServiceImpl implements BasicInformationService {


    @Autowired
    private BasicInformationMapper mapper;

    @Override
    public int insert(BasicInformation basicInformation) {
        System.out.println(basicInformation.toString());
        return mapper.insert(basicInformation);
    }

    @Override
    public List<BasicInformation> getAll() {
        BasicInformationExample example = new BasicInformationExample();
        BasicInformationExample.Criteria criteria = example.createCriteria();
        criteria.andSIdIsNotNull();
        return mapper.selectByExample(example);
    }
}
