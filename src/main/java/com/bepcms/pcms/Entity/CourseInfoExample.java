package com.bepcms.pcms.Entity;

import java.util.ArrayList;
import java.util.List;

public class CourseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseInfoExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(String value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(String value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(String value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(String value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(String value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(String value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLike(String value) {
            addCriterion("courseId like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotLike(String value) {
            addCriterion("courseId not like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<String> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<String> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(String value1, String value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(String value1, String value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNull() {
            addCriterion("credits is null");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNotNull() {
            addCriterion("credits is not null");
            return (Criteria) this;
        }

        public Criteria andCreditsEqualTo(Integer value) {
            addCriterion("credits =", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotEqualTo(Integer value) {
            addCriterion("credits <>", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThan(Integer value) {
            addCriterion("credits >", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThanOrEqualTo(Integer value) {
            addCriterion("credits >=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThan(Integer value) {
            addCriterion("credits <", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThanOrEqualTo(Integer value) {
            addCriterion("credits <=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsIn(List<Integer> values) {
            addCriterion("credits in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotIn(List<Integer> values) {
            addCriterion("credits not in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsBetween(Integer value1, Integer value2) {
            addCriterion("credits between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotBetween(Integer value1, Integer value2) {
            addCriterion("credits not between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andLabperiodIsNull() {
            addCriterion("labPeriod is null");
            return (Criteria) this;
        }

        public Criteria andLabperiodIsNotNull() {
            addCriterion("labPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andLabperiodEqualTo(Integer value) {
            addCriterion("labPeriod =", value, "labperiod");
            return (Criteria) this;
        }

        public Criteria andLabperiodNotEqualTo(Integer value) {
            addCriterion("labPeriod <>", value, "labperiod");
            return (Criteria) this;
        }

        public Criteria andLabperiodGreaterThan(Integer value) {
            addCriterion("labPeriod >", value, "labperiod");
            return (Criteria) this;
        }

        public Criteria andLabperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("labPeriod >=", value, "labperiod");
            return (Criteria) this;
        }

        public Criteria andLabperiodLessThan(Integer value) {
            addCriterion("labPeriod <", value, "labperiod");
            return (Criteria) this;
        }

        public Criteria andLabperiodLessThanOrEqualTo(Integer value) {
            addCriterion("labPeriod <=", value, "labperiod");
            return (Criteria) this;
        }

        public Criteria andLabperiodIn(List<Integer> values) {
            addCriterion("labPeriod in", values, "labperiod");
            return (Criteria) this;
        }

        public Criteria andLabperiodNotIn(List<Integer> values) {
            addCriterion("labPeriod not in", values, "labperiod");
            return (Criteria) this;
        }

        public Criteria andLabperiodBetween(Integer value1, Integer value2) {
            addCriterion("labPeriod between", value1, value2, "labperiod");
            return (Criteria) this;
        }

        public Criteria andLabperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("labPeriod not between", value1, value2, "labperiod");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherId is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("teacherId =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("teacherId <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("teacherId >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("teacherId >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("teacherId <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("teacherId <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("teacherId like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("teacherId not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("teacherId in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("teacherId not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("teacherId between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("teacherId not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("teacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("teacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("teacherName =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("teacherName <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("teacherName >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("teacherName >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("teacherName <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("teacherName <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("teacherName like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("teacherName not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("teacherName in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("teacherName not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("teacherName between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("teacherName not between", value1, value2, "teachername");
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

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryIsNull() {
            addCriterion("isNecessary is null");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryIsNotNull() {
            addCriterion("isNecessary is not null");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryEqualTo(String value) {
            addCriterion("isNecessary =", value, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryNotEqualTo(String value) {
            addCriterion("isNecessary <>", value, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryGreaterThan(String value) {
            addCriterion("isNecessary >", value, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryGreaterThanOrEqualTo(String value) {
            addCriterion("isNecessary >=", value, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryLessThan(String value) {
            addCriterion("isNecessary <", value, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryLessThanOrEqualTo(String value) {
            addCriterion("isNecessary <=", value, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryLike(String value) {
            addCriterion("isNecessary like", value, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryNotLike(String value) {
            addCriterion("isNecessary not like", value, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryIn(List<String> values) {
            addCriterion("isNecessary in", values, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryNotIn(List<String> values) {
            addCriterion("isNecessary not in", values, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryBetween(String value1, String value2) {
            addCriterion("isNecessary between", value1, value2, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andIsnecessaryNotBetween(String value1, String value2) {
            addCriterion("isNecessary not between", value1, value2, "isnecessary");
            return (Criteria) this;
        }

        public Criteria andLabtimesIsNull() {
            addCriterion("labTimes is null");
            return (Criteria) this;
        }

        public Criteria andLabtimesIsNotNull() {
            addCriterion("labTimes is not null");
            return (Criteria) this;
        }

        public Criteria andLabtimesEqualTo(Integer value) {
            addCriterion("labTimes =", value, "labtimes");
            return (Criteria) this;
        }

        public Criteria andLabtimesNotEqualTo(Integer value) {
            addCriterion("labTimes <>", value, "labtimes");
            return (Criteria) this;
        }

        public Criteria andLabtimesGreaterThan(Integer value) {
            addCriterion("labTimes >", value, "labtimes");
            return (Criteria) this;
        }

        public Criteria andLabtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("labTimes >=", value, "labtimes");
            return (Criteria) this;
        }

        public Criteria andLabtimesLessThan(Integer value) {
            addCriterion("labTimes <", value, "labtimes");
            return (Criteria) this;
        }

        public Criteria andLabtimesLessThanOrEqualTo(Integer value) {
            addCriterion("labTimes <=", value, "labtimes");
            return (Criteria) this;
        }

        public Criteria andLabtimesIn(List<Integer> values) {
            addCriterion("labTimes in", values, "labtimes");
            return (Criteria) this;
        }

        public Criteria andLabtimesNotIn(List<Integer> values) {
            addCriterion("labTimes not in", values, "labtimes");
            return (Criteria) this;
        }

        public Criteria andLabtimesBetween(Integer value1, Integer value2) {
            addCriterion("labTimes between", value1, value2, "labtimes");
            return (Criteria) this;
        }

        public Criteria andLabtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("labTimes not between", value1, value2, "labtimes");
            return (Criteria) this;
        }

        public Criteria andLabnumIsNull() {
            addCriterion("labNum is null");
            return (Criteria) this;
        }

        public Criteria andLabnumIsNotNull() {
            addCriterion("labNum is not null");
            return (Criteria) this;
        }

        public Criteria andLabnumEqualTo(Integer value) {
            addCriterion("labNum =", value, "labnum");
            return (Criteria) this;
        }

        public Criteria andLabnumNotEqualTo(Integer value) {
            addCriterion("labNum <>", value, "labnum");
            return (Criteria) this;
        }

        public Criteria andLabnumGreaterThan(Integer value) {
            addCriterion("labNum >", value, "labnum");
            return (Criteria) this;
        }

        public Criteria andLabnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("labNum >=", value, "labnum");
            return (Criteria) this;
        }

        public Criteria andLabnumLessThan(Integer value) {
            addCriterion("labNum <", value, "labnum");
            return (Criteria) this;
        }

        public Criteria andLabnumLessThanOrEqualTo(Integer value) {
            addCriterion("labNum <=", value, "labnum");
            return (Criteria) this;
        }

        public Criteria andLabnumIn(List<Integer> values) {
            addCriterion("labNum in", values, "labnum");
            return (Criteria) this;
        }

        public Criteria andLabnumNotIn(List<Integer> values) {
            addCriterion("labNum not in", values, "labnum");
            return (Criteria) this;
        }

        public Criteria andLabnumBetween(Integer value1, Integer value2) {
            addCriterion("labNum between", value1, value2, "labnum");
            return (Criteria) this;
        }

        public Criteria andLabnumNotBetween(Integer value1, Integer value2) {
            addCriterion("labNum not between", value1, value2, "labnum");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(Integer value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(Integer value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(Integer value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(Integer value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(Integer value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<Integer> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<Integer> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(Integer value1, Integer value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(Integer value1, Integer value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNull() {
            addCriterion("studentNum is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNotNull() {
            addCriterion("studentNum is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumEqualTo(Integer value) {
            addCriterion("studentNum =", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotEqualTo(Integer value) {
            addCriterion("studentNum <>", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThan(Integer value) {
            addCriterion("studentNum >", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentNum >=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThan(Integer value) {
            addCriterion("studentNum <", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThanOrEqualTo(Integer value) {
            addCriterion("studentNum <=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIn(List<Integer> values) {
            addCriterion("studentNum in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotIn(List<Integer> values) {
            addCriterion("studentNum not in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumBetween(Integer value1, Integer value2) {
            addCriterion("studentNum between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("studentNum not between", value1, value2, "studentnum");
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

        public Criteria andLaboratorynameIsNull() {
            addCriterion("laboratoryName is null");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameIsNotNull() {
            addCriterion("laboratoryName is not null");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameEqualTo(String value) {
            addCriterion("laboratoryName =", value, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameNotEqualTo(String value) {
            addCriterion("laboratoryName <>", value, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameGreaterThan(String value) {
            addCriterion("laboratoryName >", value, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameGreaterThanOrEqualTo(String value) {
            addCriterion("laboratoryName >=", value, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameLessThan(String value) {
            addCriterion("laboratoryName <", value, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameLessThanOrEqualTo(String value) {
            addCriterion("laboratoryName <=", value, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameLike(String value) {
            addCriterion("laboratoryName like", value, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameNotLike(String value) {
            addCriterion("laboratoryName not like", value, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameIn(List<String> values) {
            addCriterion("laboratoryName in", values, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameNotIn(List<String> values) {
            addCriterion("laboratoryName not in", values, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameBetween(String value1, String value2) {
            addCriterion("laboratoryName between", value1, value2, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andLaboratorynameNotBetween(String value1, String value2) {
            addCriterion("laboratoryName not between", value1, value2, "laboratoryname");
            return (Criteria) this;
        }

        public Criteria andExperimenternumIsNull() {
            addCriterion("experimenterNum is null");
            return (Criteria) this;
        }

        public Criteria andExperimenternumIsNotNull() {
            addCriterion("experimenterNum is not null");
            return (Criteria) this;
        }

        public Criteria andExperimenternumEqualTo(Integer value) {
            addCriterion("experimenterNum =", value, "experimenternum");
            return (Criteria) this;
        }

        public Criteria andExperimenternumNotEqualTo(Integer value) {
            addCriterion("experimenterNum <>", value, "experimenternum");
            return (Criteria) this;
        }

        public Criteria andExperimenternumGreaterThan(Integer value) {
            addCriterion("experimenterNum >", value, "experimenternum");
            return (Criteria) this;
        }

        public Criteria andExperimenternumGreaterThanOrEqualTo(Integer value) {
            addCriterion("experimenterNum >=", value, "experimenternum");
            return (Criteria) this;
        }

        public Criteria andExperimenternumLessThan(Integer value) {
            addCriterion("experimenterNum <", value, "experimenternum");
            return (Criteria) this;
        }

        public Criteria andExperimenternumLessThanOrEqualTo(Integer value) {
            addCriterion("experimenterNum <=", value, "experimenternum");
            return (Criteria) this;
        }

        public Criteria andExperimenternumIn(List<Integer> values) {
            addCriterion("experimenterNum in", values, "experimenternum");
            return (Criteria) this;
        }

        public Criteria andExperimenternumNotIn(List<Integer> values) {
            addCriterion("experimenterNum not in", values, "experimenternum");
            return (Criteria) this;
        }

        public Criteria andExperimenternumBetween(Integer value1, Integer value2) {
            addCriterion("experimenterNum between", value1, value2, "experimenternum");
            return (Criteria) this;
        }

        public Criteria andExperimenternumNotBetween(Integer value1, Integer value2) {
            addCriterion("experimenterNum not between", value1, value2, "experimenternum");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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