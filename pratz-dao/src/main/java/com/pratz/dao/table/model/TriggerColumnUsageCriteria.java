package com.pratz.dao.table.model;

import java.util.ArrayList;
import java.util.List;

public class TriggerColumnUsageCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public TriggerColumnUsageCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
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
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
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
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
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
     * This class corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
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

        public Criteria andTriggerCatalogIsNull() {
            addCriterion("TRIGGER_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogIsNotNull() {
            addCriterion("TRIGGER_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogEqualTo(String value) {
            addCriterion("TRIGGER_CATALOG =", value, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogNotEqualTo(String value) {
            addCriterion("TRIGGER_CATALOG <>", value, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogGreaterThan(String value) {
            addCriterion("TRIGGER_CATALOG >", value, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_CATALOG >=", value, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogLessThan(String value) {
            addCriterion("TRIGGER_CATALOG <", value, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_CATALOG <=", value, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogLike(String value) {
            addCriterion("TRIGGER_CATALOG like", value, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogNotLike(String value) {
            addCriterion("TRIGGER_CATALOG not like", value, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogIn(List<String> values) {
            addCriterion("TRIGGER_CATALOG in", values, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogNotIn(List<String> values) {
            addCriterion("TRIGGER_CATALOG not in", values, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogBetween(String value1, String value2) {
            addCriterion("TRIGGER_CATALOG between", value1, value2, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerCatalogNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_CATALOG not between", value1, value2, "triggerCatalog");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaIsNull() {
            addCriterion("TRIGGER_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaIsNotNull() {
            addCriterion("TRIGGER_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaEqualTo(String value) {
            addCriterion("TRIGGER_SCHEMA =", value, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaNotEqualTo(String value) {
            addCriterion("TRIGGER_SCHEMA <>", value, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaGreaterThan(String value) {
            addCriterion("TRIGGER_SCHEMA >", value, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_SCHEMA >=", value, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaLessThan(String value) {
            addCriterion("TRIGGER_SCHEMA <", value, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_SCHEMA <=", value, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaLike(String value) {
            addCriterion("TRIGGER_SCHEMA like", value, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaNotLike(String value) {
            addCriterion("TRIGGER_SCHEMA not like", value, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaIn(List<String> values) {
            addCriterion("TRIGGER_SCHEMA in", values, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaNotIn(List<String> values) {
            addCriterion("TRIGGER_SCHEMA not in", values, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaBetween(String value1, String value2) {
            addCriterion("TRIGGER_SCHEMA between", value1, value2, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerSchemaNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_SCHEMA not between", value1, value2, "triggerSchema");
            return (Criteria) this;
        }

        public Criteria andTriggerNameIsNull() {
            addCriterion("TRIGGER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTriggerNameIsNotNull() {
            addCriterion("TRIGGER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerNameEqualTo(String value) {
            addCriterion("TRIGGER_NAME =", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotEqualTo(String value) {
            addCriterion("TRIGGER_NAME <>", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameGreaterThan(String value) {
            addCriterion("TRIGGER_NAME >", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_NAME >=", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameLessThan(String value) {
            addCriterion("TRIGGER_NAME <", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_NAME <=", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameLike(String value) {
            addCriterion("TRIGGER_NAME like", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotLike(String value) {
            addCriterion("TRIGGER_NAME not like", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameIn(List<String> values) {
            addCriterion("TRIGGER_NAME in", values, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotIn(List<String> values) {
            addCriterion("TRIGGER_NAME not in", values, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameBetween(String value1, String value2) {
            addCriterion("TRIGGER_NAME between", value1, value2, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_NAME not between", value1, value2, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIsNull() {
            addCriterion("TABLE_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIsNotNull() {
            addCriterion("TABLE_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andTableCatalogEqualTo(String value) {
            addCriterion("TABLE_CATALOG =", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotEqualTo(String value) {
            addCriterion("TABLE_CATALOG <>", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogGreaterThan(String value) {
            addCriterion("TABLE_CATALOG >", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_CATALOG >=", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLessThan(String value) {
            addCriterion("TABLE_CATALOG <", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLessThanOrEqualTo(String value) {
            addCriterion("TABLE_CATALOG <=", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLike(String value) {
            addCriterion("TABLE_CATALOG like", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotLike(String value) {
            addCriterion("TABLE_CATALOG not like", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIn(List<String> values) {
            addCriterion("TABLE_CATALOG in", values, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotIn(List<String> values) {
            addCriterion("TABLE_CATALOG not in", values, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogBetween(String value1, String value2) {
            addCriterion("TABLE_CATALOG between", value1, value2, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotBetween(String value1, String value2) {
            addCriterion("TABLE_CATALOG not between", value1, value2, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNull() {
            addCriterion("TABLE_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNotNull() {
            addCriterion("TABLE_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaEqualTo(String value) {
            addCriterion("TABLE_SCHEMA =", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <>", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThan(String value) {
            addCriterion("TABLE_SCHEMA >", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA >=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThan(String value) {
            addCriterion("TABLE_SCHEMA <", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLike(String value) {
            addCriterion("TABLE_SCHEMA like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotLike(String value) {
            addCriterion("TABLE_SCHEMA not like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIn(List<String> values) {
            addCriterion("TABLE_SCHEMA in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotIn(List<String> values) {
            addCriterion("TABLE_SCHEMA not in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA not between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNull() {
            addCriterion("COLUMN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("COLUMN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("COLUMN_NAME =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("COLUMN_NAME <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("COLUMN_NAME >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN_NAME >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("COLUMN_NAME <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("COLUMN_NAME <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("COLUMN_NAME like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("COLUMN_NAME not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("COLUMN_NAME in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("COLUMN_NAME not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("COLUMN_NAME between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("COLUMN_NAME not between", value1, value2, "columnName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
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
     * This class corresponds to the database table INFORMATION_SCHEMA.TRIGGER_COLUMN_USAGE
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