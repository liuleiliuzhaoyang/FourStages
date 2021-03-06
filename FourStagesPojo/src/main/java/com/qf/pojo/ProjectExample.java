package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andProjectidIsNull() {
            addCriterion("projectid is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectid is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectid =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectid <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectid >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectid >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectid <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectid <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectid in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectid not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectid between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectid not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectname is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectname is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectname =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectname <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectname >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectname >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectname <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectname <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectname like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectname not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectname in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectname not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectname between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectname not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectlilvIsNull() {
            addCriterion("projectlilv is null");
            return (Criteria) this;
        }

        public Criteria andProjectlilvIsNotNull() {
            addCriterion("projectlilv is not null");
            return (Criteria) this;
        }

        public Criteria andProjectlilvEqualTo(Double value) {
            addCriterion("projectlilv =", value, "projectlilv");
            return (Criteria) this;
        }

        public Criteria andProjectlilvNotEqualTo(Double value) {
            addCriterion("projectlilv <>", value, "projectlilv");
            return (Criteria) this;
        }

        public Criteria andProjectlilvGreaterThan(Double value) {
            addCriterion("projectlilv >", value, "projectlilv");
            return (Criteria) this;
        }

        public Criteria andProjectlilvGreaterThanOrEqualTo(Double value) {
            addCriterion("projectlilv >=", value, "projectlilv");
            return (Criteria) this;
        }

        public Criteria andProjectlilvLessThan(Double value) {
            addCriterion("projectlilv <", value, "projectlilv");
            return (Criteria) this;
        }

        public Criteria andProjectlilvLessThanOrEqualTo(Double value) {
            addCriterion("projectlilv <=", value, "projectlilv");
            return (Criteria) this;
        }

        public Criteria andProjectlilvIn(List<Double> values) {
            addCriterion("projectlilv in", values, "projectlilv");
            return (Criteria) this;
        }

        public Criteria andProjectlilvNotIn(List<Double> values) {
            addCriterion("projectlilv not in", values, "projectlilv");
            return (Criteria) this;
        }

        public Criteria andProjectlilvBetween(Double value1, Double value2) {
            addCriterion("projectlilv between", value1, value2, "projectlilv");
            return (Criteria) this;
        }

        public Criteria andProjectlilvNotBetween(Double value1, Double value2) {
            addCriterion("projectlilv not between", value1, value2, "projectlilv");
            return (Criteria) this;
        }

        public Criteria andProjectqixianIsNull() {
            addCriterion("projectqixian is null");
            return (Criteria) this;
        }

        public Criteria andProjectqixianIsNotNull() {
            addCriterion("projectqixian is not null");
            return (Criteria) this;
        }

        public Criteria andProjectqixianEqualTo(String value) {
            addCriterion("projectqixian =", value, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianNotEqualTo(String value) {
            addCriterion("projectqixian <>", value, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianGreaterThan(String value) {
            addCriterion("projectqixian >", value, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianGreaterThanOrEqualTo(String value) {
            addCriterion("projectqixian >=", value, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianLessThan(String value) {
            addCriterion("projectqixian <", value, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianLessThanOrEqualTo(String value) {
            addCriterion("projectqixian <=", value, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianLike(String value) {
            addCriterion("projectqixian like", value, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianNotLike(String value) {
            addCriterion("projectqixian not like", value, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianIn(List<String> values) {
            addCriterion("projectqixian in", values, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianNotIn(List<String> values) {
            addCriterion("projectqixian not in", values, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianBetween(String value1, String value2) {
            addCriterion("projectqixian between", value1, value2, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectqixianNotBetween(String value1, String value2) {
            addCriterion("projectqixian not between", value1, value2, "projectqixian");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyIsNull() {
            addCriterion("projectmoney is null");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyIsNotNull() {
            addCriterion("projectmoney is not null");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyEqualTo(String value) {
            addCriterion("projectmoney =", value, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyNotEqualTo(String value) {
            addCriterion("projectmoney <>", value, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyGreaterThan(String value) {
            addCriterion("projectmoney >", value, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("projectmoney >=", value, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyLessThan(String value) {
            addCriterion("projectmoney <", value, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyLessThanOrEqualTo(String value) {
            addCriterion("projectmoney <=", value, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyLike(String value) {
            addCriterion("projectmoney like", value, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyNotLike(String value) {
            addCriterion("projectmoney not like", value, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyIn(List<String> values) {
            addCriterion("projectmoney in", values, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyNotIn(List<String> values) {
            addCriterion("projectmoney not in", values, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyBetween(String value1, String value2) {
            addCriterion("projectmoney between", value1, value2, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectmoneyNotBetween(String value1, String value2) {
            addCriterion("projectmoney not between", value1, value2, "projectmoney");
            return (Criteria) this;
        }

        public Criteria andProjectflagIsNull() {
            addCriterion("projectflag is null");
            return (Criteria) this;
        }

        public Criteria andProjectflagIsNotNull() {
            addCriterion("projectflag is not null");
            return (Criteria) this;
        }

        public Criteria andProjectflagEqualTo(String value) {
            addCriterion("projectflag =", value, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagNotEqualTo(String value) {
            addCriterion("projectflag <>", value, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagGreaterThan(String value) {
            addCriterion("projectflag >", value, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagGreaterThanOrEqualTo(String value) {
            addCriterion("projectflag >=", value, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagLessThan(String value) {
            addCriterion("projectflag <", value, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagLessThanOrEqualTo(String value) {
            addCriterion("projectflag <=", value, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagLike(String value) {
            addCriterion("projectflag like", value, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagNotLike(String value) {
            addCriterion("projectflag not like", value, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagIn(List<String> values) {
            addCriterion("projectflag in", values, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagNotIn(List<String> values) {
            addCriterion("projectflag not in", values, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagBetween(String value1, String value2) {
            addCriterion("projectflag between", value1, value2, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflagNotBetween(String value1, String value2) {
            addCriterion("projectflag not between", value1, value2, "projectflag");
            return (Criteria) this;
        }

        public Criteria andProjectflag2IsNull() {
            addCriterion("projectflag2 is null");
            return (Criteria) this;
        }

        public Criteria andProjectflag2IsNotNull() {
            addCriterion("projectflag2 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectflag2EqualTo(String value) {
            addCriterion("projectflag2 =", value, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2NotEqualTo(String value) {
            addCriterion("projectflag2 <>", value, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2GreaterThan(String value) {
            addCriterion("projectflag2 >", value, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2GreaterThanOrEqualTo(String value) {
            addCriterion("projectflag2 >=", value, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2LessThan(String value) {
            addCriterion("projectflag2 <", value, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2LessThanOrEqualTo(String value) {
            addCriterion("projectflag2 <=", value, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2Like(String value) {
            addCriterion("projectflag2 like", value, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2NotLike(String value) {
            addCriterion("projectflag2 not like", value, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2In(List<String> values) {
            addCriterion("projectflag2 in", values, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2NotIn(List<String> values) {
            addCriterion("projectflag2 not in", values, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2Between(String value1, String value2) {
            addCriterion("projectflag2 between", value1, value2, "projectflag2");
            return (Criteria) this;
        }

        public Criteria andProjectflag2NotBetween(String value1, String value2) {
            addCriterion("projectflag2 not between", value1, value2, "projectflag2");
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