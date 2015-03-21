package com.pratz.dao.table.model;

import java.util.ArrayList;
import java.util.List;

public class RoutineRoutineUsageCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public RoutineRoutineUsageCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
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
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
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
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
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
     * This class corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
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

        public Criteria andSpecificCatalogIsNull() {
            addCriterion("SPECIFIC_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogIsNotNull() {
            addCriterion("SPECIFIC_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogEqualTo(String value) {
            addCriterion("SPECIFIC_CATALOG =", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogNotEqualTo(String value) {
            addCriterion("SPECIFIC_CATALOG <>", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogGreaterThan(String value) {
            addCriterion("SPECIFIC_CATALOG >", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFIC_CATALOG >=", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogLessThan(String value) {
            addCriterion("SPECIFIC_CATALOG <", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogLessThanOrEqualTo(String value) {
            addCriterion("SPECIFIC_CATALOG <=", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogLike(String value) {
            addCriterion("SPECIFIC_CATALOG like", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogNotLike(String value) {
            addCriterion("SPECIFIC_CATALOG not like", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogIn(List<String> values) {
            addCriterion("SPECIFIC_CATALOG in", values, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogNotIn(List<String> values) {
            addCriterion("SPECIFIC_CATALOG not in", values, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogBetween(String value1, String value2) {
            addCriterion("SPECIFIC_CATALOG between", value1, value2, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogNotBetween(String value1, String value2) {
            addCriterion("SPECIFIC_CATALOG not between", value1, value2, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaIsNull() {
            addCriterion("SPECIFIC_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaIsNotNull() {
            addCriterion("SPECIFIC_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaEqualTo(String value) {
            addCriterion("SPECIFIC_SCHEMA =", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaNotEqualTo(String value) {
            addCriterion("SPECIFIC_SCHEMA <>", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaGreaterThan(String value) {
            addCriterion("SPECIFIC_SCHEMA >", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFIC_SCHEMA >=", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaLessThan(String value) {
            addCriterion("SPECIFIC_SCHEMA <", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaLessThanOrEqualTo(String value) {
            addCriterion("SPECIFIC_SCHEMA <=", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaLike(String value) {
            addCriterion("SPECIFIC_SCHEMA like", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaNotLike(String value) {
            addCriterion("SPECIFIC_SCHEMA not like", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaIn(List<String> values) {
            addCriterion("SPECIFIC_SCHEMA in", values, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaNotIn(List<String> values) {
            addCriterion("SPECIFIC_SCHEMA not in", values, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaBetween(String value1, String value2) {
            addCriterion("SPECIFIC_SCHEMA between", value1, value2, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaNotBetween(String value1, String value2) {
            addCriterion("SPECIFIC_SCHEMA not between", value1, value2, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificNameIsNull() {
            addCriterion("SPECIFIC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSpecificNameIsNotNull() {
            addCriterion("SPECIFIC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificNameEqualTo(String value) {
            addCriterion("SPECIFIC_NAME =", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotEqualTo(String value) {
            addCriterion("SPECIFIC_NAME <>", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameGreaterThan(String value) {
            addCriterion("SPECIFIC_NAME >", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFIC_NAME >=", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameLessThan(String value) {
            addCriterion("SPECIFIC_NAME <", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameLessThanOrEqualTo(String value) {
            addCriterion("SPECIFIC_NAME <=", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameLike(String value) {
            addCriterion("SPECIFIC_NAME like", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotLike(String value) {
            addCriterion("SPECIFIC_NAME not like", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameIn(List<String> values) {
            addCriterion("SPECIFIC_NAME in", values, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotIn(List<String> values) {
            addCriterion("SPECIFIC_NAME not in", values, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameBetween(String value1, String value2) {
            addCriterion("SPECIFIC_NAME between", value1, value2, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotBetween(String value1, String value2) {
            addCriterion("SPECIFIC_NAME not between", value1, value2, "specificName");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogIsNull() {
            addCriterion("ROUTINE_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogIsNotNull() {
            addCriterion("ROUTINE_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogEqualTo(String value) {
            addCriterion("ROUTINE_CATALOG =", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogNotEqualTo(String value) {
            addCriterion("ROUTINE_CATALOG <>", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogGreaterThan(String value) {
            addCriterion("ROUTINE_CATALOG >", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTINE_CATALOG >=", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogLessThan(String value) {
            addCriterion("ROUTINE_CATALOG <", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogLessThanOrEqualTo(String value) {
            addCriterion("ROUTINE_CATALOG <=", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogLike(String value) {
            addCriterion("ROUTINE_CATALOG like", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogNotLike(String value) {
            addCriterion("ROUTINE_CATALOG not like", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogIn(List<String> values) {
            addCriterion("ROUTINE_CATALOG in", values, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogNotIn(List<String> values) {
            addCriterion("ROUTINE_CATALOG not in", values, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogBetween(String value1, String value2) {
            addCriterion("ROUTINE_CATALOG between", value1, value2, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogNotBetween(String value1, String value2) {
            addCriterion("ROUTINE_CATALOG not between", value1, value2, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaIsNull() {
            addCriterion("ROUTINE_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaIsNotNull() {
            addCriterion("ROUTINE_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaEqualTo(String value) {
            addCriterion("ROUTINE_SCHEMA =", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaNotEqualTo(String value) {
            addCriterion("ROUTINE_SCHEMA <>", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaGreaterThan(String value) {
            addCriterion("ROUTINE_SCHEMA >", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTINE_SCHEMA >=", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaLessThan(String value) {
            addCriterion("ROUTINE_SCHEMA <", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaLessThanOrEqualTo(String value) {
            addCriterion("ROUTINE_SCHEMA <=", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaLike(String value) {
            addCriterion("ROUTINE_SCHEMA like", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaNotLike(String value) {
            addCriterion("ROUTINE_SCHEMA not like", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaIn(List<String> values) {
            addCriterion("ROUTINE_SCHEMA in", values, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaNotIn(List<String> values) {
            addCriterion("ROUTINE_SCHEMA not in", values, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaBetween(String value1, String value2) {
            addCriterion("ROUTINE_SCHEMA between", value1, value2, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaNotBetween(String value1, String value2) {
            addCriterion("ROUTINE_SCHEMA not between", value1, value2, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineNameIsNull() {
            addCriterion("ROUTINE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoutineNameIsNotNull() {
            addCriterion("ROUTINE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoutineNameEqualTo(String value) {
            addCriterion("ROUTINE_NAME =", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotEqualTo(String value) {
            addCriterion("ROUTINE_NAME <>", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameGreaterThan(String value) {
            addCriterion("ROUTINE_NAME >", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTINE_NAME >=", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameLessThan(String value) {
            addCriterion("ROUTINE_NAME <", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameLessThanOrEqualTo(String value) {
            addCriterion("ROUTINE_NAME <=", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameLike(String value) {
            addCriterion("ROUTINE_NAME like", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotLike(String value) {
            addCriterion("ROUTINE_NAME not like", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameIn(List<String> values) {
            addCriterion("ROUTINE_NAME in", values, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotIn(List<String> values) {
            addCriterion("ROUTINE_NAME not in", values, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameBetween(String value1, String value2) {
            addCriterion("ROUTINE_NAME between", value1, value2, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotBetween(String value1, String value2) {
            addCriterion("ROUTINE_NAME not between", value1, value2, "routineName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
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
     * This class corresponds to the database table INFORMATION_SCHEMA.ROUTINE_ROUTINE_USAGE
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