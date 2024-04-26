package com.nguyentronghao.employee_service.service;

import com.nguyentronghao.employee_service.model.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DEPARTMENT-SERVICE")
public interface DepartmentApiClient {
    @GetMapping("/api/department/{departmentCode}")
    DepartmentDto getDepartment(@PathVariable String departmentCode);
}