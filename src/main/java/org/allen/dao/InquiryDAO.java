package org.allen.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface InquiryDAO {

    @Select("select contacts from qp_inquiry where inquiryId = #{inquiryId}")
    String getInquiryContact(@Param("inquiryId") int inquiryId);
}
