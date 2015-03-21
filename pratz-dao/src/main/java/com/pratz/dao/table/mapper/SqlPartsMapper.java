package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.SqlParts;
import com.pratz.dao.table.model.SqlPartsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqlPartsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SQL_PARTS
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int countByExample(SqlPartsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SQL_PARTS
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int deleteByExample(SqlPartsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SQL_PARTS
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int insert(SqlParts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SQL_PARTS
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int insertSelective(SqlParts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SQL_PARTS
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    List<SqlParts> selectByExample(SqlPartsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SQL_PARTS
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int updateByExampleSelective(@Param("record") SqlParts record, @Param("example") SqlPartsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SQL_PARTS
     *
     * @mbggenerated Sat Mar 21 14:24:49 ICT 2015
     */
    int updateByExample(@Param("record") SqlParts record, @Param("example") SqlPartsCriteria example);
}