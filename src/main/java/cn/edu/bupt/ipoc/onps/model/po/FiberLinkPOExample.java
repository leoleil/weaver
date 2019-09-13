package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class FiberLinkPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FiberLinkPOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberIsNull() {
            addCriterion("sequence_number is null");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberIsNotNull() {
            addCriterion("sequence_number is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberEqualTo(Integer value) {
            addCriterion("sequence_number =", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberNotEqualTo(Integer value) {
            addCriterion("sequence_number <>", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberGreaterThan(Integer value) {
            addCriterion("sequence_number >", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence_number >=", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberLessThan(Integer value) {
            addCriterion("sequence_number <", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberLessThanOrEqualTo(Integer value) {
            addCriterion("sequence_number <=", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberIn(List<Integer> values) {
            addCriterion("sequence_number in", values, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberNotIn(List<Integer> values) {
            addCriterion("sequence_number not in", values, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberBetween(Integer value1, Integer value2) {
            addCriterion("sequence_number between", value1, value2, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence_number not between", value1, value2, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andFualtTimesIsNull() {
            addCriterion("fualt_times is null");
            return (Criteria) this;
        }

        public Criteria andFualtTimesIsNotNull() {
            addCriterion("fualt_times is not null");
            return (Criteria) this;
        }

        public Criteria andFualtTimesEqualTo(Integer value) {
            addCriterion("fualt_times =", value, "fualtTimes");
            return (Criteria) this;
        }

        public Criteria andFualtTimesNotEqualTo(Integer value) {
            addCriterion("fualt_times <>", value, "fualtTimes");
            return (Criteria) this;
        }

        public Criteria andFualtTimesGreaterThan(Integer value) {
            addCriterion("fualt_times >", value, "fualtTimes");
            return (Criteria) this;
        }

        public Criteria andFualtTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("fualt_times >=", value, "fualtTimes");
            return (Criteria) this;
        }

        public Criteria andFualtTimesLessThan(Integer value) {
            addCriterion("fualt_times <", value, "fualtTimes");
            return (Criteria) this;
        }

        public Criteria andFualtTimesLessThanOrEqualTo(Integer value) {
            addCriterion("fualt_times <=", value, "fualtTimes");
            return (Criteria) this;
        }

        public Criteria andFualtTimesIn(List<Integer> values) {
            addCriterion("fualt_times in", values, "fualtTimes");
            return (Criteria) this;
        }

        public Criteria andFualtTimesNotIn(List<Integer> values) {
            addCriterion("fualt_times not in", values, "fualtTimes");
            return (Criteria) this;
        }

        public Criteria andFualtTimesBetween(Integer value1, Integer value2) {
            addCriterion("fualt_times between", value1, value2, "fualtTimes");
            return (Criteria) this;
        }

        public Criteria andFualtTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("fualt_times not between", value1, value2, "fualtTimes");
            return (Criteria) this;
        }

        public Criteria andCompletedYearIsNull() {
            addCriterion("completed_year is null");
            return (Criteria) this;
        }

        public Criteria andCompletedYearIsNotNull() {
            addCriterion("completed_year is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedYearEqualTo(Integer value) {
            addCriterion("completed_year =", value, "completedYear");
            return (Criteria) this;
        }

        public Criteria andCompletedYearNotEqualTo(Integer value) {
            addCriterion("completed_year <>", value, "completedYear");
            return (Criteria) this;
        }

        public Criteria andCompletedYearGreaterThan(Integer value) {
            addCriterion("completed_year >", value, "completedYear");
            return (Criteria) this;
        }

        public Criteria andCompletedYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("completed_year >=", value, "completedYear");
            return (Criteria) this;
        }

        public Criteria andCompletedYearLessThan(Integer value) {
            addCriterion("completed_year <", value, "completedYear");
            return (Criteria) this;
        }

        public Criteria andCompletedYearLessThanOrEqualTo(Integer value) {
            addCriterion("completed_year <=", value, "completedYear");
            return (Criteria) this;
        }

        public Criteria andCompletedYearIn(List<Integer> values) {
            addCriterion("completed_year in", values, "completedYear");
            return (Criteria) this;
        }

        public Criteria andCompletedYearNotIn(List<Integer> values) {
            addCriterion("completed_year not in", values, "completedYear");
            return (Criteria) this;
        }

        public Criteria andCompletedYearBetween(Integer value1, Integer value2) {
            addCriterion("completed_year between", value1, value2, "completedYear");
            return (Criteria) this;
        }

        public Criteria andCompletedYearNotBetween(Integer value1, Integer value2) {
            addCriterion("completed_year not between", value1, value2, "completedYear");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayIsNull() {
            addCriterion("perfunctory_way is null");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayIsNotNull() {
            addCriterion("perfunctory_way is not null");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayEqualTo(String value) {
            addCriterion("perfunctory_way =", value, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayNotEqualTo(String value) {
            addCriterion("perfunctory_way <>", value, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayGreaterThan(String value) {
            addCriterion("perfunctory_way >", value, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayGreaterThanOrEqualTo(String value) {
            addCriterion("perfunctory_way >=", value, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayLessThan(String value) {
            addCriterion("perfunctory_way <", value, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayLessThanOrEqualTo(String value) {
            addCriterion("perfunctory_way <=", value, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayLike(String value) {
            addCriterion("perfunctory_way like", value, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayNotLike(String value) {
            addCriterion("perfunctory_way not like", value, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayIn(List<String> values) {
            addCriterion("perfunctory_way in", values, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayNotIn(List<String> values) {
            addCriterion("perfunctory_way not in", values, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayBetween(String value1, String value2) {
            addCriterion("perfunctory_way between", value1, value2, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andPerfunctoryWayNotBetween(String value1, String value2) {
            addCriterion("perfunctory_way not between", value1, value2, "perfunctoryWay");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitIsNull() {
            addCriterion("maintain_unit is null");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitIsNotNull() {
            addCriterion("maintain_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitEqualTo(String value) {
            addCriterion("maintain_unit =", value, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitNotEqualTo(String value) {
            addCriterion("maintain_unit <>", value, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitGreaterThan(String value) {
            addCriterion("maintain_unit >", value, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_unit >=", value, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitLessThan(String value) {
            addCriterion("maintain_unit <", value, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitLessThanOrEqualTo(String value) {
            addCriterion("maintain_unit <=", value, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitLike(String value) {
            addCriterion("maintain_unit like", value, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitNotLike(String value) {
            addCriterion("maintain_unit not like", value, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitIn(List<String> values) {
            addCriterion("maintain_unit in", values, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitNotIn(List<String> values) {
            addCriterion("maintain_unit not in", values, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitBetween(String value1, String value2) {
            addCriterion("maintain_unit between", value1, value2, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andMaintainUnitNotBetween(String value1, String value2) {
            addCriterion("maintain_unit not between", value1, value2, "maintainUnit");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
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