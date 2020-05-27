package cn.lingnan.mapper;

import cn.lingnan.pojo.BasicInformation;
import cn.lingnan.pojo.BasicInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasicInformationMapper {
    long countByExample(BasicInformationExample example);

    int deleteByExample(BasicInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasicInformation record);

    int insertSelective(BasicInformation record);

    List<BasicInformation> selectByExample(BasicInformationExample example);

    BasicInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasicInformation record, @Param("example") BasicInformationExample example);

    int updateByExample(@Param("record") BasicInformation record, @Param("example") BasicInformationExample example);

    int updateByPrimaryKeySelective(BasicInformation record);

    int updateByPrimaryKey(BasicInformation record);
}