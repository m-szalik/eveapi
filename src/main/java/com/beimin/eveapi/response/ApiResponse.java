package com.beimin.eveapi.response;

import java.util.Date;

import com.beimin.eveapi.handler.ApiError;

public class ApiResponse {
	private int version;
	private Date currentTime;
	private Date cachedUntil;
	private ApiError error;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	public Date getCachedUntil() {
		return cachedUntil;
	}

	public void setCachedUntil(Date cachedUntil) {
		this.cachedUntil = cachedUntil;
	}

	public boolean hasError() {
		return error != null;
	}

	public ApiError getError() {
		return error;
	}

	public void setError(ApiError error) {
		this.error = error;
	}
}
