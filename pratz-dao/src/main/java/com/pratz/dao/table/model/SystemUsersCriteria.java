package com.pratz.dao.table.model;

import java.util.ArrayList;
import java.util.List;

public class SystemUsersCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public SystemUsersCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
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
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
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
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
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
     * This class corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andAdminIsNull() {
            addCriterion("ADMIN is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsNotNull() {
            addCriterion("ADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEqualTo(Boolean value) {
            addCriterion("ADMIN =", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotEqualTo(Boolean value) {
            addCriterion("ADMIN <>", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThan(Boolean value) {
            addCriterion("ADMIN >", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ADMIN >=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThan(Boolean value) {
            addCriterion("ADMIN <", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThanOrEqualTo(Boolean value) {
            addCriterion("ADMIN <=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminIn(List<Boolean> values) {
            addCriterion("ADMIN in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotIn(List<Boolean> values) {
            addCriterion("ADMIN not in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminBetween(Boolean value1, Boolean value2) {
            addCriterion("ADMIN between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ADMIN not between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaIsNull() {
            addCriterion("INITIAL_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaIsNotNull() {
            addCriterion("INITIAL_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaEqualTo(String value) {
            addCriterion("INITIAL_SCHEMA =", value, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaNotEqualTo(String value) {
            addCriterion("INITIAL_SCHEMA <>", value, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaGreaterThan(String value) {
            addCriterion("INITIAL_SCHEMA >", value, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("INITIAL_SCHEMA >=", value, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaLessThan(String value) {
            addCriterion("INITIAL_SCHEMA <", value, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaLessThanOrEqualTo(String value) {
            addCriterion("INITIAL_SCHEMA <=", value, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaLike(String value) {
            addCriterion("INITIAL_SCHEMA like", value, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaNotLike(String value) {
            addCriterion("INITIAL_SCHEMA not like", value, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaIn(List<String> values) {
            addCriterion("INITIAL_SCHEMA in", values, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaNotIn(List<String> values) {
            addCriterion("INITIAL_SCHEMA not in", values, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaBetween(String value1, String value2) {
            addCriterion("INITIAL_SCHEMA between", value1, value2, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andInitialSchemaNotBetween(String value1, String value2) {
            addCriterion("INITIAL_SCHEMA not between", value1, value2, "initialSchema");
            return (Criteria) this;
        }

        public Criteria andAuthenticationIsNull() {
            addCriterion("AUTHENTICATION is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationIsNotNull() {
            addCriterion("AUTHENTICATION is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationEqualTo(String value) {
            addCriterion("AUTHENTICATION =", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotEqualTo(String value) {
            addCriterion("AUTHENTICATION <>", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationGreaterThan(String value) {
            addCriterion("AUTHENTICATION >", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATION >=", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationLessThan(String value) {
            addCriterion("AUTHENTICATION <", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationLessThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATION <=", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationLike(String value) {
            addCriterion("AUTHENTICATION like", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotLike(String value) {
            addCriterion("AUTHENTICATION not like", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationIn(List<String> values) {
            addCriterion("AUTHENTICATION in", values, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotIn(List<String> values) {
            addCriterion("AUTHENTICATION not in", values, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationBetween(String value1, String value2) {
            addCriterion("AUTHENTICATION between", value1, value2, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotBetween(String value1, String value2) {
            addCriterion("AUTHENTICATION not between", value1, value2, "authentication");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestIsNull() {
            addCriterion("PASSWORD_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestIsNotNull() {
            addCriterion("PASSWORD_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestEqualTo(String value) {
            addCriterion("PASSWORD_DIGEST =", value, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestNotEqualTo(String value) {
            addCriterion("PASSWORD_DIGEST <>", value, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestGreaterThan(String value) {
            addCriterion("PASSWORD_DIGEST >", value, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD_DIGEST >=", value, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestLessThan(String value) {
            addCriterion("PASSWORD_DIGEST <", value, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD_DIGEST <=", value, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestLike(String value) {
            addCriterion("PASSWORD_DIGEST like", value, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestNotLike(String value) {
            addCriterion("PASSWORD_DIGEST not like", value, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestIn(List<String> values) {
            addCriterion("PASSWORD_DIGEST in", values, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestNotIn(List<String> values) {
            addCriterion("PASSWORD_DIGEST not in", values, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestBetween(String value1, String value2) {
            addCriterion("PASSWORD_DIGEST between", value1, value2, "passwordDigest");
            return (Criteria) this;
        }

        public Criteria andPasswordDigestNotBetween(String value1, String value2) {
            addCriterion("PASSWORD_DIGEST not between", value1, value2, "passwordDigest");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
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
     * This class corresponds to the database table INFORMATION_SCHEMA.SYSTEM_USERS
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