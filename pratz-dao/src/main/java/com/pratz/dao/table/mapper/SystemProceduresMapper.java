package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.SystemProcedures;
import com.pratz.dao.table.model.SystemProceduresCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemProceduresMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROCEDURES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(SystemProceduresCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROCEDURES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(SystemProceduresCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROCEDURES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(SystemProcedures record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROCEDURES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(SystemProcedures record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROCEDURES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<SystemProcedures> selectByExample(SystemProceduresCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROCEDURES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") SystemProcedures record, @Param("example") SystemProceduresCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROCEDURES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") SystemProcedures record, @Param("example") SystemProceduresCriteria example);
}