package com.pratz.dao.table.mapper;

import com.pratz.dao.table.model.TTrQuotationrevno;
import com.pratz.dao.table.model.TTrQuotationrevnoCriteria;
import com.pratz.dao.table.model.TTrQuotationrevnoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTrQuotationrevnoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int countByExample(TTrQuotationrevnoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByExample(TTrQuotationrevnoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int deleteByPrimaryKey(TTrQuotationrevnoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insert(TTrQuotationrevno record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int insertSelective(TTrQuotationrevno record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    List<TTrQuotationrevno> selectByExample(TTrQuotationrevnoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    TTrQuotationrevno selectByPrimaryKey(TTrQuotationrevnoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExampleSelective(@Param("record") TTrQuotationrevno record, @Param("example") TTrQuotationrevnoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByExample(@Param("record") TTrQuotationrevno record, @Param("example") TTrQuotationrevnoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByPrimaryKeySelective(TTrQuotationrevno record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    int updateByPrimaryKey(TTrQuotationrevno record);
}