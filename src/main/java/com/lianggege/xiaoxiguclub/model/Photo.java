package com.lianggege.xiaoxiguclub.model;

public class Photo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTO.ID
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTO.TITLE
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTO.SRC
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    private String src;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTO.ID
     *
     * @return the value of PHOTO.ID
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTO.ID
     *
     * @param id the value for PHOTO.ID
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTO.TITLE
     *
     * @return the value of PHOTO.TITLE
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTO.TITLE
     *
     * @param title the value for PHOTO.TITLE
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTO.SRC
     *
     * @return the value of PHOTO.SRC
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public String getSrc() {
        return src;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTO.SRC
     *
     * @param src the value for PHOTO.SRC
     *
     * @mbggenerated Thu Dec 27 08:45:15 CST 2018
     */
    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }
}