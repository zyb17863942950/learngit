package com.qingao.mgj.pojo;

import java.util.ArrayList;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andStidIsNull() {
            addCriterion("stid is null");
            return (Criteria) this;
        }

        public Criteria andStidIsNotNull() {
            addCriterion("stid is not null");
            return (Criteria) this;
        }

        public Criteria andStidEqualTo(Integer value) {
            addCriterion("stid =", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotEqualTo(Integer value) {
            addCriterion("stid <>", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThan(Integer value) {
            addCriterion("stid >", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stid >=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThan(Integer value) {
            addCriterion("stid <", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThanOrEqualTo(Integer value) {
            addCriterion("stid <=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidIn(List<Integer> values) {
            addCriterion("stid in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotIn(List<Integer> values) {
            addCriterion("stid not in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidBetween(Integer value1, Integer value2) {
            addCriterion("stid between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotBetween(Integer value1, Integer value2) {
            addCriterion("stid not between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStlognameIsNull() {
            addCriterion("stlogname is null");
            return (Criteria) this;
        }

        public Criteria andStlognameIsNotNull() {
            addCriterion("stlogname is not null");
            return (Criteria) this;
        }

        public Criteria andStlognameEqualTo(String value) {
            addCriterion("stlogname =", value, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameNotEqualTo(String value) {
            addCriterion("stlogname <>", value, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameGreaterThan(String value) {
            addCriterion("stlogname >", value, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameGreaterThanOrEqualTo(String value) {
            addCriterion("stlogname >=", value, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameLessThan(String value) {
            addCriterion("stlogname <", value, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameLessThanOrEqualTo(String value) {
            addCriterion("stlogname <=", value, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameLike(String value) {
            addCriterion("stlogname like", value, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameNotLike(String value) {
            addCriterion("stlogname not like", value, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameIn(List<String> values) {
            addCriterion("stlogname in", values, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameNotIn(List<String> values) {
            addCriterion("stlogname not in", values, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameBetween(String value1, String value2) {
            addCriterion("stlogname between", value1, value2, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStlognameNotBetween(String value1, String value2) {
            addCriterion("stlogname not between", value1, value2, "stlogname");
            return (Criteria) this;
        }

        public Criteria andStpasswordIsNull() {
            addCriterion("stpassword is null");
            return (Criteria) this;
        }

        public Criteria andStpasswordIsNotNull() {
            addCriterion("stpassword is not null");
            return (Criteria) this;
        }

        public Criteria andStpasswordEqualTo(String value) {
            addCriterion("stpassword =", value, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordNotEqualTo(String value) {
            addCriterion("stpassword <>", value, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordGreaterThan(String value) {
            addCriterion("stpassword >", value, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("stpassword >=", value, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordLessThan(String value) {
            addCriterion("stpassword <", value, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordLessThanOrEqualTo(String value) {
            addCriterion("stpassword <=", value, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordLike(String value) {
            addCriterion("stpassword like", value, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordNotLike(String value) {
            addCriterion("stpassword not like", value, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordIn(List<String> values) {
            addCriterion("stpassword in", values, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordNotIn(List<String> values) {
            addCriterion("stpassword not in", values, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordBetween(String value1, String value2) {
            addCriterion("stpassword between", value1, value2, "stpassword");
            return (Criteria) this;
        }

        public Criteria andStpasswordNotBetween(String value1, String value2) {
            addCriterion("stpassword not between", value1, value2, "stpassword");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
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