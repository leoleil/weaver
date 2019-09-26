package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class OTUPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OTUPOExample() {
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

        public Criteria andOtuIdIsNull() {
            addCriterion("otu_id is null");
            return (Criteria) this;
        }

        public Criteria andOtuIdIsNotNull() {
            addCriterion("otu_id is not null");
            return (Criteria) this;
        }

        public Criteria andOtuIdEqualTo(String value) {
            addCriterion("otu_id =", value, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdNotEqualTo(String value) {
            addCriterion("otu_id <>", value, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdGreaterThan(String value) {
            addCriterion("otu_id >", value, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdGreaterThanOrEqualTo(String value) {
            addCriterion("otu_id >=", value, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdLessThan(String value) {
            addCriterion("otu_id <", value, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdLessThanOrEqualTo(String value) {
            addCriterion("otu_id <=", value, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdLike(String value) {
            addCriterion("otu_id like", value, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdNotLike(String value) {
            addCriterion("otu_id not like", value, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdIn(List<String> values) {
            addCriterion("otu_id in", values, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdNotIn(List<String> values) {
            addCriterion("otu_id not in", values, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdBetween(String value1, String value2) {
            addCriterion("otu_id between", value1, value2, "otuId");
            return (Criteria) this;
        }

        public Criteria andOtuIdNotBetween(String value1, String value2) {
            addCriterion("otu_id not between", value1, value2, "otuId");
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

        public Criteria andCarrayLinkIdIsNull() {
            addCriterion("carray_link_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdIsNotNull() {
            addCriterion("carray_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdEqualTo(String value) {
            addCriterion("carray_link_id =", value, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdNotEqualTo(String value) {
            addCriterion("carray_link_id <>", value, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdGreaterThan(String value) {
            addCriterion("carray_link_id >", value, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("carray_link_id >=", value, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdLessThan(String value) {
            addCriterion("carray_link_id <", value, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdLessThanOrEqualTo(String value) {
            addCriterion("carray_link_id <=", value, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdLike(String value) {
            addCriterion("carray_link_id like", value, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdNotLike(String value) {
            addCriterion("carray_link_id not like", value, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdIn(List<String> values) {
            addCriterion("carray_link_id in", values, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdNotIn(List<String> values) {
            addCriterion("carray_link_id not in", values, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdBetween(String value1, String value2) {
            addCriterion("carray_link_id between", value1, value2, "carrayLinkId");
            return (Criteria) this;
        }

        public Criteria andCarrayLinkIdNotBetween(String value1, String value2) {
            addCriterion("carray_link_id not between", value1, value2, "carrayLinkId");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andGranIsNull() {
            addCriterion("gran is null");
            return (Criteria) this;
        }

        public Criteria andGranIsNotNull() {
            addCriterion("gran is not null");
            return (Criteria) this;
        }

        public Criteria andGranEqualTo(Integer value) {
            addCriterion("gran =", value, "gran");
            return (Criteria) this;
        }

        public Criteria andGranNotEqualTo(Integer value) {
            addCriterion("gran <>", value, "gran");
            return (Criteria) this;
        }

        public Criteria andGranGreaterThan(Integer value) {
            addCriterion("gran >", value, "gran");
            return (Criteria) this;
        }

        public Criteria andGranGreaterThanOrEqualTo(Integer value) {
            addCriterion("gran >=", value, "gran");
            return (Criteria) this;
        }

        public Criteria andGranLessThan(Integer value) {
            addCriterion("gran <", value, "gran");
            return (Criteria) this;
        }

        public Criteria andGranLessThanOrEqualTo(Integer value) {
            addCriterion("gran <=", value, "gran");
            return (Criteria) this;
        }

        public Criteria andGranIn(List<Integer> values) {
            addCriterion("gran in", values, "gran");
            return (Criteria) this;
        }

        public Criteria andGranNotIn(List<Integer> values) {
            addCriterion("gran not in", values, "gran");
            return (Criteria) this;
        }

        public Criteria andGranBetween(Integer value1, Integer value2) {
            addCriterion("gran between", value1, value2, "gran");
            return (Criteria) this;
        }

        public Criteria andGranNotBetween(Integer value1, Integer value2) {
            addCriterion("gran not between", value1, value2, "gran");
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