package co.edu.cesde.ga.model;

public class Group {
    private int groupId;
    private String code;
    private int programId;
    private int periodId;
    private String shift;

    public Group(int groupId, String code, int programId, int periodId, String shift) {
        this.groupId = groupId;
        this.code = code;
        this.programId = programId;
        this.periodId = periodId;
        this.shift = shift;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public int getPeriodId() {
        return periodId;
    }

    public void setPeriodId(int periodId) {
        this.periodId = periodId;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId='" + groupId + '\'' +
                ", code='" + code + '\'' +
                ", programId='" + programId + '\'' +
                ", periodId='" + periodId + '\'' +
                ", shift='" + shift + '\'' +
                '}';
    }
}
