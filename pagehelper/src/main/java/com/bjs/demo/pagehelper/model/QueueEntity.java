package com.bjs.demo.pagehelper.model;

import java.math.BigInteger;

public class QueueEntity {

	private static final long serialVersionUID = -2790067587037118711L;

	private Integer id;

    private String appid;
    
    private String customerId;

    private String content;

    private Integer status;

    private Integer system;
    private Integer userId;

    private String createTime;

    private String updateTime;
    private String title;
	private Integer tagId;
	private BigInteger reminderId;
	private Integer locationType;// 跳转类型
	private String locationCode;// 跳转具体ID
	

	private Integer generalNoticeId;//一般消息的主键。
	/**
	 * IOS消息跳转地址。
	 */
	private String iosJumpParam;
	/**
	 * 安卓消息跳转地址。
	 */
	private String androidJumpParam;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSystem() {
        return system;
    }

    public void setSystem(Integer system) {
        this.system = system;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public BigInteger getReminderId() {
		return reminderId;
	}

	public void setReminderId(BigInteger reminderId) {
		this.reminderId = reminderId;
	}

	public Integer getLocationType() {
		return locationType;
	}

	public void setLocationType(Integer locationType) {
		this.locationType = locationType;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}


	public Integer getGeneralNoticeId() {
		return generalNoticeId;
	}

	public void setGeneralNoticeId(Integer generalNoticeId) {
		this.generalNoticeId = generalNoticeId;
	}

	public String getIosJumpParam() {
		return iosJumpParam;
	}

	public void setIosJumpParam(String iosJumpParam) {
		this.iosJumpParam = iosJumpParam;
	}

	public String getAndroidJumpParam() {
		return androidJumpParam;
	}

	public void setAndroidJumpParam(String androidJumpParam) {
		this.androidJumpParam = androidJumpParam;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueueEntity [id=").append(id).append(", appid=")
				.append(appid).append(", customerId=").append(customerId)
				.append(", content=").append(content).append(", status=")
				.append(status).append(", system=").append(system)
				.append(", userId=").append(userId).append(", createTime=")
				.append(createTime).append(", updateTime=").append(updateTime)
				.append(", title=").append(title).append(", tagId=")
				.append(tagId).append(", reminderId=").append(reminderId)
				.append(", locationType=").append(locationType)
				.append(", locationCode=").append(locationCode)
				.append(", generalNoticeId=").append(generalNoticeId)
				.append(", iosJumpParam=").append(iosJumpParam)
				.append(", androidJumpParam=").append(androidJumpParam)
				.append("]");
		return builder.toString();
	}

    

}
