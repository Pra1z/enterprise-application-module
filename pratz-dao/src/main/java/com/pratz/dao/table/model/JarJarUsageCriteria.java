package com.pratz.dao.table.model;

import java.util.ArrayList;
import java.util.List;

public class JarJarUsageCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public JarJarUsageCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
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
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
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
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
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
     * This class corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
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

        public Criteria andPathJarCatalogIsNull() {
            addCriterion("PATH_JAR_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogIsNotNull() {
            addCriterion("PATH_JAR_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogEqualTo(String value) {
            addCriterion("PATH_JAR_CATALOG =", value, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogNotEqualTo(String value) {
            addCriterion("PATH_JAR_CATALOG <>", value, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogGreaterThan(String value) {
            addCriterion("PATH_JAR_CATALOG >", value, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("PATH_JAR_CATALOG >=", value, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogLessThan(String value) {
            addCriterion("PATH_JAR_CATALOG <", value, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogLessThanOrEqualTo(String value) {
            addCriterion("PATH_JAR_CATALOG <=", value, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogLike(String value) {
            addCriterion("PATH_JAR_CATALOG like", value, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogNotLike(String value) {
            addCriterion("PATH_JAR_CATALOG not like", value, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogIn(List<String> values) {
            addCriterion("PATH_JAR_CATALOG in", values, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogNotIn(List<String> values) {
            addCriterion("PATH_JAR_CATALOG not in", values, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogBetween(String value1, String value2) {
            addCriterion("PATH_JAR_CATALOG between", value1, value2, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarCatalogNotBetween(String value1, String value2) {
            addCriterion("PATH_JAR_CATALOG not between", value1, value2, "pathJarCatalog");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaIsNull() {
            addCriterion("PATH_JAR_SCHAMA is null");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaIsNotNull() {
            addCriterion("PATH_JAR_SCHAMA is not null");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaEqualTo(String value) {
            addCriterion("PATH_JAR_SCHAMA =", value, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaNotEqualTo(String value) {
            addCriterion("PATH_JAR_SCHAMA <>", value, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaGreaterThan(String value) {
            addCriterion("PATH_JAR_SCHAMA >", value, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaGreaterThanOrEqualTo(String value) {
            addCriterion("PATH_JAR_SCHAMA >=", value, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaLessThan(String value) {
            addCriterion("PATH_JAR_SCHAMA <", value, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaLessThanOrEqualTo(String value) {
            addCriterion("PATH_JAR_SCHAMA <=", value, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaLike(String value) {
            addCriterion("PATH_JAR_SCHAMA like", value, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaNotLike(String value) {
            addCriterion("PATH_JAR_SCHAMA not like", value, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaIn(List<String> values) {
            addCriterion("PATH_JAR_SCHAMA in", values, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaNotIn(List<String> values) {
            addCriterion("PATH_JAR_SCHAMA not in", values, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaBetween(String value1, String value2) {
            addCriterion("PATH_JAR_SCHAMA between", value1, value2, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarSchamaNotBetween(String value1, String value2) {
            addCriterion("PATH_JAR_SCHAMA not between", value1, value2, "pathJarSchama");
            return (Criteria) this;
        }

        public Criteria andPathJarNameIsNull() {
            addCriterion("PATH_JAR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPathJarNameIsNotNull() {
            addCriterion("PATH_JAR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPathJarNameEqualTo(String value) {
            addCriterion("PATH_JAR_NAME =", value, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameNotEqualTo(String value) {
            addCriterion("PATH_JAR_NAME <>", value, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameGreaterThan(String value) {
            addCriterion("PATH_JAR_NAME >", value, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameGreaterThanOrEqualTo(String value) {
            addCriterion("PATH_JAR_NAME >=", value, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameLessThan(String value) {
            addCriterion("PATH_JAR_NAME <", value, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameLessThanOrEqualTo(String value) {
            addCriterion("PATH_JAR_NAME <=", value, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameLike(String value) {
            addCriterion("PATH_JAR_NAME like", value, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameNotLike(String value) {
            addCriterion("PATH_JAR_NAME not like", value, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameIn(List<String> values) {
            addCriterion("PATH_JAR_NAME in", values, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameNotIn(List<String> values) {
            addCriterion("PATH_JAR_NAME not in", values, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameBetween(String value1, String value2) {
            addCriterion("PATH_JAR_NAME between", value1, value2, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andPathJarNameNotBetween(String value1, String value2) {
            addCriterion("PATH_JAR_NAME not between", value1, value2, "pathJarName");
            return (Criteria) this;
        }

        public Criteria andJarCatalogIsNull() {
            addCriterion("JAR_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andJarCatalogIsNotNull() {
            addCriterion("JAR_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andJarCatalogEqualTo(String value) {
            addCriterion("JAR_CATALOG =", value, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogNotEqualTo(String value) {
            addCriterion("JAR_CATALOG <>", value, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogGreaterThan(String value) {
            addCriterion("JAR_CATALOG >", value, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("JAR_CATALOG >=", value, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogLessThan(String value) {
            addCriterion("JAR_CATALOG <", value, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogLessThanOrEqualTo(String value) {
            addCriterion("JAR_CATALOG <=", value, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogLike(String value) {
            addCriterion("JAR_CATALOG like", value, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogNotLike(String value) {
            addCriterion("JAR_CATALOG not like", value, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogIn(List<String> values) {
            addCriterion("JAR_CATALOG in", values, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogNotIn(List<String> values) {
            addCriterion("JAR_CATALOG not in", values, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogBetween(String value1, String value2) {
            addCriterion("JAR_CATALOG between", value1, value2, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarCatalogNotBetween(String value1, String value2) {
            addCriterion("JAR_CATALOG not between", value1, value2, "jarCatalog");
            return (Criteria) this;
        }

        public Criteria andJarSchemaIsNull() {
            addCriterion("JAR_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andJarSchemaIsNotNull() {
            addCriterion("JAR_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andJarSchemaEqualTo(String value) {
            addCriterion("JAR_SCHEMA =", value, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaNotEqualTo(String value) {
            addCriterion("JAR_SCHEMA <>", value, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaGreaterThan(String value) {
            addCriterion("JAR_SCHEMA >", value, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("JAR_SCHEMA >=", value, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaLessThan(String value) {
            addCriterion("JAR_SCHEMA <", value, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaLessThanOrEqualTo(String value) {
            addCriterion("JAR_SCHEMA <=", value, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaLike(String value) {
            addCriterion("JAR_SCHEMA like", value, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaNotLike(String value) {
            addCriterion("JAR_SCHEMA not like", value, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaIn(List<String> values) {
            addCriterion("JAR_SCHEMA in", values, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaNotIn(List<String> values) {
            addCriterion("JAR_SCHEMA not in", values, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaBetween(String value1, String value2) {
            addCriterion("JAR_SCHEMA between", value1, value2, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarSchemaNotBetween(String value1, String value2) {
            addCriterion("JAR_SCHEMA not between", value1, value2, "jarSchema");
            return (Criteria) this;
        }

        public Criteria andJarNameIsNull() {
            addCriterion("JAR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJarNameIsNotNull() {
            addCriterion("JAR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJarNameEqualTo(String value) {
            addCriterion("JAR_NAME =", value, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameNotEqualTo(String value) {
            addCriterion("JAR_NAME <>", value, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameGreaterThan(String value) {
            addCriterion("JAR_NAME >", value, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameGreaterThanOrEqualTo(String value) {
            addCriterion("JAR_NAME >=", value, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameLessThan(String value) {
            addCriterion("JAR_NAME <", value, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameLessThanOrEqualTo(String value) {
            addCriterion("JAR_NAME <=", value, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameLike(String value) {
            addCriterion("JAR_NAME like", value, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameNotLike(String value) {
            addCriterion("JAR_NAME not like", value, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameIn(List<String> values) {
            addCriterion("JAR_NAME in", values, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameNotIn(List<String> values) {
            addCriterion("JAR_NAME not in", values, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameBetween(String value1, String value2) {
            addCriterion("JAR_NAME between", value1, value2, "jarName");
            return (Criteria) this;
        }

        public Criteria andJarNameNotBetween(String value1, String value2) {
            addCriterion("JAR_NAME not between", value1, value2, "jarName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
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
     * This class corresponds to the database table INFORMATION_SCHEMA.JAR_JAR_USAGE
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