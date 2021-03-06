/*Generated by WaveMaker Studio*/

package com.alltypeservsforservdefs_9_0_0_1.classicmodels.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wordnik.swagger.annotations.Api;

import com.alltypeservsforservdefs_9_0_0_1.classicmodels.service.ClassicmodelsQueryExecutorService;

@RestController(value = "Classicmodels.QueryExecutionController")
@RequestMapping("/classicmodels/queryExecutor")
@Api(value = "QueryExecutionController", description = "controller class for query execution")
public class QueryExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryExecutionController.class);

    @Autowired
    private ClassicmodelsQueryExecutorService queryService;


}


