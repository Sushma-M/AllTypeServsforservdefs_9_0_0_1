/*Copyright (c) 2016-2017 vcstest1.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest1.com*/
package com.testsoapshare.adventureworks2014.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.testsoapshare.adventureworks2014.VjobCandidateEmployment;
import com.testsoapshare.adventureworks2014.VjobCandidateEmploymentId;
import com.testsoapshare.adventureworks2014.service.VjobCandidateEmploymentService;

/**
 * Controller object for domain model class VjobCandidateEmployment.
 * @see VjobCandidateEmployment
 */
@RestController("AdventureWorks2014.VjobCandidateEmploymentController")
@Api(value = "VjobCandidateEmploymentController", description = "Exposes APIs to work with VjobCandidateEmployment resource.")
@RequestMapping("/AdventureWorks2014/VjobCandidateEmployment")
public class VjobCandidateEmploymentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VjobCandidateEmploymentController.class);

    @Autowired
    @Qualifier("AdventureWorks2014.VjobCandidateEmploymentService")
    private VjobCandidateEmploymentService vjobCandidateEmploymentService;

    @ApiOperation(value = "Returns the VjobCandidateEmployment instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public VjobCandidateEmployment getVjobCandidateEmployment(@RequestParam("jobCandidateId") Integer jobCandidateId, @RequestParam("emp_startDate") Date emp_startDate, @RequestParam("emp_endDate") Date emp_endDate, @RequestParam("emp_orgName") String emp_orgName, @RequestParam("emp_jobTitle") String emp_jobTitle, @RequestParam("emp_responsibility") String emp_responsibility, @RequestParam("emp_functionCategory") String emp_functionCategory, @RequestParam("emp_industryCategory") String emp_industryCategory, @RequestParam("emp_loc_countryRegion") String emp_loc_countryRegion, @RequestParam("emp_loc_state") String emp_loc_state, @RequestParam("emp_loc_city") String emp_loc_city) throws EntityNotFoundException {
        VjobCandidateEmploymentId vjobcandidateemploymentId = new VjobCandidateEmploymentId();
        vjobcandidateemploymentId.setJobCandidateId(jobCandidateId);
        vjobcandidateemploymentId.setEmp_startDate(emp_startDate);
        vjobcandidateemploymentId.setEmp_endDate(emp_endDate);
        vjobcandidateemploymentId.setEmp_orgName(emp_orgName);
        vjobcandidateemploymentId.setEmp_jobTitle(emp_jobTitle);
        vjobcandidateemploymentId.setEmp_responsibility(emp_responsibility);
        vjobcandidateemploymentId.setEmp_functionCategory(emp_functionCategory);
        vjobcandidateemploymentId.setEmp_industryCategory(emp_industryCategory);
        vjobcandidateemploymentId.setEmp_loc_countryRegion(emp_loc_countryRegion);
        vjobcandidateemploymentId.setEmp_loc_state(emp_loc_state);
        vjobcandidateemploymentId.setEmp_loc_city(emp_loc_city);
        LOGGER.debug("Getting VjobCandidateEmployment with id: {}", vjobcandidateemploymentId);
        VjobCandidateEmployment vjobCandidateEmployment = vjobCandidateEmploymentService.getById(vjobcandidateemploymentId);
        LOGGER.debug("VjobCandidateEmployment details with id: {}", vjobCandidateEmployment);
        return vjobCandidateEmployment;
    }

    /**
     * @deprecated Use {@link #findVjobCandidateEmployments(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of VjobCandidateEmployment instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VjobCandidateEmployment> searchVjobCandidateEmploymentsByQueryFilters(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering VjobCandidateEmployments list");
        return vjobCandidateEmploymentService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the list of VjobCandidateEmployment instances matching the search criteria.")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VjobCandidateEmployment> findVjobCandidateEmployments(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering VjobCandidateEmployments list");
        return vjobCandidateEmploymentService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data.")
    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportVjobCandidateEmployments(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return vjobCandidateEmploymentService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns the total count of VjobCandidateEmployment instances.")
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Long countVjobCandidateEmployments(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting VjobCandidateEmployments");
        return vjobCandidateEmploymentService.count(query);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service VjobCandidateEmploymentService instance
	 */
    protected void setVjobCandidateEmploymentService(VjobCandidateEmploymentService service) {
        this.vjobCandidateEmploymentService = service;
    }
}
