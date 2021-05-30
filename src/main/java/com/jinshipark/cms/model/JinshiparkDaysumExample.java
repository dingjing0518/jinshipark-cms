package com.jinshipark.cms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JinshiparkDaysumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JinshiparkDaysumExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("Date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("Date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("Date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("Date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("Date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("Date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("Date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("Date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("Date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("Date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("Date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andCarsumIsNull() {
            addCriterion("CarSum is null");
            return (Criteria) this;
        }

        public Criteria andCarsumIsNotNull() {
            addCriterion("CarSum is not null");
            return (Criteria) this;
        }

        public Criteria andCarsumEqualTo(String value) {
            addCriterion("CarSum =", value, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumNotEqualTo(String value) {
            addCriterion("CarSum <>", value, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumGreaterThan(String value) {
            addCriterion("CarSum >", value, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumGreaterThanOrEqualTo(String value) {
            addCriterion("CarSum >=", value, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumLessThan(String value) {
            addCriterion("CarSum <", value, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumLessThanOrEqualTo(String value) {
            addCriterion("CarSum <=", value, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumLike(String value) {
            addCriterion("CarSum like", value, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumNotLike(String value) {
            addCriterion("CarSum not like", value, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumIn(List<String> values) {
            addCriterion("CarSum in", values, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumNotIn(List<String> values) {
            addCriterion("CarSum not in", values, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumBetween(String value1, String value2) {
            addCriterion("CarSum between", value1, value2, "carsum");
            return (Criteria) this;
        }

        public Criteria andCarsumNotBetween(String value1, String value2) {
            addCriterion("CarSum not between", value1, value2, "carsum");
            return (Criteria) this;
        }

        public Criteria andParkfeeIsNull() {
            addCriterion("ParkFee is null");
            return (Criteria) this;
        }

        public Criteria andParkfeeIsNotNull() {
            addCriterion("ParkFee is not null");
            return (Criteria) this;
        }

        public Criteria andParkfeeEqualTo(String value) {
            addCriterion("ParkFee =", value, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeNotEqualTo(String value) {
            addCriterion("ParkFee <>", value, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeGreaterThan(String value) {
            addCriterion("ParkFee >", value, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeGreaterThanOrEqualTo(String value) {
            addCriterion("ParkFee >=", value, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeLessThan(String value) {
            addCriterion("ParkFee <", value, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeLessThanOrEqualTo(String value) {
            addCriterion("ParkFee <=", value, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeLike(String value) {
            addCriterion("ParkFee like", value, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeNotLike(String value) {
            addCriterion("ParkFee not like", value, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeIn(List<String> values) {
            addCriterion("ParkFee in", values, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeNotIn(List<String> values) {
            addCriterion("ParkFee not in", values, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeBetween(String value1, String value2) {
            addCriterion("ParkFee between", value1, value2, "parkfee");
            return (Criteria) this;
        }

        public Criteria andParkfeeNotBetween(String value1, String value2) {
            addCriterion("ParkFee not between", value1, value2, "parkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeIsNull() {
            addCriterion("RealParkFee is null");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeIsNotNull() {
            addCriterion("RealParkFee is not null");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeEqualTo(String value) {
            addCriterion("RealParkFee =", value, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeNotEqualTo(String value) {
            addCriterion("RealParkFee <>", value, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeGreaterThan(String value) {
            addCriterion("RealParkFee >", value, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeGreaterThanOrEqualTo(String value) {
            addCriterion("RealParkFee >=", value, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeLessThan(String value) {
            addCriterion("RealParkFee <", value, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeLessThanOrEqualTo(String value) {
            addCriterion("RealParkFee <=", value, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeLike(String value) {
            addCriterion("RealParkFee like", value, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeNotLike(String value) {
            addCriterion("RealParkFee not like", value, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeIn(List<String> values) {
            addCriterion("RealParkFee in", values, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeNotIn(List<String> values) {
            addCriterion("RealParkFee not in", values, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeBetween(String value1, String value2) {
            addCriterion("RealParkFee between", value1, value2, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andRealparkfeeNotBetween(String value1, String value2) {
            addCriterion("RealParkFee not between", value1, value2, "realparkfee");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyIsNull() {
            addCriterion("PrePayMoney is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyIsNotNull() {
            addCriterion("PrePayMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyEqualTo(String value) {
            addCriterion("PrePayMoney =", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyNotEqualTo(String value) {
            addCriterion("PrePayMoney <>", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyGreaterThan(String value) {
            addCriterion("PrePayMoney >", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyGreaterThanOrEqualTo(String value) {
            addCriterion("PrePayMoney >=", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyLessThan(String value) {
            addCriterion("PrePayMoney <", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyLessThanOrEqualTo(String value) {
            addCriterion("PrePayMoney <=", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyLike(String value) {
            addCriterion("PrePayMoney like", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyNotLike(String value) {
            addCriterion("PrePayMoney not like", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyIn(List<String> values) {
            addCriterion("PrePayMoney in", values, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyNotIn(List<String> values) {
            addCriterion("PrePayMoney not in", values, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyBetween(String value1, String value2) {
            addCriterion("PrePayMoney between", value1, value2, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyNotBetween(String value1, String value2) {
            addCriterion("PrePayMoney not between", value1, value2, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyIsNull() {
            addCriterion("ScanPayMoney is null");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyIsNotNull() {
            addCriterion("ScanPayMoney is not null");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyEqualTo(String value) {
            addCriterion("ScanPayMoney =", value, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyNotEqualTo(String value) {
            addCriterion("ScanPayMoney <>", value, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyGreaterThan(String value) {
            addCriterion("ScanPayMoney >", value, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyGreaterThanOrEqualTo(String value) {
            addCriterion("ScanPayMoney >=", value, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyLessThan(String value) {
            addCriterion("ScanPayMoney <", value, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyLessThanOrEqualTo(String value) {
            addCriterion("ScanPayMoney <=", value, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyLike(String value) {
            addCriterion("ScanPayMoney like", value, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyNotLike(String value) {
            addCriterion("ScanPayMoney not like", value, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyIn(List<String> values) {
            addCriterion("ScanPayMoney in", values, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyNotIn(List<String> values) {
            addCriterion("ScanPayMoney not in", values, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyBetween(String value1, String value2) {
            addCriterion("ScanPayMoney between", value1, value2, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andScanpaymoneyNotBetween(String value1, String value2) {
            addCriterion("ScanPayMoney not between", value1, value2, "scanpaymoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyIsNull() {
            addCriterion("ManualMoney is null");
            return (Criteria) this;
        }

        public Criteria andManualmoneyIsNotNull() {
            addCriterion("ManualMoney is not null");
            return (Criteria) this;
        }

        public Criteria andManualmoneyEqualTo(String value) {
            addCriterion("ManualMoney =", value, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyNotEqualTo(String value) {
            addCriterion("ManualMoney <>", value, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyGreaterThan(String value) {
            addCriterion("ManualMoney >", value, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("ManualMoney >=", value, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyLessThan(String value) {
            addCriterion("ManualMoney <", value, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyLessThanOrEqualTo(String value) {
            addCriterion("ManualMoney <=", value, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyLike(String value) {
            addCriterion("ManualMoney like", value, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyNotLike(String value) {
            addCriterion("ManualMoney not like", value, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyIn(List<String> values) {
            addCriterion("ManualMoney in", values, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyNotIn(List<String> values) {
            addCriterion("ManualMoney not in", values, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyBetween(String value1, String value2) {
            addCriterion("ManualMoney between", value1, value2, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andManualmoneyNotBetween(String value1, String value2) {
            addCriterion("ManualMoney not between", value1, value2, "manualmoney");
            return (Criteria) this;
        }

        public Criteria andServicefeeIsNull() {
            addCriterion("ServiceFee is null");
            return (Criteria) this;
        }

        public Criteria andServicefeeIsNotNull() {
            addCriterion("ServiceFee is not null");
            return (Criteria) this;
        }

        public Criteria andServicefeeEqualTo(String value) {
            addCriterion("ServiceFee =", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeNotEqualTo(String value) {
            addCriterion("ServiceFee <>", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeGreaterThan(String value) {
            addCriterion("ServiceFee >", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeGreaterThanOrEqualTo(String value) {
            addCriterion("ServiceFee >=", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeLessThan(String value) {
            addCriterion("ServiceFee <", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeLessThanOrEqualTo(String value) {
            addCriterion("ServiceFee <=", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeLike(String value) {
            addCriterion("ServiceFee like", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeNotLike(String value) {
            addCriterion("ServiceFee not like", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeIn(List<String> values) {
            addCriterion("ServiceFee in", values, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeNotIn(List<String> values) {
            addCriterion("ServiceFee not in", values, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeBetween(String value1, String value2) {
            addCriterion("ServiceFee between", value1, value2, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeNotBetween(String value1, String value2) {
            addCriterion("ServiceFee not between", value1, value2, "servicefee");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyIsNull() {
            addCriterion("ReturnMoney is null");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyIsNotNull() {
            addCriterion("ReturnMoney is not null");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyEqualTo(String value) {
            addCriterion("ReturnMoney =", value, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyNotEqualTo(String value) {
            addCriterion("ReturnMoney <>", value, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyGreaterThan(String value) {
            addCriterion("ReturnMoney >", value, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("ReturnMoney >=", value, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyLessThan(String value) {
            addCriterion("ReturnMoney <", value, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyLessThanOrEqualTo(String value) {
            addCriterion("ReturnMoney <=", value, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyLike(String value) {
            addCriterion("ReturnMoney like", value, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyNotLike(String value) {
            addCriterion("ReturnMoney not like", value, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyIn(List<String> values) {
            addCriterion("ReturnMoney in", values, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyNotIn(List<String> values) {
            addCriterion("ReturnMoney not in", values, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyBetween(String value1, String value2) {
            addCriterion("ReturnMoney between", value1, value2, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andReturnmoneyNotBetween(String value1, String value2) {
            addCriterion("ReturnMoney not between", value1, value2, "returnmoney");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeIsNull() {
            addCriterion("RefundServiceFee is null");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeIsNotNull() {
            addCriterion("RefundServiceFee is not null");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeEqualTo(String value) {
            addCriterion("RefundServiceFee =", value, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeNotEqualTo(String value) {
            addCriterion("RefundServiceFee <>", value, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeGreaterThan(String value) {
            addCriterion("RefundServiceFee >", value, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeGreaterThanOrEqualTo(String value) {
            addCriterion("RefundServiceFee >=", value, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeLessThan(String value) {
            addCriterion("RefundServiceFee <", value, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeLessThanOrEqualTo(String value) {
            addCriterion("RefundServiceFee <=", value, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeLike(String value) {
            addCriterion("RefundServiceFee like", value, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeNotLike(String value) {
            addCriterion("RefundServiceFee not like", value, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeIn(List<String> values) {
            addCriterion("RefundServiceFee in", values, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeNotIn(List<String> values) {
            addCriterion("RefundServiceFee not in", values, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeBetween(String value1, String value2) {
            addCriterion("RefundServiceFee between", value1, value2, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andRefundservicefeeNotBetween(String value1, String value2) {
            addCriterion("RefundServiceFee not between", value1, value2, "refundservicefee");
            return (Criteria) this;
        }

        public Criteria andParkidIsNull() {
            addCriterion("ParkID is null");
            return (Criteria) this;
        }

        public Criteria andParkidIsNotNull() {
            addCriterion("ParkID is not null");
            return (Criteria) this;
        }

        public Criteria andParkidEqualTo(String value) {
            addCriterion("ParkID =", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotEqualTo(String value) {
            addCriterion("ParkID <>", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidGreaterThan(String value) {
            addCriterion("ParkID >", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidGreaterThanOrEqualTo(String value) {
            addCriterion("ParkID >=", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLessThan(String value) {
            addCriterion("ParkID <", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLessThanOrEqualTo(String value) {
            addCriterion("ParkID <=", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLike(String value) {
            addCriterion("ParkID like", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotLike(String value) {
            addCriterion("ParkID not like", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidIn(List<String> values) {
            addCriterion("ParkID in", values, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotIn(List<String> values) {
            addCriterion("ParkID not in", values, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidBetween(String value1, String value2) {
            addCriterion("ParkID between", value1, value2, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotBetween(String value1, String value2) {
            addCriterion("ParkID not between", value1, value2, "parkid");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("Remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("Remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("Remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("Remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("Remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("Remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("Remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("Remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("Remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("Remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("Remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("Remarks not between", value1, value2, "remarks");
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