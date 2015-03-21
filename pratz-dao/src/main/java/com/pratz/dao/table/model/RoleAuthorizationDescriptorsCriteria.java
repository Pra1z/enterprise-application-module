package com.pratz.dao.table.model;

import java.util.ArrayList;
import java.util.List;

public class RoleAuthorizationDescriptorsCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public RoleAuthorizationDescriptorsCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
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
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
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
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
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
     * This class corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
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

        public Criteria andRoleNameIsNull() {
            addCriterion("ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("ROLE_NAME =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("ROLE_NAME <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("ROLE_NAME >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("ROLE_NAME <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("ROLE_NAME like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("ROLE_NAME not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("ROLE_NAME in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("ROLE_NAME not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("ROLE_NAME between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_NAME not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andGranteeIsNull() {
            addCriterion("GRANTEE is null");
            return (Criteria) this;
        }

        public Criteria andGranteeIsNotNull() {
            addCriterion("GRANTEE is not null");
            return (Criteria) this;
        }

        public Criteria andGranteeEqualTo(String value) {
            addCriterion("GRANTEE =", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeNotEqualTo(String value) {
            addCriterion("GRANTEE <>", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeGreaterThan(String value) {
            addCriterion("GRANTEE >", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeGreaterThanOrEqualTo(String value) {
            addCriterion("GRANTEE >=", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeLessThan(String value) {
            addCriterion("GRANTEE <", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeLessThanOrEqualTo(String value) {
            addCriterion("GRANTEE <=", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeLike(String value) {
            addCriterion("GRANTEE like", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeNotLike(String value) {
            addCriterion("GRANTEE not like", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeIn(List<String> values) {
            addCriterion("GRANTEE in", values, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeNotIn(List<String> values) {
            addCriterion("GRANTEE not in", values, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeBetween(String value1, String value2) {
            addCriterion("GRANTEE between", value1, value2, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeNotBetween(String value1, String value2) {
            addCriterion("GRANTEE not between", value1, value2, "grantee");
            return (Criteria) this;
        }

        public Criteria andGrantorIsNull() {
            addCriterion("GRANTOR is null");
            return (Criteria) this;
        }

        public Criteria andGrantorIsNotNull() {
            addCriterion("GRANTOR is not null");
            return (Criteria) this;
        }

        public Criteria andGrantorEqualTo(String value) {
            addCriterion("GRANTOR =", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotEqualTo(String value) {
            addCriterion("GRANTOR <>", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorGreaterThan(String value) {
            addCriterion("GRANTOR >", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorGreaterThanOrEqualTo(String value) {
            addCriterion("GRANTOR >=", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLessThan(String value) {
            addCriterion("GRANTOR <", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLessThanOrEqualTo(String value) {
            addCriterion("GRANTOR <=", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLike(String value) {
            addCriterion("GRANTOR like", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotLike(String value) {
            addCriterion("GRANTOR not like", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorIn(List<String> values) {
            addCriterion("GRANTOR in", values, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotIn(List<String> values) {
            addCriterion("GRANTOR not in", values, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorBetween(String value1, String value2) {
            addCriterion("GRANTOR between", value1, value2, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotBetween(String value1, String value2) {
            addCriterion("GRANTOR not between", value1, value2, "grantor");
            return (Criteria) this;
        }

        public Criteria andIsGrantableIsNull() {
            addCriterion("IS_GRANTABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsGrantableIsNotNull() {
            addCriterion("IS_GRANTABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsGrantableEqualTo(String value) {
            addCriterion("IS_GRANTABLE =", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableNotEqualTo(String value) {
            addCriterion("IS_GRANTABLE <>", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableGreaterThan(String value) {
            addCriterion("IS_GRANTABLE >", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GRANTABLE >=", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableLessThan(String value) {
            addCriterion("IS_GRANTABLE <", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableLessThanOrEqualTo(String value) {
            addCriterion("IS_GRANTABLE <=", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableLike(String value) {
            addCriterion("IS_GRANTABLE like", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableNotLike(String value) {
            addCriterion("IS_GRANTABLE not like", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableIn(List<String> values) {
            addCriterion("IS_GRANTABLE in", values, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableNotIn(List<String> values) {
            addCriterion("IS_GRANTABLE not in", values, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableBetween(String value1, String value2) {
            addCriterion("IS_GRANTABLE between", value1, value2, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableNotBetween(String value1, String value2) {
            addCriterion("IS_GRANTABLE not between", value1, value2, "isGrantable");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
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
     * This class corresponds to the database table INFORMATION_SCHEMA.ROLE_AUTHORIZATION_DESCRIPTORS
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