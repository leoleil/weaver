package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class SDHLinkPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SDHLinkPOExample() {
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

        public Criteria andSdhIdIsNull() {
            addCriterion("sdh_id is null");
            return (Criteria) this;
        }

        public Criteria andSdhIdIsNotNull() {
            addCriterion("sdh_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdhIdEqualTo(String value) {
            addCriterion("sdh_id =", value, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdNotEqualTo(String value) {
            addCriterion("sdh_id <>", value, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdGreaterThan(String value) {
            addCriterion("sdh_id >", value, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdGreaterThanOrEqualTo(String value) {
            addCriterion("sdh_id >=", value, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdLessThan(String value) {
            addCriterion("sdh_id <", value, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdLessThanOrEqualTo(String value) {
            addCriterion("sdh_id <=", value, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdLike(String value) {
            addCriterion("sdh_id like", value, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdNotLike(String value) {
            addCriterion("sdh_id not like", value, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdIn(List<String> values) {
            addCriterion("sdh_id in", values, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdNotIn(List<String> values) {
            addCriterion("sdh_id not in", values, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdBetween(String value1, String value2) {
            addCriterion("sdh_id between", value1, value2, "sdhId");
            return (Criteria) this;
        }

        public Criteria andSdhIdNotBetween(String value1, String value2) {
            addCriterion("sdh_id not between", value1, value2, "sdhId");
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

        public Criteria andInRingIsNull() {
            addCriterion("in_ring is null");
            return (Criteria) this;
        }

        public Criteria andInRingIsNotNull() {
            addCriterion("in_ring is not null");
            return (Criteria) this;
        }

        public Criteria andInRingEqualTo(String value) {
            addCriterion("in_ring =", value, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingNotEqualTo(String value) {
            addCriterion("in_ring <>", value, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingGreaterThan(String value) {
            addCriterion("in_ring >", value, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingGreaterThanOrEqualTo(String value) {
            addCriterion("in_ring >=", value, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingLessThan(String value) {
            addCriterion("in_ring <", value, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingLessThanOrEqualTo(String value) {
            addCriterion("in_ring <=", value, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingLike(String value) {
            addCriterion("in_ring like", value, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingNotLike(String value) {
            addCriterion("in_ring not like", value, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingIn(List<String> values) {
            addCriterion("in_ring in", values, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingNotIn(List<String> values) {
            addCriterion("in_ring not in", values, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingBetween(String value1, String value2) {
            addCriterion("in_ring between", value1, value2, "inRing");
            return (Criteria) this;
        }

        public Criteria andInRingNotBetween(String value1, String value2) {
            addCriterion("in_ring not between", value1, value2, "inRing");
            return (Criteria) this;
        }

        public Criteria andCarryTypeIsNull() {
            addCriterion("carry_type is null");
            return (Criteria) this;
        }

        public Criteria andCarryTypeIsNotNull() {
            addCriterion("carry_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarryTypeEqualTo(String value) {
            addCriterion("carry_type =", value, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeNotEqualTo(String value) {
            addCriterion("carry_type <>", value, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeGreaterThan(String value) {
            addCriterion("carry_type >", value, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("carry_type >=", value, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeLessThan(String value) {
            addCriterion("carry_type <", value, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeLessThanOrEqualTo(String value) {
            addCriterion("carry_type <=", value, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeLike(String value) {
            addCriterion("carry_type like", value, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeNotLike(String value) {
            addCriterion("carry_type not like", value, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeIn(List<String> values) {
            addCriterion("carry_type in", values, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeNotIn(List<String> values) {
            addCriterion("carry_type not in", values, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeBetween(String value1, String value2) {
            addCriterion("carry_type between", value1, value2, "carryType");
            return (Criteria) this;
        }

        public Criteria andCarryTypeNotBetween(String value1, String value2) {
            addCriterion("carry_type not between", value1, value2, "carryType");
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