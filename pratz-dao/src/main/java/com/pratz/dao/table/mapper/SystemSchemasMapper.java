package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.SystemSchemas;
import com.pratz.dao.table.model.SystemSchemasCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemSchemasMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_SCHEMAS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(SystemSchemasCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_SCHEMAS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(SystemSchemasCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_SCHEMAS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(SystemSchemas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_SCHEMAS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(SystemSchemas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_SCHEMAS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<SystemSchemas> selectByExample(SystemSchemasCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_SCHEMAS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") SystemSchemas record, @Param("example") SystemSchemasCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_SCHEMAS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") SystemSchemas record, @Param("example") SystemSchemasCriteria example);
}