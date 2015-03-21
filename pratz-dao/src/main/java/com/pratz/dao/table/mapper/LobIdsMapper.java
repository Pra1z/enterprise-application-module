package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.LobIds;
import com.pratz.dao.table.model.LobIdsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LobIdsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(LobIdsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(LobIdsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByPrimaryKey(Long lobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(LobIds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(LobIds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<LobIds> selectByExample(LobIdsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    LobIds selectByPrimaryKey(Long lobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") LobIds record, @Param("example") LobIdsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") LobIds record, @Param("example") LobIdsCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByPrimaryKeySelective(LobIds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByPrimaryKey(LobIds record);
}