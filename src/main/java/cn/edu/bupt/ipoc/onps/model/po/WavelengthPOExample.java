package cn.edu.bupt.ipoc.onps.model.po;

import java.util.ArrayList;
import java.util.List;

public class WavelengthPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WavelengthPOExample() {
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

        public Criteria andWavelengthIdIsNull() {
            addCriterion("wavelength_id is null");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdIsNotNull() {
            addCriterion("wavelength_id is not null");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdEqualTo(String value) {
            addCriterion("wavelength_id =", value, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdNotEqualTo(String value) {
            addCriterion("wavelength_id <>", value, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdGreaterThan(String value) {
            addCriterion("wavelength_id >", value, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdGreaterThanOrEqualTo(String value) {
            addCriterion("wavelength_id >=", value, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdLessThan(String value) {
            addCriterion("wavelength_id <", value, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdLessThanOrEqualTo(String value) {
            addCriterion("wavelength_id <=", value, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdLike(String value) {
            addCriterion("wavelength_id like", value, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdNotLike(String value) {
            addCriterion("wavelength_id not like", value, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdIn(List<String> values) {
            addCriterion("wavelength_id in", values, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdNotIn(List<String> values) {
            addCriterion("wavelength_id not in", values, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdBetween(String value1, String value2) {
            addCriterion("wavelength_id between", value1, value2, "wavelengthId");
            return (Criteria) this;
        }

        public Criteria andWavelengthIdNotBetween(String value1, String value2) {
            addCriterion("wavelength_id not between", value1, value2, "wavelengthId");
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

        public Criteria andWaveTypeIsNull() {
            addCriterion("wave_type is null");
            return (Criteria) this;
        }

        public Criteria andWaveTypeIsNotNull() {
            addCriterion("wave_type is not null");
            return (Criteria) this;
        }

        public Criteria andWaveTypeEqualTo(String value) {
            addCriterion("wave_type =", value, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeNotEqualTo(String value) {
            addCriterion("wave_type <>", value, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeGreaterThan(String value) {
            addCriterion("wave_type >", value, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("wave_type >=", value, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeLessThan(String value) {
            addCriterion("wave_type <", value, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeLessThanOrEqualTo(String value) {
            addCriterion("wave_type <=", value, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeLike(String value) {
            addCriterion("wave_type like", value, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeNotLike(String value) {
            addCriterion("wave_type not like", value, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeIn(List<String> values) {
            addCriterion("wave_type in", values, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeNotIn(List<String> values) {
            addCriterion("wave_type not in", values, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeBetween(String value1, String value2) {
            addCriterion("wave_type between", value1, value2, "waveType");
            return (Criteria) this;
        }

        public Criteria andWaveTypeNotBetween(String value1, String value2) {
            addCriterion("wave_type not between", value1, value2, "waveType");
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