package com.qf.manager.pojo.po;

public class TbEmp1 {
    private Integer id;

    private String name;

    private Integer deptid;

    private Float slary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Float getSlary() {
        return slary;
    }

    public void setSlary(Float slary) {
        this.slary = slary;
    }
}