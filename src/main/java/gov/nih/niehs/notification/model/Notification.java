package gov.nih.niehs.notification.model;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Notification
 */
@Validated
@Entity
public class Notification {
	@JsonProperty("id")
	@Id
	private Integer id = null;

	@JsonProperty("notification_id")
	private UUID notificationId = null;

	@JsonProperty("sender_id")
	private String senderId = null;

	@JsonProperty("recipient_id")
	private String recipientId = null;

	@JsonProperty("subject")
	private String subject = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("seen")
	private Boolean seen = false;

	@JsonProperty("deleted")
	private Boolean deleted = false;

	@JsonProperty("date_created")
	private Timestamp dateCreated = null;

	@JsonProperty("severity_level")
	private Integer severityLevel = null;

	@JsonProperty("notification_type")
	private String notificationType = null;

	@JsonProperty("data_location_url")
	private String dataLocationUrl = null;

	public Notification id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * an auto-generated sequence by postgres db
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "an auto-generated sequence by postgres db")

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Notification notificationId(UUID notificationId) {
		this.notificationId = notificationId;
		return this;
	}

	/**
	 * an unique uuid auto-generated by postgres db
	 * 
	 * @return notificationId
	 **/
	@ApiModelProperty(value = "an unique uuid auto-generated by postgres db")

	@Valid
	public UUID getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(UUID notificationId) {
		this.notificationId = notificationId;
	}

	public Notification senderId(String senderId) {
		this.senderId = senderId;
		return this;
	}

	/**
	 * notification sender's userId
	 * 
	 * @return senderId
	 **/
	@ApiModelProperty(value = "notification sender's userId")

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public Notification recipientId(String recipientId) {
		this.recipientId = recipientId;
		return this;
	}

	/**
	 * notification recipient's userId
	 * 
	 * @return recipientId
	 **/
	@ApiModelProperty(value = "notification recipient's userId")

	public String getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public Notification subject(String subject) {
		this.subject = subject;
		return this;
	}

	/**
	 * notification subject
	 * 
	 * @return subject
	 **/
	@ApiModelProperty(value = "notification subject")

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Notification message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * notification message content
	 * 
	 * @return message
	 **/
	@ApiModelProperty(value = "notification message content")

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Notification seen(Boolean seen) {
		this.seen = seen;
		return this;
	}

	/**
	 * boolean for user's seen/unseen notification status
	 * 
	 * @return seen
	 **/
	@ApiModelProperty(value = "boolean for user's seen/unseen notification status")

	public Boolean isSeen() {
		return seen;
	}

	public void setSeen(Boolean seen) {
		this.seen = seen;
	}

	public Notification deleted(Boolean deleted) {
		this.deleted = deleted;
		return this;
	}

	/**
	 * boolean for deleted notification, notification will not be deleted from
	 * postgres db
	 * 
	 * @return deleted
	 **/
	@ApiModelProperty(value = "boolean for deleted notification, notification will not be deleted from postgres db")

	public Boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Notification dateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
		return this;
	}

	/**
	 * timestamp auto-generated by postgres db
	 * 
	 * @return dateCreated
	 **/
	@ApiModelProperty(value = "timestamp auto-generated by postgres db")

	@Valid
	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Notification severityLevel(Integer severityLevel) {
		this.severityLevel = severityLevel;
		return this;
	}

	/**
	 * severity level of notification an integer value between 1 and 5
	 * 
	 * @return severityLevel
	 **/
	@ApiModelProperty(value = "severity level of notification an integer value between 1 and 5")

	public Integer getSeverityLevel() {
		return severityLevel;
	}

	public void setSeverityLevel(Integer severityLevel) {
		this.severityLevel = severityLevel;
	}

	public Notification notificationType(String notificationType) {
		this.notificationType = notificationType;
		return this;
	}

	/**
	 * type of notification options are workflow, permission, system
	 * 
	 * @return notificationType
	 **/
	@ApiModelProperty(value = "type of notification options are workflow, permission, system")

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public Notification dataLocationUrl(String dataLocationUrl) {
		this.dataLocationUrl = dataLocationUrl;
		return this;
	}

	/**
	 * notification associated logical location of data
	 * 
	 * @return dataLocationUrl
	 **/
	@ApiModelProperty(value = "notification associated logical location of data")

	public String getDataLocationUrl() {
		return dataLocationUrl;
	}

	public void setDataLocationUrl(String dataLocationUrl) {
		this.dataLocationUrl = dataLocationUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Notification notification = (Notification) o;
		return Objects.equals(this.id, notification.id)
				&& Objects.equals(this.notificationId, notification.notificationId)
				&& Objects.equals(this.senderId, notification.senderId)
				&& Objects.equals(this.recipientId, notification.recipientId)
				&& Objects.equals(this.subject, notification.subject)
				&& Objects.equals(this.message, notification.message) && Objects.equals(this.seen, notification.seen)
				&& Objects.equals(this.deleted, notification.deleted)
				&& Objects.equals(this.dateCreated, notification.dateCreated)
				&& Objects.equals(this.severityLevel, notification.severityLevel)
				&& Objects.equals(this.notificationType, notification.notificationType)
				&& Objects.equals(this.dataLocationUrl, notification.dataLocationUrl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, notificationId, senderId, recipientId, subject, message, seen, deleted, dateCreated,
				severityLevel, notificationType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Notification {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
		sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
		sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
		sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    seen: ").append(toIndentedString(seen)).append("\n");
		sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
		sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
		sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
		sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
		sb.append("    dataLocationUrl: ").append(toIndentedString(dataLocationUrl)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
