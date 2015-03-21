package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.Views;
import com.pratz.dao.table.model.ViewsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.VIEWS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(ViewsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.VIEWS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(ViewsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.VIEWS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(Views record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.VIEWS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(Views record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.VIEWS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<Views> selectByExample(ViewsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.VIEWS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") Views record, @Param("example") ViewsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.VIEWS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") Views record, @Param("example") ViewsCriteria example);
}