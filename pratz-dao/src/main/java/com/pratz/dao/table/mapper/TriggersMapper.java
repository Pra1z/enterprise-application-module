package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.Triggers;
import com.pratz.dao.table.model.TriggersCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(TriggersCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(TriggersCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(Triggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(Triggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<Triggers> selectByExample(TriggersCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") Triggers record, @Param("example") TriggersCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") Triggers record, @Param("example") TriggersCriteria example);
}