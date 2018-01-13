package org.allen.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baturu.kit.dto.ResultDTO;
import com.baturu.trade.inquiry.dtos.InquiryDTO;
import com.baturu.trade.inquiry.service.InquiryQueryService;
import org.allen.dao.InquiryDAO;
import org.apache.commons.collections.CollectionUtils;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("inquiry")
@RestController
public class InquiryController {

    @Autowired
    private InquiryDAO inquiryDAO;

    @Reference(version = "3.0.0")
    private InquiryQueryService inquiryQueryService;

    @RequestMapping("getContacts/{inquiryId}")
    public String getContacts(@PathVariable("inquiryId") int inquiryId) {
        return inquiryDAO.getInquiryContact(inquiryId);
    }

    @RequestMapping("getInquiryDTO/{inquiryId}")
    public ResultDTO getInquiryDTO(@PathVariable("inquiryId") int inquiryId) {
        Collection<InquiryDTO> inquiriesByIds = inquiryQueryService.findInquiriesByIds(Lists.newArrayList(inquiryId), null);
        if (CollectionUtils.isNotEmpty(inquiriesByIds)) {
            return ResultDTO.successfy(inquiriesByIds.iterator().next().getContacts());
        } else return ResultDTO.successfy(null);
    }
}
