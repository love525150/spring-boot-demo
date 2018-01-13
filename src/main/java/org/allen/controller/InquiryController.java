package org.allen.controller;

import org.allen.dao.InquiryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("inquiry")
@RestController
public class InquiryController {

    @Autowired
    private InquiryDAO inquiryDAO;

    @RequestMapping("getContacts/{inquiryId}")
    public String getContacts(@PathVariable("inquiryId") int inquiryId) {
        return inquiryDAO.getInquiryContact(inquiryId);
    }
}
