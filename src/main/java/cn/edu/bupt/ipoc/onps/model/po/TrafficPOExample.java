package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class TrafficPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrafficPOExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateIsNull() {
            addCriterion("traffic_Rate is null");
            return (Criteria) this;
        }

        public Criteria andTrafficRateIsNotNull() {
            addCriterion("traffic_Rate is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficRateEqualTo(String value) {
            addCriterion("traffic_Rate =", value, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateNotEqualTo(String value) {
            addCriterion("traffic_Rate <>", value, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateGreaterThan(String value) {
            addCriterion("traffic_Rate >", value, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_Rate >=", value, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateLessThan(String value) {
            addCriterion("traffic_Rate <", value, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateLessThanOrEqualTo(String value) {
            addCriterion("traffic_Rate <=", value, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateLike(String value) {
            addCriterion("traffic_Rate like", value, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateNotLike(String value) {
            addCriterion("traffic_Rate not like", value, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateIn(List<String> values) {
            addCriterion("traffic_Rate in", values, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateNotIn(List<String> values) {
            addCriterion("traffic_Rate not in", values, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateBetween(String value1, String value2) {
            addCriterion("traffic_Rate between", value1, value2, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficRateNotBetween(String value1, String value2) {
            addCriterion("traffic_Rate not between", value1, value2, "trafficRate");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusIsNull() {
            addCriterion("traffic_status is null");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusIsNotNull() {
            addCriterion("traffic_status is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusEqualTo(String value) {
            addCriterion("traffic_status =", value, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusNotEqualTo(String value) {
            addCriterion("traffic_status <>", value, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusGreaterThan(String value) {
            addCriterion("traffic_status >", value, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_status >=", value, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusLessThan(String value) {
            addCriterion("traffic_status <", value, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusLessThanOrEqualTo(String value) {
            addCriterion("traffic_status <=", value, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusLike(String value) {
            addCriterion("traffic_status like", value, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusNotLike(String value) {
            addCriterion("traffic_status not like", value, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusIn(List<String> values) {
            addCriterion("traffic_status in", values, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusNotIn(List<String> values) {
            addCriterion("traffic_status not in", values, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusBetween(String value1, String value2) {
            addCriterion("traffic_status between", value1, value2, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficStatusNotBetween(String value1, String value2) {
            addCriterion("traffic_status not between", value1, value2, "trafficStatus");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpIsNull() {
            addCriterion("traffic_group_ip is null");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpIsNotNull() {
            addCriterion("traffic_group_ip is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpEqualTo(String value) {
            addCriterion("traffic_group_ip =", value, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpNotEqualTo(String value) {
            addCriterion("traffic_group_ip <>", value, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpGreaterThan(String value) {
            addCriterion("traffic_group_ip >", value, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_group_ip >=", value, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpLessThan(String value) {
            addCriterion("traffic_group_ip <", value, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpLessThanOrEqualTo(String value) {
            addCriterion("traffic_group_ip <=", value, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpLike(String value) {
            addCriterion("traffic_group_ip like", value, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpNotLike(String value) {
            addCriterion("traffic_group_ip not like", value, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpIn(List<String> values) {
            addCriterion("traffic_group_ip in", values, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpNotIn(List<String> values) {
            addCriterion("traffic_group_ip not in", values, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpBetween(String value1, String value2) {
            addCriterion("traffic_group_ip between", value1, value2, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficGroupIpNotBetween(String value1, String value2) {
            addCriterion("traffic_group_ip not between", value1, value2, "trafficGroupIp");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelIsNull() {
            addCriterion("traffic_level is null");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelIsNotNull() {
            addCriterion("traffic_level is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelEqualTo(String value) {
            addCriterion("traffic_level =", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelNotEqualTo(String value) {
            addCriterion("traffic_level <>", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelGreaterThan(String value) {
            addCriterion("traffic_level >", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_level >=", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelLessThan(String value) {
            addCriterion("traffic_level <", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelLessThanOrEqualTo(String value) {
            addCriterion("traffic_level <=", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelLike(String value) {
            addCriterion("traffic_level like", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelNotLike(String value) {
            addCriterion("traffic_level not like", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelIn(List<String> values) {
            addCriterion("traffic_level in", values, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelNotIn(List<String> values) {
            addCriterion("traffic_level not in", values, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelBetween(String value1, String value2) {
            addCriterion("traffic_level between", value1, value2, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelNotBetween(String value1, String value2) {
            addCriterion("traffic_level not between", value1, value2, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andEffectIsNull() {
            addCriterion("effect is null");
            return (Criteria) this;
        }

        public Criteria andEffectIsNotNull() {
            addCriterion("effect is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEqualTo(Integer value) {
            addCriterion("effect =", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotEqualTo(Integer value) {
            addCriterion("effect <>", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThan(Integer value) {
            addCriterion("effect >", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThanOrEqualTo(Integer value) {
            addCriterion("effect >=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThan(Integer value) {
            addCriterion("effect <", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThanOrEqualTo(Integer value) {
            addCriterion("effect <=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectIn(List<Integer> values) {
            addCriterion("effect in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotIn(List<Integer> values) {
            addCriterion("effect not in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectBetween(Integer value1, Integer value2) {
            addCriterion("effect between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotBetween(Integer value1, Integer value2) {
            addCriterion("effect not between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andFallIsNull() {
            addCriterion("fall is null");
            return (Criteria) this;
        }

        public Criteria andFallIsNotNull() {
            addCriterion("fall is not null");
            return (Criteria) this;
        }

        public Criteria andFallEqualTo(Integer value) {
            addCriterion("fall =", value, "fall");
            return (Criteria) this;
        }

        public Criteria andFallNotEqualTo(Integer value) {
            addCriterion("fall <>", value, "fall");
            return (Criteria) this;
        }

        public Criteria andFallGreaterThan(Integer value) {
            addCriterion("fall >", value, "fall");
            return (Criteria) this;
        }

        public Criteria andFallGreaterThanOrEqualTo(Integer value) {
            addCriterion("fall >=", value, "fall");
            return (Criteria) this;
        }

        public Criteria andFallLessThan(Integer value) {
            addCriterion("fall <", value, "fall");
            return (Criteria) this;
        }

        public Criteria andFallLessThanOrEqualTo(Integer value) {
            addCriterion("fall <=", value, "fall");
            return (Criteria) this;
        }

        public Criteria andFallIn(List<Integer> values) {
            addCriterion("fall in", values, "fall");
            return (Criteria) this;
        }

        public Criteria andFallNotIn(List<Integer> values) {
            addCriterion("fall not in", values, "fall");
            return (Criteria) this;
        }

        public Criteria andFallBetween(Integer value1, Integer value2) {
            addCriterion("fall between", value1, value2, "fall");
            return (Criteria) this;
        }

        public Criteria andFallNotBetween(Integer value1, Integer value2) {
            addCriterion("fall not between", value1, value2, "fall");
            return (Criteria) this;
        }

        public Criteria andCutoffIsNull() {
            addCriterion("cutoff is null");
            return (Criteria) this;
        }

        public Criteria andCutoffIsNotNull() {
            addCriterion("cutoff is not null");
            return (Criteria) this;
        }

        public Criteria andCutoffEqualTo(Integer value) {
            addCriterion("cutoff =", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffNotEqualTo(Integer value) {
            addCriterion("cutoff <>", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffGreaterThan(Integer value) {
            addCriterion("cutoff >", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffGreaterThanOrEqualTo(Integer value) {
            addCriterion("cutoff >=", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffLessThan(Integer value) {
            addCriterion("cutoff <", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffLessThanOrEqualTo(Integer value) {
            addCriterion("cutoff <=", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffIn(List<Integer> values) {
            addCriterion("cutoff in", values, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffNotIn(List<Integer> values) {
            addCriterion("cutoff not in", values, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffBetween(Integer value1, Integer value2) {
            addCriterion("cutoff between", value1, value2, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffNotBetween(Integer value1, Integer value2) {
            addCriterion("cutoff not between", value1, value2, "cutoff");
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

        public Criteria andWorkRouteIdIsNull() {
            addCriterion("work_route_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdIsNotNull() {
            addCriterion("work_route_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdEqualTo(String value) {
            addCriterion("work_route_id =", value, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdNotEqualTo(String value) {
            addCriterion("work_route_id <>", value, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdGreaterThan(String value) {
            addCriterion("work_route_id >", value, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_route_id >=", value, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdLessThan(String value) {
            addCriterion("work_route_id <", value, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdLessThanOrEqualTo(String value) {
            addCriterion("work_route_id <=", value, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdLike(String value) {
            addCriterion("work_route_id like", value, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdNotLike(String value) {
            addCriterion("work_route_id not like", value, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdIn(List<String> values) {
            addCriterion("work_route_id in", values, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdNotIn(List<String> values) {
            addCriterion("work_route_id not in", values, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdBetween(String value1, String value2) {
            addCriterion("work_route_id between", value1, value2, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andWorkRouteIdNotBetween(String value1, String value2) {
            addCriterion("work_route_id not between", value1, value2, "workRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdIsNull() {
            addCriterion("resume_route_id is null");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdIsNotNull() {
            addCriterion("resume_route_id is not null");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdEqualTo(String value) {
            addCriterion("resume_route_id =", value, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdNotEqualTo(String value) {
            addCriterion("resume_route_id <>", value, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdGreaterThan(String value) {
            addCriterion("resume_route_id >", value, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdGreaterThanOrEqualTo(String value) {
            addCriterion("resume_route_id >=", value, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdLessThan(String value) {
            addCriterion("resume_route_id <", value, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdLessThanOrEqualTo(String value) {
            addCriterion("resume_route_id <=", value, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdLike(String value) {
            addCriterion("resume_route_id like", value, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdNotLike(String value) {
            addCriterion("resume_route_id not like", value, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdIn(List<String> values) {
            addCriterion("resume_route_id in", values, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdNotIn(List<String> values) {
            addCriterion("resume_route_id not in", values, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdBetween(String value1, String value2) {
            addCriterion("resume_route_id between", value1, value2, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteIdNotBetween(String value1, String value2) {
            addCriterion("resume_route_id not between", value1, value2, "resumeRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdIsNull() {
            addCriterion("protect_route_id is null");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdIsNotNull() {
            addCriterion("protect_route_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdEqualTo(String value) {
            addCriterion("protect_route_id =", value, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdNotEqualTo(String value) {
            addCriterion("protect_route_id <>", value, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdGreaterThan(String value) {
            addCriterion("protect_route_id >", value, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdGreaterThanOrEqualTo(String value) {
            addCriterion("protect_route_id >=", value, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdLessThan(String value) {
            addCriterion("protect_route_id <", value, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdLessThanOrEqualTo(String value) {
            addCriterion("protect_route_id <=", value, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdLike(String value) {
            addCriterion("protect_route_id like", value, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdNotLike(String value) {
            addCriterion("protect_route_id not like", value, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdIn(List<String> values) {
            addCriterion("protect_route_id in", values, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdNotIn(List<String> values) {
            addCriterion("protect_route_id not in", values, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdBetween(String value1, String value2) {
            addCriterion("protect_route_id between", value1, value2, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andProtectRouteIdNotBetween(String value1, String value2) {
            addCriterion("protect_route_id not between", value1, value2, "protectRouteId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdIsNull() {
            addCriterion("resume_route_for_protect_id is null");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdIsNotNull() {
            addCriterion("resume_route_for_protect_id is not null");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdEqualTo(String value) {
            addCriterion("resume_route_for_protect_id =", value, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdNotEqualTo(String value) {
            addCriterion("resume_route_for_protect_id <>", value, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdGreaterThan(String value) {
            addCriterion("resume_route_for_protect_id >", value, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdGreaterThanOrEqualTo(String value) {
            addCriterion("resume_route_for_protect_id >=", value, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdLessThan(String value) {
            addCriterion("resume_route_for_protect_id <", value, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdLessThanOrEqualTo(String value) {
            addCriterion("resume_route_for_protect_id <=", value, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdLike(String value) {
            addCriterion("resume_route_for_protect_id like", value, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdNotLike(String value) {
            addCriterion("resume_route_for_protect_id not like", value, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdIn(List<String> values) {
            addCriterion("resume_route_for_protect_id in", values, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdNotIn(List<String> values) {
            addCriterion("resume_route_for_protect_id not in", values, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdBetween(String value1, String value2) {
            addCriterion("resume_route_for_protect_id between", value1, value2, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andResumeRouteForProtectIdNotBetween(String value1, String value2) {
            addCriterion("resume_route_for_protect_id not between", value1, value2, "resumeRouteForProtectId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdIsNull() {
            addCriterion("work_must_node_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdIsNotNull() {
            addCriterion("work_must_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdEqualTo(String value) {
            addCriterion("work_must_node_id =", value, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdNotEqualTo(String value) {
            addCriterion("work_must_node_id <>", value, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdGreaterThan(String value) {
            addCriterion("work_must_node_id >", value, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_must_node_id >=", value, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdLessThan(String value) {
            addCriterion("work_must_node_id <", value, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdLessThanOrEqualTo(String value) {
            addCriterion("work_must_node_id <=", value, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdLike(String value) {
            addCriterion("work_must_node_id like", value, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdNotLike(String value) {
            addCriterion("work_must_node_id not like", value, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdIn(List<String> values) {
            addCriterion("work_must_node_id in", values, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdNotIn(List<String> values) {
            addCriterion("work_must_node_id not in", values, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdBetween(String value1, String value2) {
            addCriterion("work_must_node_id between", value1, value2, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustNodeIdNotBetween(String value1, String value2) {
            addCriterion("work_must_node_id not between", value1, value2, "workMustNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdIsNull() {
            addCriterion("work_never_node_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdIsNotNull() {
            addCriterion("work_never_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdEqualTo(String value) {
            addCriterion("work_never_node_id =", value, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdNotEqualTo(String value) {
            addCriterion("work_never_node_id <>", value, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdGreaterThan(String value) {
            addCriterion("work_never_node_id >", value, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_never_node_id >=", value, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdLessThan(String value) {
            addCriterion("work_never_node_id <", value, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdLessThanOrEqualTo(String value) {
            addCriterion("work_never_node_id <=", value, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdLike(String value) {
            addCriterion("work_never_node_id like", value, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdNotLike(String value) {
            addCriterion("work_never_node_id not like", value, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdIn(List<String> values) {
            addCriterion("work_never_node_id in", values, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdNotIn(List<String> values) {
            addCriterion("work_never_node_id not in", values, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdBetween(String value1, String value2) {
            addCriterion("work_never_node_id between", value1, value2, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverNodeIdNotBetween(String value1, String value2) {
            addCriterion("work_never_node_id not between", value1, value2, "workNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdIsNull() {
            addCriterion("protect_must_node_id is null");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdIsNotNull() {
            addCriterion("protect_must_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdEqualTo(String value) {
            addCriterion("protect_must_node_id =", value, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdNotEqualTo(String value) {
            addCriterion("protect_must_node_id <>", value, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdGreaterThan(String value) {
            addCriterion("protect_must_node_id >", value, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("protect_must_node_id >=", value, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdLessThan(String value) {
            addCriterion("protect_must_node_id <", value, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdLessThanOrEqualTo(String value) {
            addCriterion("protect_must_node_id <=", value, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdLike(String value) {
            addCriterion("protect_must_node_id like", value, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdNotLike(String value) {
            addCriterion("protect_must_node_id not like", value, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdIn(List<String> values) {
            addCriterion("protect_must_node_id in", values, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdNotIn(List<String> values) {
            addCriterion("protect_must_node_id not in", values, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdBetween(String value1, String value2) {
            addCriterion("protect_must_node_id between", value1, value2, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectMustNodeIdNotBetween(String value1, String value2) {
            addCriterion("protect_must_node_id not between", value1, value2, "protectMustNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdIsNull() {
            addCriterion("protect_never_node_id is null");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdIsNotNull() {
            addCriterion("protect_never_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdEqualTo(String value) {
            addCriterion("protect_never_node_id =", value, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdNotEqualTo(String value) {
            addCriterion("protect_never_node_id <>", value, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdGreaterThan(String value) {
            addCriterion("protect_never_node_id >", value, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("protect_never_node_id >=", value, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdLessThan(String value) {
            addCriterion("protect_never_node_id <", value, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdLessThanOrEqualTo(String value) {
            addCriterion("protect_never_node_id <=", value, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdLike(String value) {
            addCriterion("protect_never_node_id like", value, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdNotLike(String value) {
            addCriterion("protect_never_node_id not like", value, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdIn(List<String> values) {
            addCriterion("protect_never_node_id in", values, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdNotIn(List<String> values) {
            addCriterion("protect_never_node_id not in", values, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdBetween(String value1, String value2) {
            addCriterion("protect_never_node_id between", value1, value2, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverNodeIdNotBetween(String value1, String value2) {
            addCriterion("protect_never_node_id not between", value1, value2, "protectNeverNodeId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdIsNull() {
            addCriterion("work_must_link_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdIsNotNull() {
            addCriterion("work_must_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdEqualTo(String value) {
            addCriterion("work_must_link_id =", value, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdNotEqualTo(String value) {
            addCriterion("work_must_link_id <>", value, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdGreaterThan(String value) {
            addCriterion("work_must_link_id >", value, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_must_link_id >=", value, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdLessThan(String value) {
            addCriterion("work_must_link_id <", value, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdLessThanOrEqualTo(String value) {
            addCriterion("work_must_link_id <=", value, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdLike(String value) {
            addCriterion("work_must_link_id like", value, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdNotLike(String value) {
            addCriterion("work_must_link_id not like", value, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdIn(List<String> values) {
            addCriterion("work_must_link_id in", values, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdNotIn(List<String> values) {
            addCriterion("work_must_link_id not in", values, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdBetween(String value1, String value2) {
            addCriterion("work_must_link_id between", value1, value2, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkMustLinkIdNotBetween(String value1, String value2) {
            addCriterion("work_must_link_id not between", value1, value2, "workMustLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdIsNull() {
            addCriterion("work_never_link_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdIsNotNull() {
            addCriterion("work_never_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdEqualTo(String value) {
            addCriterion("work_never_link_id =", value, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdNotEqualTo(String value) {
            addCriterion("work_never_link_id <>", value, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdGreaterThan(String value) {
            addCriterion("work_never_link_id >", value, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_never_link_id >=", value, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdLessThan(String value) {
            addCriterion("work_never_link_id <", value, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdLessThanOrEqualTo(String value) {
            addCriterion("work_never_link_id <=", value, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdLike(String value) {
            addCriterion("work_never_link_id like", value, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdNotLike(String value) {
            addCriterion("work_never_link_id not like", value, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdIn(List<String> values) {
            addCriterion("work_never_link_id in", values, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdNotIn(List<String> values) {
            addCriterion("work_never_link_id not in", values, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdBetween(String value1, String value2) {
            addCriterion("work_never_link_id between", value1, value2, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andWorkNeverLinkIdNotBetween(String value1, String value2) {
            addCriterion("work_never_link_id not between", value1, value2, "workNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdIsNull() {
            addCriterion("protect_must_link_id is null");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdIsNotNull() {
            addCriterion("protect_must_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdEqualTo(String value) {
            addCriterion("protect_must_link_id =", value, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdNotEqualTo(String value) {
            addCriterion("protect_must_link_id <>", value, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdGreaterThan(String value) {
            addCriterion("protect_must_link_id >", value, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("protect_must_link_id >=", value, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdLessThan(String value) {
            addCriterion("protect_must_link_id <", value, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdLessThanOrEqualTo(String value) {
            addCriterion("protect_must_link_id <=", value, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdLike(String value) {
            addCriterion("protect_must_link_id like", value, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdNotLike(String value) {
            addCriterion("protect_must_link_id not like", value, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdIn(List<String> values) {
            addCriterion("protect_must_link_id in", values, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdNotIn(List<String> values) {
            addCriterion("protect_must_link_id not in", values, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdBetween(String value1, String value2) {
            addCriterion("protect_must_link_id between", value1, value2, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectMustLinkIdNotBetween(String value1, String value2) {
            addCriterion("protect_must_link_id not between", value1, value2, "protectMustLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdIsNull() {
            addCriterion("protect_never_link_id is null");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdIsNotNull() {
            addCriterion("protect_never_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdEqualTo(String value) {
            addCriterion("protect_never_link_id =", value, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdNotEqualTo(String value) {
            addCriterion("protect_never_link_id <>", value, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdGreaterThan(String value) {
            addCriterion("protect_never_link_id >", value, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("protect_never_link_id >=", value, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdLessThan(String value) {
            addCriterion("protect_never_link_id <", value, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdLessThanOrEqualTo(String value) {
            addCriterion("protect_never_link_id <=", value, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdLike(String value) {
            addCriterion("protect_never_link_id like", value, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdNotLike(String value) {
            addCriterion("protect_never_link_id not like", value, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdIn(List<String> values) {
            addCriterion("protect_never_link_id in", values, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdNotIn(List<String> values) {
            addCriterion("protect_never_link_id not in", values, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdBetween(String value1, String value2) {
            addCriterion("protect_never_link_id between", value1, value2, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andProtectNeverLinkIdNotBetween(String value1, String value2) {
            addCriterion("protect_never_link_id not between", value1, value2, "protectNeverLinkId");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedIsNull() {
            addCriterion("fault_affected is null");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedIsNotNull() {
            addCriterion("fault_affected is not null");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedEqualTo(String value) {
            addCriterion("fault_affected =", value, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedNotEqualTo(String value) {
            addCriterion("fault_affected <>", value, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedGreaterThan(String value) {
            addCriterion("fault_affected >", value, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedGreaterThanOrEqualTo(String value) {
            addCriterion("fault_affected >=", value, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedLessThan(String value) {
            addCriterion("fault_affected <", value, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedLessThanOrEqualTo(String value) {
            addCriterion("fault_affected <=", value, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedLike(String value) {
            addCriterion("fault_affected like", value, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedNotLike(String value) {
            addCriterion("fault_affected not like", value, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedIn(List<String> values) {
            addCriterion("fault_affected in", values, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedNotIn(List<String> values) {
            addCriterion("fault_affected not in", values, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedBetween(String value1, String value2) {
            addCriterion("fault_affected between", value1, value2, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultAffectedNotBetween(String value1, String value2) {
            addCriterion("fault_affected not between", value1, value2, "faultAffected");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNull() {
            addCriterion("fault_type is null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNotNull() {
            addCriterion("fault_type is not null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeEqualTo(Integer value) {
            addCriterion("fault_type =", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotEqualTo(Integer value) {
            addCriterion("fault_type <>", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThan(Integer value) {
            addCriterion("fault_type >", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fault_type >=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThan(Integer value) {
            addCriterion("fault_type <", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThanOrEqualTo(Integer value) {
            addCriterion("fault_type <=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIn(List<Integer> values) {
            addCriterion("fault_type in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotIn(List<Integer> values) {
            addCriterion("fault_type not in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeBetween(Integer value1, Integer value2) {
            addCriterion("fault_type between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fault_type not between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelIsNull() {
            addCriterion("priority_level is null");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelIsNotNull() {
            addCriterion("priority_level is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelEqualTo(Integer value) {
            addCriterion("priority_level =", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelNotEqualTo(Integer value) {
            addCriterion("priority_level <>", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelGreaterThan(Integer value) {
            addCriterion("priority_level >", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority_level >=", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelLessThan(Integer value) {
            addCriterion("priority_level <", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelLessThanOrEqualTo(Integer value) {
            addCriterion("priority_level <=", value, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelIn(List<Integer> values) {
            addCriterion("priority_level in", values, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelNotIn(List<Integer> values) {
            addCriterion("priority_level not in", values, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelBetween(Integer value1, Integer value2) {
            addCriterion("priority_level between", value1, value2, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andPriorityLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("priority_level not between", value1, value2, "priorityLevel");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
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