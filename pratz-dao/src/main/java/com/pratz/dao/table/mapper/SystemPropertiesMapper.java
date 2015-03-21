package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.SystemProperties;
import com.pratz.dao.table.model.SystemPropertiesCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemPropertiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROPERTIES
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int countByExample(SystemPropertiesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROPERTIES
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int deleteByExample(SystemPropertiesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROPERTIES
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int insert(SystemProperties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROPERTIES
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int insertSelective(SystemProperties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROPERTIES
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    List<SystemProperties> selectByExample(SystemPropertiesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROPERTIES
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int updateByExampleSelective(@Param("record") SystemProperties record, @Param("example") SystemPropertiesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_PROPERTIES
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int updateByExample(@Param("record") SystemProperties record, @Param("example") SystemPropertiesCriteria example);
}