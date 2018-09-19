/*Copyright (c) 2016-2017 vcstest1.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest1.com*/
package com.testsoapshare.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.sql.Time;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testsoapshare.adventureworks2014.EmployeeDepartmentHistory;
import com.testsoapshare.adventureworks2014.Shift;

/**
 * Service object for domain model class {@link Shift}.
 */
public interface ShiftService {

    /**
     * Creates a new Shift. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Shift if any.
     *
     * @param shift Details of the Shift to be created; value cannot be null.
     * @return The newly created Shift.
     */
	Shift create(@Valid Shift shift);


	/**
	 * Returns Shift by given id if exists.
	 *
	 * @param shiftIdInstance The id of the Shift to get; value cannot be null.
	 * @return Shift associated with the given shiftIdInstance.
     * @throws EntityNotFoundException If no Shift is found.
	 */
	Shift getById(Byte shiftIdInstance) throws EntityNotFoundException;

    /**
	 * Find and return the Shift by given id if exists, returns null otherwise.
	 *
	 * @param shiftIdInstance The id of the Shift to get; value cannot be null.
	 * @return Shift associated with the given shiftIdInstance.
	 */
	Shift findById(Byte shiftIdInstance);

    /**
	 * Find and return the Shift for given startTime  andendTime  if exists.
	 *
	 * @param startTime value of startTime; value cannot be null.
	 * @param endTime value of endTime; value cannot be null.
	 * @return Shift associated with the given inputs.
     * @throws EntityNotFoundException if no matching Shift found.
	 */
    Shift getByStartTimeAndEndTime(Time startTime, Time endTime)throws EntityNotFoundException;

    /**
	 * Find and return the Shift for given name  if exists.
	 *
	 * @param name value of name; value cannot be null.
	 * @return Shift associated with the given inputs.
     * @throws EntityNotFoundException if no matching Shift found.
	 */
    Shift getByName(String name)throws EntityNotFoundException;

	/**
	 * Updates the details of an existing Shift. It replaces all fields of the existing Shift with the given shift.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on Shift if any.
     *
	 * @param shift The details of the Shift to be updated; value cannot be null.
	 * @return The updated Shift.
	 * @throws EntityNotFoundException if no Shift is found with given input.
	 */
	Shift update(@Valid Shift shift) throws EntityNotFoundException;

    /**
	 * Deletes an existing Shift with the given id.
	 *
	 * @param shiftIdInstance The id of the Shift to be deleted; value cannot be null.
	 * @return The deleted Shift.
	 * @throws EntityNotFoundException if no Shift found with the given id.
	 */
	Shift delete(Byte shiftIdInstance) throws EntityNotFoundException;

	/**
	 * Find all Shifts matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Shifts.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<Shift> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all Shifts matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Shifts.
     *
     * @see Pageable
     * @see Page
	 */
    Page<Shift> findAll(String query, Pageable pageable);

    /**
	 * Exports all Shifts matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Shifts in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the Shift.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);

    /*
     * Returns the associated employeeDepartmentHistories for given Shift id.
     *
     * @param shiftId value of shiftId; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated EmployeeDepartmentHistory instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<EmployeeDepartmentHistory> findAssociatedEmployeeDepartmentHistories(Byte shiftId, Pageable pageable);

}

