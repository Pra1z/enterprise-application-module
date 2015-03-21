package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.TriggerRoutineUsage;
import com.pratz.dao.table.model.TriggerRoutineUsageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggerRoutineUsageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(TriggerRoutineUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(TriggerRoutineUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(TriggerRoutineUsage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(TriggerRoutineUsage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<TriggerRoutineUsage> selectByExample(TriggerRoutineUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") TriggerRoutineUsage record, @Param("example") TriggerRoutineUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") TriggerRoutineUsage record, @Param("example") TriggerRoutineUsageCriteria example);
}