package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.TriggerTableUsage;
import com.pratz.dao.table.model.TriggerTableUsageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggerTableUsageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_TABLE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(TriggerTableUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_TABLE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(TriggerTableUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_TABLE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(TriggerTableUsage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_TABLE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(TriggerTableUsage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_TABLE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<TriggerTableUsage> selectByExample(TriggerTableUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_TABLE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") TriggerTableUsage record, @Param("example") TriggerTableUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_TABLE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") TriggerTableUsage record, @Param("example") TriggerTableUsageCriteria example);
}