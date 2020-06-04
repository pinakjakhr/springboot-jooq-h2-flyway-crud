/*
 * This file is generated by jOOQ.
 */
package com.jooq.tables.records;


import com.jooq.tables.UserMaster;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserMasterRecord extends UpdatableRecordImpl<UserMasterRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1226680211;

    /**
     * Setter for <code>user_master.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>user_master.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>user_master.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>user_master.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return UserMaster.USER_MASTER.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return UserMaster.USER_MASTER.NAME;
    }

    @Override
    public Integer component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public UserMasterRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserMasterRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public UserMasterRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserMasterRecord
     */
    public UserMasterRecord() {
        super(UserMaster.USER_MASTER);
    }

    /**
     * Create a detached, initialised UserMasterRecord
     */
    public UserMasterRecord(Integer userId, String name) {
        super(UserMaster.USER_MASTER);

        set(0, userId);
        set(1, name);
    }
}