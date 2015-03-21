package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.RoleColumnGrants;
import com.pratz.dao.table.model.RoleColumnGrantsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleColumnGrantsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_COLUMN_GRANTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(RoleColumnGrantsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_COLUMN_GRANTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(RoleColumnGrantsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_COLUMN_GRANTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(RoleColumnGrants record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_COLUMN_GRANTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(RoleColumnGrants record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_COLUMN_GRANTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<RoleColumnGrants> selectByExample(RoleColumnGrantsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_COLUMN_GRANTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") RoleColumnGrants record, @Param("example") RoleColumnGrantsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_COLUMN_GRANTS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") RoleColumnGrants record, @Param("example") RoleColumnGrantsCriteria example);
}