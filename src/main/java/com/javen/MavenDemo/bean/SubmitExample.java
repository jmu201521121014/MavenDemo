package com.javen.MavenDemo.bean;

import java.util.ArrayList;
import java.util.List;

public class SubmitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubmitExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andQueNoIsNull() {
            addCriterion("que_no is null");
            return (Criteria) this;
        }

        public Criteria andQueNoIsNotNull() {
            addCriterion("que_no is not null");
            return (Criteria) this;
        }

        public Criteria andQueNoEqualTo(String value) {
            addCriterion("que_no =", value, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoNotEqualTo(String value) {
            addCriterion("que_no <>", value, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoGreaterThan(String value) {
            addCriterion("que_no >", value, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoGreaterThanOrEqualTo(String value) {
            addCriterion("que_no >=", value, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoLessThan(String value) {
            addCriterion("que_no <", value, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoLessThanOrEqualTo(String value) {
            addCriterion("que_no <=", value, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoLike(String value) {
            addCriterion("que_no like", value, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoNotLike(String value) {
            addCriterion("que_no not like", value, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoIn(List<String> values) {
            addCriterion("que_no in", values, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoNotIn(List<String> values) {
            addCriterion("que_no not in", values, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoBetween(String value1, String value2) {
            addCriterion("que_no between", value1, value2, "queNo");
            return (Criteria) this;
        }

        public Criteria andQueNoNotBetween(String value1, String value2) {
            addCriterion("que_no not between", value1, value2, "queNo");
            return (Criteria) this;
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

        public Criteria andStuAnswerIsNull() {
            addCriterion("stu_answer is null");
            return (Criteria) this;
        }

        public Criteria andStuAnswerIsNotNull() {
            addCriterion("stu_answer is not null");
            return (Criteria) this;
        }

        public Criteria andStuAnswerEqualTo(String value) {
            addCriterion("stu_answer =", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerNotEqualTo(String value) {
            addCriterion("stu_answer <>", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerGreaterThan(String value) {
            addCriterion("stu_answer >", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("stu_answer >=", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerLessThan(String value) {
            addCriterion("stu_answer <", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerLessThanOrEqualTo(String value) {
            addCriterion("stu_answer <=", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerLike(String value) {
            addCriterion("stu_answer like", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerNotLike(String value) {
            addCriterion("stu_answer not like", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerIn(List<String> values) {
            addCriterion("stu_answer in", values, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerNotIn(List<String> values) {
            addCriterion("stu_answer not in", values, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerBetween(String value1, String value2) {
            addCriterion("stu_answer between", value1, value2, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerNotBetween(String value1, String value2) {
            addCriterion("stu_answer not between", value1, value2, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andSubScoreIsNull() {
            addCriterion("sub_score is null");
            return (Criteria) this;
        }

        public Criteria andSubScoreIsNotNull() {
            addCriterion("sub_score is not null");
            return (Criteria) this;
        }

        public Criteria andSubScoreEqualTo(Integer value) {
            addCriterion("sub_score =", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreNotEqualTo(Integer value) {
            addCriterion("sub_score <>", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreGreaterThan(Integer value) {
            addCriterion("sub_score >", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_score >=", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreLessThan(Integer value) {
            addCriterion("sub_score <", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreLessThanOrEqualTo(Integer value) {
            addCriterion("sub_score <=", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreIn(List<Integer> values) {
            addCriterion("sub_score in", values, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreNotIn(List<Integer> values) {
            addCriterion("sub_score not in", values, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreBetween(Integer value1, Integer value2) {
            addCriterion("sub_score between", value1, value2, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_score not between", value1, value2, "subScore");
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