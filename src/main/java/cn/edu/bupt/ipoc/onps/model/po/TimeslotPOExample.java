package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class TimeslotPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeslotPOExample() {
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

        public Criteria andTimeslotIdIsNull() {
            addCriterion("timeslot_id is null");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdIsNotNull() {
            addCriterion("timeslot_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdEqualTo(String value) {
            addCriterion("timeslot_id =", value, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdNotEqualTo(String value) {
            addCriterion("timeslot_id <>", value, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdGreaterThan(String value) {
            addCriterion("timeslot_id >", value, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdGreaterThanOrEqualTo(String value) {
            addCriterion("timeslot_id >=", value, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdLessThan(String value) {
            addCriterion("timeslot_id <", value, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdLessThanOrEqualTo(String value) {
            addCriterion("timeslot_id <=", value, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdLike(String value) {
            addCriterion("timeslot_id like", value, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdNotLike(String value) {
            addCriterion("timeslot_id not like", value, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdIn(List<String> values) {
            addCriterion("timeslot_id in", values, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdNotIn(List<String> values) {
            addCriterion("timeslot_id not in", values, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdBetween(String value1, String value2) {
            addCriterion("timeslot_id between", value1, value2, "timeslotId");
            return (Criteria) this;
        }

        public Criteria andTimeslotIdNotBetween(String value1, String value2) {
            addCriterion("timeslot_id not between", value1, value2, "timeslotId");
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

        public Criteria andFreeIsNull() {
            addCriterion("free is null");
            return (Criteria) this;
        }

        public Criteria andFreeIsNotNull() {
            addCriterion("free is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEqualTo(Integer value) {
            addCriterion("free =", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotEqualTo(Integer value) {
            addCriterion("free <>", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThan(Integer value) {
            addCriterion("free >", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("free >=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThan(Integer value) {
            addCriterion("free <", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThanOrEqualTo(Integer value) {
            addCriterion("free <=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeIn(List<Integer> values) {
            addCriterion("free in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotIn(List<Integer> values) {
            addCriterion("free not in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeBetween(Integer value1, Integer value2) {
            addCriterion("free between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotBetween(Integer value1, Integer value2) {
            addCriterion("free not between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andLinkIdIsNull() {
            addCriterion("link_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkIdIsNotNull() {
            addCriterion("link_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkIdEqualTo(String value) {
            addCriterion("link_id =", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotEqualTo(String value) {
            addCriterion("link_id <>", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThan(String value) {
            addCriterion("link_id >", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("link_id >=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThan(String value) {
            addCriterion("link_id <", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThanOrEqualTo(String value) {
            addCriterion("link_id <=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLike(String value) {
            addCriterion("link_id like", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotLike(String value) {
            addCriterion("link_id not like", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdIn(List<String> values) {
            addCriterion("link_id in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotIn(List<String> values) {
            addCriterion("link_id not in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdBetween(String value1, String value2) {
            addCriterion("link_id between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotBetween(String value1, String value2) {
            addCriterion("link_id not between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNull() {
            addCriterion("caption is null");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNotNull() {
            addCriterion("caption is not null");
            return (Criteria) this;
        }

        public Criteria andCaptionEqualTo(Integer value) {
            addCriterion("caption =", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotEqualTo(Integer value) {
            addCriterion("caption <>", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThan(Integer value) {
            addCriterion("caption >", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("caption >=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThan(Integer value) {
            addCriterion("caption <", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThanOrEqualTo(Integer value) {
            addCriterion("caption <=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionIn(List<Integer> values) {
            addCriterion("caption in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotIn(List<Integer> values) {
            addCriterion("caption not in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionBetween(Integer value1, Integer value2) {
            addCriterion("caption between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotBetween(Integer value1, Integer value2) {
            addCriterion("caption not between", value1, value2, "caption");
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

        public Criteria andTrafficIdIsNull() {
            addCriterion("traffic_id is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIdIsNotNull() {
            addCriterion("traffic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficIdEqualTo(String value) {
            addCriterion("traffic_id =", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdNotEqualTo(String value) {
            addCriterion("traffic_id <>", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdGreaterThan(String value) {
            addCriterion("traffic_id >", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_id >=", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdLessThan(String value) {
            addCriterion("traffic_id <", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdLessThanOrEqualTo(String value) {
            addCriterion("traffic_id <=", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdLike(String value) {
            addCriterion("traffic_id like", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdNotLike(String value) {
            addCriterion("traffic_id not like", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdIn(List<String> values) {
            addCriterion("traffic_id in", values, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdNotIn(List<String> values) {
            addCriterion("traffic_id not in", values, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdBetween(String value1, String value2) {
            addCriterion("traffic_id between", value1, value2, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdNotBetween(String value1, String value2) {
            addCriterion("traffic_id not between", value1, value2, "trafficId");
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