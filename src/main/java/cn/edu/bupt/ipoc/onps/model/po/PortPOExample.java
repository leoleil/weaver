package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class PortPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PortPOExample() {
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

        public Criteria andVelocityIsNull() {
            addCriterion("velocity is null");
            return (Criteria) this;
        }

        public Criteria andVelocityIsNotNull() {
            addCriterion("velocity is not null");
            return (Criteria) this;
        }

        public Criteria andVelocityEqualTo(Double value) {
            addCriterion("velocity =", value, "velocity");
            return (Criteria) this;
        }

        public Criteria andVelocityNotEqualTo(Double value) {
            addCriterion("velocity <>", value, "velocity");
            return (Criteria) this;
        }

        public Criteria andVelocityGreaterThan(Double value) {
            addCriterion("velocity >", value, "velocity");
            return (Criteria) this;
        }

        public Criteria andVelocityGreaterThanOrEqualTo(Double value) {
            addCriterion("velocity >=", value, "velocity");
            return (Criteria) this;
        }

        public Criteria andVelocityLessThan(Double value) {
            addCriterion("velocity <", value, "velocity");
            return (Criteria) this;
        }

        public Criteria andVelocityLessThanOrEqualTo(Double value) {
            addCriterion("velocity <=", value, "velocity");
            return (Criteria) this;
        }

        public Criteria andVelocityIn(List<Double> values) {
            addCriterion("velocity in", values, "velocity");
            return (Criteria) this;
        }

        public Criteria andVelocityNotIn(List<Double> values) {
            addCriterion("velocity not in", values, "velocity");
            return (Criteria) this;
        }

        public Criteria andVelocityBetween(Double value1, Double value2) {
            addCriterion("velocity between", value1, value2, "velocity");
            return (Criteria) this;
        }

        public Criteria andVelocityNotBetween(Double value1, Double value2) {
            addCriterion("velocity not between", value1, value2, "velocity");
            return (Criteria) this;
        }

        public Criteria andLayerIsNull() {
            addCriterion("layer is null");
            return (Criteria) this;
        }

        public Criteria andLayerIsNotNull() {
            addCriterion("layer is not null");
            return (Criteria) this;
        }

        public Criteria andLayerEqualTo(String value) {
            addCriterion("layer =", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotEqualTo(String value) {
            addCriterion("layer <>", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThan(String value) {
            addCriterion("layer >", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThanOrEqualTo(String value) {
            addCriterion("layer >=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThan(String value) {
            addCriterion("layer <", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThanOrEqualTo(String value) {
            addCriterion("layer <=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLike(String value) {
            addCriterion("layer like", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotLike(String value) {
            addCriterion("layer not like", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerIn(List<String> values) {
            addCriterion("layer in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotIn(List<String> values) {
            addCriterion("layer not in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerBetween(String value1, String value2) {
            addCriterion("layer between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotBetween(String value1, String value2) {
            addCriterion("layer not between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andPortTypeIsNull() {
            addCriterion("port_type is null");
            return (Criteria) this;
        }

        public Criteria andPortTypeIsNotNull() {
            addCriterion("port_type is not null");
            return (Criteria) this;
        }

        public Criteria andPortTypeEqualTo(String value) {
            addCriterion("port_type =", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeNotEqualTo(String value) {
            addCriterion("port_type <>", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeGreaterThan(String value) {
            addCriterion("port_type >", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeGreaterThanOrEqualTo(String value) {
            addCriterion("port_type >=", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeLessThan(String value) {
            addCriterion("port_type <", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeLessThanOrEqualTo(String value) {
            addCriterion("port_type <=", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeLike(String value) {
            addCriterion("port_type like", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeNotLike(String value) {
            addCriterion("port_type not like", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeIn(List<String> values) {
            addCriterion("port_type in", values, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeNotIn(List<String> values) {
            addCriterion("port_type not in", values, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeBetween(String value1, String value2) {
            addCriterion("port_type between", value1, value2, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeNotBetween(String value1, String value2) {
            addCriterion("port_type not between", value1, value2, "portType");
            return (Criteria) this;
        }

        public Criteria andPortRateIsNull() {
            addCriterion("port_rate is null");
            return (Criteria) this;
        }

        public Criteria andPortRateIsNotNull() {
            addCriterion("port_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPortRateEqualTo(String value) {
            addCriterion("port_rate =", value, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateNotEqualTo(String value) {
            addCriterion("port_rate <>", value, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateGreaterThan(String value) {
            addCriterion("port_rate >", value, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateGreaterThanOrEqualTo(String value) {
            addCriterion("port_rate >=", value, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateLessThan(String value) {
            addCriterion("port_rate <", value, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateLessThanOrEqualTo(String value) {
            addCriterion("port_rate <=", value, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateLike(String value) {
            addCriterion("port_rate like", value, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateNotLike(String value) {
            addCriterion("port_rate not like", value, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateIn(List<String> values) {
            addCriterion("port_rate in", values, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateNotIn(List<String> values) {
            addCriterion("port_rate not in", values, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateBetween(String value1, String value2) {
            addCriterion("port_rate between", value1, value2, "portRate");
            return (Criteria) this;
        }

        public Criteria andPortRateNotBetween(String value1, String value2) {
            addCriterion("port_rate not between", value1, value2, "portRate");
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

        public Criteria andNodeIdIsNull() {
            addCriterion("node_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(String value) {
            addCriterion("node_id =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(String value) {
            addCriterion("node_id <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(String value) {
            addCriterion("node_id >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("node_id >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(String value) {
            addCriterion("node_id <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(String value) {
            addCriterion("node_id <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLike(String value) {
            addCriterion("node_id like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotLike(String value) {
            addCriterion("node_id not like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<String> values) {
            addCriterion("node_id in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<String> values) {
            addCriterion("node_id not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(String value1, String value2) {
            addCriterion("node_id between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(String value1, String value2) {
            addCriterion("node_id not between", value1, value2, "nodeId");
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