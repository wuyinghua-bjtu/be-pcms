package com.bepcms.pcms.Entity;

import java.util.ArrayList;
import java.util.List;

public class CourseLabExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseLabExample() {
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

        public Criteria andLabidIsNull() {
            addCriterion("labId is null");
            return (Criteria) this;
        }

        public Criteria andLabidIsNotNull() {
            addCriterion("labId is not null");
            return (Criteria) this;
        }

        public Criteria andLabidEqualTo(Integer value) {
            addCriterion("labId =", value, "labid");
            return (Criteria) this;
        }

        public Criteria andLabidNotEqualTo(Integer value) {
            addCriterion("labId <>", value, "labid");
            return (Criteria) this;
        }

        public Criteria andLabidGreaterThan(Integer value) {
            addCriterion("labId >", value, "labid");
            return (Criteria) this;
        }

        public Criteria andLabidGreaterThanOrEqualTo(Integer value) {
            addCriterion("labId >=", value, "labid");
            return (Criteria) this;
        }

        public Criteria andLabidLessThan(Integer value) {
            addCriterion("labId <", value, "labid");
            return (Criteria) this;
        }

        public Criteria andLabidLessThanOrEqualTo(Integer value) {
            addCriterion("labId <=", value, "labid");
            return (Criteria) this;
        }

        public Criteria andLabidIn(List<Integer> values) {
            addCriterion("labId in", values, "labid");
            return (Criteria) this;
        }

        public Criteria andLabidNotIn(List<Integer> values) {
            addCriterion("labId not in", values, "labid");
            return (Criteria) this;
        }

        public Criteria andLabidBetween(Integer value1, Integer value2) {
            addCriterion("labId between", value1, value2, "labid");
            return (Criteria) this;
        }

        public Criteria andLabidNotBetween(Integer value1, Integer value2) {
            addCriterion("labId not between", value1, value2, "labid");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNull() {
            addCriterion("infoId is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("infoId is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(Integer value) {
            addCriterion("infoId =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(Integer value) {
            addCriterion("infoId <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(Integer value) {
            addCriterion("infoId >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("infoId >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(Integer value) {
            addCriterion("infoId <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(Integer value) {
            addCriterion("infoId <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<Integer> values) {
            addCriterion("infoId in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<Integer> values) {
            addCriterion("infoId not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(Integer value1, Integer value2) {
            addCriterion("infoId between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("infoId not between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andLabnameIsNull() {
            addCriterion("labName is null");
            return (Criteria) this;
        }

        public Criteria andLabnameIsNotNull() {
            addCriterion("labName is not null");
            return (Criteria) this;
        }

        public Criteria andLabnameEqualTo(String value) {
            addCriterion("labName =", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameNotEqualTo(String value) {
            addCriterion("labName <>", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameGreaterThan(String value) {
            addCriterion("labName >", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameGreaterThanOrEqualTo(String value) {
            addCriterion("labName >=", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameLessThan(String value) {
            addCriterion("labName <", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameLessThanOrEqualTo(String value) {
            addCriterion("labName <=", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameLike(String value) {
            addCriterion("labName like", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameNotLike(String value) {
            addCriterion("labName not like", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameIn(List<String> values) {
            addCriterion("labName in", values, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameNotIn(List<String> values) {
            addCriterion("labName not in", values, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameBetween(String value1, String value2) {
            addCriterion("labName between", value1, value2, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameNotBetween(String value1, String value2) {
            addCriterion("labName not between", value1, value2, "labname");
            return (Criteria) this;
        }

        public Criteria andLabstyleIsNull() {
            addCriterion("labStyle is null");
            return (Criteria) this;
        }

        public Criteria andLabstyleIsNotNull() {
            addCriterion("labStyle is not null");
            return (Criteria) this;
        }

        public Criteria andLabstyleEqualTo(String value) {
            addCriterion("labStyle =", value, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleNotEqualTo(String value) {
            addCriterion("labStyle <>", value, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleGreaterThan(String value) {
            addCriterion("labStyle >", value, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleGreaterThanOrEqualTo(String value) {
            addCriterion("labStyle >=", value, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleLessThan(String value) {
            addCriterion("labStyle <", value, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleLessThanOrEqualTo(String value) {
            addCriterion("labStyle <=", value, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleLike(String value) {
            addCriterion("labStyle like", value, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleNotLike(String value) {
            addCriterion("labStyle not like", value, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleIn(List<String> values) {
            addCriterion("labStyle in", values, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleNotIn(List<String> values) {
            addCriterion("labStyle not in", values, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleBetween(String value1, String value2) {
            addCriterion("labStyle between", value1, value2, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabstyleNotBetween(String value1, String value2) {
            addCriterion("labStyle not between", value1, value2, "labstyle");
            return (Criteria) this;
        }

        public Criteria andLabenvIsNull() {
            addCriterion("labEnv is null");
            return (Criteria) this;
        }

        public Criteria andLabenvIsNotNull() {
            addCriterion("labEnv is not null");
            return (Criteria) this;
        }

        public Criteria andLabenvEqualTo(String value) {
            addCriterion("labEnv =", value, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvNotEqualTo(String value) {
            addCriterion("labEnv <>", value, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvGreaterThan(String value) {
            addCriterion("labEnv >", value, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvGreaterThanOrEqualTo(String value) {
            addCriterion("labEnv >=", value, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvLessThan(String value) {
            addCriterion("labEnv <", value, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvLessThanOrEqualTo(String value) {
            addCriterion("labEnv <=", value, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvLike(String value) {
            addCriterion("labEnv like", value, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvNotLike(String value) {
            addCriterion("labEnv not like", value, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvIn(List<String> values) {
            addCriterion("labEnv in", values, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvNotIn(List<String> values) {
            addCriterion("labEnv not in", values, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvBetween(String value1, String value2) {
            addCriterion("labEnv between", value1, value2, "labenv");
            return (Criteria) this;
        }

        public Criteria andLabenvNotBetween(String value1, String value2) {
            addCriterion("labEnv not between", value1, value2, "labenv");
            return (Criteria) this;
        }

        public Criteria andHasgroupIsNull() {
            addCriterion("hasGroup is null");
            return (Criteria) this;
        }

        public Criteria andHasgroupIsNotNull() {
            addCriterion("hasGroup is not null");
            return (Criteria) this;
        }

        public Criteria andHasgroupEqualTo(String value) {
            addCriterion("hasGroup =", value, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupNotEqualTo(String value) {
            addCriterion("hasGroup <>", value, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupGreaterThan(String value) {
            addCriterion("hasGroup >", value, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupGreaterThanOrEqualTo(String value) {
            addCriterion("hasGroup >=", value, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupLessThan(String value) {
            addCriterion("hasGroup <", value, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupLessThanOrEqualTo(String value) {
            addCriterion("hasGroup <=", value, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupLike(String value) {
            addCriterion("hasGroup like", value, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupNotLike(String value) {
            addCriterion("hasGroup not like", value, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupIn(List<String> values) {
            addCriterion("hasGroup in", values, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupNotIn(List<String> values) {
            addCriterion("hasGroup not in", values, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupBetween(String value1, String value2) {
            addCriterion("hasGroup between", value1, value2, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andHasgroupNotBetween(String value1, String value2) {
            addCriterion("hasGroup not between", value1, value2, "hasgroup");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumIsNull() {
            addCriterion("groupmateNum is null");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumIsNotNull() {
            addCriterion("groupmateNum is not null");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumEqualTo(Integer value) {
            addCriterion("groupmateNum =", value, "groupmatenum");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumNotEqualTo(Integer value) {
            addCriterion("groupmateNum <>", value, "groupmatenum");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumGreaterThan(Integer value) {
            addCriterion("groupmateNum >", value, "groupmatenum");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupmateNum >=", value, "groupmatenum");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumLessThan(Integer value) {
            addCriterion("groupmateNum <", value, "groupmatenum");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumLessThanOrEqualTo(Integer value) {
            addCriterion("groupmateNum <=", value, "groupmatenum");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumIn(List<Integer> values) {
            addCriterion("groupmateNum in", values, "groupmatenum");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumNotIn(List<Integer> values) {
            addCriterion("groupmateNum not in", values, "groupmatenum");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumBetween(Integer value1, Integer value2) {
            addCriterion("groupmateNum between", value1, value2, "groupmatenum");
            return (Criteria) this;
        }

        public Criteria andGroupmatenumNotBetween(Integer value1, Integer value2) {
            addCriterion("groupmateNum not between", value1, value2, "groupmatenum");
            return (Criteria) this;
        }

        public Criteria andLabtypeIsNull() {
            addCriterion("labType is null");
            return (Criteria) this;
        }

        public Criteria andLabtypeIsNotNull() {
            addCriterion("labType is not null");
            return (Criteria) this;
        }

        public Criteria andLabtypeEqualTo(String value) {
            addCriterion("labType =", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeNotEqualTo(String value) {
            addCriterion("labType <>", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeGreaterThan(String value) {
            addCriterion("labType >", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeGreaterThanOrEqualTo(String value) {
            addCriterion("labType >=", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeLessThan(String value) {
            addCriterion("labType <", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeLessThanOrEqualTo(String value) {
            addCriterion("labType <=", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeLike(String value) {
            addCriterion("labType like", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeNotLike(String value) {
            addCriterion("labType not like", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeIn(List<String> values) {
            addCriterion("labType in", values, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeNotIn(List<String> values) {
            addCriterion("labType not in", values, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeBetween(String value1, String value2) {
            addCriterion("labType between", value1, value2, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeNotBetween(String value1, String value2) {
            addCriterion("labType not between", value1, value2, "labtype");
            return (Criteria) this;
        }

        public Criteria andAimIsNull() {
            addCriterion("aim is null");
            return (Criteria) this;
        }

        public Criteria andAimIsNotNull() {
            addCriterion("aim is not null");
            return (Criteria) this;
        }

        public Criteria andAimEqualTo(String value) {
            addCriterion("aim =", value, "aim");
            return (Criteria) this;
        }

        public Criteria andAimNotEqualTo(String value) {
            addCriterion("aim <>", value, "aim");
            return (Criteria) this;
        }

        public Criteria andAimGreaterThan(String value) {
            addCriterion("aim >", value, "aim");
            return (Criteria) this;
        }

        public Criteria andAimGreaterThanOrEqualTo(String value) {
            addCriterion("aim >=", value, "aim");
            return (Criteria) this;
        }

        public Criteria andAimLessThan(String value) {
            addCriterion("aim <", value, "aim");
            return (Criteria) this;
        }

        public Criteria andAimLessThanOrEqualTo(String value) {
            addCriterion("aim <=", value, "aim");
            return (Criteria) this;
        }

        public Criteria andAimLike(String value) {
            addCriterion("aim like", value, "aim");
            return (Criteria) this;
        }

        public Criteria andAimNotLike(String value) {
            addCriterion("aim not like", value, "aim");
            return (Criteria) this;
        }

        public Criteria andAimIn(List<String> values) {
            addCriterion("aim in", values, "aim");
            return (Criteria) this;
        }

        public Criteria andAimNotIn(List<String> values) {
            addCriterion("aim not in", values, "aim");
            return (Criteria) this;
        }

        public Criteria andAimBetween(String value1, String value2) {
            addCriterion("aim between", value1, value2, "aim");
            return (Criteria) this;
        }

        public Criteria andAimNotBetween(String value1, String value2) {
            addCriterion("aim not between", value1, value2, "aim");
            return (Criteria) this;
        }

        public Criteria andPrincipleIsNull() {
            addCriterion("principle is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleIsNotNull() {
            addCriterion("principle is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleEqualTo(String value) {
            addCriterion("principle =", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleNotEqualTo(String value) {
            addCriterion("principle <>", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleGreaterThan(String value) {
            addCriterion("principle >", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleGreaterThanOrEqualTo(String value) {
            addCriterion("principle >=", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleLessThan(String value) {
            addCriterion("principle <", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleLessThanOrEqualTo(String value) {
            addCriterion("principle <=", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleLike(String value) {
            addCriterion("principle like", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleNotLike(String value) {
            addCriterion("principle not like", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleIn(List<String> values) {
            addCriterion("principle in", values, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleNotIn(List<String> values) {
            addCriterion("principle not in", values, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleBetween(String value1, String value2) {
            addCriterion("principle between", value1, value2, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleNotBetween(String value1, String value2) {
            addCriterion("principle not between", value1, value2, "principle");
            return (Criteria) this;
        }

        public Criteria andGuideIsNull() {
            addCriterion("guide is null");
            return (Criteria) this;
        }

        public Criteria andGuideIsNotNull() {
            addCriterion("guide is not null");
            return (Criteria) this;
        }

        public Criteria andGuideEqualTo(String value) {
            addCriterion("guide =", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideNotEqualTo(String value) {
            addCriterion("guide <>", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideGreaterThan(String value) {
            addCriterion("guide >", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideGreaterThanOrEqualTo(String value) {
            addCriterion("guide >=", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideLessThan(String value) {
            addCriterion("guide <", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideLessThanOrEqualTo(String value) {
            addCriterion("guide <=", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideLike(String value) {
            addCriterion("guide like", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideNotLike(String value) {
            addCriterion("guide not like", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideIn(List<String> values) {
            addCriterion("guide in", values, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideNotIn(List<String> values) {
            addCriterion("guide not in", values, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideBetween(String value1, String value2) {
            addCriterion("guide between", value1, value2, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideNotBetween(String value1, String value2) {
            addCriterion("guide not between", value1, value2, "guide");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNull() {
            addCriterion("notice is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNotNull() {
            addCriterion("notice is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEqualTo(String value) {
            addCriterion("notice =", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotEqualTo(String value) {
            addCriterion("notice <>", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThan(String value) {
            addCriterion("notice >", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("notice >=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThan(String value) {
            addCriterion("notice <", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThanOrEqualTo(String value) {
            addCriterion("notice <=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLike(String value) {
            addCriterion("notice like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotLike(String value) {
            addCriterion("notice not like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeIn(List<String> values) {
            addCriterion("notice in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotIn(List<String> values) {
            addCriterion("notice not in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeBetween(String value1, String value2) {
            addCriterion("notice between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotBetween(String value1, String value2) {
            addCriterion("notice not between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andHasfileIsNull() {
            addCriterion("hasFile is null");
            return (Criteria) this;
        }

        public Criteria andHasfileIsNotNull() {
            addCriterion("hasFile is not null");
            return (Criteria) this;
        }

        public Criteria andHasfileEqualTo(Boolean value) {
            addCriterion("hasFile =", value, "hasfile");
            return (Criteria) this;
        }

        public Criteria andHasfileNotEqualTo(Boolean value) {
            addCriterion("hasFile <>", value, "hasfile");
            return (Criteria) this;
        }

        public Criteria andHasfileGreaterThan(Boolean value) {
            addCriterion("hasFile >", value, "hasfile");
            return (Criteria) this;
        }

        public Criteria andHasfileGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasFile >=", value, "hasfile");
            return (Criteria) this;
        }

        public Criteria andHasfileLessThan(Boolean value) {
            addCriterion("hasFile <", value, "hasfile");
            return (Criteria) this;
        }

        public Criteria andHasfileLessThanOrEqualTo(Boolean value) {
            addCriterion("hasFile <=", value, "hasfile");
            return (Criteria) this;
        }

        public Criteria andHasfileIn(List<Boolean> values) {
            addCriterion("hasFile in", values, "hasfile");
            return (Criteria) this;
        }

        public Criteria andHasfileNotIn(List<Boolean> values) {
            addCriterion("hasFile not in", values, "hasfile");
            return (Criteria) this;
        }

        public Criteria andHasfileBetween(Boolean value1, Boolean value2) {
            addCriterion("hasFile between", value1, value2, "hasfile");
            return (Criteria) this;
        }

        public Criteria andHasfileNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasFile not between", value1, value2, "hasfile");
            return (Criteria) this;
        }

        public Criteria andFiletagIsNull() {
            addCriterion("fileTag is null");
            return (Criteria) this;
        }

        public Criteria andFiletagIsNotNull() {
            addCriterion("fileTag is not null");
            return (Criteria) this;
        }

        public Criteria andFiletagEqualTo(String value) {
            addCriterion("fileTag =", value, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagNotEqualTo(String value) {
            addCriterion("fileTag <>", value, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagGreaterThan(String value) {
            addCriterion("fileTag >", value, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagGreaterThanOrEqualTo(String value) {
            addCriterion("fileTag >=", value, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagLessThan(String value) {
            addCriterion("fileTag <", value, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagLessThanOrEqualTo(String value) {
            addCriterion("fileTag <=", value, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagLike(String value) {
            addCriterion("fileTag like", value, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagNotLike(String value) {
            addCriterion("fileTag not like", value, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagIn(List<String> values) {
            addCriterion("fileTag in", values, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagNotIn(List<String> values) {
            addCriterion("fileTag not in", values, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagBetween(String value1, String value2) {
            addCriterion("fileTag between", value1, value2, "filetag");
            return (Criteria) this;
        }

        public Criteria andFiletagNotBetween(String value1, String value2) {
            addCriterion("fileTag not between", value1, value2, "filetag");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(String value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(String value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(String value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(String value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(String value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(String value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLike(String value) {
            addCriterion("duration like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotLike(String value) {
            addCriterion("duration not like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<String> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<String> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(String value1, String value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(String value1, String value2) {
            addCriterion("duration not between", value1, value2, "duration");
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