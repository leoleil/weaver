package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class LayerRoutePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LayerRoutePOExample() {
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

        public Criteria andCarryLinkIdIsNull() {
            addCriterion("carry_link_id is null");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdIsNotNull() {
            addCriterion("carry_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdEqualTo(String value) {
            addCriterion("carry_link_id =", value, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdNotEqualTo(String value) {
            addCriterion("carry_link_id <>", value, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdGreaterThan(String value) {
            addCriterion("carry_link_id >", value, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("carry_link_id >=", value, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdLessThan(String value) {
            addCriterion("carry_link_id <", value, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdLessThanOrEqualTo(String value) {
            addCriterion("carry_link_id <=", value, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdLike(String value) {
            addCriterion("carry_link_id like", value, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdNotLike(String value) {
            addCriterion("carry_link_id not like", value, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdIn(List<String> values) {
            addCriterion("carry_link_id in", values, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdNotIn(List<String> values) {
            addCriterion("carry_link_id not in", values, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdBetween(String value1, String value2) {
            addCriterion("carry_link_id between", value1, value2, "carryLinkId");
            return (Criteria) this;
        }

        public Criteria andCarryLinkIdNotBetween(String value1, String value2) {
            addCriterion("carry_link_id not between", value1, value2, "carryLinkId");
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

        public Criteria andCarryLayerIsNull() {
            addCriterion("carry_layer is null");
            return (Criteria) this;
        }

        public Criteria andCarryLayerIsNotNull() {
            addCriterion("carry_layer is not null");
            return (Criteria) this;
        }

        public Criteria andCarryLayerEqualTo(String value) {
            addCriterion("carry_layer =", value, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerNotEqualTo(String value) {
            addCriterion("carry_layer <>", value, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerGreaterThan(String value) {
            addCriterion("carry_layer >", value, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerGreaterThanOrEqualTo(String value) {
            addCriterion("carry_layer >=", value, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerLessThan(String value) {
            addCriterion("carry_layer <", value, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerLessThanOrEqualTo(String value) {
            addCriterion("carry_layer <=", value, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerLike(String value) {
            addCriterion("carry_layer like", value, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerNotLike(String value) {
            addCriterion("carry_layer not like", value, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerIn(List<String> values) {
            addCriterion("carry_layer in", values, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerNotIn(List<String> values) {
            addCriterion("carry_layer not in", values, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerBetween(String value1, String value2) {
            addCriterion("carry_layer between", value1, value2, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryLayerNotBetween(String value1, String value2) {
            addCriterion("carry_layer not between", value1, value2, "carryLayer");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdIsNull() {
            addCriterion("carry_cell_id is null");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdIsNotNull() {
            addCriterion("carry_cell_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdEqualTo(String value) {
            addCriterion("carry_cell_id =", value, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdNotEqualTo(String value) {
            addCriterion("carry_cell_id <>", value, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdGreaterThan(String value) {
            addCriterion("carry_cell_id >", value, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdGreaterThanOrEqualTo(String value) {
            addCriterion("carry_cell_id >=", value, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdLessThan(String value) {
            addCriterion("carry_cell_id <", value, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdLessThanOrEqualTo(String value) {
            addCriterion("carry_cell_id <=", value, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdLike(String value) {
            addCriterion("carry_cell_id like", value, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdNotLike(String value) {
            addCriterion("carry_cell_id not like", value, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdIn(List<String> values) {
            addCriterion("carry_cell_id in", values, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdNotIn(List<String> values) {
            addCriterion("carry_cell_id not in", values, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdBetween(String value1, String value2) {
            addCriterion("carry_cell_id between", value1, value2, "carryCellId");
            return (Criteria) this;
        }

        public Criteria andCarryCellIdNotBetween(String value1, String value2) {
            addCriterion("carry_cell_id not between", value1, value2, "carryCellId");
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