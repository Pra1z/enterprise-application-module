package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.RoleAuthorizationDescriptors;
import com.pratz.dao.table.model.RoleAuthorizationDescriptorsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthorizationDescriptorsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(RoleAuthorizationDescriptorsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(RoleAuthorizationDescriptorsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(RoleAuthorizationDescriptors record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(RoleAuthorizationDescriptors record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<RoleAuthorizationDescriptors> selectByExample(RoleAuthorizationDescriptorsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") RoleAuthorizationDescriptors record, @Param("example") RoleAuthorizationDescriptorsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") RoleAuthorizationDescriptors record, @Param("example") RoleAuthorizationDescriptorsCriteria example);
}