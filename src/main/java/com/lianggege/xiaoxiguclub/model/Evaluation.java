package com.lianggege.xiaoxiguclub.model;

import java.util.Date;

public class Evaluation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EVALUATION.ID
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EVALUATION.EVALUATOR
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    private String evaluator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EVALUATION.EVALUATION
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    private String evaluation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EVALUATION.EVALUATE_DATE
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    private Date evaluateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EVALUATION.SRC
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    private String src;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EVALUATION.ID
     *
     * @return the value of EVALUATION.ID
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EVALUATION.ID
     *
     * @param id the value for EVALUATION.ID
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EVALUATION.EVALUATOR
     *
     * @return the value of EVALUATION.EVALUATOR
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public String getEvaluator() {
        return evaluator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EVALUATION.EVALUATOR
     *
     * @param evaluator the value for EVALUATION.EVALUATOR
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public void setEvaluator(String evaluator) {
        this.evaluator = evaluator == null ? null : evaluator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EVALUATION.EVALUATION
     *
     * @return the value of EVALUATION.EVALUATION
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public String getEvaluation() {
        return evaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EVALUATION.EVALUATION
     *
     * @param evaluation the value for EVALUATION.EVALUATION
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation == null ? null : evaluation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EVALUATION.EVALUATE_DATE
     *
     * @return the value of EVALUATION.EVALUATE_DATE
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public Date getEvaluateDate() {
        return evaluateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EVALUATION.EVALUATE_DATE
     *
     * @param evaluateDate the value for EVALUATION.EVALUATE_DATE
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public void setEvaluateDate(Date evaluateDate) {
        this.evaluateDate = evaluateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EVALUATION.SRC
     *
     * @return the value of EVALUATION.SRC
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public String getSrc() {
        return src;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EVALUATION.SRC
     *
     * @param src the value for EVALUATION.SRC
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }
}