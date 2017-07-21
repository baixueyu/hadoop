package org.apache.hadoop.fs.swift.snative;

public class SwiftDirStatus {
	public boolean isdir;
	public boolean isempty;
	public SwiftDirStatus() {
	}

	public SwiftDirStatus( boolean isdir,
	                         boolean isempty) {
		this.isdir = isdir;
		this.isempty = isempty;
	}
}
