package com.javen.MavenDemo.bean;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQueTypeIsNull() {
            addCriterion("que_type is null");
            return (Criteria) this;
        }

        public Criteria andQueTypeIsNotNull() {
            addCriterion("que_type is not null");
            return (Criteria) this;
        }

        public Criteria andQueTypeEqualTo(String value) {
            addCriterion("que_type =", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotEqualTo(String value) {
            addCriterion("que_type <>", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeGreaterThan(String value) {
            addCriterion("que_type >", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("que_type >=", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeLessThan(String value) {
            addCriterion("que_type <", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeLessThanOrEqualTo(String value) {
            addCriterion("que_type <=", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeLike(String value) {
            addCriterion("que_type like", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotLike(String value) {
            addCriterion("que_type not like", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeIn(List<String> values) {
            addCriterion("que_type in", values, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotIn(List<String> values) {
            addCriterion("que_type not in", values, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeBetween(String value1, String value2) {
            addCriterion("que_type between", value1, value2, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotBetween(String value1, String value2) {
            addCriterion("que_type not between", value1, value2, "queType");
            return (Criteria) this;
        }

        public Criteria andQueScoreIsNull() {
            addCriterion("que_score is null");
            return (Criteria) this;
        }

        public Criteria andQueScoreIsNotNull() {
            addCriterion("que_score is not null");
            return (Criteria) this;
        }

        public Criteria andQueScoreEqualTo(Integer value) {
            addCriterion("que_score =", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreNotEqualTo(Integer value) {
            addCriterion("que_score <>", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreGreaterThan(Integer value) {
            addCriterion("que_score >", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_score >=", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreLessThan(Integer value) {
            addCriterion("que_score <", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreLessThanOrEqualTo(Integer value) {
            addCriterion("que_score <=", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreIn(List<Integer> values) {
            addCriterion("que_score in", values, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreNotIn(List<Integer> values) {
            addCriterion("que_score not in", values, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreBetween(Integer value1, Integer value2) {
            addCriterion("que_score between", value1, value2, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("que_score not between", value1, value2, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueDesIsNull() {
            addCriterion("que_des is null");
            return (Criteria) this;
        }

        public Criteria andQueDesIsNotNull() {
            addCriterion("que_des is not null");
            return (Criteria) this;
        }

        public Criteria andQueDesEqualTo(String value) {
            addCriterion("que_des =", value, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesNotEqualTo(String value) {
            addCriterion("que_des <>", value, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesGreaterThan(String value) {
            addCriterion("que_des >", value, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesGreaterThanOrEqualTo(String value) {
            addCriterion("que_des >=", value, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesLessThan(String value) {
            addCriterion("que_des <", value, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesLessThanOrEqualTo(String value) {
            addCriterion("que_des <=", value, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesLike(String value) {
            addCriterion("que_des like", value, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesNotLike(String value) {
            addCriterion("que_des not like", value, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesIn(List<String> values) {
            addCriterion("que_des in", values, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesNotIn(List<String> values) {
            addCriterion("que_des not in", values, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesBetween(String value1, String value2) {
            addCriterion("que_des between", value1, value2, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueDesNotBetween(String value1, String value2) {
            addCriterion("que_des not between", value1, value2, "queDes");
            return (Criteria) this;
        }

        public Criteria andQueAnswerIsNull() {
            addCriterion("que_answer is null");
            return (Criteria) this;
        }

        public Criteria andQueAnswerIsNotNull() {
            addCriterion("que_answer is not null");
            return (Criteria) this;
        }

        public Criteria andQueAnswerEqualTo(String value) {
            addCriterion("que_answer =", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerNotEqualTo(String value) {
            addCriterion("que_answer <>", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerGreaterThan(String value) {
            addCriterion("que_answer >", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("que_answer >=", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerLessThan(String value) {
            addCriterion("que_answer <", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerLessThanOrEqualTo(String value) {
            addCriterion("que_answer <=", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerLike(String value) {
            addCriterion("que_answer like", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerNotLike(String value) {
            addCriterion("que_answer not like", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerIn(List<String> values) {
            addCriterion("que_answer in", values, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerNotIn(List<String> values) {
            addCriterion("que_answer not in", values, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerBetween(String value1, String value2) {
            addCriterion("que_answer between", value1, value2, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerNotBetween(String value1, String value2) {
            addCriterion("que_answer not between", value1, value2, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAIsNull() {
            addCriterion("que_a is null");
            return (Criteria) this;
        }

        public Criteria andQueAIsNotNull() {
            addCriterion("que_a is not null");
            return (Criteria) this;
        }

        public Criteria andQueAEqualTo(String value) {
            addCriterion("que_a =", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueANotEqualTo(String value) {
            addCriterion("que_a <>", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueAGreaterThan(String value) {
            addCriterion("que_a >", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueAGreaterThanOrEqualTo(String value) {
            addCriterion("que_a >=", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueALessThan(String value) {
            addCriterion("que_a <", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueALessThanOrEqualTo(String value) {
            addCriterion("que_a <=", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueALike(String value) {
            addCriterion("que_a like", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueANotLike(String value) {
            addCriterion("que_a not like", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueAIn(List<String> values) {
            addCriterion("que_a in", values, "queA");
            return (Criteria) this;
        }

        public Criteria andQueANotIn(List<String> values) {
            addCriterion("que_a not in", values, "queA");
            return (Criteria) this;
        }

        public Criteria andQueABetween(String value1, String value2) {
            addCriterion("que_a between", value1, value2, "queA");
            return (Criteria) this;
        }

        public Criteria andQueANotBetween(String value1, String value2) {
            addCriterion("que_a not between", value1, value2, "queA");
            return (Criteria) this;
        }

        public Criteria andQueBIsNull() {
            addCriterion("que_b is null");
            return (Criteria) this;
        }

        public Criteria andQueBIsNotNull() {
            addCriterion("que_b is not null");
            return (Criteria) this;
        }

        public Criteria andQueBEqualTo(String value) {
            addCriterion("que_b =", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBNotEqualTo(String value) {
            addCriterion("que_b <>", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBGreaterThan(String value) {
            addCriterion("que_b >", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBGreaterThanOrEqualTo(String value) {
            addCriterion("que_b >=", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBLessThan(String value) {
            addCriterion("que_b <", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBLessThanOrEqualTo(String value) {
            addCriterion("que_b <=", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBLike(String value) {
            addCriterion("que_b like", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBNotLike(String value) {
            addCriterion("que_b not like", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBIn(List<String> values) {
            addCriterion("que_b in", values, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBNotIn(List<String> values) {
            addCriterion("que_b not in", values, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBBetween(String value1, String value2) {
            addCriterion("que_b between", value1, value2, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBNotBetween(String value1, String value2) {
            addCriterion("que_b not between", value1, value2, "queB");
            return (Criteria) this;
        }

        public Criteria andQueCIsNull() {
            addCriterion("que_c is null");
            return (Criteria) this;
        }

        public Criteria andQueCIsNotNull() {
            addCriterion("que_c is not null");
            return (Criteria) this;
        }

        public Criteria andQueCEqualTo(String value) {
            addCriterion("que_c =", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCNotEqualTo(String value) {
            addCriterion("que_c <>", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCGreaterThan(String value) {
            addCriterion("que_c >", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCGreaterThanOrEqualTo(String value) {
            addCriterion("que_c >=", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCLessThan(String value) {
            addCriterion("que_c <", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCLessThanOrEqualTo(String value) {
            addCriterion("que_c <=", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCLike(String value) {
            addCriterion("que_c like", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCNotLike(String value) {
            addCriterion("que_c not like", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCIn(List<String> values) {
            addCriterion("que_c in", values, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCNotIn(List<String> values) {
            addCriterion("que_c not in", values, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCBetween(String value1, String value2) {
            addCriterion("que_c between", value1, value2, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCNotBetween(String value1, String value2) {
            addCriterion("que_c not between", value1, value2, "queC");
            return (Criteria) this;
        }

        public Criteria andQueDIsNull() {
            addCriterion("que_d is null");
            return (Criteria) this;
        }

        public Criteria andQueDIsNotNull() {
            addCriterion("que_d is not null");
            return (Criteria) this;
        }

        public Criteria andQueDEqualTo(String value) {
            addCriterion("que_d =", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDNotEqualTo(String value) {
            addCriterion("que_d <>", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDGreaterThan(String value) {
            addCriterion("que_d >", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDGreaterThanOrEqualTo(String value) {
            addCriterion("que_d >=", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDLessThan(String value) {
            addCriterion("que_d <", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDLessThanOrEqualTo(String value) {
            addCriterion("que_d <=", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDLike(String value) {
            addCriterion("que_d like", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDNotLike(String value) {
            addCriterion("que_d not like", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDIn(List<String> values) {
            addCriterion("que_d in", values, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDNotIn(List<String> values) {
            addCriterion("que_d not in", values, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDBetween(String value1, String value2) {
            addCriterion("que_d between", value1, value2, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDNotBetween(String value1, String value2) {
            addCriterion("que_d not between", value1, value2, "queD");
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