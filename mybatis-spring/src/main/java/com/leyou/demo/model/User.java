package com.leyou.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * ÕËºÅ
     */
    private String username;

    /**
     * ÃÜÂë
     */
    private String password;

    private String name;

    private Integer age;

    private String sex;

    private Date birthday;

    private Date created;

    private Date updated;

    private String note;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * »ñÈ¡ÕËºÅ
     *
     * @return username - ÕËºÅ
     */
    public String getUsername() {
        return username;
    }

    /**
     * ÉèÖÃÕËºÅ
     *
     * @param username ÕËºÅ
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * »ñÈ¡ÃÜÂë
     *
     * @return password - ÃÜÂë
     */
    public String getPassword() {
        return password;
    }

    /**
     * ÉèÖÃÃÜÂë
     *
     * @param password ÃÜÂë
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }
}