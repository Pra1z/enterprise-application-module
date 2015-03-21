package com.pratz.dao.table.model;

import java.util.ArrayList;
import java.util.List;

public class CheckConstraintRoutineUsageCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public CheckConstraintRoutineUsageCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
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
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
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
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
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
     * This class corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
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

        public Criteria andConstraintCatalogIsNull() {
            addCriterion("CONSTRAINT_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogIsNotNull() {
            addCriterion("CONSTRAINT_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogEqualTo(String value) {
            addCriterion("CONSTRAINT_CATALOG =", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogNotEqualTo(String value) {
            addCriterion("CONSTRAINT_CATALOG <>", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogGreaterThan(String value) {
            addCriterion("CONSTRAINT_CATALOG >", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("CONSTRAINT_CATALOG >=", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogLessThan(String value) {
            addCriterion("CONSTRAINT_CATALOG <", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogLessThanOrEqualTo(String value) {
            addCriterion("CONSTRAINT_CATALOG <=", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogLike(String value) {
            addCriterion("CONSTRAINT_CATALOG like", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogNotLike(String value) {
            addCriterion("CONSTRAINT_CATALOG not like", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogIn(List<String> values) {
            addCriterion("CONSTRAINT_CATALOG in", values, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogNotIn(List<String> values) {
            addCriterion("CONSTRAINT_CATALOG not in", values, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogBetween(String value1, String value2) {
            addCriterion("CONSTRAINT_CATALOG between", value1, value2, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogNotBetween(String value1, String value2) {
            addCriterion("CONSTRAINT_CATALOG not between", value1, value2, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaIsNull() {
            addCriterion("CONSTRAINT_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaIsNotNull() {
            addCriterion("CONSTRAINT_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaEqualTo(String value) {
            addCriterion("CONSTRAINT_SCHEMA =", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaNotEqualTo(String value) {
            addCriterion("CONSTRAINT_SCHEMA <>", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaGreaterThan(String value) {
            addCriterion("CONSTRAINT_SCHEMA >", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("CONSTRAINT_SCHEMA >=", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaLessThan(String value) {
            addCriterion("CONSTRAINT_SCHEMA <", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaLessThanOrEqualTo(String value) {
            addCriterion("CONSTRAINT_SCHEMA <=", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaLike(String value) {
            addCriterion("CONSTRAINT_SCHEMA like", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaNotLike(String value) {
            addCriterion("CONSTRAINT_SCHEMA not like", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaIn(List<String> values) {
            addCriterion("CONSTRAINT_SCHEMA in", values, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaNotIn(List<String> values) {
            addCriterion("CONSTRAINT_SCHEMA not in", values, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaBetween(String value1, String value2) {
            addCriterion("CONSTRAINT_SCHEMA between", value1, value2, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaNotBetween(String value1, String value2) {
            addCriterion("CONSTRAINT_SCHEMA not between", value1, value2, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintNameIsNull() {
            addCriterion("CONSTRAINT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConstraintNameIsNotNull() {
            addCriterion("CONSTRAINT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintNameEqualTo(String value) {
            addCriterion("CONSTRAINT_NAME =", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotEqualTo(String value) {
            addCriterion("CONSTRAINT_NAME <>", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameGreaterThan(String value) {
            addCriterion("CONSTRAINT_NAME >", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONSTRAINT_NAME >=", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameLessThan(String value) {
            addCriterion("CONSTRAINT_NAME <", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameLessThanOrEqualTo(String value) {
            addCriterion("CONSTRAINT_NAME <=", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameLike(String value) {
            addCriterion("CONSTRAINT_NAME like", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotLike(String value) {
            addCriterion("CONSTRAINT_NAME not like", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameIn(List<String> values) {
            addCriterion("CONSTRAINT_NAME in", values, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotIn(List<String> values) {
            addCriterion("CONSTRAINT_NAME not in", values, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameBetween(String value1, String value2) {
            addCriterion("CONSTRAINT_NAME between", value1, value2, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotBetween(String value1, String value2) {
            addCriterion("CONSTRAINT_NAME not between", value1, value2, "constraintName");
            return (Criteria) this;
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
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
     * This class corresponds to the database table INFORMATION_SCHEMA.CHECK_CONSTRAINT_ROUTINE_USAGE
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