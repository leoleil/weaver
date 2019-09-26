package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class FiberPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FiberPOExample() {
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

        public Criteria andFiberIdIsNull() {
            addCriterion("fiber_id is null");
            return (Criteria) this;
        }

        public Criteria andFiberIdIsNotNull() {
            addCriterion("fiber_id is not null");
            return (Criteria) this;
        }

        public Criteria andFiberIdEqualTo(String value) {
            addCriterion("fiber_id =", value, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdNotEqualTo(String value) {
            addCriterion("fiber_id <>", value, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdGreaterThan(String value) {
            addCriterion("fiber_id >", value, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdGreaterThanOrEqualTo(String value) {
            addCriterion("fiber_id >=", value, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdLessThan(String value) {
            addCriterion("fiber_id <", value, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdLessThanOrEqualTo(String value) {
            addCriterion("fiber_id <=", value, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdLike(String value) {
            addCriterion("fiber_id like", value, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdNotLike(String value) {
            addCriterion("fiber_id not like", value, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdIn(List<String> values) {
            addCriterion("fiber_id in", values, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdNotIn(List<String> values) {
            addCriterion("fiber_id not in", values, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdBetween(String value1, String value2) {
            addCriterion("fiber_id between", value1, value2, "fiberId");
            return (Criteria) this;
        }

        public Criteria andFiberIdNotBetween(String value1, String value2) {
            addCriterion("fiber_id not between", value1, value2, "fiberId");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdIsNull() {
            addCriterion("fiber_link_id is null");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdIsNotNull() {
            addCriterion("fiber_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdEqualTo(String value) {
            addCriterion("fiber_link_id =", value, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdNotEqualTo(String value) {
            addCriterion("fiber_link_id <>", value, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdGreaterThan(String value) {
            addCriterion("fiber_link_id >", value, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("fiber_link_id >=", value, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdLessThan(String value) {
            addCriterion("fiber_link_id <", value, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdLessThanOrEqualTo(String value) {
            addCriterion("fiber_link_id <=", value, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdLike(String value) {
            addCriterion("fiber_link_id like", value, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdNotLike(String value) {
            addCriterion("fiber_link_id not like", value, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdIn(List<String> values) {
            addCriterion("fiber_link_id in", values, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdNotIn(List<String> values) {
            addCriterion("fiber_link_id not in", values, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdBetween(String value1, String value2) {
            addCriterion("fiber_link_id between", value1, value2, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andFiberLinkIdNotBetween(String value1, String value2) {
            addCriterion("fiber_link_id not between", value1, value2, "fiberLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdIsNull() {
            addCriterion("wdm_link_id is null");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdIsNotNull() {
            addCriterion("wdm_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdEqualTo(String value) {
            addCriterion("wdm_link_id =", value, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdNotEqualTo(String value) {
            addCriterion("wdm_link_id <>", value, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdGreaterThan(String value) {
            addCriterion("wdm_link_id >", value, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("wdm_link_id >=", value, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdLessThan(String value) {
            addCriterion("wdm_link_id <", value, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdLessThanOrEqualTo(String value) {
            addCriterion("wdm_link_id <=", value, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdLike(String value) {
            addCriterion("wdm_link_id like", value, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdNotLike(String value) {
            addCriterion("wdm_link_id not like", value, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdIn(List<String> values) {
            addCriterion("wdm_link_id in", values, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdNotIn(List<String> values) {
            addCriterion("wdm_link_id not in", values, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdBetween(String value1, String value2) {
            addCriterion("wdm_link_id between", value1, value2, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andWdmLinkIdNotBetween(String value1, String value2) {
            addCriterion("wdm_link_id not between", value1, value2, "wdmLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdIsNull() {
            addCriterion("otn_link_id is null");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdIsNotNull() {
            addCriterion("otn_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdEqualTo(String value) {
            addCriterion("otn_link_id =", value, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdNotEqualTo(String value) {
            addCriterion("otn_link_id <>", value, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdGreaterThan(String value) {
            addCriterion("otn_link_id >", value, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("otn_link_id >=", value, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdLessThan(String value) {
            addCriterion("otn_link_id <", value, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdLessThanOrEqualTo(String value) {
            addCriterion("otn_link_id <=", value, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdLike(String value) {
            addCriterion("otn_link_id like", value, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdNotLike(String value) {
            addCriterion("otn_link_id not like", value, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdIn(List<String> values) {
            addCriterion("otn_link_id in", values, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdNotIn(List<String> values) {
            addCriterion("otn_link_id not in", values, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdBetween(String value1, String value2) {
            addCriterion("otn_link_id between", value1, value2, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andOtnLinkIdNotBetween(String value1, String value2) {
            addCriterion("otn_link_id not between", value1, value2, "otnLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdIsNull() {
            addCriterion("sdh_link_id is null");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdIsNotNull() {
            addCriterion("sdh_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdEqualTo(String value) {
            addCriterion("sdh_link_id =", value, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdNotEqualTo(String value) {
            addCriterion("sdh_link_id <>", value, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdGreaterThan(String value) {
            addCriterion("sdh_link_id >", value, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("sdh_link_id >=", value, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdLessThan(String value) {
            addCriterion("sdh_link_id <", value, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdLessThanOrEqualTo(String value) {
            addCriterion("sdh_link_id <=", value, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdLike(String value) {
            addCriterion("sdh_link_id like", value, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdNotLike(String value) {
            addCriterion("sdh_link_id not like", value, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdIn(List<String> values) {
            addCriterion("sdh_link_id in", values, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdNotIn(List<String> values) {
            addCriterion("sdh_link_id not in", values, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdBetween(String value1, String value2) {
            addCriterion("sdh_link_id between", value1, value2, "sdhLinkId");
            return (Criteria) this;
        }

        public Criteria andSdhLinkIdNotBetween(String value1, String value2) {
            addCriterion("sdh_link_id not between", value1, value2, "sdhLinkId");
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