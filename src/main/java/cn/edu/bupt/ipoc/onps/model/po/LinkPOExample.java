package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class LinkPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinkPOExample() {
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

        public Criteria andLinkExpendIdIsNull() {
            addCriterion("link_expend_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdIsNotNull() {
            addCriterion("link_expend_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdEqualTo(String value) {
            addCriterion("link_expend_id =", value, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdNotEqualTo(String value) {
            addCriterion("link_expend_id <>", value, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdGreaterThan(String value) {
            addCriterion("link_expend_id >", value, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdGreaterThanOrEqualTo(String value) {
            addCriterion("link_expend_id >=", value, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdLessThan(String value) {
            addCriterion("link_expend_id <", value, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdLessThanOrEqualTo(String value) {
            addCriterion("link_expend_id <=", value, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdLike(String value) {
            addCriterion("link_expend_id like", value, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdNotLike(String value) {
            addCriterion("link_expend_id not like", value, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdIn(List<String> values) {
            addCriterion("link_expend_id in", values, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdNotIn(List<String> values) {
            addCriterion("link_expend_id not in", values, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdBetween(String value1, String value2) {
            addCriterion("link_expend_id between", value1, value2, "linkExpendId");
            return (Criteria) this;
        }

        public Criteria andLinkExpendIdNotBetween(String value1, String value2) {
            addCriterion("link_expend_id not between", value1, value2, "linkExpendId");
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

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Double value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Double value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Double value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Double value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Double value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Double> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Double> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Double value1, Double value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Double value1, Double value2) {
            addCriterion("length not between", value1, value2, "length");
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

        public Criteria andCarriedIsNull() {
            addCriterion("carried is null");
            return (Criteria) this;
        }

        public Criteria andCarriedIsNotNull() {
            addCriterion("carried is not null");
            return (Criteria) this;
        }

        public Criteria andCarriedEqualTo(Integer value) {
            addCriterion("carried =", value, "carried");
            return (Criteria) this;
        }

        public Criteria andCarriedNotEqualTo(Integer value) {
            addCriterion("carried <>", value, "carried");
            return (Criteria) this;
        }

        public Criteria andCarriedGreaterThan(Integer value) {
            addCriterion("carried >", value, "carried");
            return (Criteria) this;
        }

        public Criteria andCarriedGreaterThanOrEqualTo(Integer value) {
            addCriterion("carried >=", value, "carried");
            return (Criteria) this;
        }

        public Criteria andCarriedLessThan(Integer value) {
            addCriterion("carried <", value, "carried");
            return (Criteria) this;
        }

        public Criteria andCarriedLessThanOrEqualTo(Integer value) {
            addCriterion("carried <=", value, "carried");
            return (Criteria) this;
        }

        public Criteria andCarriedIn(List<Integer> values) {
            addCriterion("carried in", values, "carried");
            return (Criteria) this;
        }

        public Criteria andCarriedNotIn(List<Integer> values) {
            addCriterion("carried not in", values, "carried");
            return (Criteria) this;
        }

        public Criteria andCarriedBetween(Integer value1, Integer value2) {
            addCriterion("carried between", value1, value2, "carried");
            return (Criteria) this;
        }

        public Criteria andCarriedNotBetween(Integer value1, Integer value2) {
            addCriterion("carried not between", value1, value2, "carried");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andUtilizationIsNull() {
            addCriterion("utilization is null");
            return (Criteria) this;
        }

        public Criteria andUtilizationIsNotNull() {
            addCriterion("utilization is not null");
            return (Criteria) this;
        }

        public Criteria andUtilizationEqualTo(Double value) {
            addCriterion("utilization =", value, "utilization");
            return (Criteria) this;
        }

        public Criteria andUtilizationNotEqualTo(Double value) {
            addCriterion("utilization <>", value, "utilization");
            return (Criteria) this;
        }

        public Criteria andUtilizationGreaterThan(Double value) {
            addCriterion("utilization >", value, "utilization");
            return (Criteria) this;
        }

        public Criteria andUtilizationGreaterThanOrEqualTo(Double value) {
            addCriterion("utilization >=", value, "utilization");
            return (Criteria) this;
        }

        public Criteria andUtilizationLessThan(Double value) {
            addCriterion("utilization <", value, "utilization");
            return (Criteria) this;
        }

        public Criteria andUtilizationLessThanOrEqualTo(Double value) {
            addCriterion("utilization <=", value, "utilization");
            return (Criteria) this;
        }

        public Criteria andUtilizationIn(List<Double> values) {
            addCriterion("utilization in", values, "utilization");
            return (Criteria) this;
        }

        public Criteria andUtilizationNotIn(List<Double> values) {
            addCriterion("utilization not in", values, "utilization");
            return (Criteria) this;
        }

        public Criteria andUtilizationBetween(Double value1, Double value2) {
            addCriterion("utilization between", value1, value2, "utilization");
            return (Criteria) this;
        }

        public Criteria andUtilizationNotBetween(Double value1, Double value2) {
            addCriterion("utilization not between", value1, value2, "utilization");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberIsNull() {
            addCriterion("child_net_number is null");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberIsNotNull() {
            addCriterion("child_net_number is not null");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberEqualTo(String value) {
            addCriterion("child_net_number =", value, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberNotEqualTo(String value) {
            addCriterion("child_net_number <>", value, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberGreaterThan(String value) {
            addCriterion("child_net_number >", value, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberGreaterThanOrEqualTo(String value) {
            addCriterion("child_net_number >=", value, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberLessThan(String value) {
            addCriterion("child_net_number <", value, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberLessThanOrEqualTo(String value) {
            addCriterion("child_net_number <=", value, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberLike(String value) {
            addCriterion("child_net_number like", value, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberNotLike(String value) {
            addCriterion("child_net_number not like", value, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberIn(List<String> values) {
            addCriterion("child_net_number in", values, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberNotIn(List<String> values) {
            addCriterion("child_net_number not in", values, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberBetween(String value1, String value2) {
            addCriterion("child_net_number between", value1, value2, "childNetNumber");
            return (Criteria) this;
        }

        public Criteria andChildNetNumberNotBetween(String value1, String value2) {
            addCriterion("child_net_number not between", value1, value2, "childNetNumber");
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

        public Criteria andSurvivanceIsNull() {
            addCriterion("survivance is null");
            return (Criteria) this;
        }

        public Criteria andSurvivanceIsNotNull() {
            addCriterion("survivance is not null");
            return (Criteria) this;
        }

        public Criteria andSurvivanceEqualTo(String value) {
            addCriterion("survivance =", value, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceNotEqualTo(String value) {
            addCriterion("survivance <>", value, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceGreaterThan(String value) {
            addCriterion("survivance >", value, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceGreaterThanOrEqualTo(String value) {
            addCriterion("survivance >=", value, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceLessThan(String value) {
            addCriterion("survivance <", value, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceLessThanOrEqualTo(String value) {
            addCriterion("survivance <=", value, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceLike(String value) {
            addCriterion("survivance like", value, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceNotLike(String value) {
            addCriterion("survivance not like", value, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceIn(List<String> values) {
            addCriterion("survivance in", values, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceNotIn(List<String> values) {
            addCriterion("survivance not in", values, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceBetween(String value1, String value2) {
            addCriterion("survivance between", value1, value2, "survivance");
            return (Criteria) this;
        }

        public Criteria andSurvivanceNotBetween(String value1, String value2) {
            addCriterion("survivance not between", value1, value2, "survivance");
            return (Criteria) this;
        }

        public Criteria andErrorIsNull() {
            addCriterion("error is null");
            return (Criteria) this;
        }

        public Criteria andErrorIsNotNull() {
            addCriterion("error is not null");
            return (Criteria) this;
        }

        public Criteria andErrorEqualTo(Double value) {
            addCriterion("error =", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotEqualTo(Double value) {
            addCriterion("error <>", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorGreaterThan(Double value) {
            addCriterion("error >", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorGreaterThanOrEqualTo(Double value) {
            addCriterion("error >=", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLessThan(Double value) {
            addCriterion("error <", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLessThanOrEqualTo(Double value) {
            addCriterion("error <=", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorIn(List<Double> values) {
            addCriterion("error in", values, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotIn(List<Double> values) {
            addCriterion("error not in", values, "error");
            return (Criteria) this;
        }

        public Criteria andErrorBetween(Double value1, Double value2) {
            addCriterion("error between", value1, value2, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotBetween(Double value1, Double value2) {
            addCriterion("error not between", value1, value2, "error");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andFromPortIsNull() {
            addCriterion("from_port is null");
            return (Criteria) this;
        }

        public Criteria andFromPortIsNotNull() {
            addCriterion("from_port is not null");
            return (Criteria) this;
        }

        public Criteria andFromPortEqualTo(String value) {
            addCriterion("from_port =", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotEqualTo(String value) {
            addCriterion("from_port <>", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortGreaterThan(String value) {
            addCriterion("from_port >", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortGreaterThanOrEqualTo(String value) {
            addCriterion("from_port >=", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortLessThan(String value) {
            addCriterion("from_port <", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortLessThanOrEqualTo(String value) {
            addCriterion("from_port <=", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortLike(String value) {
            addCriterion("from_port like", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotLike(String value) {
            addCriterion("from_port not like", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortIn(List<String> values) {
            addCriterion("from_port in", values, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotIn(List<String> values) {
            addCriterion("from_port not in", values, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortBetween(String value1, String value2) {
            addCriterion("from_port between", value1, value2, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotBetween(String value1, String value2) {
            addCriterion("from_port not between", value1, value2, "fromPort");
            return (Criteria) this;
        }

        public Criteria andToPortIsNull() {
            addCriterion("to_port is null");
            return (Criteria) this;
        }

        public Criteria andToPortIsNotNull() {
            addCriterion("to_port is not null");
            return (Criteria) this;
        }

        public Criteria andToPortEqualTo(String value) {
            addCriterion("to_port =", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortNotEqualTo(String value) {
            addCriterion("to_port <>", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortGreaterThan(String value) {
            addCriterion("to_port >", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortGreaterThanOrEqualTo(String value) {
            addCriterion("to_port >=", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortLessThan(String value) {
            addCriterion("to_port <", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortLessThanOrEqualTo(String value) {
            addCriterion("to_port <=", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortLike(String value) {
            addCriterion("to_port like", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortNotLike(String value) {
            addCriterion("to_port not like", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortIn(List<String> values) {
            addCriterion("to_port in", values, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortNotIn(List<String> values) {
            addCriterion("to_port not in", values, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortBetween(String value1, String value2) {
            addCriterion("to_port between", value1, value2, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortNotBetween(String value1, String value2) {
            addCriterion("to_port not between", value1, value2, "toPort");
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

        public Criteria andNetworkIdIsNull() {
            addCriterion("network_id is null");
            return (Criteria) this;
        }

        public Criteria andNetworkIdIsNotNull() {
            addCriterion("network_id is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkIdEqualTo(String value) {
            addCriterion("network_id =", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdNotEqualTo(String value) {
            addCriterion("network_id <>", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdGreaterThan(String value) {
            addCriterion("network_id >", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdGreaterThanOrEqualTo(String value) {
            addCriterion("network_id >=", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdLessThan(String value) {
            addCriterion("network_id <", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdLessThanOrEqualTo(String value) {
            addCriterion("network_id <=", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdLike(String value) {
            addCriterion("network_id like", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdNotLike(String value) {
            addCriterion("network_id not like", value, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdIn(List<String> values) {
            addCriterion("network_id in", values, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdNotIn(List<String> values) {
            addCriterion("network_id not in", values, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdBetween(String value1, String value2) {
            addCriterion("network_id between", value1, value2, "networkId");
            return (Criteria) this;
        }

        public Criteria andNetworkIdNotBetween(String value1, String value2) {
            addCriterion("network_id not between", value1, value2, "networkId");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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