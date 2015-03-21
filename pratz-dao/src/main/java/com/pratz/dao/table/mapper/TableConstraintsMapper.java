package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.TableConstraints;
import com.pratz.dao.table.model.TableConstraintsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableConstraintsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TABLE_CONSTRAINTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(TableConstraintsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TABLE_CONSTRAINTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(TableConstraintsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TABLE_CONSTRAINTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(TableConstraints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TABLE_CONSTRAINTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(TableConstraints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TABLE_CONSTRAINTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<TableConstraints> selectByExample(TableConstraintsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TABLE_CONSTRAINTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") TableConstraints record, @Param("example") TableConstraintsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TABLE_CONSTRAINTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") TableConstraints record, @Param("example") TableConstraintsCriteria example);
}