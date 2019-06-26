package com.javen.MavenDemo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTestNoIsNull() {
            addCriterion("test_no is null");
            return (Criteria) this;
        }

        public Criteria andTestNoIsNotNull() {
            addCriterion("test_no is not null");
            return (Criteria) this;
        }

        public Criteria andTestNoEqualTo(String value) {
            addCriterion("test_no =", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoNotEqualTo(String value) {
            addCriterion("test_no <>", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoGreaterThan(String value) {
            addCriterion("test_no >", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoGreaterThanOrEqualTo(String value) {
            addCriterion("test_no >=", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoLessThan(String value) {
            addCriterion("test_no <", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoLessThanOrEqualTo(String value) {
            addCriterion("test_no <=", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoLike(String value) {
            addCriterion("test_no like", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoNotLike(String value) {
            addCriterion("test_no not like", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoIn(List<String> values) {
            addCriterion("test_no in", values, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoNotIn(List<String> values) {
            addCriterion("test_no not in", values, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoBetween(String value1, String value2) {
            addCriterion("test_no between", value1, value2, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoNotBetween(String value1, String value2) {
            addCriterion("test_no not between", value1, value2, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNameIsNull() {
            addCriterion("test_name is null");
            return (Criteria) this;
        }

        public Criteria andTestNameIsNotNull() {
            addCriterion("test_name is not null");
            return (Criteria) this;
        }

        public Criteria andTestNameEqualTo(String value) {
            addCriterion("test_name =", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotEqualTo(String value) {
            addCriterion("test_name <>", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameGreaterThan(String value) {
            addCriterion("test_name >", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameGreaterThanOrEqualTo(String value) {
            addCriterion("test_name >=", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameLessThan(String value) {
            addCriterion("test_name <", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameLessThanOrEqualTo(String value) {
            addCriterion("test_name <=", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameLike(String value) {
            addCriterion("test_name like", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotLike(String value) {
            addCriterion("test_name not like", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameIn(List<String> values) {
            addCriterion("test_name in", values, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotIn(List<String> values) {
            addCriterion("test_name not in", values, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameBetween(String value1, String value2) {
            addCriterion("test_name between", value1, value2, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotBetween(String value1, String value2) {
            addCriterion("test_name not between", value1, value2, "testName");
            return (Criteria) this;
        }

        public Criteria andTestClassIsNull() {
            addCriterion("test_class is null");
            return (Criteria) this;
        }

        public Criteria andTestClassIsNotNull() {
            addCriterion("test_class is not null");
            return (Criteria) this;
        }

        public Criteria andTestClassEqualTo(String value) {
            addCriterion("test_class =", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassNotEqualTo(String value) {
            addCriterion("test_class <>", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassGreaterThan(String value) {
            addCriterion("test_class >", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassGreaterThanOrEqualTo(String value) {
            addCriterion("test_class >=", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassLessThan(String value) {
            addCriterion("test_class <", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassLessThanOrEqualTo(String value) {
            addCriterion("test_class <=", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassLike(String value) {
            addCriterion("test_class like", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassNotLike(String value) {
            addCriterion("test_class not like", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassIn(List<String> values) {
            addCriterion("test_class in", values, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassNotIn(List<String> values) {
            addCriterion("test_class not in", values, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassBetween(String value1, String value2) {
            addCriterion("test_class between", value1, value2, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassNotBetween(String value1, String value2) {
            addCriterion("test_class not between", value1, value2, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestStatusIsNull() {
            addCriterion("test_status is null");
            return (Criteria) this;
        }

        public Criteria andTestStatusIsNotNull() {
            addCriterion("test_status is not null");
            return (Criteria) this;
        }

        public Criteria andTestStatusEqualTo(String value) {
            addCriterion("test_status =", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusNotEqualTo(String value) {
            addCriterion("test_status <>", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusGreaterThan(String value) {
            addCriterion("test_status >", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusGreaterThanOrEqualTo(String value) {
            addCriterion("test_status >=", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusLessThan(String value) {
            addCriterion("test_status <", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusLessThanOrEqualTo(String value) {
            addCriterion("test_status <=", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusLike(String value) {
            addCriterion("test_status like", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusNotLike(String value) {
            addCriterion("test_status not like", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusIn(List<String> values) {
            addCriterion("test_status in", values, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusNotIn(List<String> values) {
            addCriterion("test_status not in", values, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusBetween(String value1, String value2) {
            addCriterion("test_status between", value1, value2, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusNotBetween(String value1, String value2) {
            addCriterion("test_status not between", value1, value2, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestNumIsNull() {
            addCriterion("test_num is null");
            return (Criteria) this;
        }

        public Criteria andTestNumIsNotNull() {
            addCriterion("test_num is not null");
            return (Criteria) this;
        }

        public Criteria andTestNumEqualTo(Integer value) {
            addCriterion("test_num =", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumNotEqualTo(Integer value) {
            addCriterion("test_num <>", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumGreaterThan(Integer value) {
            addCriterion("test_num >", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_num >=", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumLessThan(Integer value) {
            addCriterion("test_num <", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumLessThanOrEqualTo(Integer value) {
            addCriterion("test_num <=", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumIn(List<Integer> values) {
            addCriterion("test_num in", values, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumNotIn(List<Integer> values) {
            addCriterion("test_num not in", values, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumBetween(Integer value1, Integer value2) {
            addCriterion("test_num between", value1, value2, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumNotBetween(Integer value1, Integer value2) {
            addCriterion("test_num not between", value1, value2, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestLimitIsNull() {
            addCriterion("test_limit is null");
            return (Criteria) this;
        }

        public Criteria andTestLimitIsNotNull() {
            addCriterion("test_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTestLimitEqualTo(Date value) {
            addCriterionForJDBCDate("test_limit =", value, "testLimit");
            return (Criteria) this;
        }

        public Criteria andTestLimitNotEqualTo(Date value) {
            addCriterionForJDBCDate("test_limit <>", value, "testLimit");
            return (Criteria) this;
        }

        public Criteria andTestLimitGreaterThan(Date value) {
            addCriterionForJDBCDate("test_limit >", value, "testLimit");
            return (Criteria) this;
        }

        public Criteria andTestLimitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("test_limit >=", value, "testLimit");
            return (Criteria) this;
        }

        public Criteria andTestLimitLessThan(Date value) {
            addCriterionForJDBCDate("test_limit <", value, "testLimit");
            return (Criteria) this;
        }

        public Criteria andTestLimitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("test_limit <=", value, "testLimit");
            return (Criteria) this;
        }

        public Criteria andTestLimitIn(List<Date> values) {
            addCriterionForJDBCDate("test_limit in", values, "testLimit");
            return (Criteria) this;
        }

        public Criteria andTestLimitNotIn(List<Date> values) {
            addCriterionForJDBCDate("test_limit not in", values, "testLimit");
            return (Criteria) this;
        }

        public Criteria andTestLimitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("test_limit between", value1, value2, "testLimit");
            return (Criteria) this;
        }

        public Criteria andTestLimitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("test_limit not between", value1, value2, "testLimit");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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