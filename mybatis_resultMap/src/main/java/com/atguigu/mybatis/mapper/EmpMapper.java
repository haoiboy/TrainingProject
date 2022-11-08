package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    /**
     * 根据id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId")Integer empId);

    /**
     * 获取员工以及所对应的部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId")Integer empId);

    /**
     *通过分步查询员工以及所对应的部门信息的第一步
     * @param empId
     * @return
     */
    Emp   getEmpAndDeptByStepOne(@Param("empId")Integer empId);

}
