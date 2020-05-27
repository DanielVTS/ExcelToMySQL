package cn.lingnan.pojo;

import java.util.ArrayList;
import java.util.List;

public class BasicInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicInformationExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("sId is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("sId is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("sId =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("sId <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("sId >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("sId >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("sId <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("sId <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("sId like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("sId not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("sId in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("sId not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("sId between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("sId not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("sName is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("sName is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("sName =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("sName <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("sName >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("sName >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("sName <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("sName <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("sName like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("sName not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("sName in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("sName not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("sName between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("sName not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSClass1IsNull() {
            addCriterion("sClass1 is null");
            return (Criteria) this;
        }

        public Criteria andSClass1IsNotNull() {
            addCriterion("sClass1 is not null");
            return (Criteria) this;
        }

        public Criteria andSClass1EqualTo(String value) {
            addCriterion("sClass1 =", value, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1NotEqualTo(String value) {
            addCriterion("sClass1 <>", value, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1GreaterThan(String value) {
            addCriterion("sClass1 >", value, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1GreaterThanOrEqualTo(String value) {
            addCriterion("sClass1 >=", value, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1LessThan(String value) {
            addCriterion("sClass1 <", value, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1LessThanOrEqualTo(String value) {
            addCriterion("sClass1 <=", value, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1Like(String value) {
            addCriterion("sClass1 like", value, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1NotLike(String value) {
            addCriterion("sClass1 not like", value, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1In(List<String> values) {
            addCriterion("sClass1 in", values, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1NotIn(List<String> values) {
            addCriterion("sClass1 not in", values, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1Between(String value1, String value2) {
            addCriterion("sClass1 between", value1, value2, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSClass1NotBetween(String value1, String value2) {
            addCriterion("sClass1 not between", value1, value2, "sClass1");
            return (Criteria) this;
        }

        public Criteria andSLocationIsNull() {
            addCriterion("sLocation is null");
            return (Criteria) this;
        }

        public Criteria andSLocationIsNotNull() {
            addCriterion("sLocation is not null");
            return (Criteria) this;
        }

        public Criteria andSLocationEqualTo(String value) {
            addCriterion("sLocation =", value, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationNotEqualTo(String value) {
            addCriterion("sLocation <>", value, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationGreaterThan(String value) {
            addCriterion("sLocation >", value, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationGreaterThanOrEqualTo(String value) {
            addCriterion("sLocation >=", value, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationLessThan(String value) {
            addCriterion("sLocation <", value, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationLessThanOrEqualTo(String value) {
            addCriterion("sLocation <=", value, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationLike(String value) {
            addCriterion("sLocation like", value, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationNotLike(String value) {
            addCriterion("sLocation not like", value, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationIn(List<String> values) {
            addCriterion("sLocation in", values, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationNotIn(List<String> values) {
            addCriterion("sLocation not in", values, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationBetween(String value1, String value2) {
            addCriterion("sLocation between", value1, value2, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSLocationNotBetween(String value1, String value2) {
            addCriterion("sLocation not between", value1, value2, "sLocation");
            return (Criteria) this;
        }

        public Criteria andSClass2IsNull() {
            addCriterion("sClass2 is null");
            return (Criteria) this;
        }

        public Criteria andSClass2IsNotNull() {
            addCriterion("sClass2 is not null");
            return (Criteria) this;
        }

        public Criteria andSClass2EqualTo(String value) {
            addCriterion("sClass2 =", value, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2NotEqualTo(String value) {
            addCriterion("sClass2 <>", value, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2GreaterThan(String value) {
            addCriterion("sClass2 >", value, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2GreaterThanOrEqualTo(String value) {
            addCriterion("sClass2 >=", value, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2LessThan(String value) {
            addCriterion("sClass2 <", value, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2LessThanOrEqualTo(String value) {
            addCriterion("sClass2 <=", value, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2Like(String value) {
            addCriterion("sClass2 like", value, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2NotLike(String value) {
            addCriterion("sClass2 not like", value, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2In(List<String> values) {
            addCriterion("sClass2 in", values, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2NotIn(List<String> values) {
            addCriterion("sClass2 not in", values, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2Between(String value1, String value2) {
            addCriterion("sClass2 between", value1, value2, "sClass2");
            return (Criteria) this;
        }

        public Criteria andSClass2NotBetween(String value1, String value2) {
            addCriterion("sClass2 not between", value1, value2, "sClass2");
            return (Criteria) this;
        }
    }

    /**
     *
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private final String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private final String typeHandler;

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