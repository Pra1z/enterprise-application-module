package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.Routines;
import com.pratz.dao.table.model.RoutinesCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutinesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(RoutinesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(RoutinesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(Routines record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(Routines record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<Routines> selectByExample(RoutinesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") Routines record, @Param("example") RoutinesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINES
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") Routines record, @Param("example") RoutinesCriteria example);
}