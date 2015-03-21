package com.pratz.dao.table.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TTrQuotationrevnoCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public TTrQuotationrevnoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPrefixIsNull() {
            addCriterion("PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNotNull() {
            addCriterion("PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andPrefixEqualTo(String value) {
            addCriterion("PREFIX =", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotEqualTo(String value) {
            addCriterion("PREFIX <>", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThan(String value) {
            addCriterion("PREFIX >", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("PREFIX >=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThan(String value) {
            addCriterion("PREFIX <", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThanOrEqualTo(String value) {
            addCriterion("PREFIX <=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLike(String value) {
            addCriterion("PREFIX like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotLike(String value) {
            addCriterion("PREFIX not like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixIn(List<String> values) {
            addCriterion("PREFIX in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotIn(List<String> values) {
            addCriterion("PREFIX not in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixBetween(String value1, String value2) {
            addCriterion("PREFIX between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotBetween(String value1, String value2) {
            addCriterion("PREFIX not between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andQuotationnoIsNull() {
            addCriterion("QUOTATIONNO is null");
            return (Criteria) this;
        }

        public Criteria andQuotationnoIsNotNull() {
            addCriterion("QUOTATIONNO is not null");
            return (Criteria) this;
        }

        public Criteria andQuotationnoEqualTo(String value) {
            addCriterion("QUOTATIONNO =", value, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoNotEqualTo(String value) {
            addCriterion("QUOTATIONNO <>", value, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoGreaterThan(String value) {
            addCriterion("QUOTATIONNO >", value, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoGreaterThanOrEqualTo(String value) {
            addCriterion("QUOTATIONNO >=", value, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoLessThan(String value) {
            addCriterion("QUOTATIONNO <", value, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoLessThanOrEqualTo(String value) {
            addCriterion("QUOTATIONNO <=", value, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoLike(String value) {
            addCriterion("QUOTATIONNO like", value, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoNotLike(String value) {
            addCriterion("QUOTATIONNO not like", value, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoIn(List<String> values) {
            addCriterion("QUOTATIONNO in", values, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoNotIn(List<String> values) {
            addCriterion("QUOTATIONNO not in", values, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoBetween(String value1, String value2) {
            addCriterion("QUOTATIONNO between", value1, value2, "quotationno");
            return (Criteria) this;
        }

        public Criteria andQuotationnoNotBetween(String value1, String value2) {
            addCriterion("QUOTATIONNO not between", value1, value2, "quotationno");
            return (Criteria) this;
        }

        public Criteria andMaxrunningIsNull() {
            addCriterion("MAXRUNNING is null");
            return (Criteria) this;
        }

        public Criteria andMaxrunningIsNotNull() {
            addCriterion("MAXRUNNING is not null");
            return (Criteria) this;
        }

        public Criteria andMaxrunningEqualTo(Integer value) {
            addCriterion("MAXRUNNING =", value, "maxrunning");
            return (Criteria) this;
        }

        public Criteria andMaxrunningNotEqualTo(Integer value) {
            addCriterion("MAXRUNNING <>", value, "maxrunning");
            return (Criteria) this;
        }

        public Criteria andMaxrunningGreaterThan(Integer value) {
            addCriterion("MAXRUNNING >", value, "maxrunning");
            return (Criteria) this;
        }

        public Criteria andMaxrunningGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAXRUNNING >=", value, "maxrunning");
            return (Criteria) this;
        }

        public Criteria andMaxrunningLessThan(Integer value) {
            addCriterion("MAXRUNNING <", value, "maxrunning");
            return (Criteria) this;
        }

        public Criteria andMaxrunningLessThanOrEqualTo(Integer value) {
            addCriterion("MAXRUNNING <=", value, "maxrunning");
            return (Criteria) this;
        }

        public Criteria andMaxrunningIn(List<Integer> values) {
            addCriterion("MAXRUNNING in", values, "maxrunning");
            return (Criteria) this;
        }

        public Criteria andMaxrunningNotIn(List<Integer> values) {
            addCriterion("MAXRUNNING not in", values, "maxrunning");
            return (Criteria) this;
        }

        public Criteria andMaxrunningBetween(Integer value1, Integer value2) {
            addCriterion("MAXRUNNING between", value1, value2, "maxrunning");
            return (Criteria) this;
        }

        public Criteria andMaxrunningNotBetween(Integer value1, Integer value2) {
            addCriterion("MAXRUNNING not between", value1, value2, "maxrunning");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoIsNull() {
            addCriterion("INCREMENTALNO is null");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoIsNotNull() {
            addCriterion("INCREMENTALNO is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoEqualTo(Integer value) {
            addCriterion("INCREMENTALNO =", value, "incrementalno");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoNotEqualTo(Integer value) {
            addCriterion("INCREMENTALNO <>", value, "incrementalno");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoGreaterThan(Integer value) {
            addCriterion("INCREMENTALNO >", value, "incrementalno");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("INCREMENTALNO >=", value, "incrementalno");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoLessThan(Integer value) {
            addCriterion("INCREMENTALNO <", value, "incrementalno");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoLessThanOrEqualTo(Integer value) {
            addCriterion("INCREMENTALNO <=", value, "incrementalno");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoIn(List<Integer> values) {
            addCriterion("INCREMENTALNO in", values, "incrementalno");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoNotIn(List<Integer> values) {
            addCriterion("INCREMENTALNO not in", values, "incrementalno");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoBetween(Integer value1, Integer value2) {
            addCriterion("INCREMENTALNO between", value1, value2, "incrementalno");
            return (Criteria) this;
        }

        public Criteria andIncrementalnoNotBetween(Integer value1, Integer value2) {
            addCriterion("INCREMENTALNO not between", value1, value2, "incrementalno");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNull() {
            addCriterion("CREATEDDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNotNull() {
            addCriterion("CREATEDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDDATE =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDDATE <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATEDDATE >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDDATE >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(Date value) {
            addCriterionForJDBCDate("CREATEDDATE <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDDATE <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDDATE in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDDATE not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDDATE between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDDATE not between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("CREATEDBY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("CREATEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(String value) {
            addCriterion("CREATEDBY =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(String value) {
            addCriterion("CREATEDBY <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(String value) {
            addCriterion("CREATEDBY >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDBY >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(String value) {
            addCriterion("CREATEDBY <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(String value) {
            addCriterion("CREATEDBY <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLike(String value) {
            addCriterion("CREATEDBY like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotLike(String value) {
            addCriterion("CREATEDBY not like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<String> values) {
            addCriterion("CREATEDBY in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<String> values) {
            addCriterion("CREATEDBY not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(String value1, String value2) {
            addCriterion("CREATEDBY between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(String value1, String value2) {
            addCriterion("CREATEDBY not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andUpdateddateIsNull() {
            addCriterion("UPDATEDDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateddateIsNotNull() {
            addCriterion("UPDATEDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateddateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDDATE =", value, "updateddate");
            return (Criteria) this;
        }

        public Criteria andUpdateddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDDATE <>", value, "updateddate");
            return (Criteria) this;
        }

        public Criteria andUpdateddateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATEDDATE >", value, "updateddate");
            return (Criteria) this;
        }

        public Criteria andUpdateddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDDATE >=", value, "updateddate");
            return (Criteria) this;
        }

        public Criteria andUpdateddateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATEDDATE <", value, "updateddate");
            return (Criteria) this;
        }

        public Criteria andUpdateddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDDATE <=", value, "updateddate");
            return (Criteria) this;
        }

        public Criteria andUpdateddateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATEDDATE in", values, "updateddate");
            return (Criteria) this;
        }

        public Criteria andUpdateddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATEDDATE not in", values, "updateddate");
            return (Criteria) this;
        }

        public Criteria andUpdateddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATEDDATE between", value1, value2, "updateddate");
            return (Criteria) this;
        }

        public Criteria andUpdateddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATEDDATE not between", value1, value2, "updateddate");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIsNull() {
            addCriterion("UPDATEDBY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIsNotNull() {
            addCriterion("UPDATEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyEqualTo(String value) {
            addCriterion("UPDATEDBY =", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotEqualTo(String value) {
            addCriterion("UPDATEDBY <>", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyGreaterThan(String value) {
            addCriterion("UPDATEDBY >", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEDBY >=", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyLessThan(String value) {
            addCriterion("UPDATEDBY <", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyLessThanOrEqualTo(String value) {
            addCriterion("UPDATEDBY <=", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyLike(String value) {
            addCriterion("UPDATEDBY like", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotLike(String value) {
            addCriterion("UPDATEDBY not like", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIn(List<String> values) {
            addCriterion("UPDATEDBY in", values, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotIn(List<String> values) {
            addCriterion("UPDATEDBY not in", values, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyBetween(String value1, String value2) {
            addCriterion("UPDATEDBY between", value1, value2, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotBetween(String value1, String value2) {
            addCriterion("UPDATEDBY not between", value1, value2, "updatedby");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated do_not_delete_during_merge Sat Mar 21 14:24:50 ICT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TTFL.T_TR_QUOTATIONREVNO
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}