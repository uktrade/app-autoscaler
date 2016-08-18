package org.cloudfoundry.autoscaler.scheduler.util;

/**
 * 
 *
 */
public enum JobActionEnum {
	START("Start", "Start Scaling Job", "_start"), END("End", "End Scaling Job", "_end");

	private String action;
	private String description;
	private String jobIdSuffix;

	JobActionEnum(String action, String description, String jobIdSuffix) {
		this.action = action;
		this.description = description;
		this.jobIdSuffix = jobIdSuffix;
	}

	public String getAction() {
		return action;
	}

	public String getDescription() {
		return description;
	}

	public String getJobIdSuffix() {
		return jobIdSuffix;
	}

}