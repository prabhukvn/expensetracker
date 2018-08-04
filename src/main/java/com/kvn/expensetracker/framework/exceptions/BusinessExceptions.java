package com.kvn.expensetracker.framework.exceptions;

import org.springframework.http.HttpStatus;

// TODO: Auto-generated Javadoc
/**
 * The Class BusinessExceptions.
 */
public class BusinessExceptions extends RuntimeException {

	/** Global Exception Handler. */
	private static final long serialVersionUID = 1L;

	/** The message. */
	private String message;
	
	/** The message id. */
	private String messageId;
	
	/** The http status. */
	private HttpStatus httpStatus;
	
	/** The original. */
	private Throwable original;

	/**
	 * Instantiates a new business exceptions.
	 */
	public BusinessExceptions() {
	}

	/**
	 * Instantiates a new business exceptions.
	 *
	 * @param message the message
	 * @param messageId the message id
	 */
	public BusinessExceptions(String message, String messageId) {
		super();
		this.message = message;
		this.messageId = messageId;
	}

	/**
	 * Instantiates a new business exceptions.
	 *
	 * @param message the message
	 * @param messageId the message id
	 * @param original the original
	 */
	public BusinessExceptions(String message, String messageId, Throwable original) {
		super();
		this.message = message;
		this.messageId = messageId;
		this.original = original;
	}

	/**
	 * Instantiates a new business exceptions.
	 *
	 * @param message the message
	 * @param messageId the message id
	 * @param httpStatus the http status
	 * @param original the original
	 */
	public BusinessExceptions(String message, String messageId, HttpStatus httpStatus, Throwable original) {
		super();
		this.message = message;
		this.messageId = messageId;
		this.httpStatus = httpStatus;
		this.original = original;
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Message:").append(message).append(" Message Id:").append(messageId).append(" Exception:")
				.append(original.getMessage()).append("Status: ").append(httpStatus.toString());
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the message id.
	 *
	 * @return the message id
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * Sets the message id.
	 *
	 * @param messageId the new message id
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	/**
	 * Gets the http status.
	 *
	 * @return the http status
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * Sets the http status.
	 *
	 * @param httpStatus the new http status
	 */
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	/**
	 * Gets the original.
	 *
	 * @return the original
	 */
	public Throwable getOriginal() {
		return original;
	}

	/**
	 * Sets the original.
	 *
	 * @param original the new original
	 */
	public void setOriginal(Throwable original) {
		this.original = original;
	}

	
}
