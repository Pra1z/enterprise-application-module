package com.pratz.dao.table.model;

import java.util.Date;

public class SystemSessions {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.SESSION_ID
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private Long sessionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.CONNECTED
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private Date connected;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.USER_NAME
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.IS_ADMIN
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private Boolean isAdmin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.AUTOCOMMIT
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private Boolean autocommit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.READONLY
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private Boolean readonly;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.LAST_IDENTITY
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private Long lastIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.SCHEMA
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private String schema;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.TRANSACTION
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private Boolean transaction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.TRANSACTION_SIZE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private Long transactionSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.WAITING_FOR_THIS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private String waitingForThis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.THIS_WAITING_FOR
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private String thisWaitingFor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.CURRENT_STATEMENT
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private String currentStatement;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.LATCH_COUNT
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    private Long latchCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.SESSION_ID
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.SESSION_ID
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Long getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.SESSION_ID
     *
     * @param sessionId the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.SESSION_ID
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.CONNECTED
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.CONNECTED
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Date getConnected() {
        return connected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.CONNECTED
     *
     * @param connected the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.CONNECTED
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setConnected(Date connected) {
        this.connected = connected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.USER_NAME
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.USER_NAME
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.USER_NAME
     *
     * @param userName the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.USER_NAME
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.IS_ADMIN
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.IS_ADMIN
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.IS_ADMIN
     *
     * @param isAdmin the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.IS_ADMIN
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.AUTOCOMMIT
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.AUTOCOMMIT
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Boolean getAutocommit() {
        return autocommit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.AUTOCOMMIT
     *
     * @param autocommit the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.AUTOCOMMIT
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setAutocommit(Boolean autocommit) {
        this.autocommit = autocommit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.READONLY
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.READONLY
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Boolean getReadonly() {
        return readonly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.READONLY
     *
     * @param readonly the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.READONLY
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.LAST_IDENTITY
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.LAST_IDENTITY
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Long getLastIdentity() {
        return lastIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.LAST_IDENTITY
     *
     * @param lastIdentity the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.LAST_IDENTITY
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setLastIdentity(Long lastIdentity) {
        this.lastIdentity = lastIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.SCHEMA
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.SCHEMA
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getSchema() {
        return schema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.SCHEMA
     *
     * @param schema the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.SCHEMA
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.TRANSACTION
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.TRANSACTION
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Boolean getTransaction() {
        return transaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.TRANSACTION
     *
     * @param transaction the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.TRANSACTION
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setTransaction(Boolean transaction) {
        this.transaction = transaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.TRANSACTION_SIZE
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.TRANSACTION_SIZE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Long getTransactionSize() {
        return transactionSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.TRANSACTION_SIZE
     *
     * @param transactionSize the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.TRANSACTION_SIZE
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setTransactionSize(Long transactionSize) {
        this.transactionSize = transactionSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.WAITING_FOR_THIS
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.WAITING_FOR_THIS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getWaitingForThis() {
        return waitingForThis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.WAITING_FOR_THIS
     *
     * @param waitingForThis the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.WAITING_FOR_THIS
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setWaitingForThis(String waitingForThis) {
        this.waitingForThis = waitingForThis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.THIS_WAITING_FOR
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.THIS_WAITING_FOR
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getThisWaitingFor() {
        return thisWaitingFor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.THIS_WAITING_FOR
     *
     * @param thisWaitingFor the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.THIS_WAITING_FOR
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setThisWaitingFor(String thisWaitingFor) {
        this.thisWaitingFor = thisWaitingFor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.CURRENT_STATEMENT
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.CURRENT_STATEMENT
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public String getCurrentStatement() {
        return currentStatement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.CURRENT_STATEMENT
     *
     * @param currentStatement the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.CURRENT_STATEMENT
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.LATCH_COUNT
     *
     * @return the value of INFORMATION_SCHEMA.SYSTEM_SESSIONS.LATCH_COUNT
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public Long getLatchCount() {
        return latchCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INFORMATION_SCHEMA.SYSTEM_SESSIONS.LATCH_COUNT
     *
     * @param latchCount the value for INFORMATION_SCHEMA.SYSTEM_SESSIONS.LATCH_COUNT
     *
     * @mbggenerated Sat Mar 21 14:24:50 ICT 2015
     */
    public void setLatchCount(Long latchCount) {
        this.latchCount = latchCount;
    }
}