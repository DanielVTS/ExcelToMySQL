package cn.lingnan.pojo;

import java.io.Serializable;

/**
 * basicInformation
 *
 * @author
 */
public class BasicInformation implements Serializable {
    private Integer id;

    private String sId;

    private String sName;

    private String sClass1;

    private String sLocation;

    private String sClass2;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsClass1() {
        return sClass1;
    }

    public void setsClass1(String sClass1) {
        this.sClass1 = sClass1;
    }

    public String getsLocation() {
        return sLocation;
    }

    public void setsLocation(String sLocation) {
        this.sLocation = sLocation;
    }

    public String getsClass2() {
        return sClass2;
    }

    public void setsClass2(String sClass2) {
        this.sClass2 = sClass2;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BasicInformation other = (BasicInformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getsId() == null ? other.getsId() == null : this.getsId().equals(other.getsId()))
                && (this.getsName() == null ? other.getsName() == null : this.getsName().equals(other.getsName()))
                && (this.getsClass1() == null ? other.getsClass1() == null : this.getsClass1().equals(other.getsClass1()))
                && (this.getsLocation() == null ? other.getsLocation() == null : this.getsLocation().equals(other.getsLocation()))
                && (this.getsClass2() == null ? other.getsClass2() == null : this.getsClass2().equals(other.getsClass2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getsId() == null) ? 0 : getsId().hashCode());
        result = prime * result + ((getsName() == null) ? 0 : getsName().hashCode());
        result = prime * result + ((getsClass1() == null) ? 0 : getsClass1().hashCode());
        result = prime * result + ((getsLocation() == null) ? 0 : getsLocation().hashCode());
        result = prime * result + ((getsClass2() == null) ? 0 : getsClass2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sId=").append(sId);
        sb.append(", sName=").append(sName);
        sb.append(", sClass1=").append(sClass1);
        sb.append(", sLocation=").append(sLocation);
        sb.append(", sClass2=").append(sClass2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}