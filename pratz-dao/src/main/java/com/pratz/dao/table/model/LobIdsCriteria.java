package com.pratz.dao.table.model;

import java.util.ArrayList;
import java.util.List;

public class LobIdsCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public LobIdsCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
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
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
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
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_LOBS.LOB_IDS
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
     * This class corresponds to the database table SYSTEM_LOBS.LOB_IDS
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

        public Criteria andLobIdIsNull() {
            addCriterion("LOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andLobIdIsNotNull() {
            addCriterion("LOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLobIdEqualTo(Long value) {
            addCriterion("LOB_ID =", value, "lobId");
            return (Criteria) this;
        }

        public Criteria andLobIdNotEqualTo(Long value) {
            addCriterion("LOB_ID <>", value, "lobId");
            return (Criteria) this;
        }

        public Criteria andLobIdGreaterThan(Long value) {
            addCriterion("LOB_ID >", value, "lobId");
            return (Criteria) this;
        }

        public Criteria andLobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOB_ID >=", value, "lobId");
            return (Criteria) this;
        }

        public Criteria andLobIdLessThan(Long value) {
            addCriterion("LOB_ID <", value, "lobId");
            return (Criteria) this;
        }

        public Criteria andLobIdLessThanOrEqualTo(Long value) {
            addCriterion("LOB_ID <=", value, "lobId");
            return (Criteria) this;
        }

        public Criteria andLobIdIn(List<Long> values) {
            addCriterion("LOB_ID in", values, "lobId");
            return (Criteria) this;
        }

        public Criteria andLobIdNotIn(List<Long> values) {
            addCriterion("LOB_ID not in", values, "lobId");
            return (Criteria) this;
        }

        public Criteria andLobIdBetween(Long value1, Long value2) {
            addCriterion("LOB_ID between", value1, value2, "lobId");
            return (Criteria) this;
        }

        public Criteria andLobIdNotBetween(Long value1, Long value2) {
            addCriterion("LOB_ID not between", value1, value2, "lobId");
            return (Criteria) this;
        }

        public Criteria andLobLengthIsNull() {
            addCriterion("LOB_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andLobLengthIsNotNull() {
            addCriterion("LOB_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andLobLengthEqualTo(Long value) {
            addCriterion("LOB_LENGTH =", value, "lobLength");
            return (Criteria) this;
        }

        public Criteria andLobLengthNotEqualTo(Long value) {
            addCriterion("LOB_LENGTH <>", value, "lobLength");
            return (Criteria) this;
        }

        public Criteria andLobLengthGreaterThan(Long value) {
            addCriterion("LOB_LENGTH >", value, "lobLength");
            return (Criteria) this;
        }

        public Criteria andLobLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("LOB_LENGTH >=", value, "lobLength");
            return (Criteria) this;
        }

        public Criteria andLobLengthLessThan(Long value) {
            addCriterion("LOB_LENGTH <", value, "lobLength");
            return (Criteria) this;
        }

        public Criteria andLobLengthLessThanOrEqualTo(Long value) {
            addCriterion("LOB_LENGTH <=", value, "lobLength");
            return (Criteria) this;
        }

        public Criteria andLobLengthIn(List<Long> values) {
            addCriterion("LOB_LENGTH in", values, "lobLength");
            return (Criteria) this;
        }

        public Criteria andLobLengthNotIn(List<Long> values) {
            addCriterion("LOB_LENGTH not in", values, "lobLength");
            return (Criteria) this;
        }

        public Criteria andLobLengthBetween(Long value1, Long value2) {
            addCriterion("LOB_LENGTH between", value1, value2, "lobLength");
            return (Criteria) this;
        }

        public Criteria andLobLengthNotBetween(Long value1, Long value2) {
            addCriterion("LOB_LENGTH not between", value1, value2, "lobLength");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountIsNull() {
            addCriterion("LOB_USAGE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountIsNotNull() {
            addCriterion("LOB_USAGE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountEqualTo(Integer value) {
            addCriterion("LOB_USAGE_COUNT =", value, "lobUsageCount");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountNotEqualTo(Integer value) {
            addCriterion("LOB_USAGE_COUNT <>", value, "lobUsageCount");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountGreaterThan(Integer value) {
            addCriterion("LOB_USAGE_COUNT >", value, "lobUsageCount");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOB_USAGE_COUNT >=", value, "lobUsageCount");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountLessThan(Integer value) {
            addCriterion("LOB_USAGE_COUNT <", value, "lobUsageCount");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountLessThanOrEqualTo(Integer value) {
            addCriterion("LOB_USAGE_COUNT <=", value, "lobUsageCount");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountIn(List<Integer> values) {
            addCriterion("LOB_USAGE_COUNT in", values, "lobUsageCount");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountNotIn(List<Integer> values) {
            addCriterion("LOB_USAGE_COUNT not in", values, "lobUsageCount");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountBetween(Integer value1, Integer value2) {
            addCriterion("LOB_USAGE_COUNT between", value1, value2, "lobUsageCount");
            return (Criteria) this;
        }

        public Criteria andLobUsageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LOB_USAGE_COUNT not between", value1, value2, "lobUsageCount");
            return (Criteria) this;
        }

        public Criteria andLobTypeIsNull() {
            addCriterion("LOB_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLobTypeIsNotNull() {
            addCriterion("LOB_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLobTypeEqualTo(Short value) {
            addCriterion("LOB_TYPE =", value, "lobType");
            return (Criteria) this;
        }

        public Criteria andLobTypeNotEqualTo(Short value) {
            addCriterion("LOB_TYPE <>", value, "lobType");
            return (Criteria) this;
        }

        public Criteria andLobTypeGreaterThan(Short value) {
            addCriterion("LOB_TYPE >", value, "lobType");
            return (Criteria) this;
        }

        public Criteria andLobTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("LOB_TYPE >=", value, "lobType");
            return (Criteria) this;
        }

        public Criteria andLobTypeLessThan(Short value) {
            addCriterion("LOB_TYPE <", value, "lobType");
            return (Criteria) this;
        }

        public Criteria andLobTypeLessThanOrEqualTo(Short value) {
            addCriterion("LOB_TYPE <=", value, "lobType");
            return (Criteria) this;
        }

        public Criteria andLobTypeIn(List<Short> values) {
            addCriterion("LOB_TYPE in", values, "lobType");
            return (Criteria) this;
        }

        public Criteria andLobTypeNotIn(List<Short> values) {
            addCriterion("LOB_TYPE not in", values, "lobType");
            return (Criteria) this;
        }

        public Criteria andLobTypeBetween(Short value1, Short value2) {
            addCriterion("LOB_TYPE between", value1, value2, "lobType");
            return (Criteria) this;
        }

        public Criteria andLobTypeNotBetween(Short value1, Short value2) {
            addCriterion("LOB_TYPE not between", value1, value2, "lobType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SYSTEM_LOBS.LOB_IDS
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
     * This class corresponds to the database table SYSTEM_LOBS.LOB_IDS
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