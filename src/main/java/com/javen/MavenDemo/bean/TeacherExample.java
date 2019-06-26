package com.javen.MavenDemo.bean;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(String value) {
            addCriterion("tea_id =", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(String value) {
            addCriterion("tea_id <>", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(String value) {
            addCriterion("tea_id >", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(String value) {
            addCriterion("tea_id >=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(String value) {
            addCriterion("tea_id <", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(String value) {
            addCriterion("tea_id <=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLike(String value) {
            addCriterion("tea_id like", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotLike(String value) {
            addCriterion("tea_id not like", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<String> values) {
            addCriterion("tea_id in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<String> values) {
            addCriterion("tea_id not in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(String value1, String value2) {
            addCriterion("tea_id between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(String value1, String value2) {
            addCriterion("tea_id not between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaPassIsNull() {
            addCriterion("tea_pass is null");
            return (Criteria) this;
        }

        public Criteria andTeaPassIsNotNull() {
            addCriterion("tea_pass is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPassEqualTo(String value) {
            addCriterion("tea_pass =", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassNotEqualTo(String value) {
            addCriterion("tea_pass <>", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassGreaterThan(String value) {
            addCriterion("tea_pass >", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassGreaterThanOrEqualTo(String value) {
            addCriterion("tea_pass >=", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassLessThan(String value) {
            addCriterion("tea_pass <", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassLessThanOrEqualTo(String value) {
            addCriterion("tea_pass <=", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassLike(String value) {
            addCriterion("tea_pass like", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassNotLike(String value) {
            addCriterion("tea_pass not like", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassIn(List<String> values) {
            addCriterion("tea_pass in", values, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassNotIn(List<String> values) {
            addCriterion("tea_pass not in", values, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassBetween(String value1, String value2) {
            addCriterion("tea_pass between", value1, value2, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassNotBetween(String value1, String value2) {
            addCriterion("tea_pass not between", value1, value2, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIsNull() {
            addCriterion("tea_email is null");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIsNotNull() {
            addCriterion("tea_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeaEmailEqualTo(String value) {
            addCriterion("tea_email =", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotEqualTo(String value) {
            addCriterion("tea_email <>", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailGreaterThan(String value) {
            addCriterion("tea_email >", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailGreaterThanOrEqualTo(String value) {
            addCriterion("tea_email >=", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLessThan(String value) {
            addCriterion("tea_email <", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLessThanOrEqualTo(String value) {
            addCriterion("tea_email <=", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLike(String value) {
            addCriterion("tea_email like", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotLike(String value) {
            addCriterion("tea_email not like", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIn(List<String> values) {
            addCriterion("tea_email in", values, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotIn(List<String> values) {
            addCriterion("tea_email not in", values, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailBetween(String value1, String value2) {
            addCriterion("tea_email between", value1, value2, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotBetween(String value1, String value2) {
            addCriterion("tea_email not between", value1, value2, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
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