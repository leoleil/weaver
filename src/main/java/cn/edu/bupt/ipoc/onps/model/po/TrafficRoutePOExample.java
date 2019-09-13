package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class TrafficRoutePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrafficRoutePOExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdIsNull() {
            addCriterion("from_node_id is null");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdIsNotNull() {
            addCriterion("from_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdEqualTo(String value) {
            addCriterion("from_node_id =", value, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdNotEqualTo(String value) {
            addCriterion("from_node_id <>", value, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdGreaterThan(String value) {
            addCriterion("from_node_id >", value, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("from_node_id >=", value, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdLessThan(String value) {
            addCriterion("from_node_id <", value, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdLessThanOrEqualTo(String value) {
            addCriterion("from_node_id <=", value, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdLike(String value) {
            addCriterion("from_node_id like", value, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdNotLike(String value) {
            addCriterion("from_node_id not like", value, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdIn(List<String> values) {
            addCriterion("from_node_id in", values, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdNotIn(List<String> values) {
            addCriterion("from_node_id not in", values, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdBetween(String value1, String value2) {
            addCriterion("from_node_id between", value1, value2, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andFromNodeIdNotBetween(String value1, String value2) {
            addCriterion("from_node_id not between", value1, value2, "fromNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdIsNull() {
            addCriterion("to_node_id is null");
            return (Criteria) this;
        }

        public Criteria andToNodeIdIsNotNull() {
            addCriterion("to_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andToNodeIdEqualTo(String value) {
            addCriterion("to_node_id =", value, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdNotEqualTo(String value) {
            addCriterion("to_node_id <>", value, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdGreaterThan(String value) {
            addCriterion("to_node_id >", value, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_node_id >=", value, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdLessThan(String value) {
            addCriterion("to_node_id <", value, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdLessThanOrEqualTo(String value) {
            addCriterion("to_node_id <=", value, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdLike(String value) {
            addCriterion("to_node_id like", value, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdNotLike(String value) {
            addCriterion("to_node_id not like", value, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdIn(List<String> values) {
            addCriterion("to_node_id in", values, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdNotIn(List<String> values) {
            addCriterion("to_node_id not in", values, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdBetween(String value1, String value2) {
            addCriterion("to_node_id between", value1, value2, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andToNodeIdNotBetween(String value1, String value2) {
            addCriterion("to_node_id not between", value1, value2, "toNodeId");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
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

        public Criteria andHopIsNull() {
            addCriterion("hop is null");
            return (Criteria) this;
        }

        public Criteria andHopIsNotNull() {
            addCriterion("hop is not null");
            return (Criteria) this;
        }

        public Criteria andHopEqualTo(Integer value) {
            addCriterion("hop =", value, "hop");
            return (Criteria) this;
        }

        public Criteria andHopNotEqualTo(Integer value) {
            addCriterion("hop <>", value, "hop");
            return (Criteria) this;
        }

        public Criteria andHopGreaterThan(Integer value) {
            addCriterion("hop >", value, "hop");
            return (Criteria) this;
        }

        public Criteria andHopGreaterThanOrEqualTo(Integer value) {
            addCriterion("hop >=", value, "hop");
            return (Criteria) this;
        }

        public Criteria andHopLessThan(Integer value) {
            addCriterion("hop <", value, "hop");
            return (Criteria) this;
        }

        public Criteria andHopLessThanOrEqualTo(Integer value) {
            addCriterion("hop <=", value, "hop");
            return (Criteria) this;
        }

        public Criteria andHopIn(List<Integer> values) {
            addCriterion("hop in", values, "hop");
            return (Criteria) this;
        }

        public Criteria andHopNotIn(List<Integer> values) {
            addCriterion("hop not in", values, "hop");
            return (Criteria) this;
        }

        public Criteria andHopBetween(Integer value1, Integer value2) {
            addCriterion("hop between", value1, value2, "hop");
            return (Criteria) this;
        }

        public Criteria andHopNotBetween(Integer value1, Integer value2) {
            addCriterion("hop not between", value1, value2, "hop");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Integer value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Integer value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Integer value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Integer value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Integer value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Integer> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Integer> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Integer value1, Integer value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Integer value1, Integer value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNull() {
            addCriterion("success is null");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNotNull() {
            addCriterion("success is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessEqualTo(Integer value) {
            addCriterion("success =", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotEqualTo(Integer value) {
            addCriterion("success <>", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThan(Integer value) {
            addCriterion("success >", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("success >=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThan(Integer value) {
            addCriterion("success <", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("success <=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessIn(List<Integer> values) {
            addCriterion("success in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotIn(List<Integer> values) {
            addCriterion("success not in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessBetween(Integer value1, Integer value2) {
            addCriterion("success between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("success not between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andReliabilityIsNull() {
            addCriterion("reliability is null");
            return (Criteria) this;
        }

        public Criteria andReliabilityIsNotNull() {
            addCriterion("reliability is not null");
            return (Criteria) this;
        }

        public Criteria andReliabilityEqualTo(Double value) {
            addCriterion("reliability =", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityNotEqualTo(Double value) {
            addCriterion("reliability <>", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityGreaterThan(Double value) {
            addCriterion("reliability >", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityGreaterThanOrEqualTo(Double value) {
            addCriterion("reliability >=", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityLessThan(Double value) {
            addCriterion("reliability <", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityLessThanOrEqualTo(Double value) {
            addCriterion("reliability <=", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityIn(List<Double> values) {
            addCriterion("reliability in", values, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityNotIn(List<Double> values) {
            addCriterion("reliability not in", values, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityBetween(Double value1, Double value2) {
            addCriterion("reliability between", value1, value2, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityNotBetween(Double value1, Double value2) {
            addCriterion("reliability not between", value1, value2, "reliability");
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

        public Criteria andRouteSequenceIsNull() {
            addCriterion("route_sequence is null");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceIsNotNull() {
            addCriterion("route_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceEqualTo(Integer value) {
            addCriterion("route_sequence =", value, "routeSequence");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceNotEqualTo(Integer value) {
            addCriterion("route_sequence <>", value, "routeSequence");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceGreaterThan(Integer value) {
            addCriterion("route_sequence >", value, "routeSequence");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("route_sequence >=", value, "routeSequence");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceLessThan(Integer value) {
            addCriterion("route_sequence <", value, "routeSequence");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("route_sequence <=", value, "routeSequence");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceIn(List<Integer> values) {
            addCriterion("route_sequence in", values, "routeSequence");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceNotIn(List<Integer> values) {
            addCriterion("route_sequence not in", values, "routeSequence");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceBetween(Integer value1, Integer value2) {
            addCriterion("route_sequence between", value1, value2, "routeSequence");
            return (Criteria) this;
        }

        public Criteria andRouteSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("route_sequence not between", value1, value2, "routeSequence");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("source_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("source_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(String value) {
            addCriterion("source_id =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(String value) {
            addCriterion("source_id <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(String value) {
            addCriterion("source_id >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("source_id >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(String value) {
            addCriterion("source_id <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(String value) {
            addCriterion("source_id <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLike(String value) {
            addCriterion("source_id like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotLike(String value) {
            addCriterion("source_id not like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<String> values) {
            addCriterion("source_id in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<String> values) {
            addCriterion("source_id not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(String value1, String value2) {
            addCriterion("source_id between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(String value1, String value2) {
            addCriterion("source_id not between", value1, value2, "sourceId");
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

        public Criteria andFromPortSourceIdIsNull() {
            addCriterion("from_port_source_id is null");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdIsNotNull() {
            addCriterion("from_port_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdEqualTo(String value) {
            addCriterion("from_port_source_id =", value, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdNotEqualTo(String value) {
            addCriterion("from_port_source_id <>", value, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdGreaterThan(String value) {
            addCriterion("from_port_source_id >", value, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("from_port_source_id >=", value, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdLessThan(String value) {
            addCriterion("from_port_source_id <", value, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdLessThanOrEqualTo(String value) {
            addCriterion("from_port_source_id <=", value, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdLike(String value) {
            addCriterion("from_port_source_id like", value, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdNotLike(String value) {
            addCriterion("from_port_source_id not like", value, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdIn(List<String> values) {
            addCriterion("from_port_source_id in", values, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdNotIn(List<String> values) {
            addCriterion("from_port_source_id not in", values, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdBetween(String value1, String value2) {
            addCriterion("from_port_source_id between", value1, value2, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andFromPortSourceIdNotBetween(String value1, String value2) {
            addCriterion("from_port_source_id not between", value1, value2, "fromPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdIsNull() {
            addCriterion("to_port_source_id is null");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdIsNotNull() {
            addCriterion("to_port_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdEqualTo(String value) {
            addCriterion("to_port_source_id =", value, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdNotEqualTo(String value) {
            addCriterion("to_port_source_id <>", value, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdGreaterThan(String value) {
            addCriterion("to_port_source_id >", value, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_port_source_id >=", value, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdLessThan(String value) {
            addCriterion("to_port_source_id <", value, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdLessThanOrEqualTo(String value) {
            addCriterion("to_port_source_id <=", value, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdLike(String value) {
            addCriterion("to_port_source_id like", value, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdNotLike(String value) {
            addCriterion("to_port_source_id not like", value, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdIn(List<String> values) {
            addCriterion("to_port_source_id in", values, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdNotIn(List<String> values) {
            addCriterion("to_port_source_id not in", values, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdBetween(String value1, String value2) {
            addCriterion("to_port_source_id between", value1, value2, "toPortSourceId");
            return (Criteria) this;
        }

        public Criteria andToPortSourceIdNotBetween(String value1, String value2) {
            addCriterion("to_port_source_id not between", value1, value2, "toPortSourceId");
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