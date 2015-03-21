package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.RoutineRoutineUsage;
import com.pratz.dao.table.model.RoutineRoutineUsageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutineRoutineUsageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(RoutineRoutineUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(RoutineRoutineUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(RoutineRoutineUsage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(RoutineRoutineUsage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<RoutineRoutineUsage> selectByExample(RoutineRoutineUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") RoutineRoutineUsage record, @Param("example") RoutineRoutineUsageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") RoutineRoutineUsage record, @Param("example") RoutineRoutineUsageCriteria example);
}